# String Simple Content Platform

A simple example of a stream/message oriented architecture. It includes the following microservices

1. contentpumper: generates dummy messages and sends it to rabbitmq
2. contentconsumer: consumes rabbitmq messages and logs it
3. lookup: consumes the messages and saves it into a relational database. have a controller to allow by-id lookups
4. search: consumes the messages and saves it into a mongodb database. have a controller to allow by-body searches
5. registry: eureka server instance
6. proxy: zull proxy instance

Every different service has a different group on rabbitmq-stream config. So, if you spin more than one instance, no duplicate messages will be processed by the same service group. 
