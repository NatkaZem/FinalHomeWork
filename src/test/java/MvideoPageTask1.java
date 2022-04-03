import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class MvideoPageTask1 {
    private static MvideoPageTask1 mvideoPage;

    private MvideoPageTask1() {
    }

    public static MvideoPageTask1 getMvideoPage() {
        if (Objects.isNull(mvideoPage)) mvideoPage = Selenide.page(new MvideoPageTask1());
        return mvideoPage;
    }

    //кнопка "Статус заказа"
    @FindBy(xpath = "//div[@class = 'nav-tabs']//mvid-header-icon[contains(@class, 'tab-status-order')]")
    private SelenideElement statusOrder;
    //кнопка "Войти"
    @FindBy(xpath = "//div[@class = 'nav-tabs']//div[contains(@class, 'tab-profile')]")
    private SelenideElement enter;
    //кнопка "Сравнение"
    @FindBy(xpath = "//div[contains(@class, 'tab-compare')]//mvid-header-icon")
    private SelenideElement compare;
    //кнопка "Избранное"
    @FindBy(xpath = "//div[contains(@class,'tab-personal')]//mvid-header-icon")
    private SelenideElement favorite;
    //кнопка "Корзина"
    @FindBy(xpath = "//div[contains(@class,'tab-cart')]//mvid-header-icon")
    private SelenideElement korzina;


    public SelenideElement getStatusOrder() {return statusOrder;}
    public SelenideElement getEnter() {
        return enter;
    }
    public SelenideElement getCompare() {
        return compare;
    }
    public SelenideElement getFavorite() {return favorite;}
    public SelenideElement getKorzina() {
        return korzina;
    }
}




