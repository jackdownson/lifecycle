package com.telegramservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yml")
public class ConfigConstants {
    @Value("${constants.rabbit.exchange}")
    public String EXCHANGE_NAME;
    @Value("${constants.rabbit.queue}")
    public String QUEUE_NAME;
    @Value("${constants.rabbit.routing-key}")
    public String ROUTING_KEY;
}
