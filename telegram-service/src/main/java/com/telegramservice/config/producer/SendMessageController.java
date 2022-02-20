package com.telegramservice.config.producer;

import com.telegramservice.config.ConfigConstants;
import com.telegramservice.config.ConfigureRabbitMq;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    private final ConfigConstants config;
    private final RabbitTemplate rabbitTemplate;

    public SendMessageController(ConfigConstants config, RabbitTemplate rabbitTemplate) {
        this.config = config;
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/send")
    public ResponseEntity<?> sendMessage(@RequestParam String themessage) {
        rabbitTemplate.convertAndSend(config.EXCHANGE_NAME,
                config.ROUTING_KEY, themessage);
        return ResponseEntity.ok("We have sent a message! :" + themessage);
    }
}