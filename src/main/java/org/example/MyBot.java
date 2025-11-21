package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    MyBotservies myBotservies = new MyBotservies();


    @Override
    public void
    onUpdateReceived(Update update) {


        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();


            // Text korishida javob kelsa
            if (text.equals("/start")) {
                try {
                    execute(myBotservies.uzLangMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDC54 Kiyimlar")) {
                try {
                    execute(myBotservies.uzKiyimlarMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();

            //data kornshida javob kelsa


            //uzbeca

            // O'zbekcha menyu
            if (data.equals("O'zbekchaId")) {
                try {
                    execute(myBotservies.uzMain(chatId));
                    execute(myBotservies.uzMainMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzBaggyId")) {
                try {
                    execute(myBotservies.uzBaggyMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzBaggyHoodieId")) {
                try {
                    execute(myBotservies.UzHoodiePicture1(chatId));
                    execute(myBotservies.uzPurchaseHoodie1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzHoodiePic1OldingaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture2(chatId));
                    execute(myBotservies.uzPurchaseHoodie2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic2OldingaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture3(chatId));
                    execute(myBotservies.uzPurchaseHoodie3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic3OldingaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture4(chatId));
                    execute(myBotservies.uzPurchaseHoodie4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic4OldingaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture5(chatId));
                    execute(myBotservies.uzPurchaseHoodie5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic5OldingaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture6(chatId));
                    execute(myBotservies.uzPurchaseHoodie6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic6OldingaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture7(chatId));
                    execute(myBotservies.uzPurchaseHoodie7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic7OldingaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture8(chatId));
                    execute(myBotservies.uzPurchaseHoodie8(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic8OldingaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture9(chatId));
                    execute(myBotservies.uzPurchaseHoodie9(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic9OldingaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture10(chatId));
                    execute(myBotservies.uzPurchaseHoodie10(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzHoodiePic2OrtgaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture1(chatId));
                    execute(myBotservies.uzPurchaseHoodie1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic3OrtgaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture2(chatId));
                    execute(myBotservies.uzPurchaseHoodie2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic4OrtgaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture3(chatId));
                    execute(myBotservies.uzPurchaseHoodie3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic5OrtgaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture4(chatId));
                    execute(myBotservies.uzPurchaseHoodie4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic6OrtgaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture5(chatId));
                    execute(myBotservies.uzPurchaseHoodie5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic7OrtgaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture6(chatId));
                    execute(myBotservies.uzPurchaseHoodie6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic8OrtgaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture7(chatId));
                    execute(myBotservies.uzPurchaseHoodie7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic9OrtgaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture8(chatId));
                    execute(myBotservies.uzPurchaseHoodie8(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzHoodiePic10OrtgaId")) {
                try {
                    execute(myBotservies.UzHoodiePicture9(chatId));
                    execute(myBotservies.uzPurchaseHoodie9(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzHoodiePicSotibOlishId")) {
                try {
                    execute(myBotservies.uzPurchase(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //ruschaa


            //inglisch
        }
    }


    @Override
    public String getBotUsername() {
        return "Looewe_bot";
    }

    @Override
    public String getBotToken() {
        return "8596659549:AAG_8g-QBiXRW6O9ZYnqVm9B8hqsLH7aoJM";
    }
}