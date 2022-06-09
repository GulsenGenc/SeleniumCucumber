# hotel my camp sitesinde 3 adet negative test senaryosu olusturalim
# 1- dogru username-yanlis password
# 2- yanlis username-dogru password
# 3- yanlis username-yanlis password

Feature: US1006 yanlis bilgilerle siteye giris yapilamaz

  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "hotelUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapılamadıgını test eder
    And sayfayi kapatir


  Scenario: TC10 yanlış username ile sayafaya gırılemez
    Given kullanici "hotelUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapılamadıgını test eder
    And sayfayi kapatir

  Scenario: TC11 yanlış şifre ve kullanıcı adı ile sayfaya gırılemez
    Given kullanici "hotelUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapılamadıgını test eder
    And sayfayi kapatir