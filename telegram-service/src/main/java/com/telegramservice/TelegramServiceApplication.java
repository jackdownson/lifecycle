package com.telegramservice;

import com.telegramservice.config.ConfigConstants;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan(basePackages="com.telegramservice")
@Slf4j
public class TelegramServiceApplication {



	public static void main(String[] args) {
		SpringApplication.run(TelegramServiceApplication.class, args);

	}

}
