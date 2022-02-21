package com.telegramservice.config.rabbit.consumer;

import com.telegramservice.dto.message.UserDataMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceiveMessageHandler {

    public UserDataMessage getMessageFromCrudService(UserDataMessage message){
        return message;
    }

}