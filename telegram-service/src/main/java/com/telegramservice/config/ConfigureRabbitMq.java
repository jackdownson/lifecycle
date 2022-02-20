package com.telegramservice.config;

import com.telegramservice.config.consumer.ReceiveMessageHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class ConfigureRabbitMq {

    @Autowired
    ConfigConstants config;


    @Bean
    Queue createQueue() {
        log.info(config.QUEUE_NAME);
        return new Queue(config.QUEUE_NAME, true, false, false);
    }

    @Bean
    TopicExchange exchange() {
        log.info(config.EXCHANGE_NAME);
        return new TopicExchange(config.EXCHANGE_NAME);
    }

    @Bean
    Binding binding(Queue q, TopicExchange exchange) {
        return BindingBuilder.bind(q).to(exchange).with("data.#");
    }


}
