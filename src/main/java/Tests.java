import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.testng.Assert;
import org.testng.annotations.*;


public class Tests {
    private Steps steps = new Steps();
    private Object[][] testData = new Object[][]{
            {"statusZakaza", "voity", "sravnenie", "izbrannoe", "korzina"}};

    @BeforeTest
    public void beforeTest() {
        Selenide.open("https://www.mvideo.ru/");
    }

    @DataProvider(name = "testDataProvider")
    public Object[][] getData() {
        return testData;
    }

    @Test(dataProvider = "testDataProvider")
    public void checkThatButtonsAreDisplayed(Object param_1, Object param_2, Object param_3, Object param_4, Object param_5) {
        steps.checkThatButtonsAreDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void checkThatButtonsAreEnabled(Object param_1, Object param_2) {
        steps.checkThatButtonsAreEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void checkThatButtonsAreNotEnabled(Object param_3, Object param_4, Object param_5) {
        steps.checkThatButtonsAreNotEnabled();
    }

    @AfterTest
    public void afterTest(){
        Selenide.closeWebDriver();
    }

}


////
//    //проверка, что кнопка "Статус заказа" активна
//    @Test
//    public void checkStatusZakazaIsEnabled() {
//        steps.checkThatButtonStatusZakazaIsEnabled();
//    }
//////
////    //проверка, что кнопка "Статус заказа" видима
////    @Test
////    public void checkStatusZakazaIsDisplayed() {
////        steps.checkThatButtonStatusZakazaIsDisplayed();
////    }
//////
//    //проверка, что кнопка "Войти" активна
//    @Test
//    public void checkVoityIsEnabled() {
//        steps.checkThatButtonVoityIsEnabled();
//    }
//////
////    //проверка, что кнопка "Войти" видима
////    @Test
////    public void checkVoityIsDisplayed() {
////        steps.checkThatButtonVoityIsDisplayed();
////    }
//////
//    //проверка, что кнопка "Сравнение" не активна
//    @Test
//    public void checkSravnenieIsDisabled() {
//        steps.checkThatButtonSravnenieIsDisabled();
//    }
//////
////    //проверка, что кнопка "Сравнение" видима
////    @Test
////    public void checkSravnenieIsDisplayed() {
////        steps.checkThatButtonSravnenieIsDisplayed();
////    }
//////
//////
//    //проверка, что кнопка "Избранное" не активна
//    @Test
//    public void checkIzbrannoeIsDisabled() {
//       steps.checkThatButtonIzbrannoeIsDisabled();
//    }
//////
////    //проверка, что кнопка "Избранное" видима
////    @Test
////    public void checkIzbrannoeIsDisplayed() {
////        steps.checkThatButtonIzbrannoeIsDisplayed();
////    }
//////
//    //проверка, что кнопка "Корзина" не активна
//    @Test
//    public void checkKorzinaIsDisabled() {
//        steps.checkThatButtonKorzinaIsDisabled();
//    }
//
////    //проверка, что кнопка "Корзина" видима
////    @Test
////    public void checkKorzinaIsDisplayed() {
////        steps.checkThatButtonKorzinaIsDisplayed();
////    }
////
//}