package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class MyBotservies {

    //Hodiie Rasmlar
    public SendPhoto UzHoodiePicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/8"));
        sendPhoto.setCaption("Hoodie \n Rangi: Och kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/9"));
        sendPhoto.setCaption("Hoodie \n Rangi: Toq Kok \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/10"));
        sendPhoto.setCaption("Hoodie \n Rangi: kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/11"));
        sendPhoto.setCaption("Hoodie \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/12"));
        sendPhoto.setCaption("Hoodie \n Rangi: Qora  \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/13"));
        sendPhoto.setCaption("Hoodie \n Rangi: Oq va qora(oddiy bomaga) \n Razmeri: xs,s,m,l,xl \n Narxi: 359 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/14"));
        sendPhoto.setCaption("Hoodie \n Rangi: Kok va oq\n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/15"));
        sendPhoto.setCaption("Hoodie \n Rangi: Qizil va oq\n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/16"));
        sendPhoto.setCaption("Hoodie \n Rangi: Malocni va toq kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto UzHoodiePicture10(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/17"));
        sendPhoto.setCaption("Hoodie \n Rangi: Och kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }

    //Shim rasmlar
    public SendPhoto UzShimPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/47"));
        sendPhoto.setCaption("Shim \n Rangi: qoramtir \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/48"));
        sendPhoto.setCaption("Shortiklik Shim \n Rangi: qoramtir (ortasi Oqishroq) \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/49"));
        sendPhoto.setCaption("Shim \n Rangi: Kok \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/50"));
        sendPhoto.setCaption("Shim \n Rangi: Seriy \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/51"));
        sendPhoto.setCaption("Shim \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/127"));
        sendPhoto.setCaption("Shim \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/128"));
        sendPhoto.setCaption("Shim \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto UzShimPicture8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/129"));
        sendPhoto.setCaption("Shim \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }


    //Sviter rasmlar
    public SendPhoto UzSveiterPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/60"));
        sendPhoto.setCaption("Sveiter \n Rangi: Qaymoq rang \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto UzSveiterPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/61"));
        sendPhoto.setCaption("Sveiter \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto UzSveiterPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/62"));
        sendPhoto.setCaption("Sveiter \n Rangi: Qora \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto UzSveiterPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/63"));
        sendPhoto.setCaption("Sveiter \n Rangi: Seriy \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }

    // Veitrovkalar
    public SendPhoto UzVeitrovkaPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/64?single"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/65"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/66"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/67"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/73"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/74"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 85$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/75"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/130"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzVeitrovkaPicture9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/131"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }

    //aksesuarlar
    public SendPhoto UzAksesuarlarPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/78"));
        sendPhoto.setCaption("sumka \n Rangi: qora \n Razmeri:yoq \n Narxi: 30$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/79"));
        sendPhoto.setCaption("sumka \n Rangi: yashil \n Razmeri:yoq \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/80"));
        sendPhoto.setCaption("ochki \n Rangi: qora \n Razmeri:yoq \n Narxi: 30$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/81"));
        sendPhoto.setCaption("ochki \n Rangi: oq \n Razmeri:yoq \n Narxi: 30$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/82"));
        sendPhoto.setCaption("ochki \n Rangi: qora \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/83"));
        sendPhoto.setCaption("kepka \n Rangi: idk \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/84"));
        sendPhoto.setCaption("kepka \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/92"));
        sendPhoto.setCaption("shapka \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/93"));
        sendPhoto.setCaption("qolqop \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture10(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/94"));
        sendPhoto.setCaption("achki \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture12(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/96"));
        sendPhoto.setCaption("kepka \n Rangi: idk \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto UzAksesuarlarPicture13(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/91"));
        sendPhoto.setCaption("nike \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }

    //Baggy fudbolka
    public SendPhoto UzfudbolkaPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/42"));
        sendPhoto.setCaption("FUdbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/43"));
        sendPhoto.setCaption("Fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/44"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/45"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/46"));
        sendPhoto.setCaption("fudbolka \n Rangi: oq \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/124"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto UzfudbolkaPicture7(Long chatId) {
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
        button.setText("\uD83D\uDC53 Aksessuarlar \uD83E\uDDE3");
        button.setCallbackData("uzAksessuarlarId");
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
    public SendMessage uzPurchaseHoodie1(Long chatId) {
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
    public SendMessage uzPurchaseHoodie2(Long chatId) {
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
    public SendMessage uzPurchaseHoodie3(Long chatId) {
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
    public SendMessage uzPurchaseHoodie4(Long chatId) {
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
        button.setCallbackData("uzHoodiePic4OldingaId");
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
    public SendMessage uzPurchaseHoodie5(Long chatId) {
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
    public SendMessage uzPurchaseHoodie6(Long chatId) {
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
    public SendMessage uzPurchaseHoodie7(Long chatId) {
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
    public SendMessage uzPurchaseHoodie8(Long chatId) {
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
    public SendMessage uzPurchaseHoodie9(Long chatId) {

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
    public SendMessage uzPurchaseHoodie10(Long chatId) {
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
    public SendMessage uzPurchaseShim1(Long chatId) {
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
    public SendMessage uzPurchaseShim2(Long chatId) {
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
    public SendMessage uzPurchaseShim3(Long chatId) {
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
    public SendMessage uzPurchaseShim4(Long chatId) {
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
    public SendMessage uzPurchaseShim5(Long chatId) {
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

    // Baggy >> Fudbolkalar Picture Purchase item inline button
    public SendMessage uzPurchaseFudbolka1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic1OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseFudbolka2(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic2OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseFudbolka3(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic3OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseFudbolka4(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic4OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseFudbolka5(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic5OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic5OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseFudbolka6(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic6OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic6OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseFudbolka7(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic7OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic7OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Baggy >> Veitrovkalar Picture Purchase item inline button
    public SendMessage uzPurchaseVeitrovka1(Long chatId) {
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
    public SendMessage uzPurchaseVeitrovka2(Long chatId) {
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
    public SendMessage uzPurchaseVeitrovka3(Long chatId) {
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
    public SendMessage uzPurchaseVeitrovka4(Long chatId) {
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
        button.setCallbackData("uzVeitrovkaPic4OldingaId");
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
    public SendMessage uzPurchaseVeitrovka5(Long chatId) {
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
    public SendMessage uzPurchaseVeitrovka6(Long chatId) {
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
    public SendMessage uzPurchaseVeitrovka7(Long chatId) {
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
    public SendMessage uzPurchaseVeitrovka8(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic8OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic8OldingaId");
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
    public SendMessage uzPurchaseVeitrovka9(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic9OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic9OldingaId");
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
        button.setText("⬅️\uFE0F Ortga");
        button.setCallbackData("uzClassicOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Classic menu >> Sweater Pic Purchase item inline button
    public SendMessage uzClassicSweaterPurchase1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzSweaterPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzSweaterPic1OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzSweaterPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzSweaterOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzClassicSweaterPurchase2(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzSweaterPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzSweaterPic2OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzSweaterPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzSweaterOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzClassicSweaterPurchase3(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzSweaterPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzSweaterPic3OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzSweaterPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzSweaterOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzClassicSweaterPurchase4(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzSweaterPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzSweaterPic4OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzSweaterPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzSweaterOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Classic menu >> Shimlar Pic Purchase item inline button
    public SendMessage uzPurchaseClassicShim1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic1OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseClassicShim2(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic2OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseClassicShim3(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic3OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseClassicShim4(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic4OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseClassicShim5(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic5OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic5OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseClassicShim6(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic6OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic6OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseClassicShim7(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic7OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic7OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseClassicShim8(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzShimPic8OrtgaId");
        button.setCallbackData("uzClassicShimPic8OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic8OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Kiyimlar >> Aksessuarlar menu
    public SendMessage uzPurchaseAcces1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic1OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces2 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic2OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces3(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic3OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces4(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic4OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces5(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic5OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic5OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces6(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic6OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic6OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces7(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic7OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic7OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces8(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic8OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic9OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces9(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic9OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic9OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces10(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic10OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic10OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces12(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic12OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic12OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzPurchaseAcces13(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic13OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic13OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }


    public SendMessage uzPurchase(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Buyurtmani olish yo'lini tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDE9A Yetkazib berish");
        button.setCallbackData("uzYetkazibBerishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDFEA Kelib olib ketish");
        button.setCallbackData("uzKelibOlishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage uzKelibOlish1(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCCD Shu yerda bizning manzilimizga kelib mahsulotni olib keting");
        return sendMessage;
    }
    public SendLocation uzKelibOlish2(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(40.7236413);
        sendLocation.setLongitude(-74.0010634);
        return sendLocation;
    }
    //end uz


    // hamkorlik menu
    public SendMessage uzHamkorlik(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Biz bilan hamkorlik uchun!!!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCDE Biz bilan bog'lanish");
        button.setCallbackData("uzBoglanishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("☎\uFE0F Bizning kontaktlarimiz");
        button.setCallbackData("uzOurContactsId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCCD Bizning manzillarimiz");
        button.setCallbackData("uzLocationId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHamkorlikOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }


    // reply button uchun

    //oz main
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

    //izoh qoldirish
    public SendMessage uzIzohQoldirish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Biz siz bilan bog‘lanishimiz uchun telefon raqamingizni yuboring:");

        // Keyboard
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("📱 Telefon raqamni yuborish");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅\uFE0F Ortga");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

















    // Rus tili
    //#################################################################################################################

    //Hodiie Rasmlar
    public SendPhoto ruHoodiePicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/8"));
        sendPhoto.setCaption("Hoodie \n Rangi: Och kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto ruHoodiePicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/9"));
        sendPhoto.setCaption("Hoodie \n Rangi: Toq Kok \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto ruHoodiePicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/10"));
        sendPhoto.setCaption("Hoodie \n Rangi: kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto ruHoodiePicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/11"));
        sendPhoto.setCaption("Hoodie \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto ruHoodiePicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/12"));
        sendPhoto.setCaption("Hoodie \n Rangi: Qora  \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto ruHoodiePicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/13"));
        sendPhoto.setCaption("Hoodie \n Rangi: Oq va qora(oddiy bomaga) \n Razmeri: xs,s,m,l,xl \n Narxi: 359 900");
        return sendPhoto;
    }
    public SendPhoto ruHoodiePicture7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/14"));
        sendPhoto.setCaption("Hoodie \n Rangi: Kok va oq\n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto ruHoodiePicture8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/15"));
        sendPhoto.setCaption("Hoodie \n Rangi: Qizil va oq\n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto ruHoodiePicture9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/16"));
        sendPhoto.setCaption("Hoodie \n Rangi: Malocni va toq kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }
    public SendPhoto ruHoodiePicture10(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/17"));
        sendPhoto.setCaption("Hoodie \n Rangi: Och kulrang \n Razmeri: xs,s,m,l,xl \n Narxi: 259 900");
        return sendPhoto;
    }

    //Shim rasmlar
    public SendPhoto ruShimPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/47"));
        sendPhoto.setCaption("Shim \n Rangi: qoramtir \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto ruShimPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/48"));
        sendPhoto.setCaption("Shortiklik Shim \n Rangi: qoramtir (ortasi Oqishroq) \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto ruShimPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/49"));
        sendPhoto.setCaption("Shim \n Rangi: Kok \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto ruShimPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/50"));
        sendPhoto.setCaption("Shim \n Rangi: Seriy \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto ruShimPicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/51"));
        sendPhoto.setCaption("Shim \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto ruShimPicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/127"));
        sendPhoto.setCaption("Shim \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto ruShimPicture7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/128"));
        sendPhoto.setCaption("Shim \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }
    public SendPhoto ruShimPicture8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/129"));
        sendPhoto.setCaption("Shim \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 559 900");
        return sendPhoto;
    }


    //Sviter rasmlar
    public SendPhoto ruSveiterPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/60"));
        sendPhoto.setCaption("Sveiter \n Rangi: Qaymoq rang \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto ruSveiterPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/61"));
        sendPhoto.setCaption("Sveiter \n Rangi: Oq \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto ruSveiterPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/62"));
        sendPhoto.setCaption("Sveiter \n Rangi: Qora \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto ruSveiterPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/63"));
        sendPhoto.setCaption("Sveiter \n Rangi: Seriy \n Razmeri: xs,s,m,l,xl \n Narxi: 50$");
        return sendPhoto;
    }

    // Veitrovkalar
    public SendPhoto ruVeitrovkaPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/64?single"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto ruVeitrovkaPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/65"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto ruVeitrovkaPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/66"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto ruVeitrovkaPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/67"));
        sendPhoto.setCaption("Koja \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 70$");
        return sendPhoto;
    }
    public SendPhoto ruVeitrovkaPicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/73"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto ruVeitrovkaPicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/74"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 85$");
        return sendPhoto;
    }
    public SendPhoto ruVeitrovkaPicture7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/75"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto ruVeitrovkaPicture8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/130"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto ruVeitrovkaPicture9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/131"));
        sendPhoto.setCaption("Kurtka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }

    //aksesuarlar
    public SendPhoto ruAksesuarlarPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/78"));
        sendPhoto.setCaption("sumka \n Rangi: qora \n Razmeri:yoq \n Narxi: 30$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/79"));
        sendPhoto.setCaption("sumka \n Rangi: yashil \n Razmeri:yoq \n Narxi: 50$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/80"));
        sendPhoto.setCaption("ochki \n Rangi: qora \n Razmeri:yoq \n Narxi: 30$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/81"));
        sendPhoto.setCaption("ochki \n Rangi: oq \n Razmeri:yoq \n Narxi: 30$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/82"));
        sendPhoto.setCaption("ochki \n Rangi: qora \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/83"));
        sendPhoto.setCaption("kepka \n Rangi: idk \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/84"));
        sendPhoto.setCaption("kepka \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture8(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/92"));
        sendPhoto.setCaption("shapka \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture9(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/93"));
        sendPhoto.setCaption("qolqop \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture10(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/94"));
        sendPhoto.setCaption("achki \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture12(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/96"));
        sendPhoto.setCaption("kepka \n Rangi: idk \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }
    public SendPhoto ruAksesuarlarPicture13(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/91"));
        sendPhoto.setCaption("nike \n Rangi: oq \n Razmeri:yoq \n Narxi: 40$");
        return sendPhoto;
    }

    //Baggy fudbolka
    public SendPhoto rufudbolkaPicture1(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/42"));
        sendPhoto.setCaption("FUdbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto rufudbolkaPicture2(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/43"));
        sendPhoto.setCaption("Fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto rufudbolkaPicture3(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/44"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto rufudbolkaPicture4(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/45"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto rufudbolkaPicture5(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/46"));
        sendPhoto.setCaption("fudbolka \n Rangi: oq \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto rufudbolkaPicture6(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/124"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }
    public SendPhoto rufudbolkaPicture7(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();

        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/Looewe3/125"));
        sendPhoto.setCaption("fudbolka \n Rangi: qora \n Razmeri: xs,s,m,l,xl \n Narxi: 80$");
        return sendPhoto;
    }


    // text yozw uchun

    // O'zbekcha menyu 1
    public SendMessage ruMain(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ushbu bot sizga 'Loewe' haqida kerakli ma'lumotlarni topishga va sizga kerakli mahsulotlarni topishga yordam beradi.");
        return sendMessage;
    }


    //inline buttonlar uchun


    // O'zbekcha LANGUAGE MENU #########
    public SendMessage ruLangMenu(Long chatId) {
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
    public SendMessage ruKiyimlarMenu(Long chatId) {
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
        button.setText("\uD83D\uDC53 Aksessuarlar \uD83E\uDDE3");
        button.setCallbackData("uzAksessuarlarId");
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
    public SendMessage ruBaggyMenu(Long chatId) {
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
    public SendMessage ruPurchaseHoodie1(Long chatId) {
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
    public SendMessage ruPurchaseHoodie2(Long chatId) {
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
    public SendMessage ruPurchaseHoodie3(Long chatId) {
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
    public SendMessage ruPurchaseHoodie4(Long chatId) {
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
        button.setCallbackData("uzHoodiePic4OldingaId");
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
    public SendMessage ruPurchaseHoodie5(Long chatId) {
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
    public SendMessage ruPurchaseHoodie6(Long chatId) {
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
    public SendMessage ruPurchaseHoodie7(Long chatId) {
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
    public SendMessage ruPurchaseHoodie8(Long chatId) {
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
    public SendMessage ruPurchaseHoodie9(Long chatId) {

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
    public SendMessage ruPurchaseHoodie10(Long chatId) {
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
    public SendMessage ruPurchaseShim1(Long chatId) {
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
    public SendMessage ruPurchaseShim2(Long chatId) {
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
    public SendMessage ruPurchaseShim3(Long chatId) {
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
    public SendMessage ruPurchaseShim4(Long chatId) {
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
    public SendMessage ruPurchaseShim5(Long chatId) {
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

    // Baggy >> Fudbolkalar Picture Purchase item inline button
    public SendMessage ruPurchaseFudbolka1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic1OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseFudbolka2(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic2OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseFudbolka3(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic3OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseFudbolka4(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic4OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseFudbolka5(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic5OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic5OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseFudbolka6(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic6OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic6OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseFudbolka7(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzFudbolkaPic7OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzFudbolkaPic7OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzFudbolkaPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzFudbolkaOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Baggy >> Veitrovkalar Picture Purchase item inline button
    public SendMessage ruPurchaseVeitrovka1(Long chatId) {
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
    public SendMessage ruPurchaseVeitrovka2(Long chatId) {
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
    public SendMessage ruPurchaseVeitrovka3(Long chatId) {
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
    public SendMessage ruPurchaseVeitrovka4(Long chatId) {
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
        button.setCallbackData("uzVeitrovkaPic4OldingaId");
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
    public SendMessage ruPurchaseVeitrovka5(Long chatId) {
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
    public SendMessage ruPurchaseVeitrovka6(Long chatId) {
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
    public SendMessage ruPurchaseVeitrovka7(Long chatId) {
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
    public SendMessage ruPurchaseVeitrovka8(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic8OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic8OldingaId");
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
    public SendMessage ruPurchaseVeitrovka9(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzVeitrovkaPic9OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzVeitrovkaPic9OldingaId");
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

    // Classic main menu
    public SendMessage ruClassicMenu(Long chatId) {
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
        button.setText("⬅️\uFE0F Ortga");
        button.setCallbackData("uzClassicOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Classic menu >> Sweater Pic Purchase item inline button
    public SendMessage ruClassicSweaterPurchase1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzSweaterPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzSweaterPic1OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzSweaterPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzSweaterOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruClassicSweaterPurchase2(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzSweaterPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzSweaterPic2OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzSweaterPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzSweaterOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruClassicSweaterPurchase3(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzSweaterPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzSweaterPic3OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzSweaterPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzSweaterOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruClassicSweaterPurchase4(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzSweaterPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzSweaterPic4OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzSweaterPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzSweaterOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Classic menu >> Shimlar Pic Purchase item inline button
    public SendMessage ruPurchaseClassicShim1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic1OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseClassicShim2(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic2OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseClassicShim3(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic3OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseClassicShim4(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic4OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseClassicShim5(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic5OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic5OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseClassicShim6(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic6OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic6OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseClassicShim7(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzClassicShimPic7OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic7OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseClassicShim8(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzShimPic8OrtgaId");
        button.setCallbackData("uzClassicShimPic8OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzClassicShimPic8OldingaId");
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
        button.setCallbackData("uzClassicShimOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    // Kiyimlar >> Aksessuarlar menu
    public SendMessage ruPurchaseAcces1(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic1OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic1OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces2 (Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic2OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic2OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces3(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic3OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic3OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces4(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic4OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic4OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces5(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic5OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic5OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces6(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic6OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic6OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces7(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic7OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic7OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces8(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic8OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic9OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces9(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic9OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic9OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces10(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic10OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic10OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces12(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic12OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic12OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage ruPurchaseAcces13(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("_____________________________________________");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("⏪ Ortga");
        button.setCallbackData("uzAccesPic13OrtgaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Oldinga ⏩");
        button.setCallbackData("uzAccesPic13OldingaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sotib olish \uD83D\uDCB8");
        button.setCallbackData("uzAccesPicSotibOlishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzAccesOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }


    public SendMessage ruPurchase(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("");
        return sendMessage;
    }
    //end uz


    // hamkorlik menu
    public SendMessage ruHamkorlik(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Biz bilan hamkorlik uchun!!!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCDE Biz bilan bog'lanish");
        button.setCallbackData("uzBoglanishId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("☎\uFE0F Bizning kontaktlarimiz");
        button.setCallbackData("uzOurContactsId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCCD Bizning manzillarimiz");
        button.setCallbackData("uzLocationId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        button.setCallbackData("uzHamkorlikOrtgaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }


    // reply button uchun

    //oz main
    public SendMessage ruMainMenu(Long chatId) {
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

    //izoh qoldirish
    public SendMessage ruIzohQoldirish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Biz siz bilan bog‘lanishimiz uchun telefon raqamingizni yuboring:");

        // Keyboard
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("📱 Telefon raqamni yuborish");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅\uFE0F Ortga");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }



























































































    // Ingliz tili
    //################################################################################################################





}