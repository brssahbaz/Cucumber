package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;

public class AmazonEnIyiUrunSD {
    AmazonPage page = new AmazonPage();
    String eniyiUrunIsim = "";
    String eniyiUrunPuan = "";
    String eniyiUrunSayi = "";
    String eniyiUrunFiyat = "";
    int enYuksek = 0;

    @Given("kullanici kategori olarak {string} secer")
    public void kullanici_kategori_olarak_secer(String kategori) {
        Select select = new Select(page.catList);
        select.selectByVisibleText(kategori);


    }

    @Given("kullanici arama kutuusna {string} yazar")
    public void kullanici_arama_kutuusna_yazar(String urun) {
        page.aramakutusu.sendKeys(urun + Keys.ENTER);
    }


    @Given("kullanici en iyi urunu bulmak icin hesaplama yapar")
    public void kullanici_en_iyi_urunu_bulmak_icin_hesaplama_yapar() {

        for (WebElement urun : page.tumUrunler) {
            WebElement isim = urun.findElement(By.cssSelector(".a-size-medium.a-color-base.a-text-normal"));
            WebElement fiyat = urun.findElement(By.cssSelector(".a-price-whole"));//"24"
            WebElement puan = urun.findElement(By.cssSelector("[aria-label~='stars']"));
            WebElement sayi = urun.findElement(By.xpath("//a[@class='a-link-normal']/span[@class='a-size-base']"));
            // 4.4 out of 5 stars
            String puanBul[] = puan.getAttribute("aria-label").split(" out");
            int temelPuan = (int) Float.parseFloat(puanBul[0]); // 4

            //12292
            int degerlendirmeSayisi = Integer.parseInt(sayi.getText().replace(",", ""));
            int temelFiyat = Integer.parseInt(fiyat.getText());// 24
            int sonuc = (temelPuan * degerlendirmeSayisi) - (temelFiyat * 300);
            if (sonuc > enYuksek) {
                eniyiUrunIsim = isim.getText();
                eniyiUrunPuan = "" + temelPuan;
                eniyiUrunSayi = "" + degerlendirmeSayisi;
                eniyiUrunFiyat = fiyat.getText();

            }

        }


    }

    @Given("kullanici en iyi urunu konsola yazar")
    public void kullanici_en_iyi_urunu_konsola_yazar() {
        System.out.println("isim: "+eniyiUrunIsim);
        System.out.println("puan: "+eniyiUrunPuan);
        System.out.println("fiyat: "+eniyiUrunFiyat);
        System.out.println("say??: "+eniyiUrunSayi);
    }


}
