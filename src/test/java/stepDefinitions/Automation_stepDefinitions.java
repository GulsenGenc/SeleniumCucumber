package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class Automation_stepDefinitions {
    AutomationPage automationPage = new AutomationPage();
    Faker faker = new Faker();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automationPage.singInButton.click();
    }

    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bölümüne_email_adresi_girer() {
        automationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationPage.createAccountButton.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions = new Actions(Driver.getDriver());
actions.click(automationPage.gender)
        .sendKeys(Keys.TAB)
        .sendKeys(faker.name().firstName()+Keys.TAB)
        .sendKeys(faker.name().lastName()+Keys.TAB+Keys.TAB)
        .sendKeys(faker.internet().password()+Keys.TAB)
        .sendKeys("10"+Keys.TAB)
        .sendKeys("January"+Keys.TAB)
        .sendKeys("2000"+Keys.TAB)
        .sendKeys(Keys.TAB)
        .sendKeys(Keys.TAB)
        .sendKeys(Keys.TAB)
        .sendKeys(Keys.TAB)
        .sendKeys(Keys.TAB)
        .sendKeys(faker.company().name()+Keys.TAB)
        .sendKeys(faker.address().fullAddress()+Keys.TAB)

        .sendKeys(faker.address().cityName()+Keys.TAB)
        .sendKeys("Alaska"+Keys.TAB)

        .sendKeys(faker.address().zipCode()+Keys.TAB)
        .sendKeys("United States"+Keys.TAB)
        .sendKeys(Keys.TAB)
        .sendKeys(faker.phoneNumber().phoneNumber()+Keys.TAB)
        .sendKeys(faker.phoneNumber().phoneNumber()+Keys.TAB)
        .sendKeys("ALSK").perform();
    }

    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
automationPage.registerButton.click();
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());
    }
}
