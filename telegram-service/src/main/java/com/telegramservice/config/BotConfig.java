package com.telegramservice.config;

import com.telegramservice.LifeCycleBot;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Configuration
@Slf4j
public class BotConfig {
    @Value("${telegrambot_webhook}")
    private String botWebhook;
    @Value("${telegrambot_token}")
    private String botToken;
    @Value("${telegrambot_username}")
    private String botName;

    @Bean
    public LifeCycleBot mySubscribeBot() {
        LifeCycleBot bot = new LifeCycleBot();
        bot.setBotName(botName);
        bot.setBotToken(botToken);
        bot.setBotWebhook(botWebhook);
        log.info("Bot started with props: " +
                        "{}" +
                        " {}" +
                        " {}",
                botName,
                botToken,
                botWebhook);
        return bot;
    }
}
