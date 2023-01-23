Feature: En iyi Urun

  @amazoneniyiurun
  Scenario: :kullanici arama sonuclarindaki en iyi urunu bulur
    Given kullanici amazon sayfasina gider
    And kullanici kategori olarak "Automotive" secer
    And kullanici arama kutuusna "car phone holder" yazar
    And kullanici en iyi urunu bulmak icin hesaplama yapar
    And kullanici en iyi urunu konsola yazar