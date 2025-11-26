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
    public SendPhoto UzVeitrovkaPicture1 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/64?single"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture2 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/65"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture3 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/66"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture4 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/67"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture5 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/73"));
        sendPhoto.setCaption("kurtk \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture6 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/77"));
        sendPhoto.setCaption("kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 85$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture7 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/78"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }

    //aksesuarlar
    public SendPhoto UzAksesuarlarPicture1 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/78"));
        sendPhoto.setCaption("sumka \n Rangi: qora \n Razmeri:yoq \n Narxi: 30$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture2 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/79"));
        sendPhoto.setCaption("sumka \n Rangi: yashil \n Razmeri:yoq \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture3 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/80"));
        sendPhoto.setCaption("ochki \n Rangi: qora \n Razmeri:yoq \n Narxi: 30$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture4 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/81"));
        sendPhoto.setCaption("ochki \n Rangi: oq \n Razmeri:yoq \n Narxi: 30$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture5 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/82"));
        sendPhoto.setCaption("ochki \n Rangi: qora \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture6 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/83"));
        sendPhoto.setCaption("kepka \n Rangi: idk \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture7 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/84"));
        sendPhoto.setCaption("kepka \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture13 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/91"));
        sendPhoto.setCaption("nike \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture8 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/92"));
        sendPhoto.setCaption("shapka \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture9 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/93"));
        sendPhoto.setCaption("qolqop \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture10 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/94"));
        sendPhoto.setCaption("achki \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture11 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/95"));
        sendPhoto.setCaption("shapka \n Rangi: qora \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture12 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/96"));
        sendPhoto.setCaption("kepka \n Rangi: idk \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }

    //fudbolka
    public SendPhoto UzFudbolkaPicture1 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/42"));
        sendPhoto.setCaption("FUdbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture2 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/43"));
        sendPhoto.setCaption("Fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture3 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/44"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture4 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/45"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture5 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/46"));
        sendPhoto.setCaption("fudbolka \n Rangi: oq \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture6 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/124"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture7 (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/125"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }















    // text yozw uchun

    // O'zbekcha menyu 1
    public SendMessage uzMain(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ushbu bot sizga 'Loewe' haqida kerakli ma'lumotlarni topishga va sizga kerakli mahsulotlarni topishga yordam beradi.");
        return sendMessage;
    }

    // O'zbekcha menyu 2
    public SendMessage uzMainMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menyuni tanlang:");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        // clothes
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDC54 Kiyimlar");
        row.add(button);
        rowList.add(row);

        // Communicate us
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCC8 Hamkorlik");
        row1.add(button1);
        rowList.add(row1);

        // tips
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCAC Izoh Qoldirish");
        row2.add(button2);
        rowList.add(row2);

        // change language
        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDDFA\uD83C\uDDFF Tilni o'zgartirish");
        row3.add(button3);
        rowList.add(row3);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


    //inline buttonlar uchun


    // O'zbekcha LANGUAGE MENU #########
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

    // Kiyimlar
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

    // Baggy main menu
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
        button.setCallbackData("uzBaggyVitrovkalarId");
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
    // Baggy >> Hoodie Picture Purchase item Inline Button
    public SendMessage uzPurchaseHoodie1 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

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
        sendMessage.setText("_____________________________________________");

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
        sendMessage.setText("_____________________________________________");

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
        sendMessage.setText("_____________________________________________");

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
        sendMessage.setText("_____________________________________________");

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
        sendMessage.setText("_____________________________________________");

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
        sendMessage.setText("_____________________________________________");

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
        sendMessage.setText("_____________________________________________");

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
        sendMessage.setText("_____________________________________________");

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
        sendMessage.setText("_____________________________________________");

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

    // Baggy >> Shimlar Picture Purchase item inline button
    public SendMessage uzPurchaseShim1 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzShimPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzShimPic1OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzShimPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseShim2 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzShimPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzShimPic2OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzShimPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseShim3 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzShimPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzShimPic3OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzShimPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseShim4 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzShimPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzShimPic4OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzShimPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Baggy >> Fudbolkalar Picture Purchase item inline button

    // Baggy >> Veitrovkalar Picture Purchase item inline button
    public SendMessage uzPurchaseVeitrovka1 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic1OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzVeitrovkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzVeitrovkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseVeitrovka2 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic2OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzVeitrovkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzVeitrovkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseVeitrovka3 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic3OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzVeitrovkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzVeitrovkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseVeitrovka4 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPicOldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzVeitrovkaPic4SotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzVeitrovkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseVeitrovka5 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic5OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic5OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzVeitrovkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzVeitrovkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseVeitrovka6 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic6OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic6OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzVeitrovkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzVeitrovkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseVeitrovka7 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic7OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic7OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzVeitrovkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzVeitrovkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseShim5 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzShimPic5OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzShimPic5OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzShimPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Bag'g'iy

    // Classic main menu
    public SendMessage uzClassicMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kiyimlar Bolimi Styleni Tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDC58 Sweaterlar");
        button.setCallbackData("uzClassicSweaterId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDC56 Shimlar");
        button.setCallbackData("uzClassicShimlarId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDC55 Fudbolkalar");
        button.setCallbackData("uzClassicFutbolkalarId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83E\uDD7C Veitrovkalar");
        button.setCallbackData("uzClassicVitrovkalar");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅️\uFE0F Ortga");
        button.setCallbackData("uzClassicOrtgaId");
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