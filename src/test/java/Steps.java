import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;


public class Steps {

    public void checkButtonsOfHeaderOfMainPage(){
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement statusOrder = mvideoPage.getStatusOrder();
        Assert.assertTrue(statusOrder.isDisplayed());         //Кнопка "Статус заказа" отображается
        Assert.assertTrue(statusOrder.isEnabled());          //и активна
        SelenideElement enter = mvideoPage.getEnter();
        Assert.assertTrue(enter.isDisplayed());              //Кнопка "Войти" отображается
        Assert.assertTrue(enter.isEnabled());                //и активна
        SelenideElement compare = mvideoPage.getCompare();
        Assert.assertTrue(compare.isDisplayed());            //Кнопка "Сравнение" отображается
        Assert.assertTrue(compare.has(Condition.cssClass("disabled"))); //и неактивна
        SelenideElement favorite = mvideoPage.getFavorite();
        Assert.assertTrue(favorite.isDisplayed());          //Кнопка "Избранное" отображается
        Assert.assertTrue(favorite.has(Condition.cssClass("disabled")));  //и неактивна
        SelenideElement korzina = mvideoPage.getKorzina();
        Assert.assertTrue(korzina.isDisplayed());           //Кнопка "Корзина" отображается
        Assert.assertTrue(korzina.has(Condition.cssClass("disabled")));  //и неактивна
    }
}
