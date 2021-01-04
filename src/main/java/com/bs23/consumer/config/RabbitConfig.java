//package com.bs23.consumer.config;
//
//import com.rabbitmq.client.ConnectionFactory;
//import org.springframework.amqp.core.AmqpAdmin;
//import org.springframework.amqp.rabbit.annotation.EnableRabbit;
//import org.springframework.amqp.rabbit.core.RabbitAdmin;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author Ahmed Dinar
// * Created 1/4/2021
// */
//
//@Configuration
//@EnableRabbit
//public class RabbitConfig {
//
//  @Value("${rabbit.hostName}")
//  String rabbitHostName;
//
//  @Value("${rabbit.virtualHost}")
//  String rabbitVirtualHost;
//
//  @Value("${rabbit.port}")
//  String rabbitPort;
//
//  @Value("${rabbit.username}")
//  String rabbitUsername;
//
//  @Value("${rabbit.password}")
//  String rabbitPassword;
//
//  @Bean
//  public ConnectionFactory connectionFactory() {
//    ConnectionFactory connectionFactory  = new ConnectionFactory();
//    connectionFactory.setUsername(rabbitUsername);
//    connectionFactory.setPassword(rabbitPassword);
//    connectionFactory.setHost(rabbitHostName);
//    connectionFactory.setVirtualHost(rabbitVirtualHost);
//    return connectionFactory;
//  }
//}
