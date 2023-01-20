# Getting Started

## Starting ELK stack locally

The easiest way is to start ELK stack via `docker-compose`. You can use the following repo to get ELK up and running - [Elastic stack (ELK) on Docker](https://github.com/deviantony/docker-elk).

After initial setup is done - login to [Kibana](http://localhost:5601), then:
* navigate to [Management -> Ingest -> Logstash Pipelines](http://localhost:5601/app/management/ingest/pipelines/pipeline)
* hit `Create Pipeline` button
* in the `pipeline` window paste
```shell
input { 
    tcp {
        port => 50000
    }
}

output {
    elasticsearch {
        hosts => "elasticsearch:9200"
        user => "logstash_internal"
        password => "changeme"
    }
}
```
* restart the stack
* start the app
* open [Kibana](http://localhost:5601) and navigate to [Analytics -> Discover](http://localhost:5601/app/discover)
* observe the logs from the app

## Useful Documentation

* [CENTRALIZED LOG MANAGEMENT (GRAYLOG, LOGSTASH, FLUENTD)](https://quarkus.io/guides/centralized-log-management)
* [Elastic Stack and GELF](https://docs.revenera.com/fne/2021_09/adminguide/content/helplibrary/Elastic_Stack_and_GELF.htm)
* [Graylog Extended Format logging driver](https://docs.docker.com/config/containers/logging/gelf/)

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.1/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

