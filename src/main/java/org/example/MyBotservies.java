package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class MyBotservies {

    public SendMessage Ozbemzayu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("salom");

        return sendMessage;
    }
}
