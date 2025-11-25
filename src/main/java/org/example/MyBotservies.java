 package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.LongFunction;

public class MyBotservies {

    //Hodiie Rasmlar
    public SendPhoto UzHoodiePicture1 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/8"));
        sendPhoto.setCaption("Hoodie \n Rangi: Och kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture2 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/9"));
        sendPhoto.setCaption("Hoodie \n Rangi: Toq Kok \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture3 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/10"));
        sendPhoto.setCaption("Hoodie \n Rangi: kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture4 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/11"));
        sendPhoto.setCaption("Hoodie \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture5 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/12"));
        sendPhoto.setCaption("Hoodie \n Rangi: Qora  \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture6 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/13"));
        sendPhoto.setCaption("Hoodie \n Rangi: Oq va qora(oddiy bomaga) \n Razmeri: xs,s,m,l,xl \n Narxi: 359 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture7 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/14"));
        sendPhoto.setCaption("Hoodie \n Rangi: Kok va oq\n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture8 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/15"));
        sendPhoto.setCaption("Hoodie \n Rangi: Qizil va oq\n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture9 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/16"));
        sendPhoto.setCaption("Hoodie \n Rangi: Malocni va toq kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture10 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/17"));
        sendPhoto.setCaption("Hoodie \n Rangi: Och kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }

    //Shim rasmlar
    public SendPhoto UzShimPicture1 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/47"));
        sendPhoto.setCaption("Shim \n Rangi: qoramtir \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture2 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/48"));
        sendPhoto.setCaption("Shortiklik Shim \n Rangi: qoramtir (ortasi Oqishroq) \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture3 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/49"));
        sendPhoto.setCaption("Shim \n Rangi: Kok \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture4 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/50"));
        sendPhoto.setCaption("Shim \n Rangi: Seriy \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture5 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/51"));
        sendPhoto.setCaption("Shim \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }

    //Sviter rasmlar
    public SendPhoto UzSveiterPicture1 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/60"));
        sendPhoto.setCaption("Sveiter \n Rangi: Qaymoq rang \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto UzSveiterPicture2 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/61"));
        sendPhoto.setCaption("Sveiter \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto UzSveiterPicture3 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/62"));
        sendPhoto.setCaption("Sveiter \n Rangi: Qora \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto UzSveiterPicture4 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/63"));
        sendPhoto.setCaption("Sveiter \n Rangi: Seriy \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }

    // Veitrovkalar
    public SendPhoto UzVeitrovkaPicture4 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/63"));
        sendPhoto.setCaption("Sveiter \n Rangi: Seriy \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }








    // text yozw uchun

    // O'zbekcha menyu
    public SendMessage uzMain(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ushbu bot sizga 'Loewe' haqida kerakli ma'lumotlarni topishga va sizga kerakli mahsulotlarni topishga yordam beradi.");
        return sendMessage;
    }

    // O'zbekcha menyu
    public SendMessage uzMainMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menyuni tanlang:");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        //👔 Kiyimlar
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDC54 Kiyimlar");
        row.add(button);
        rowList.add(row);

        //
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCC8 Hamkorlik");
        row1.add(button1);
        rowList.add(row1);

        //
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCAC Izoh Qoldirish");
        row2.add(button2);
        rowList.add(row2);

        //
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDDFA\uD83C\uDDFF Tilni tanlash");
        row3.add(button3);
        rowList.add(row3);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


    //inline buttonlar uchun


    // O'zbekcha tilni tanlash menyusi
    public SendMessage uzLangMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("'Loewe' botiga xush kelibsiz!\nTilni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("O'zbekcha \uD83C\uDDFA\uD83C\uDDFF");
        button.setCallbackData("O'zbekchaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
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

    // Kiyimlar stylelari menyusi
    public SendMessage uzKiyimlarMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kiyimlar bolimi stilini tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDC56 Baggy");
        button.setCallbackData("uzBaggyId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83E\uDDE5 Classic");
        button.setCallbackData("uzClassicId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83E\uDE73 New Money");
        button.setCallbackData("uzNewMoneyId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅️\uFE0F Ortga");
        button.setCallbackData("uzKiyimlarOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Kiyimlar stylelari menyusi >> Baggy menu2
    public SendMessage uzBaggyMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kiyimlar Bolimi Styleni Tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDC58 Hoodie");
        button.setCallbackData("uzBaggyHoodieId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDC56 Shimlar");
        button.setCallbackData("uzBaggyShimlarId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDC55 Fudbolkalar");
        button.setCallbackData("uzBaggyFutbolkalarId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83E\uDD7C Veitrovkalar");
        button.setCallbackData("uzBaggyVitrovkalar");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅️\uFE0F Ortga");
        button.setCallbackData("uzBaggyOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Hoodie Picture Purchase item Inline Button
    public SendMessage uzPurchaseHoodie1 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePic1OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseHoodie2 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePic2OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseHoodie3 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePic3OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseHoodie4 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePicOldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePic4SotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseHoodie5 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic5OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePic5OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseHoodie6 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic6OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePic6OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseHoodie7 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic7OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePic7OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseHoodie8 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic8OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePic8OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseHoodie9 (Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic9OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePic9OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseHoodie10 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("______________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzHoodiePic10OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzHoodiePic10OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzHoodiePicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHoodieOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }


    public SendMessage uzPurchase(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Pulingiz yetmayapti :3");
        return sendMessage;
    }
    //end uz


    // reply button uchun

}