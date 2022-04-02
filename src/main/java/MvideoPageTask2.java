import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class MvideoPageTask2 {

    private static MvideoPageTask2 mvideoPage;

    //кнопка "В корзину"
    @FindBy(xpath = "//mvid-day-product[contains(@class, 'main') and contains(@class, 'product')]//button")
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


    //название товара в корзине (который мы выбрали)
    @FindBy(xpath = "//div[contains(@class, 'c-cart-item__text-wrapper')]//child::div[@class = 'c-cart-item__header']//a[contains(@class, 'c-cart-item__title')]")
    private SelenideElement nameOfProductInTheCart;

    public SelenideElement getNameOfProductInTheCart() {
        return nameOfProductInTheCart;
    }

    //название товара в "Товары дня"
    @FindBy(xpath = "//mvid-day-product[contains(@class, 'main') and contains(@class, 'product')]//following-sibling::div[contains(@class, 'title')]")
    private SelenideElement nameOfProductOnProductOfDay;

    public SelenideElement getNameOfProductOnProductOfDay() {
        return nameOfProductOnProductOfDay;
    }

    //цена товара из блока "Товары дня" (который мы выбираем)
    @FindBy(xpath = "//mvid-day-product[contains(@class, 'main') and contains(@class, 'product')]//div[contains(@class, 'price__wrapper')]")
    private SelenideElement tovarDnyaPrice;


    public SelenideElement getTovarDnyaPrice() {
        return tovarDnyaPrice;
    }

    //цена товара в корзине (который мы выбрали)
    @FindBy(xpath = "//div[contains(@class, 'c-cart-item__text-wrapper')]//child::div[@class = 'c-cart-item__price-block']//span[@class = 'c-cart-item__price']")
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


    //Элемент "Самые просматриваемые"
    @FindBy(xpath = "//mvid-mmag-collection/following-sibling::mvid-simple-product-collection-mp")
    private SelenideElement mostViewed;

    public SelenideElement getMostViewed() {
        return mostViewed;
    }

    //Кнопка "Добавить в корзину" в категории "Самые просматриваемые" у первого товара
    @FindBy(xpath = "//mvid-simple-product-collection[.//h2[text() = 'Самые просматриваемые']]//div[contains(@class,'mvid-carousel-inner')]//div[contains(@class, 'product-mini-card__controls')][1]//button[contains(@class, 'actions__cart') and contains(@class,'mv-main-button--primary')]")
    private SelenideElement addToCart;

    public SelenideElement getAddToCart() {
        return addToCart;
    }


    //Кнопка "Добавить в корзину" в категории "Самые просматриваемые" у второго товара
    @FindBy(xpath = "//mvid-simple-product-collection[.//h2[text() = 'Самые просматриваемые']]//div[contains(@class,'mvid-carousel-inner')]//div[contains(@class, 'product-mini-card__controls')][2]//button[contains(@class, 'actions__cart') and contains(@class,'mv-main-button--primary')]")
    private SelenideElement addToCart_1;

    public SelenideElement getAddToCart_1() {
        return addToCart_1;
    }


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

    //Дропдаун "Сначала популярные" на главной странице
    @FindBy(xpath = "//div[contains(@class, 'dropdown')]//span[text() = 'Сначала популярные']")
    private SelenideElement dropdown;

    public SelenideElement getDropdown() {
        return dropdown;
    }

    //Выпадающий список вариантов сортировки
    @FindBy(xpath = "//div[contains(@class, 'open')]//following-sibling::div[@class = 'dropdown__options']")
    private SelenideElement listDropdown;

    public SelenideElement getListDropdown() {
        return listDropdown;
    }

    //"Сначала дороже" в выпадающем списке вариантов сортировки
    @FindBy(xpath = "//div[@class = 'dropdown__options']//div[text() = ' Сначала дороже ']")
    private SelenideElement mostExpensive;

    public SelenideElement getMostExpensive() {
        return mostExpensive;
    }

    //Цена товаров Apple
    @FindBy(xpath = "//div[@class = 'price price--grid ng-star-inserted']/span")
    private SelenideElement priceApple;

    public SelenideElement getPriceApple() {
        return priceApple;
    }

    //кнопка "Войти"
    @FindBy(xpath = "//div[@class = 'container'][.//*[text() = 'Войти']]")
    private SelenideElement voity;

    public SelenideElement getVoity() {
        return voity;
    }

    //Модальное окно
    @FindBy(xpath = "//div[contains(@class, 'modal-layout__content')]")
    private SelenideElement modalWindow;

    public SelenideElement getModalWindow() {
        return modalWindow;
    }

    //Поле для ввода текста с плейсхолдером “Телефон”
    @FindBy(xpath = "//div[contains(@class, 'modal-layout--without-title')]//div[@class = 'form-field__input-container']")
    private SelenideElement formField;

    public SelenideElement getFormField() {
        return formField;
    }

    //Неактивная кнопка “Продолжить” в модальном окне
    @FindBy(xpath = "//div[contains(@class, 'modal-layout--without-title')]//following::div[@class = 'login-form__container login-form__button-container']//button")
    private SelenideElement buttonContinue;

    public SelenideElement getButtonContinue() {
        return buttonContinue;
    }

    //Ссылка "Для юридических лиц"
    @FindBy(xpath = "//div[contains(@class, 'modal-layout--without-title')]//following::div[@class = 'login-form__container login-form__link-container']//button")
    private SelenideElement link;

    public SelenideElement getLink() {
        return link;
    }

    //Ссылка с текущим городом
    @FindBy(xpath = " //div[contains(@class, \'app-header-top\')]//div[contains(@class, \'location\')]")
    private SelenideElement location;

    public SelenideElement getLocation() {
        return location;
    }

    //Модальное окно с заголовком “Выберите город”
    @FindBy(xpath = "//div[contains(@class,'modal-wrapper__content')]/child::div[contains(@class, 'modal-layout')]")
    private SelenideElement cityModalWindow;

    public SelenideElement getCityModalWindow() {
        return cityModalWindow;
    }

    @FindBy(xpath = "//div[contains(@class,'modal-layout')]/.//li[text()='Краснодар']")
    private SelenideElement stringCity;

    public SelenideElement getStringCity() {
        return stringCity;
    }

    //Карточка с наименованием добавленных товаров в "Моя корзина"
    @FindBy(xpath = "//div[@id = 'checkout_main']")
    private SelenideElement checkout;

    public SelenideElement getCheckout() {
        return checkout;
    }

    //Цена первого товара в корзине
//    @FindBy(xpath = "//div[@data-product-position = '1']//div[@class = 'c-cart-item__header']//div[@class = 'c-cart-item__price-block']")
    @FindBy(xpath = "//div[@data-product-position = '1']//div[@class = 'c-cart-item__header']//div[@class = 'c-cart-item__price-block']//span[@class='c-cart-item__price']")
    private SelenideElement firstProductPrice;

    public SelenideElement getFirstProductPrice() {
        return firstProductPrice;
    }

    //Цена второго товара в корзине
    @FindBy(xpath = "//div[@data-product-position = '2']//div[@class = 'c-cart-item__header']//div[@class = 'c-cart-item__price-block']")
    private SelenideElement secondProductPrice;


    public SelenideElement getSecondProductPrice() {
        return secondProductPrice;
    }

    //Общая цена товаров в корзине
    @FindBy(xpath = "//div[contains(@class, 'c-orders-list') and contains(@class, 'c-orders-list_mobile-sheet')]//div[contains(@class, 'c-cost-line__text-wrap')]//span")
    private SelenideElement totalPrice;

    public SelenideElement getTotalPrice() {
        return totalPrice;
    }
}


