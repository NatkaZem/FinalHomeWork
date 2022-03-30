import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.sun.source.tree.AssertTree;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class StepsTask3 {

    public void checkPerehodVKorzinu() {
        MvideoPageTask2 mvideoPage = MvideoPageTask2.mvideoPage();
        SelenideElement tovaryDnya = mvideoPage.getTovaryDnya();
        Assert.assertTrue(tovaryDnya.isDisplayed());                    //На странице отображается блок “Товары дня”
        SelenideElement tovarDnyaPrice = mvideoPage.getTovarDnyaPrice();
//        String a = tovarDnyaPrice.getOwnText();
        SelenideElement vKorzinu = mvideoPage.getvKorzinu();
        vKorzinu.click();                                         //Нажимаем у товара на кнопку “В корзину”
        Configuration.timeout = 10000;
        SelenideElement korzina = mvideoPage.getKorzina();
        korzina.click();                                               //Нажимаем на кнопку “Корзина”
        Assert.assertEquals("https://www.mvideo.ru/cart", WebDriverRunner.url());      //Открывается страница “/cart” (проверяем URL открывшейся страницы)
        SelenideElement moyaKorzina = mvideoPage.getMoyaKorzina();
        Assert.assertTrue(moyaKorzina.isDisplayed());          //Отображается заголовок “Моя корзина”
        Configuration.timeout = 10000;

        SelenideElement tovarDnyaVKorzinePrice = mvideoPage.getTovarDnyaVKorzinePrice();
//Assert.assertEquals(a,tovarDnyaVKorzinePrice.getOwnText());
        SelenideElement pereityKOformleniu = mvideoPage.getPereityKOformleniu();
        Assert.assertTrue(pereityKOformleniu.isDisplayed());             //Отображается кнопка “Перейти к оформлению”
        SelenideElement vKorzine1Tovar = mvideoPage.getvKorzine1Tovar();
        Assert.assertTrue(vKorzine1Tovar.isDisplayed());      //Элемент "В корзине 1 товар" отображается
        Assert.assertEquals("В корзине 1 товар", vKorzine1Tovar.text()); //Отображается текст “В корзине 1 товар”


    }

    public void addingTwoProductsToCart() {
        MvideoPageTask2 mvideoPage = MvideoPageTask2.mvideoPage();
        SelenideElement mostViewed = mvideoPage.getMostViewed();
        mostViewed.scrollIntoView("{behavior: \"smooth\", block: \"center\", inline: \"center\"}");
        Assert.assertTrue(mostViewed.isDisplayed());          //На странице отображается блок “Самые просматриваемые”
        SelenideElement addToCart = mvideoPage.getAddToCart();
        addToCart.click();                                   // Добавляем 1 товар из блока "Самые просматриваемые"
        Configuration.timeout = 10000;
        SelenideElement addToCart_2 = mvideoPage.getAddToCart();
        addToCart_2.click();
        Configuration.timeout = 10000;
        SelenideElement korzina = mvideoPage.getKorzina();
        korzina.scrollTo();
        korzina.click();
    }

    public void findProducts() {
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
}