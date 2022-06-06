@tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar
@nutella
  Scenario: TC01 kullanıcı amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    Then sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir
@java
  Scenario: TC02 kullanici amazonda java aratir
    Given kullanici amazon anasayfasinda
    Then kullanici java icin arama yapar
    Then sonuclarin java icerdigini test eder
    And sayfayi kapatir
@iphone
    Scenario: TC03 kullanici iphone aratsın
      When kullanici amazon anasayfasinda
      Then kullanici iphone icin arama yapar
      And sonuclarin iphone icerdigini test eder
      And sayfayi kapatir