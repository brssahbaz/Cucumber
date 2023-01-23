package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReusableMethods {


    public static void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<WebElement> getBasliklar(int tablo){
      return  Driver.getDriver().findElements(By.xpath("(//table)["+tablo+"]//th"));
    }

    public static List<WebElement> getSatirlar(int tablo){
        return  Driver.getDriver().findElements(By.xpath("(//table)[1]/tbody/tr"));
    }
    public static List<WebElement> getHucreler(int tablo){
        return  Driver.getDriver().findElements(By.xpath("(//table)[1]/tbody/tr"));
    }
    public static List<WebElement> getSatirdakiHucreler(int tablo,int satir){
        return  Driver.getDriver().findElements(By.xpath("((//table)["+tablo+"]/tbody/tr)["+satir+"]"));
    }

    public static List<WebElement> getSutun(int tablo,int sutun){
        return  Driver.getDriver().findElements(By.xpath("(//table)["+tablo+"]//td["+sutun+"]"));
    }

    public static WebElement getTabloSatirSutun(int tablo,int satir,int sutun){
        return  Driver.getDriver().findElement(By.xpath("(//table)["+tablo+"]//tr["+satir+"]/td["+sutun+"]"));
    }

}
