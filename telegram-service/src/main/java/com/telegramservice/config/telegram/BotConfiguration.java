package com.telegramservice.config.telegram;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.ApiContext;

@Slf4j
@Configuration
public class BotConfiguration {

    @Value("${telegram.bot.token}")
    private String token;
    @Value("${telegram.bot.name}")
    private String name;
    @Value("${telegram.bot.webhookPath}")
    private String webhookPath;

    @Bean
    public LifeCycleBot lifeCycleBot() {
        LifeCycleBot bot = new LifeCycleBot();

        bot.setWebhook(webhookPath);
        bot.setBotName(name);
        bot.setBotToken(token);

        log.info("Bot started with props: " +
                        "{}" +
                        " {}" +
                        " {}",
                name,
                token,
                webhookPath);

        return bot;
    }

}
