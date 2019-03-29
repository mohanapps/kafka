# kafka
kafka Demo

This project provide quick setup of single node kafka cluster and integrate with Spring boot framework using spring-kafka api.

Steps:

1. Follow Step 1 through Step6 from below link
    https://kafka.apache.org/quickstart
    
2. Import the demo project as maven project onto eclipse.
3. Run DemoApplication.java.Springboot will bring a instance of embedded tomcat.
4. post message to kafka topic using REST api http://localhost:8080/kafka/sendMessage/testMessage. testMessage in the URI is the message
  that will be posted on to the topic test.
  
5. testMessage will printed in the eclipse console which is cosumed by  DemoConsumer.processMessage method

