package com.crudservice.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class ConfigConstants {

    @Value("${constants.rabbit.exchange}")
    public String EXCHANGE_NAME;
    @Value("${constants.rabbit.queue}")
    public String QUEUE_NAME;
    @Value("${constants.rabbit.routing-key}")
    public String ROUTING_KEY;

}
