Feature:Amazon Arama

  @amazonarama
  Scenario:TC01_Kullanici amazonda urun arar
    Given kullanici amazon sayfasina gider
    And kullanıcı arama kutusuna iphone yazar
    Then kullanici sonuc sayisini ekrana yazar