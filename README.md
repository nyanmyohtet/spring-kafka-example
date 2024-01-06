# Spring Kafka Example

Spring Boot with Kafka

## Tech Stack

- kafka : [2.13-3.6.1](https://dlcdn.apache.org/kafka/3.6.1/kafka_2.13-3.6.1.tgz)
- spring boot : 2.x

## Kafka

### Run with Docker

```shell
docker compose up -d
```

### Run Locally

#### for Linux

```shell
# Start the ZooKeeper service
bin/zookeeper-server-start.sh config/zookeeper.properties

# Start the Kafka broker service
bin/kafka-server-start.sh config/server.properties
```

#### for Windows(with cmd)
```shell
# Start the ZooKeeper service
zookeeper-server-start.bat ..\..\config\zookeeper.properties

# Start the Kafka broker service
kafka-server-start.bat ..\..\config\server.properties
```

### Read Event

#### for Linux
```sh
bin/kafka-console-consumer.sh --topic <topic-name> --from-beginning --bootstrap-server localhost:9092
```

### for Windows(use cmd)
inside `bin\windows`
```sh
kafka-console-consumer.bat --topic <topic-name> --from-beginning --bootstrap-server localhost:9092
```

## Dockerize

ref: https://www.baeldung.com/ops/kafka-docker-setup

## Kafka

ref:
- https://www.youtube.com/watch?v=SqVfCyfCJqw
- https://medium.com/@Wajahat_Hussain_/a-comprehensive-guide-to-getting-started-with-apache-kafka-using-docker-61cc27e1ffb0
