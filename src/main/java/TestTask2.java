import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTask2 {
    private StepsTask2 steps = new StepsTask2();


    @BeforeTest
    public void beforeTest() {
        Selenide.open("https://www.mvideo.ru/");
    } //Открываем ссылку mvideo.ru

    @Test
    public void checkThatVKorzinuIsEnabledAndHasNumber() {
        steps.checkThatVKorzinuIsEnabledAndHasNumber();
    }


}

