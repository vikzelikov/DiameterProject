package com.company;

import com.company.Kafka.KafkaProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCassandraApplication.class, args);

		KafkaProcessor kafkaProcessor = new KafkaProcessor();
		kafkaProcessor.start();

	}
}
