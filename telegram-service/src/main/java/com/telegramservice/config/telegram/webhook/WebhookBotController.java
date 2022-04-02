package com.telegramservice.config.telegram.webhook;

import com.telegramservice.config.telegram.LifeCycleBot;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class WebhookBotController {

    private final LifeCycleBot bot;

    public WebhookBotController(LifeCycleBot bot) {
        this.bot = bot;
    }

    @PostMapping("/")
    public BotApiMethod<?> handleUpdate(@RequestBody Update update) {

        return bot.onWebhookUpdateReceived(update);
    }
}
