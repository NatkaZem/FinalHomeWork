import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class MvideoPageTask1 {
    private static MvideoPageTask1 mvideoPage;
    public SelenideElement testData;

    private MvideoPageTask1() {
    }

    public static MvideoPageTask1 getMvideoPage() {
        if (Objects.isNull(mvideoPage)) mvideoPage = Selenide.page(new MvideoPageTask1());
        return mvideoPage;
    }

    //кнопка "Статус заказа"
    @FindBy(xpath = "//div[@class = 'container'][.//*[text() = 'Статус заказа']]")
    private SelenideElement statusZakaza;
    //кнопка "Войти"
    @FindBy(xpath = "//div[@class = 'container'][.//*[text() = 'Войти']]")
    private SelenideElement voity;
    //кнопка "Сравнение"
    @FindBy(xpath = "//div[contains(@class, 'tab-compare')]//mvid-header-icon")
    private SelenideElement sravnenie;
    //кнопка "Избранное"
    @FindBy(xpath = "//div[contains(@class, 'tab-personal')]//mvid-header-icon")
    private SelenideElement izbrannoe;
    //кнопка "Корзина"
    @FindBy(xpath = "//div[contains(@class, 'tab-cart')]//mvid-header-icon")
    private SelenideElement korzina;


    public SelenideElement getStatusZakaza() {return statusZakaza;}
    public SelenideElement getVoity() {
        return voity;
    }
    public SelenideElement getSravnenie() {
        return sravnenie;
    }
    public SelenideElement getIzbrannoe() {
        return izbrannoe;
    }
    public SelenideElement getKorzina() {
        return korzina;
    }
}




