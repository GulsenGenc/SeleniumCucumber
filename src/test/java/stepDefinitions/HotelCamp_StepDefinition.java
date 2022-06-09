package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelPage;
import utilities.ConfigReader;

public class HotelCamp_StepDefinition {

    HotelPage hotelPage = new HotelPage();

    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        hotelPage.loginButonu.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hotelPage.usernameKutusu.sendKeys(ConfigReader.getProperty("hotelUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hotelPage.passwordKutusu.sendKeys(ConfigReader.getProperty("hotelPassword"));

    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hotelPage.loginButonu2.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hotelPage.hotelManagement.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hotelPage.passwordKutusu.sendKeys(ConfigReader.getProperty("hotelWrongPassword"));

    }

    @Then("sayfaya giris yapılamadıgını test eder")
    public void sayfayaGirisYapılamadıgınıTestEder() {
        Assert.assertTrue(hotelPage.tekrarDeneyinYazısı.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hotelPage.usernameKutusu.sendKeys(ConfigReader.getProperty("hotelWrongUsername"));
    }

    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hotelPage.usernameKutusu.sendKeys(username);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hotelPage.passwordKutusu.sendKeys(password);
    }





}
