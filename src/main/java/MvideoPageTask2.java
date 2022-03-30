import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MvideoPageTask2 {

    private static MvideoPageTask2 mvideoPage;

    //кнопка "В корзину"
    @FindBy(xpath = "//div[@class = 'carousel']//button[span[text() = ' В корзину']]")
    private SelenideElement vKorzinu;

    private MvideoPageTask2() {
    }

    public static MvideoPageTask2 mvideoPage() {
        if (Objects.isNull(mvideoPage)) mvideoPage = Selenide.page(new MvideoPageTask2());
        return mvideoPage;
    }

    public SelenideElement getvKorzinu() {
        return vKorzinu;
    }

    //кнопка "Корзина"
    @FindBy(xpath = "//div[@class = 'container'][.//*[text() = 'Корзина']]//mvid-bubble[contains(text(), '')]")
    private SelenideElement korzina;

    public SelenideElement getKorzina() {
        return korzina;
    }


    //Элемент "Моя корзина"
    @FindBy(xpath = "//div[contains(@class, 'o-container__section')]/span")
    private SelenideElement moyaKorzina;

    public SelenideElement getMoyaKorzina() {
        return moyaKorzina;
    }


    //Карточка "Товары дня"
    @FindBy(xpath = "//div[contains(@class, 'carousel-desktop')]")
    private SelenideElement tovaryDnya;

    public SelenideElement getTovaryDnya() {
        return tovaryDnya;
    }

    //Кнопка "Перейти к оформлению"
    @FindBy(xpath = "//input[@class = 'c-btn c-btn_text c-btn_full-size sel-common-button-create-order cart-submit-btn u-hidden-phone']")
    private SelenideElement pereityKOformleniu;

    public SelenideElement getPereityKOformleniu() {
        return pereityKOformleniu;
    }


    //цена товара из блока "Товары дня" (который мы выбираем)
        @FindBy(xpath = "//div[contains(@class, 'carousel-desktop')]//mvid-price-2")
    private SelenideElement tovarDnyaPrice;


    public SelenideElement getTovarDnyaPrice() {
        return tovarDnyaPrice;
    }

    //цена товара в корзине (который мы выбрали)
    @FindBy(xpath = "//div[@class = 'c-cart-item__price-block']")
    private SelenideElement tovarDnyaVKorzinePrice;

    public SelenideElement getTovarDnyaVKorzinePrice() {
        return tovarDnyaVKorzinePrice;
    }

    //Элемент "В корзине 1 товар"
    @FindBy(xpath = "//div[(@class = 'c-cost-line__title-wrap')]/span")
    private SelenideElement vKorzine1Tovar;

    public SelenideElement getvKorzine1Tovar() {
        return vKorzine1Tovar;
    }

    //Элемент "Цена товара" в "Товары дня"
    @FindBy(xpath = "//div[@class = 'price price--dailyProduct']/following::span[@class = 'price__main-value']")
    private SelenideElement price;

    public SelenideElement getPrice() {
        return price;
    }

    //Элемент "Цена товара" в "Моя корзина"
    @FindBy(xpath = "//div[@class = 'c-cart-item__price-block']/span[@class = 'c-cart-item__price']")
    private SelenideElement price_1;

    public SelenideElement getPrice_1() {
        return price_1;
    }

//div[contains(@class, 'c-cart-item__header')]//a[@class = 'c-link c-cart-item__title']

   //Элемент "Самые просматриваемые"
    @FindBy(xpath = "//mvid-mmag-collection/following-sibling::mvid-simple-product-collection-mp")
    private SelenideElement mostViewed;

    public SelenideElement getMostViewed() {
        return mostViewed;
    }

    //Кнопка "Добавить в корзину" в категории "Самые просматриваемые" у первого товара
    @FindBy(xpath = "//mvid-mmag-collection/following-sibling::mvid-simple-product-collection-mp//button")
    private SelenideElement addToCart;

    public SelenideElement getAddToCart() {
        return addToCart;
    }

    //Кнопка "Добавить в корзину" в категории "Самые просматриваемые" у второго товара
    @FindBy(xpath = "//mvid-mmag-collection/following-sibling::mvid-simple-product-collection-mp//button[2]")
    private SelenideElement addToCart_1;

//    public SelenideElement getAddToCart_1() {
//        return addToCart;
//    }

    //Строка поиска товара на главной странице
    @FindBy(xpath = "//div[@class = 'input__container']/input")
    private SelenideElement findProduct;

    public SelenideElement getFindProduct() {
        return findProduct;
    }

    //Кнопка поиска в строке поиска на главной странице
    @FindBy(xpath = "//div[contains(@class,'input__container')]//following::div[contains(@class, 'search-icon-wrap')]//mvid-icon")
    private SelenideElement buttonFindProduct;

    public SelenideElement getButtonFindProduct() {
        return buttonFindProduct;
    }

    //Товары Apple
    @FindBy(xpath = "//div[contains(@class,'product-card__title-line-container')][mvid-plp-product-title]//a[contains(@class,'product-title__text')]")
    private SelenideElement appleProducts;

    public SelenideElement getAppleProducts() {
        return appleProducts;
    }
}

