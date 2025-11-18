package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotservies {

    // text yozw uchun

    // O'zbekcha menyu
    public SendMessage uzMain (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ushbu bot sizga 'Loewe' haqida kerakli ma'lumotlarni topishga va sizga kerakli mahsulotlarni topishga yordam beradi.");
        return sendMessage;
    }
    // O'zbekcha menyu
    public SendMessage uzMainMenu (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menyuni tanlang:");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        // 👔 Kiyimlar
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDC54 Kiyimlar");
        row.add(button);
        rowList.add(row);

        //
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("");
        row1.add(button1);
        rowList.add(row1);

        //
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("");
        row2.add(button2);
        rowList.add(row2);

        //
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("");
        row2.add(button3);

        //
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("");
        row3.add(button4);
        rowList.add(row3);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }











    //inline buttonlar uchun

    // O'zbekcha tilni tanlash menyusi
    public SendMessage uzLangMenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("'Loewe' botiga xush kelibsiz!\nTilni tanlang:'");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button = new InlineKeyboardButton();
        button.setText("O'zbekcha \uD83C\uDDFA\uD83C\uDDFF");
        button.setCallbackData("O'zbekchaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button.setText("Русский \uD83C\uDDF7\uD83C\uDDFA");
        button.setCallbackData("РусскийId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("English \uD83C\uDDEC\uD83C\uDDE7");
        button.setCallbackData("EnglishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }













    // reply button uchun

}
