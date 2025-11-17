package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    MyBotservies myBotservies = new MyBotservies();


    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "@Looewe_bot";
    }

    @Override
    public String getBotToken() {
        return "8596659549:AAG_8g-QBiXRW6O9ZYnqVm9B8hqsLH7aoJM";
    }
}
