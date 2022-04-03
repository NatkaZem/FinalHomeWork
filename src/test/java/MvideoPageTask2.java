import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class MvideoPageTask2 {
    private static MvideoPageTask2 mvideoPage;

    private MvideoPageTask2() {
    }

    public static MvideoPageTask2 mvideoPage() {
        if (Objects.isNull(mvideoPage)) mvideoPage = Selenide.page(new MvideoPageTask2());
        return mvideoPage;
    }

    //кнопка "В корзину"
    @FindBy(xpath = "//mvid-day-product[contains(@class, 'main') and contains(@class, 'product')]//button")
    private SelenideElement vKorzinu;
    //кнопка "Корзина"
    @FindBy(xpath = "//div[@class = 'container'][.//*[text() = 'Корзина']]//mvid-bubble[contains(text(), '')]")
    private SelenideElement korzina;
    //Элемент "Моя корзина"
    @FindBy(xpath = "//div[contains(@class, 'o-container__section')]/span")
    private SelenideElement moyaKorzina;
    //Карточка "Товары дня"
    @FindBy(xpath = "//div[contains(@class, 'carousel-desktop')]")
    private SelenideElement tovaryDnya;
    //Кнопка "Перейти к оформлению"
    @FindBy(xpath = "//input[@class = 'c-btn c-btn_text c-btn_full-size sel-common-button-create-order cart-submit-btn u-hidden-phone']")
    private SelenideElement pereityKOformleniu;
    //название товара в корзине (который мы выбрали)
    @FindBy(xpath = "//div[contains(@class, 'c-cart-item__text-wrapper')]//child::div[@class = 'c-cart-item__header']//a[contains(@class, 'c-cart-item__title')]")
    private SelenideElement nameOfProductInTheCart;
    //название товара в "Товары дня"
    @FindBy(xpath = "//mvid-day-product[contains(@class, 'main') and contains(@class, 'product')]//following-sibling::div[contains(@class, 'title')]")
    private SelenideElement nameOfProductOnProductOfDay;
    //цена товара из блока "Товары дня" (который мы выбираем)
    @FindBy(xpath = "//mvid-day-product[contains(@class, 'main') and contains(@class, 'product')]//div[contains(@class, 'price__wrapper')]")
    private SelenideElement tovarDnyaPrice;
    //цена товара в корзине (который мы выбрали)
    @FindBy(xpath = "//div[contains(@class, 'c-cart-item__text-wrapper')]//child::div[@class = 'c-cart-item__price-block']//span[@class = 'c-cart-item__price']")
    private SelenideElement tovarDnyaVKorzinePrice;
    //Элемент "В корзине 1 товар"
    @FindBy(xpath = "//div[(@class = 'c-cost-line__title-wrap')]/span")
    private SelenideElement vKorzine1Tovar;
    //Элемент "Цена товара" в "Товары дня"
    @FindBy(xpath = "//div[@class = 'price price--dailyProduct']/following::span[@class = 'price__main-value']")
    private SelenideElement price;
    //Элемент "Цена товара" в "Моя корзина"
    @FindBy(xpath = "//div[@class = 'c-cart-item__price-block']/span[@class = 'c-cart-item__price']")
    private SelenideElement price_1;
    //Элемент "Самые просматриваемые"
    @FindBy(xpath = "//mvid-mmag-collection/following-sibling::mvid-simple-product-collection-mp")
    private SelenideElement mostViewed;
    //Кнопка "Добавить в корзину" в категории "Самые просматриваемые" у первого товара
    @FindBy(xpath = "//mvid-simple-product-collection[.//h2[text() = 'Самые просматриваемые']]//div[contains(@class,'mvid-carousel-inner')]//div[contains(@class, 'product-mini-card__controls')][1]//button[contains(@class, 'actions__cart') and contains(@class,'mv-main-button--primary')]")
    private SelenideElement addToCart;
    //Кнопка "Добавить в корзину" в категории "Самые просматриваемые" у второго товара
    @FindBy(xpath = "//mvid-simple-product-collection[.//h2[text() = 'Самые просматриваемые']]//div[contains(@class,'mvid-carousel-inner')]//div[contains(@class, 'product-mini-card__controls')][2]//button[contains(@class, 'actions__cart') and contains(@class,'mv-main-button--primary')]")
    private SelenideElement addToCart_1;
    //Строка поиска товара на главной странице
    @FindBy(xpath = "//div[@class = 'input__container']/input")
    private SelenideElement findProduct;
    //Кнопка поиска в строке поиска на главной странице
    @FindBy(xpath = "//div[contains(@class,'input__container')]//following::div[contains(@class, 'search-icon-wrap')]//mvid-icon")
    private SelenideElement buttonFindProduct;
    //Товары Apple
    @FindBy(xpath = "//div[contains(@class,'product-card__title-line-container')][mvid-plp-product-title]//a[contains(@class,'product-title__text')]")
    private SelenideElement appleProducts;
    //Дропдаун "Сначала популярные" на главной странице
    @FindBy(xpath = "//div[contains(@class, 'dropdown')]//span[text() = 'Сначала популярные']")
    private SelenideElement dropdown;
    //Выпадающий список вариантов сортировки
    @FindBy(xpath = "//div[contains(@class, 'open')]//following-sibling::div[@class = 'dropdown__options']")
    private SelenideElement listDropdown;
    //"Сначала дороже" в выпадающем списке вариантов сортировки
    @FindBy(xpath = "//div[@class = 'dropdown__options']//div[text() = ' Сначала дороже ']")
    private SelenideElement mostExpensive;
    //Цена товаров Apple
    @FindBy(xpath = "//div[@class = 'price price--grid ng-star-inserted']/span")
    private SelenideElement priceApple;
    //кнопка "Войти"
    @FindBy(xpath = "//div[@class = 'nav-tabs']//div[contains(@class, 'tab-profile')]")
    private SelenideElement enter;
    //Модальное окно
    @FindBy(xpath = "//div[contains(@class, 'modal-layout__content')]")
    private SelenideElement modalWindow;
    //Поле для ввода текста с плейсхолдером “Телефон”
    @FindBy(xpath = "//div[contains(@class, 'modal-layout--without-title')]//div[@class = 'form-field__input-container']")
    private SelenideElement formField;
    //Неактивная кнопка “Продолжить” в модальном окне
    @FindBy(xpath = "//div[contains(@class, 'modal-layout--without-title')]//following::div[@class = 'login-form__container login-form__button-container']//button")
    private SelenideElement buttonContinue;
    //Ссылка "Для юридических лиц"
    @FindBy(xpath = "//div[contains(@class, 'modal-layout--without-title')]//following::div[@class = 'login-form__container login-form__link-container']//button")
    private SelenideElement link;
    //Ссылка с текущим городом
    @FindBy(xpath = " //div[contains(@class, \'app-header-top\')]//div[contains(@class, \'location\')]")
    private SelenideElement location;
    //Модальное окно с заголовком “Выберите город”
    @FindBy(xpath = "//div[contains(@class,'modal-wrapper__content')]/child::div[contains(@class, 'modal-layout')]")
    private SelenideElement cityModalWindow;
    //Строчка "Краснодар"
    @FindBy(xpath = "//div[contains(@class,'modal-layout')]/.//li[text()='Краснодар']")
    private SelenideElement stringCity;
    //Карточка с наименованием добавленных товаров в "Моя корзина"
    @FindBy(xpath = "//div[@id = 'checkout_main']")
    private SelenideElement checkout;
    //Цена первого товара в корзине
    @FindBy(xpath = "//div[@data-product-position = '1']//div[@class = 'c-cart-item__header']//div[@class = 'c-cart-item__price-block']//span[@class='c-cart-item__price']")
    private SelenideElement firstProductPrice;
    //Цена второго товара в корзине
    @FindBy(xpath = "//div[@data-product-position = '2']//div[@class = 'c-cart-item__header']//div[@class = 'c-cart-item__price-block']")
    private SelenideElement secondProductPrice;
    //Общая цена товаров в корзине
    @FindBy(xpath = "//div[contains(@class, 'c-orders-list') and contains(@class, 'c-orders-list_mobile-sheet')]//div[contains(@class, 'c-cost-line__text-wrap')]//span")
    private SelenideElement totalPrice;

    public SelenideElement getvKorzinu() {
        return vKorzinu;
    }

    public SelenideElement getKorzina() {
        return korzina;
    }

    public SelenideElement getMoyaKorzina() {
        return moyaKorzina;
    }

    public SelenideElement getTovaryDnya() {
        return tovaryDnya;
    }

    public SelenideElement getPereityKOformleniu() {
        return pereityKOformleniu;
    }

    public SelenideElement getNameOfProductInTheCart() {
        return nameOfProductInTheCart;
    }

    public SelenideElement getNameOfProductOnProductOfDay() {
        return nameOfProductOnProductOfDay;
    }

    public SelenideElement getTovarDnyaPrice() {
        return tovarDnyaPrice;
    }

    public SelenideElement getTovarDnyaVKorzinePrice() {
        return tovarDnyaVKorzinePrice;
    }

    public SelenideElement getvKorzine1Tovar() {
        return vKorzine1Tovar;
    }

    public SelenideElement getPrice() {
        return price;
    }

    public SelenideElement getMostViewed() {
        return mostViewed;
    }

    public SelenideElement getAddToCart() {
        return addToCart;
    }

    public SelenideElement getAddToCart_1() {
        return addToCart_1;
    }

    public SelenideElement getFindProduct() {
        return findProduct;
    }

    public SelenideElement getButtonFindProduct() {
        return buttonFindProduct;
    }

    public SelenideElement getAppleProducts() {
        return appleProducts;
    }

    public SelenideElement getDropdown() {
        return dropdown;
    }

    public SelenideElement getListDropdown() {
        return listDropdown;
    }

    public SelenideElement getMostExpensive() {
        return mostExpensive;
    }

    public SelenideElement getPriceApple() {
        return priceApple;
    }

    public SelenideElement getEnter() {
        return enter;
    }

    public SelenideElement getModalWindow() {
        return modalWindow;
    }

    public SelenideElement getFormField() {
        return formField;
    }

    public SelenideElement getButtonContinue() {
        return buttonContinue;
    }

    public SelenideElement getLink() {
        return link;
    }

    public SelenideElement getLocation() {
        return location;
    }

    public SelenideElement getCityModalWindow() {
        return cityModalWindow;
    }

    public SelenideElement getStringCity() {
        return stringCity;
    }

    public SelenideElement getCheckout() {
        return checkout;
    }

    public SelenideElement getFirstProductPrice() {
        return firstProductPrice;
    }

    public SelenideElement getSecondProductPrice() {
        return secondProductPrice;
    }

    public SelenideElement getTotalPrice() {
        return totalPrice;
    }
}


