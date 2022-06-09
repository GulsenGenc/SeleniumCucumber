package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel_stepDefinition {
    Workbook workbook;

    @Given("kullanici excel dosyasini kullanilabilir hale getirir")
    public void kullanici_excel_dosyasini_kullanilabilir_hale_getirir() throws IOException {
        String dosyaYolu = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        workbook = WorkbookFactory.create(fis);

    }

    @Then("{int}.satirdaki {int}.hucreye yazdirir")
    public void satirdaki_hucreye_yazdirir(Integer satır, Integer sutun) {
        String ıstenenHucreyıYazdır =
                workbook.getSheet("Sayfa1").getRow(satır - 1).getCell(sutun - 1).toString();
        System.out.println(satır + ". satır " + sutun + ". daki değer :" + ıstenenHucreyıYazdır);
        System.out.println(workbook.getSheet("Sayfa1").getLastRowNum());
    }

    @Then("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskenti_jakarta_olan_ulke_ismini_yazdirir() {
        int satırSayısı = workbook.getSheet("Sayfa1").getLastRowNum();
        for (int i = 0; i <= satırSayısı; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")) {
                System.out.println("başkenti Jakarta olan ülke " + workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            }

        }
    }

    @Then("Ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer sayı) {
        int ulkeSayısı = workbook.getSheet("Sayfa1").getLastRowNum();
        Assert.assertTrue(ulkeSayısı == sayı);
    }

    @Then("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer sayı) {
        int doluSatırSayısı = workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(doluSatırSayısı == sayı);
    }


}
