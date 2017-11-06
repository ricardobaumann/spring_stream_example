# Streaming example

A simple example of a stream/message oriented architecture. It includes the following microservices

1. `eventsource`: generates dummy messages and sends it to rabbitmq. Some are specific for a channel, others are for both.
2. `eventconsumer_abc` and `eventconsumer_xyz`: consumes rabbitmq messages from a specific topic and logs it
5. `registry`: eureka server instance

Every different service has a different group on rabbitmq-stream config. So, if you spin more than one instance, no duplicate messages will be processed by the same service group. 

## Usage
1. Install `maven3` and `docker compose`
2. Run `mvn clean package && docker-compose up` on the root folder and check out the logs. 

Please leave your questions on this repo and I will come back to you. 
