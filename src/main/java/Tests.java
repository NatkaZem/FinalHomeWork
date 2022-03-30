import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Array;

public class Tests {
    private Steps steps = new Steps();


//    @DataProvider(name = "testDataProvider")
//    public static Object[][] dataProviderMethod() {
//        return new Object[][]
//                {{"statusZakaza"},
//                        {"voity"},
//                        {"sravnenie"},
//                        {"izbrannoe"},
//                        {"korzina"}};
//    }
//
//    @Test(dataProvider = "testDataProvider")
//    public void checkThatButtonsAreEnabled(String statusZakaza, String voity, String sravnenie, String izbrannoe, String korzina) {
//        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
//        SelenideElement actual = mvideoPage.getStatusZakaza();
//        Assert.assertTrue(actual.isEnabled());
//    }

    @BeforeTest
    public void beforeTest() {
        Selenide.open("https://www.mvideo.ru/");
    }

    //проверка, что кнопка "Статус заказа" активна
    @Test
    public void checkStatusZakazaIsEnabled() {
        steps.checkThatButtonStatusZakazaIsEnabled();
    }

    //проверка, что кнопка "Статус заказа" видима
    @Test
    public void checkStatusZakazaIsDisplayed() {
        steps.checkThatButtonStatusZakazaIsDisplayed();
    }

    //проверка, что кнопка "Войти" активна
    @Test
    public void checkVoityIsEnabled() {
        steps.checkThatButtonVoityIsEnabled();
    }

    //проверка, что кнопка "Войти" видима
    @Test
    public void checkVoityIsDisplayed() {
        steps.checkThatButtonVoityIsDisplayed();
    }

    //проверка, что кнопка "Сравнение" не активна
    @Test
    public void checkSravnenieIsDisabled() {
        steps.checkThatButtonSravnenieIsDisabled();
    }

    //проверка, что кнопка "Сравнение" видима
    @Test
    public void checkSravnenieIsDisplayed() {
        steps.checkThatButtonSravnenieIsDisplayed();
    }


    //проверка, что кнопка "Избранное" не активна
    @Test
    public void checkIzbrannoeIsDisabled() {
       steps.checkThatButtonIzbrannoeIsDisabled();
    }

    //проверка, что кнопка "Избранное" видима
    @Test
    public void checkIzbrannoeIsDisplayed() {
        steps.checkThatButtonIzbrannoeIsDisplayed();
    }

    //проверка, что кнопка "Корзина" не активна
    @Test
    public void checkKorzinaIsDisabled() {
        steps.checkThatButtonKorzinaIsDisabled();
    }

    //проверка, что кнопка "Корзина" видима
    @Test
    public void checkKorzinaIsDisplayed() {
        steps.checkThatButtonKorzinaIsDisplayed();
    }

}