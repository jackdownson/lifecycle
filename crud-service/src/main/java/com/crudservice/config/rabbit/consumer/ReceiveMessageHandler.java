package com.crudservice.config.rabbit.consumer;

import com.crudservice.dto.message.UserDataMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceiveMessageHandler {

    public UserDataMessage getMessageFromTelegramService(UserDataMessage message){
        return message;
    }

}