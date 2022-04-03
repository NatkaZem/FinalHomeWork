import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTask5 {
    private StepsTask3 steps = new StepsTask3();

    @BeforeTest
    public void beforeTest() {
        Selenide.open("https://www.mvideo.ru/"); //Открываем ссылку mvideo.ru
    }

    @Test
    public void findProducts() {
        steps.findProducts();
    }

    @AfterTest
    public void afterTest(){
        Selenide.closeWebDriver();
    }
}
