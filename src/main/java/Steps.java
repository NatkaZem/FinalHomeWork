import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

public class Steps {

    public void checkThatButtonStatusZakazaIsEnabled() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getStatusZakaza();
        Assert.assertTrue(actual.isEnabled());
    }

    public void checkThatButtonStatusZakazaIsDisplayed() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getStatusZakaza();
        Assert.assertTrue(actual.isDisplayed());
    }

    public void checkThatButtonVoityIsEnabled() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getVoity();
        Assert.assertTrue(actual.isEnabled());
    }

    public void checkThatButtonVoityIsDisplayed() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getVoity();
        Assert.assertTrue(actual.isDisplayed());
    }

    public void checkThatButtonSravnenieIsDisabled() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getSravnenie();
        Assert.assertTrue(actual.has(Condition.cssClass("disabled")));
    }

    public void checkThatButtonSravnenieIsDisplayed() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getSravnenie();
        Assert.assertTrue(actual.isDisplayed());
    }

    public void checkThatButtonIzbrannoeIsDisabled() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getIzbrannoe();
        Assert.assertTrue(actual.has(Condition.cssClass("disabled")));
    }

    public void checkThatButtonIzbrannoeIsDisplayed() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getIzbrannoe();
        Assert.assertTrue(actual.isDisplayed());
    }

    public void checkThatButtonKorzinaIsDisabled() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getKorzina();
        Assert.assertTrue(actual.has(Condition.cssClass("disabled")));
    }

    public void checkThatButtonKorzinaIsDisplayed() {
        MvideoPageTask1 mvideoPage = MvideoPageTask1.getMvideoPage();
        SelenideElement actual = mvideoPage.getKorzina();
        Assert.assertTrue(actual.isDisplayed());
    }


}
