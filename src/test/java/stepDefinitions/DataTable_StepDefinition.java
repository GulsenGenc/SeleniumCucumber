package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablePage;

public class DataTable_StepDefinition {
    DataTablePage dtPage=new DataTablePage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dtPage.newButonu.click();
    }
    @Then("isim bölümüne {string} yazar")
    public void isim_bölümüne_yazar(String firstName) {
        dtPage.firstNameKutusu.sendKeys(firstName);
    }
    @Then("soyisim bölümüne {string} yazar")
    public void soyisim_bölümüne_yazar(String lastName) {
        dtPage.lastNameKutusu.sendKeys(lastName);
    }
    @Then("position bölümüne {string} yazar")
    public void position_bölümüne_yazar(String position) {
        dtPage.positionKutusu.sendKeys(position);

    }
    @Then("office bölümüne {string} yazar")
    public void office_bölümüne_yazar(String office) {
        dtPage.officeKutusu.sendKeys(office);

    }
    @Then("extension bölümüne {string} yazar")
    public void extension_bölümüne_yazar(String extension) {
        dtPage.extentionKutusu.sendKeys(extension);

    }
    @Then("startDate bölümüne {string} yazar")
    public void start_date_bölümüne_yazar(String date) {
        dtPage.startDate.sendKeys(date);

    }
    @Then("salary bölümüne {string} yazar")
    public void salary_bölümüne_yazar(String salary) {
        dtPage.salaryKutusu.sendKeys(salary);

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dtPage.createButonu.click();
    }



    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dtPage.search.sendKeys(firstName+ Keys.ENTER);
    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstName) {
        Assert.assertTrue(dtPage.aramaSonucIlkElement.getText().contains(firstName));
    }

}
