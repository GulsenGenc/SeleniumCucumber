package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import pages.DataTablePage;
import pages.HotelPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Amazon_StepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramakUtusu.sendKeys("Nutella" + Keys.ENTER);

    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime = "Nutella";
        String actualAramaSonucYazısı = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazısı.contains(arananKelime));

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramakUtusu.sendKeys("java" + Keys.ENTER);
    }

    @Then("sonuclarin java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String arananKelime = "java";
        String actualAramaSonucYazısı = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazısı.contains(arananKelime));


    }


    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime = "iphone";
        String actualAramaSonucYazısı = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazısı.contains(arananKelime));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramakUtusu.sendKeys("iphone" + Keys.ENTER);
    }

    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.aramakUtusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        String actualAramaSonucYazısı = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazısı.contains(istenenKelime));
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }


    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {

        try {
            Thread.sleep(istenenSaniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}