package com.telegramservice.config.telegram;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;


@Getter
@Setter
@RequiredArgsConstructor
public class LifeCycleBot extends TelegramWebhookBot {

    private String webhookPath;
    private String botToken;
    private String botName;

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
            SendMessage message = new SendMessage();
        if (update.getMessage() != null && update.getMessage().hasText()) {
            message.setChatId(update.getMessage().getChatId());
            message.setText("Серега педор");
        return message;
        }

        return message;
    }

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public String getBotPath() {
        return null;
    }

    public void setWebhook(String webhookPath) {
        this.webhookPath = webhookPath;
    }
}
