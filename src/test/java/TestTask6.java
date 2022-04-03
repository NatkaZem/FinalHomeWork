import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTask6 {
    private StepsTask3 steps = new StepsTask3();

    @BeforeTest
    public void beforeTest() {
        Selenide.open("https://www.mvideo.ru/"); //Открываем ссылку mvideo.ru
    }


    @Test
    public void sortingInTheListing() {
        steps.sortingInTheListing();
    }
}