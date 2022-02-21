package com.crudservice.service;

import com.crudservice.config.rabbit.consumer.ReceiveMessageHandler;
import com.crudservice.dto.message.UserDataMessage;

/**
 * Класс дя обработки получаемого сообщения из telegram-service.*/
public class ReceiveMessageUseCase {

    ReceiveMessageHandler messageHandler;

    public void receiveMessage(UserDataMessage message){
        messageHandler.getMessageFromTelegramService(message);
        System.out.println(message);

    }
}