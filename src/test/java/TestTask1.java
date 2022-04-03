import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTask1 {
    private Steps steps = new Steps();


    @BeforeTest
    public void beforeTest() {
        Selenide.open("https://www.mvideo.ru/");
    } //Открываем ссылку mvideo.ru

    @Test
    public void checkButtonsOfHeaderOfMainPage() {
        steps.checkButtonsOfHeaderOfMainPage();
    }

    @AfterTest
    public void afterTest(){
        Selenide.closeWebDriver();
    }
}

