Feature: En iyi Urun

  @amazoneniyiurun
  Scenario: :kullanici arama sonuclarindaki en iyi urunu bulur
    Given kullanici amazon sayfasina gider
    And kullanici kategori olarak "Baby" secer
    And kullanici arama kutuusna "stroller" yazar
    And kullanici en iyi urunu bulmak icin hesaplama yapar
    Then kullanici en iyi urunu konsola yazar