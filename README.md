# SpringCloudKafkaBinder
 SpringCloudKafkaBinder 
 using 4 dependencies :->Cloud Stream,Spring Apache Kafka,Spring Web,Lombok
 
 

**start** :-zookeeper-server-start.bat C:\kafka\config\zookeeper.properties

**start** :-kafka-server-start.bat C:\kafka\config\server.properties


**create** :-bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test

 **list all the topics creatd** :-list out all topic :-bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092


**produce something** :- bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic test

//we cna produce something from spring boot app as well

**consume what produced** :- bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning
 

 

