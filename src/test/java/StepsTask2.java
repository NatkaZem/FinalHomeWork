import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

public class StepsTask2 {

    public void checkThatVKorzinuIsEnabledAndHasNumber() {
        MvideoPageTask2 mvideoPage = MvideoPageTask2.mvideoPage();
        SelenideElement tovaryDnya = mvideoPage.getTovaryDnya();
        Assert.assertTrue(tovaryDnya.isDisplayed());                    //На странице отображается блок “Товары дня”
        Configuration.timeout = 10000;
        SelenideElement vKorzinu = mvideoPage.getvKorzinu();
        vKorzinu.click();                                               //Нажимаем у товара на кнопку “В корзину”
        Configuration.timeout = 10000;
        SelenideElement actual = mvideoPage.getKorzina();
        Assert.assertTrue(actual.isEnabled());                          //Кнопка “Корзина” в шапке становится активной
        Assert.assertTrue(actual.has(Condition.matchText("1")));        //На кнопке "Корзина" отображается число 1
    }
}