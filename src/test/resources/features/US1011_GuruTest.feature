Feature: US1011 web tablosundakı ıstenen stunu yazdırma
  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli

  http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
  Cucumber framework'de US1012_Guru_Web_Tables altinda

    Given kullanici "guruUrl" anasayfasinda
    And "Istenen Baslik", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir