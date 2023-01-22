package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonAramaStepDef {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://www.amazon.com");

        System.out.println("İlk adım");
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("kullanıcı arama kutusuna iphone yazar")
    public void kullanıcı_arama_kutusuna_iphone_yazar() {

        amazonPage.aramakutusu.sendKeys("iphone"+ Keys.ENTER);
        System.out.println("İkinci adım");
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("kullanici sonuc sayisini ekrana yazar")
    public void kullanici_sonuc_sayisini_ekrana_yazar() {
        String sonucSayisi=amazonPage.sonucSayisi.getText();
        System.out.println(sonucSayisi);
        // Write code here that turns the phrase above into concrete actions

    }





}
