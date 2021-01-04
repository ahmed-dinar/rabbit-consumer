package com.bs23.consumer.config;


import java.util.Map;

public class RabbitConsumer {

  public void consume(Map<String, String> message) {

    System.out.println("recievedMessage ------------> " + message);
  }
}
