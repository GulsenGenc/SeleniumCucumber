Feature: US1004 Kullanici parametre ile configuratıon file i kullanabılmeli

  @config
  Scenario: TC07 Confuguration properties dosyasından parametre kullanımı
    Given kullanici "amazonUrl" anasayfasinda
    And url'in amazon icerdini test eder
    Then sayfayi kapatir