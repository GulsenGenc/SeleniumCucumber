package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerOkuPage;
import utilities.Driver;

import java.time.Duration;

public class HerOku_StepDefinition {
HerOkuPage hoPage=new HerOkuPage();
    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        hoPage.addElementButonu.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(hoPage.deleteButonları.get(0)));
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(hoPage.deleteButonları.get(0).isDisplayed());
    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
hoPage.deleteButonları.get(0).click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
Assert.assertTrue(hoPage.deleteButonları.isEmpty());
    }
}
