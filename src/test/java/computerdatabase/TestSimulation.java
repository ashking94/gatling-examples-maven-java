package computerdatabase;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static io.gatling.javaapi.core.CoreDsl.StringBody;
import static io.gatling.javaapi.core.CoreDsl.atOnceUsers;
import static io.gatling.javaapi.core.CoreDsl.rampUsers;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;

public class TestSimulation extends Simulation {

    int i = 0;

    HttpProtocolBuilder httpProtocol =
            http
                    // Here is the root for all relative URLs
                    .baseUrl("http://localhost:9202");

//    ScenarioBuilder createIndex =
//            scenario("Create Index")
//                    .exec(http("create index"))
    // A scenario is a chain of requests and pauses

    Iterator<Map<String, Object>> numberFeeder =
            Stream.generate((Supplier<Map<String, Object>>) () -> {
                        return Collections.singletonMap("number", Integer.valueOf(i++).toString());
                    }
            ).iterator();

    ScenarioBuilder indexRequest =
            scenario("Index request")
                    .feed(numberFeeder)
                    .exec(http("index")
                            .post("/test-index-no-replica/_doc")
                            .header("Content-Type", session -> "application/json")
                            .body(StringBody("""
                                    {
                                      "name":"abc#{number}"
                                    }
                                    """)));

    ScenarioBuilder scn =
            scenario("Scenario Name")
                    .exec(http("request_1").get("/"))
                    // Note that Gatling has recorded real time pauses
                    .pause(7)
                    .exec(http("request_2").get("/computers?f=macbook"))
                    .pause(2)
                    .exec(http("request_3").get("/computers/6"))
                    .pause(3)
                    .exec(http("request_4").get("/"))
                    .pause(2)
                    .exec(http("request_5").get("/computers?p=1"))
                    .pause(Duration.ofMillis(670))
                    .exec(http("request_6").get("/computers?p=2"))
                    .pause(Duration.ofMillis(629))
                    .exec(http("request_7").get("/computers?p=3"))
                    .pause(Duration.ofMillis(734))
                    .exec(http("request_8").get("/computers?p=4"))
                    .pause(5)
                    .exec(http("request_9").get("/computers/new"))
                    .pause(1)
                    .exec(
                            http("request_10")
                                    // Here's an example of a POST request
                                    .post("/computers")
                                    .formParam("name", "Beautiful Computer")
                                    .formParam("introduced", "2012-05-30")
                                    .formParam("discontinued", "")
                                    .formParam("company", "37"));

    {
        setUp(indexRequest.injectOpen(atOnceUsers(10), rampUsers(10000).during(100)).protocols(httpProtocol));
    }
}
