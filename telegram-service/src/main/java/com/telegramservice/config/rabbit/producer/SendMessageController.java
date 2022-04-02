package com.telegramservice.config.rabbit.producer;

import com.telegramservice.config.ConfigConstants;
import com.telegramservice.dto.UserDataDto;
import com.telegramservice.dto.message.UserDataMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class SendMessageController {

    private final ConfigConstants config;
    private final RabbitTemplate rabbitTemplate;

    public SendMessageController(ConfigConstants config, RabbitTemplate rabbitTemplate) {
        this.config = config;
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/send")
    public ResponseEntity<?> sendMessage() {
        UserDataMessage message = new UserDataMessage();
        UserDataDto userData = new UserDataDto();
        userData.setDayNotes("day was good");
        userData.setAssignmentTime(new Date());
        userData.setWork("12");

        message.setMessageId(UUID.randomUUID().toString());
        message.setMessageDate(new Date());
        message.setUserDataDto(userData);

        rabbitTemplate.convertAndSend(config.EXCHANGE_NAME,
                config.ROUTING_KEY, message);
        return ResponseEntity.ok("We have sent a message! :" + message);
    }
}