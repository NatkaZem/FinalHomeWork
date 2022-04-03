import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StepsTask3 {

    public void checkPerehodVKorzinu() {
        Configuration.timeout = 20000;
        MvideoPageTask2 mvideoPage = MvideoPageTask2.mvideoPage();
        SelenideElement tovaryDnya = mvideoPage.getTovaryDnya();
        Assert.assertTrue(tovaryDnya.isDisplayed());                    //На странице отображается блок “Товары дня”
        SelenideElement nameOfProductOnProductOfDay = mvideoPage.getNameOfProductOnProductOfDay();
        String a = nameOfProductOnProductOfDay.getText();
        SelenideElement tovarDnyaPrice = mvideoPage.getTovarDnyaPrice();
        String b = tovarDnyaPrice.getText();
        SelenideElement vKorzinu = mvideoPage.getvKorzinu();
        vKorzinu.click();                                         //Нажимаем у товара на кнопку “В корзину”
        Configuration.timeout = 10000;
        SelenideElement korzina = mvideoPage.getKorzina();
        korzina.click();                                               //Нажимаем на кнопку “Корзина”
        Assert.assertEquals("https://www.mvideo.ru/cart", WebDriverRunner.url());      //Открывается страница “/cart” (проверяем URL открывшейся страницы)
        SelenideElement moyaKorzina = mvideoPage.getMoyaKorzina();
        Assert.assertTrue(moyaKorzina.isDisplayed());          //Отображается заголовок “Моя корзина”
        SelenideElement nameOfProductInTheCart = mvideoPage.getNameOfProductInTheCart();
        Assert.assertEquals(a, nameOfProductInTheCart.getText());    // Проверка, что в корзине оказался именно выбранный товар (проверка по названию товара)
        SelenideElement tovarDnyaVKorzinePrice = mvideoPage.getTovarDnyaVKorzinePrice();
        Assert.assertEquals(b, tovarDnyaVKorzinePrice.getText().replaceAll("¤", " "));
        SelenideElement pereityKOformleniu = mvideoPage.getPereityKOformleniu();
        Assert.assertTrue(pereityKOformleniu.isDisplayed());             //Отображается кнопка “Перейти к оформлению”
        SelenideElement vKorzine1Tovar = mvideoPage.getvKorzine1Tovar();
        Assert.assertTrue(vKorzine1Tovar.isDisplayed());      //Элемент "В корзине 1 товар" отображается
        Assert.assertEquals("В корзине 1 товар", vKorzine1Tovar.text()); //Отображается текст “В корзине 1 товар”
    }

    public void addingTwoProductsToCart() {
        Configuration.timeout = 20000;
        MvideoPageTask2 mvideoPage = MvideoPageTask2.mvideoPage();
        SelenideElement mostViewed = mvideoPage.getMostViewed();
        mostViewed.scrollIntoView("{behavior: \"auto\", block: \"center\", inline: \"center\"}");
        Assert.assertTrue(mostViewed.isDisplayed());          //На странице отображается блок “Самые просматриваемые”
        SelenideElement addToCart = mvideoPage.getAddToCart();
        addToCart.click();                                   // Добавляем 1 товар из блока "Самые просматриваемые"
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SelenideElement addToCart_1 = mvideoPage.getAddToCart_1();
        addToCart_1.click();                                  // Добавляем 2 товар из блока "Самые просматриваемые"
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SelenideElement korzina = mvideoPage.getKorzina();
        korzina.scrollTo();
        korzina.click();                              //Переходим в корзину
        Configuration.timeout = 60000;
        SelenideElement checkout = mvideoPage.getCheckout();
        Assert.assertTrue(checkout.isDisplayed());      //В корзине отображается карточки с наименованиями добавленных товаров
        int firstProductPrice = parsePrice(mvideoPage.getFirstProductPrice());   //Цена первого добавленного товара в "Моя корзина"
        int secondProductPrice = parsePrice(mvideoPage.getSecondProductPrice());  //Цена второго добавленного товара в "Моя корзина"
        SelenideElement totalPrice = mvideoPage.getTotalPrice();
        Assert.assertEquals(firstProductPrice + secondProductPrice, parsePrice(totalPrice)); //Сумма всей корзины равна сумме цен добавленных товаров
    }

    public void findProducts() {
        Configuration.timeout = 200000;
        MvideoPageTask2 mvideoPage = MvideoPageTask2.mvideoPage();
        SelenideElement findProduct = mvideoPage.getFindProduct();
        Assert.assertTrue(findProduct.isDisplayed());            //В шапке отображается строка поиска товаров
        findProduct.sendKeys("apple");      //Вводим в  строку поиска товаров “apple”
        SelenideElement buttonFindProduct = mvideoPage.getButtonFindProduct();
        buttonFindProduct.click();                  //нажимаем на кнопку поиска
        Configuration.timeout = 10000;
        SelenideElement appleProducts = mvideoPage.getAppleProducts();
        appleProducts.scrollTo();
        appleProducts.isDisplayed();
        Assert.assertEquals("https://www.mvideo.ru/product-list-page?q=apple&category=smartfony-205", WebDriverRunner.url());   //Открывается страница “/product-list-page” с параметрами поиска
        Assert.assertTrue(appleProducts.has(Condition.text("Apple")));                 //Отображаются только товары содержащие в названии слово apple в любом регистре
    }


    public void sortingInTheListing() {
        Configuration.timeout = 200000;
        MvideoPageTask2 mvideoPage = MvideoPageTask2.mvideoPage();
        SelenideElement findProduct = mvideoPage.getFindProduct();
        Assert.assertTrue(findProduct.isDisplayed());            //В шапке отображается строка поиска товаров
        findProduct.sendKeys("apple");      //Вводим в  строку поиска товаров “apple”
        SelenideElement buttonFindProduct = mvideoPage.getButtonFindProduct();
        buttonFindProduct.click();                  //нажимаем на кнопку поиска
        Configuration.timeout = 10000;
        SelenideElement dropdown = mvideoPage.getDropdown(); //
        dropdown.click();
        Configuration.timeout = 10000;
        SelenideElement listDropdown = mvideoPage.getListDropdown();
        Assert.assertTrue(listDropdown.isDisplayed());               //Отображается выпадающий список вариантов сортировки со значением “Сначала популярные”
        SelenideElement mostExpensive = mvideoPage.getMostExpensive();
        mostExpensive.click();                             //Выбираем в списке значение “Сначала дороже”
        Configuration.timeout = 10000;
        SelenideElement appleProducts = mvideoPage.getAppleProducts();
        appleProducts.scrollTo();
        Assert.assertTrue(appleProducts.has(Condition.text("Apple")));  //Отображаются только товары содержащие в названии слово apple
        SelenideElement priceApple = mvideoPage.getPriceApple();
    }

    public void checkModalWindow() {
        Configuration.timeout = 200000;
        MvideoPageTask2 mvideoPage = MvideoPageTask2.mvideoPage();
        SelenideElement enter = mvideoPage.getEnter();
        enter.click();                                        //Нажимаем кнопку "Войти"
        SelenideElement modalWindow = mvideoPage.getModalWindow();
        Assert.assertTrue(modalWindow.isDisplayed());
        SelenideElement formField = mvideoPage.getFormField();
        Assert.assertTrue(formField.isDisplayed());    //Отображается модальное окно с заголовком "Вход или регистрация"
        SelenideElement buttonContinue = mvideoPage.getButtonContinue();
        Assert.assertTrue(buttonContinue.isDisplayed());  //Отображается кнопка “Продолжить”
        Assert.assertFalse((buttonContinue.isEnabled()));  //Кнопка "Продолжить" неактивная
        SelenideElement link = mvideoPage.getLink();
        Assert.assertTrue(link.isDisplayed());          //Отображается ссылка “Для юридических лиц”
    }

    public void changeLocation() {
        Configuration.timeout = 200000;
        MvideoPageTask2 mvideoPage = MvideoPageTask2.mvideoPage();
        SelenideElement location = mvideoPage.getLocation();
        location.click();                //нажимаем на ссылку с текущим городом
        Configuration.timeout = 60000;
        SelenideElement cityModalWindow = mvideoPage.getCityModalWindow();
        Assert.assertTrue(cityModalWindow.isDisplayed());     //Открыто модальное окно "Выберите город"
        Assert.assertTrue(cityModalWindow.has(Condition.text("Выберите город")));  // Заголовок модального окна - "Выберите город"
        SelenideElement stringCity = mvideoPage.getStringCity();
        stringCity.click();                 //Нажимаем на строку с городом “Краснодар”
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(cityModalWindow.isDisplayed());   //Модальное окно с заголовком “Выберите город” не отображается
        Assert.assertTrue(location.has(Condition.text("Краснодар"))); //В хедере отображается ссылка с городом “Краснодар”
    }

    // Парсит цену товара убирает пробелы и лишние символы
    private int parsePrice(SelenideElement value) {
        StringBuilder priceBuilder = new StringBuilder();
        String textPrice = value.getText();
        Pattern pattern = Pattern.compile("\\d+\\S?\\d+");
        Matcher matcher = pattern.matcher(textPrice);
        while (matcher.find()) {
            String group = matcher.group(0);
            if (group.replaceAll("\\D", "").length() == group.length()) {
                priceBuilder.append(group);
            }
        }
        return Integer.parseInt(priceBuilder.toString());
    }
}