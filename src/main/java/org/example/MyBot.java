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

            if (text.equals("\uD83C\uDDFA\uD83C\uDDFF Tilni o'zgartirish")) {
                try {
                    execute(myBotservies.uzLangMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDCAC Izoh Qoldirish")){
                try {
                    execute(myBotservies.uzIzohQoldirish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDCC8 Hamkorlik")){
                try {
                    execute(myBotservies.uzHamkorlik(chatId));
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


            // Switch Hoodie
            if (data.equals("uzBaggyHoodieId")) {
                try {
                    execute(myBotservies.UzHoodiePicture1(chatId));
                    execute(myBotservies.uzPurchaseHoodie1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            // Hoodie rasmni oldinga o'tkaziw
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

            // Hoodie rasmni orqaga o'tkaziw
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


            // Switch Shim
            if (data.equals("uzBaggyShimlarId")) {
                try {
                    execute(myBotservies.UzShimPicture1(chatId));
                    execute(myBotservies.uzPurchaseShim1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            // Shim rasmni oldinga o'tkaziw
            if (data.equals("uzShimPic1OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture2(chatId));
                    execute(myBotservies.uzPurchaseShim2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzShimPic2OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture3(chatId));
                    execute(myBotservies.uzPurchaseShim3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzShimPic3OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture4(chatId));
                    execute(myBotservies.uzPurchaseShim4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzShimPic4OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture5(chatId));
                    execute(myBotservies.uzPurchaseShim5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Shim rasmni orqaga o'tkaziw
            if (data.equals("uzShimPic2OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture1(chatId));
                    execute(myBotservies.uzPurchaseShim1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzShimPic3OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture2(chatId));
                    execute(myBotservies.uzPurchaseShim2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzShimPic4OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture3(chatId));
                    execute(myBotservies.uzPurchaseShim3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzShimPic5OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture4(chatId));
                    execute(myBotservies.uzPurchaseShim4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzShimPicSotibOlishId")) {
                try {
                    execute(myBotservies.uzPurchase(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Switch Fudbolka
            if (data.equals("uzBaggyFutbolkalarId")){
                try {
                    execute(myBotservies.UzfudbolkaPicture1(chatId));
                    execute(myBotservies.uzPurchaseFudbolka1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            // Fudbolka rasmni oldinga o'tkaziw
            if (data.equals("uzFudbolkaPic1OldingaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture2(chatId));
                    execute(myBotservies.uzPurchaseFudbolka2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic2OldingaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture3(chatId));
                    execute(myBotservies.uzPurchaseFudbolka3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic3OldingaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture4(chatId));
                    execute(myBotservies.uzPurchaseFudbolka4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic4OldingaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture5(chatId));
                    execute(myBotservies.uzPurchaseFudbolka5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic5OldingaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture6(chatId));
                    execute(myBotservies.uzPurchaseFudbolka6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic6OldingaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture7(chatId));
                    execute(myBotservies.uzPurchaseFudbolka7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Fudbolka rasmni orqaga o'tkaziw
            if (data.equals("uzFudbolkaPic2OrtgaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture1(chatId));
                    execute(myBotservies.uzPurchaseFudbolka1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic3OrtgaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture2(chatId));
                    execute(myBotservies.uzPurchaseFudbolka2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic4OrtgaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture3(chatId));
                    execute(myBotservies.uzPurchaseFudbolka3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic5OrtgaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture4(chatId));
                    execute(myBotservies.uzPurchaseFudbolka4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic6OrtgaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture5(chatId));
                    execute(myBotservies.uzPurchaseFudbolka5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzFudbolkaPic7OrtgaId")) {
                try {
                    execute(myBotservies.UzfudbolkaPicture6(chatId));
                    execute(myBotservies.uzPurchaseFudbolka6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzFudbolkaPicSotibOlishId")){
                try {
                    execute(myBotservies.uzPurchase(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Switch Veitrovka
            if (data.equals("uzBaggyVitrovkalarId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture1(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            // Veitrovka rasmni oldinga o'tkaziw
            if (data.equals("uzVeitrovkaPic1OldingaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture2(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic2OldingaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture3(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic3OldingaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture4(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic4OldingaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture5(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic5OldingaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture6(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic6OldingaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture7(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic7OldingaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture8(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka8(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic8OldingaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture9(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka9(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Veitrovka rasmni orqaga o'tkaziw
            if (data.equals("uzVeitrovkaPic2OrtgaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture1(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic3OrtgaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture2(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic4OrtgaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture3(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic5OrtgaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture4(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic6OrtgaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture5(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic7OrtgaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture6(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic8OrtgaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture7(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzVeitrovkaPic9OrtgaId")) {
                try {
                    execute(myBotservies.UzVeitrovkaPicture8(chatId));
                    execute(myBotservies.uzPurchaseVeitrovka8(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzVeitrovkaPicSotibOlishId")) {
                try {
                    execute(myBotservies.uzPurchase(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("uzClassicId")) {
                try {
                    execute(myBotservies.uzClassicMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Switch Classic Shim
            if (data.equals("uzClassicShimlarId")) {
                try {
                    execute(myBotservies.UzShimPicture1(chatId));
                    execute(myBotservies.uzPurchaseClassicShim1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            // Classic Shim rasmni oldinga o'tkaziw
            if (data.equals("uzClassicShimPic1OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture2(chatId));
                    execute(myBotservies.uzPurchaseClassicShim2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic2OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture3(chatId));
                    execute(myBotservies.uzPurchaseClassicShim3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic3OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture4(chatId));
                    execute(myBotservies.uzPurchaseClassicShim4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic4OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture5(chatId));
                    execute(myBotservies.uzPurchaseClassicShim5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic5OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture6(chatId));
                    execute(myBotservies.uzPurchaseClassicShim6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic6OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture7(chatId));
                    execute(myBotservies.uzPurchaseClassicShim7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic7OldingaId")) {
                try {
                    execute(myBotservies.UzShimPicture8(chatId));
                    execute(myBotservies.uzPurchaseClassicShim8(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Classic Shim rasmni orqaga o'tkaziw
            if (data.equals("uzClassicShimPic2OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture1(chatId));
                    execute(myBotservies.uzPurchaseClassicShim1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic3OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture2(chatId));
                    execute(myBotservies.uzPurchaseClassicShim2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic4OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture3(chatId));
                    execute(myBotservies.uzPurchaseClassicShim3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic5OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture4(chatId));
                    execute(myBotservies.uzPurchaseClassicShim4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic6OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture5(chatId));
                    execute(myBotservies.uzPurchaseClassicShim5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic7OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture6(chatId));
                    execute(myBotservies.uzPurchaseClassicShim6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzClassicShimPic8OrtgaId")) {
                try {
                    execute(myBotservies.UzShimPicture7(chatId));
                    execute(myBotservies.uzPurchaseClassicShim7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzClassicShimOrtgaId")){
                try {
                    execute(myBotservies.uzClassicMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzClassicOrtgaId")){
                try {
                    execute(myBotservies.uzKiyimlarMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzClassicSweaterId")){
                try {
                    execute(myBotservies.UzSveiterPicture1(chatId));
                    execute(myBotservies.uzClassicSweaterPurchase1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            // Classic Sweaters pic olding'a o'tqzig'sh
            if (data.equals("uzSweaterPic1OldingaId")){
                try {
                    execute(myBotservies.UzSveiterPicture2(chatId));
                    execute(myBotservies.uzClassicSweaterPurchase2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzSweaterPic2OldingaId")){
                try {
                    execute(myBotservies.UzSveiterPicture3(chatId));
                    execute(myBotservies.uzClassicSweaterPurchase3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzSweaterPic3OldingaId")){
                try {
                    execute(myBotservies.UzSveiterPicture4(chatId));
                    execute(myBotservies.uzClassicSweaterPurchase4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Classic Sweaters pic arqag'a o'tqzig'sh
            if (data.equals("uzSweaterPic2OrtgaId")){
                try {
                    execute(myBotservies.UzSveiterPicture1(chatId));
                    execute(myBotservies.uzClassicSweaterPurchase1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzSweaterPic3OrtgaId")){
                try {
                    execute(myBotservies.UzSveiterPicture2(chatId));
                    execute(myBotservies.uzClassicSweaterPurchase2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzSweaterPic4OrtgaId")){
                try {
                    execute(myBotservies.UzSveiterPicture3(chatId));
                    execute(myBotservies.uzClassicSweaterPurchase3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzSweaterPicSotibOlishId")){
                try {
                    execute(myBotservies.uzPurchase(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzSweaterOrtgaId")){
                try {
                    execute(myBotservies.uzClassicMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Aksessuarlar menu Switch
            if (data.equals("uzAksessuarlarId")){
                try {
                    execute(myBotservies.UzAksesuarlarPicture1(chatId));
                    execute(myBotservies.uzPurchaseAcces1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Aksessuarlar rasmni oldinga o'tkaziw
            if (data.equals("uzAccesPic1OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture2(chatId));
                    execute(myBotservies.uzPurchaseAcces2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic2OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture3(chatId));
                    execute(myBotservies.uzPurchaseAcces3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic3OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture4(chatId));
                    execute(myBotservies.uzPurchaseAcces4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic4OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture5(chatId));
                    execute(myBotservies.uzPurchaseAcces5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic5OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture6(chatId));
                    execute(myBotservies.uzPurchaseAcces6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic6OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture7(chatId));
                    execute(myBotservies.uzPurchaseAcces7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic7OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture8(chatId));
                    execute(myBotservies.uzPurchaseAcces8(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic8OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture9(chatId));
                    execute(myBotservies.uzPurchaseAcces9(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic9OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture10(chatId));
                    execute(myBotservies.uzPurchaseAcces10(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic10OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture12(chatId));
                    execute(myBotservies.uzPurchaseAcces12(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic12OldingaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture13(chatId));
                    execute(myBotservies.uzPurchaseAcces13(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            // Aksessuarlar rasmni orqaga o'tkaziw
            if (data.equals("uzAccesPic2OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture1(chatId));
                    execute(myBotservies.uzPurchaseAcces1(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic3OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture2(chatId));
                    execute(myBotservies.uzPurchaseAcces2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic4OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture3(chatId));
                    execute(myBotservies.uzPurchaseAcces3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic5OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture4(chatId));
                    execute(myBotservies.uzPurchaseAcces4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic6OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture5(chatId));
                    execute(myBotservies.uzPurchaseAcces5(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic7OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture6(chatId));
                    execute(myBotservies.uzPurchaseAcces6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic8OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture7(chatId));
                    execute(myBotservies.uzPurchaseAcces7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic9OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture8(chatId));
                    execute(myBotservies.uzPurchaseAcces8(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic10OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture9(chatId));
                    execute(myBotservies.uzPurchaseAcces9(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic12OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture10(chatId));
                    execute(myBotservies.uzPurchaseAcces10(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("uzAccesPic13OrtgaId")) {
                try {
                    execute(myBotservies.UzAksesuarlarPicture12(chatId));
                    execute(myBotservies.uzPurchaseAcces12(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzAccesPicSotibOlishId")){
                try {
                    execute(myBotservies.uzPurchase(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzAccesOrtgaId")){
                try {
                    execute(myBotservies.uzKiyimlarMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzKiyimlarOrtgaId")) {
                try {
                    execute(myBotservies.uzMainMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzBaggyOrtgaId")) {
                try {
                    execute(myBotservies.uzKiyimlarMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzHoodieOrtgaId")) {
                try {
                    execute(myBotservies.uzBaggyMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzShimOrtgaId")) {
                try {
                    execute(myBotservies.uzBaggyMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzFudbolkaOrtgaId")){
                try {
                    execute(myBotservies.uzBaggyMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzVeitrovkaOrtgaId")) {
                try {
                    execute(myBotservies.uzBaggyMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzHamkorlikOrtgaId")){
                try {
                    execute(myBotservies.uzMainMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzKelibOlishId")){
                try {
                    execute(myBotservies.uzKelibOlish1(chatId));
                    execute(myBotservies.uzKelibOlish2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzPurchaseOrtgaId")){
                try {
                    execute(myBotservies.uzKiyimlarMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(data.equals("uzYetkazibBerishId")){
                try {
                    execute(myBotservies.contact(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //ruscha


            //inglisch
        } else if (update.hasMessage() && update.getMessage().hasContact()) {
            Long chatId = update.getMessage().getChatId();

            try {
                execute(myBotservies.Location(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.hasMessage() && update.getMessage().hasLocation()) {
            Long chatId = update.getMessage().getChatId();

            try {
                execute(myBotservies.Yetibkeladi(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

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