
# Spring boot - kafka

Spring boot Producer Consumer Example


## Link
https://kafka.apache.org/quickstart 
https://www.apache.org/dyn/closer.cgi?path=/kafka/3.1.0/kafka_2.13-3.1.0.tgz  
https://dlcdn.apache.org/kafka/3.1.0/kafka_2.13-3.1.0.tgz

Open git bash here ==>  kafka_2.13-3.1.0
#### Start Zookeeper

$ bin/zookeeper-server-start.sh config/zookeeper.properties

#### Start Broker

#### add these two lines ::
listeners=PLAINTEXT://0.0.0.0:9092
advertised.listeners=PLAINTEXT://127.0.0.1:9092
#### in server.properties then start broker

$ bin/kafka-server-start.sh config/server.properties

#### Start Producer Springboot app

#### Start client
$ bin/kafka-console-consumer.sh --topic deepakTopic1 --from-beginning --bootstrap-server localhost:9092


#### List Topics
$ bin/kafka-topics.sh --list --bootstrap-server localhost:9092

#### Used
Java       - 8
Kafka      - 3.0.1
SpringBoot - 2.6.6


## API 

#### Send Message

```http
  POST localhost:8080/api/v1/message
```

|  |Body Raw JSON     |               |
 :-------- | :------- | :------------------------- |
|  | { "msg" : "Apache Kafka event"} |



