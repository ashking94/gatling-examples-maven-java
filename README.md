GeMi Gatling Examples in JAVA [![Build Status](https://github.com/gemiusz/gatling-examples-maven-java/actions/workflows/gatling_test_all_mine.yml/badge.svg?branch=master)](https://github.com/gemiusz/gatling-examples-maven-java/actions/workflows/gatling_test_all_mine.yml?query=branch%3Amaster)
============================================

Gatling project in JAVA 17 showing working examples and solutions - Inspired by [Gatling Community](https://community.gatling.io)
<br><br>

It includes:
* [Maven Wrapper](https://maven.apache.org/wrapper/), so that you can immediately run Maven with `./mvnw` without having
  to install it on your computer
* minimal `pom.xml`
* latest version of `io.gatling.highcharts:gatling-charts-highcharts`applied - [Maven Central Repository Search](https://search.maven.org/artifact/io.gatling.highcharts/gatling-charts-highcharts)
* latest version of `io.gatling:gatling-maven-plugin` applied - [Maven Central Repository Search](https://search.maven.org/artifact/io.gatling/gatling-maven-plugin)
* official examples: [ComputerDatabaseSimulation](src/test/java/computerdatabase/ComputerDatabaseSimulation.java), [BasicSimulation](src/test/java/computerdatabase/BasicSimulation.java), [AdvancedSimulationStep01](src/test/java/computerdatabase/advanced/AdvancedSimulationStep01.java), [AdvancedSimulationStep02](src/test/java/computerdatabase/advanced/AdvancedSimulationStep02.java), [AdvancedSimulationStep03](src/test/java/computerdatabase/advanced/AdvancedSimulationStep03.java), [AdvancedSimulationStep04](src/test/java/computerdatabase/advanced/AdvancedSimulationStep04.java), [AdvancedSimulationStep05](src/test/java/computerdatabase/advanced/AdvancedSimulationStep05.java)
* mine examples and solutions mostly based on cases from [Gatling Community](https://community.gatling.io)
* auto run using GitHub [Actions](https://github.com/gemiusz/gatling-examples-maven-java/actions/workflows/gatling_test_all_mine.yml) of all mine examples after `push` and during `pull_request`
<br><br><br>

### Mine examples and solutions divided into cases:
* [**Case0001JMESPathSimulation**](src/test/java/pl/gemiusz/Case0001JMESPathSimulation.java) => [JmesPath is not finding a JSON Object](https://community.gatling.io/t/jmespath-is-not-finding-a-json-object/6995)
* [**Case0002PDFdownloadSimulation**](src/test/java/pl/gemiusz/Case0002PDFdownloadSimulation.java) => [How to ensure a pdf is downloaded during a loadtest?](https://community.gatling.io/t/how-to-ensure-a-pdf-is-downloaded-during-a-loadtest/3927)
* [**Case0003UnzipJsonForFeederSimulation**](src/test/java/pl/gemiusz/Case0003UnzipJsonForFeederSimulation.java) => [Unzipping json file for feeders](https://community.gatling.io/t/unzipping-json-file-for-feeders/6996)
* [**Case0004StatusCodeSimulation**](src/test/java/pl/gemiusz/Case0004StatusCodeSimulation.java) => [withDefault Check Transforming feature](https://community.gatling.io/t/withdefault-check-transforming-feature/7008)
* [**Case0005UUIDfeederSimulation**](src/test/java/pl/gemiusz/Case0005UUIDfeederSimulation.java) => [Is there an EL function to generate uuid using java in gatling](https://community.gatling.io/t/is-there-an-el-function-to-generate-uuid-using-java-in-gatling/7028)
* [**Case0006CommandLineParametersSimulation**](src/test/java/pl/gemiusz/Case0006CommandLineParametersSimulation.java) => [Cannot Grab Command Line Arguments](https://community.gatling.io/t/cannot-grab-command-line-arguments/7025)
* [**Case0007AsyncReqSimulation**](src/test/java/pl/gemiusz/Case0007AsyncReqSimulation.java) - using `repeat` => [How to simulate an asynchronous request executing many times?](https://community.gatling.io/t/how-to-simulate-an-asynchronous-request-executing-many-times/7031)
* [**Case0008AsyncReqResourcesSimulation**](src/test/java/pl/gemiusz/Case0008AsyncReqResourcesSimulation.java) - using `resources` => [How to simulate an asynchronous request executing many times?](https://community.gatling.io/t/how-to-simulate-an-asynchronous-request-executing-many-times/7031)
* [**Case0009SessionValuesSimulation**](src/test/java/pl/gemiusz/Case0009SessionValuesSimulation.java) => [Dynamically generating param values for an API and setting it using session](https://community.gatling.io/t/dynamically-generating-param-values-for-an-api-and-setting-it-using-session/7041)
* [**Case0010JsonEditVariableSimulation**](src/test/java/pl/gemiusz/Case0010JsonEditVariableSimulation.java) => [Java - edit variable received in JSON](https://community.gatling.io/t/java-edit-variable-received-in-json/7046)
* [**Case0011ProxyCommandLineParametersSimulation**](src/test/java/pl/gemiusz/Case0011ProxyCommandLineParametersSimulation.java) => [Gatling proxy configuration from command line](https://community.gatling.io/t/gatling-proxy-configuration-from-command-line/7072)
* [**Case0012DenySomeResourcesSimulation**](src/test/java/pl/gemiusz/Case0012DenySomeResourcesSimulation.java) => [Gatling Java - HttpProtocolBuilder DenyList](https://community.gatling.io/t/gatling-java-httpprotocolbuilder-denylist/7099)
* [**Case0013RequestBeforeSimulation**](src/test/java/pl/gemiusz/Case0013RequestBeforeSimulation.java) => [Best way of calling another API before the performance test](https://community.gatling.io/t/best-way-of-calling-another-api-before-the-performance-test/7116)
* [**Case0014Loop5times1RPSand3sPauseSimulation**](src/test/java/pl/gemiusz/Case0014Loop5times1RPSand3sPauseSimulation.java) => [Emulate load with few requests simultaneously that repeated after some period of time](https://community.gatling.io/t/emulate-load-with-few-requests-simultaneously-that-repeated-after-some-period-of-time/7155)
* [**Case0015UUIDfeederTwoRecordsAtTheSameTimeSimulation**](src/test/java/pl/gemiusz/Case0015UUIDfeederTwoRecordsAtTheSameTimeSimulation.java) => [Feed multiple n-rows from CSV to json payload](https://community.gatling.io/t/feed-multiple-n-rows-from-csv-to-json-payload/7160)
* [**Case0016ScenarioDurationSimulation**](src/test/java/pl/gemiusz/Case0016ScenarioDurationSimulation.java) => [How to get the duration of a specific scnario?](https://community.gatling.io/t/how-to-get-the-duration-of-a-specific-scnario/7220)
* [**Case0017ForeachAfterForeachSimulation**](src/test/java/pl/gemiusz/Case0017ForeachAfterForeachSimulation.java) => [Foreach loop after a foreach loop does not execute](https://community.gatling.io/t/foreach-loop-after-a-foreach-loop-does-not-execute/7277)
* [**Case0018GetTokenWhenStatus401Simulation**](src/test/java/pl/gemiusz/Case0018GetTokenWhenStatus401Simulation.java) => [Using a .doIf when token expired and need refresh](https://community.gatling.io/t/using-a-doif-when-token-expired-and-need-refresh/7303)
* [**Case0019WhenStatusCode400ThenFailSimulation**](src/test/java/pl/gemiusz/Case0019WhenStatusCode400ThenFailSimulation.java) => [Assertion on the HTTP status code](https://community.gatling.io/t/assertion-on-the-http-status-code/7355)
* [**Case0020ExitBlockOnFailSimulation**](src/test/java/pl/gemiusz/Case0020ExitBlockOnFailSimulation.java) => [Stop the current Iteration/loop and start the next Iteration/loop when request failed](https://community.gatling.io/t/stop-the-current-iteration-loop-and-start-the-next-iteration-loop-when-request-failed/7492)
