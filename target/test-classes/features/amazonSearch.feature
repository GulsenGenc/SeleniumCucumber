Feature: Amazon Search

  Scenario: TC01 kullanıcı amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    Then sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

    Scenario: TC02 kullanici amazonda java aratir
      Given kullanici amazon anasayfasinda
      Then kullanici java icin arama yapar
      And sonuclarin java icerdigini test eder
      And sonuclarin java icerdigini test eder