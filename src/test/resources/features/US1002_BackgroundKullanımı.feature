Feature: US1002 Kullanici ortak adimlari Background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasinda

    Scenario: TC04 amazon nutella arama
      And kullanici Nutella icin arama yapar
      And  sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir

      Scenario: TC05 amazon java arama
        And kullanici java icin arama yapar
        Then sonuclarin java icerdigini test eder
        And sayfayi kapatir