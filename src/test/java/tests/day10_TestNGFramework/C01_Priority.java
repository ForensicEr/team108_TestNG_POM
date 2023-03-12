package tests.day10_TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utulities.Driver;



public class C01_Priority {
    /*
    TestNg test methodlarini standart olarak harf siralamasina bakar
    Ancak TestNg siralamayi bizim kontrol etmemize olanak tanir
    Istedigimiz test methoduna istedigimiz onceligi priority ile tanimlayabiliriz
    Selenium test methodlarini priority'si kucukten buyuge olacak sekilde calsitirir
    Priority ayni olan test methodlari harf sirasina göre calisir
    priority degeri yazilmazsa default olarak '0' kabul edilir
     */


    @Test (priority = 20)
    public void amazonTesti(){
        // Amazon ana sayfaya gidip, amazona gittigimizi test edelim
        Driver.getDriver().get("https://www.amazon.com");

        // url amazon iceriyor mu test edelim
        String expectedIcerik = "amazon";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }

    @Test (priority = 50)
    public void wiseTesti(){
        // wisequarter ana sayfaya gidip, wisequarter'a gittigimizi test edelim
        Driver.getDriver().get("https://www.wisequarter.com");

        // url wisequarter iceriyor mu test edelim
        String expectedIcerik = "wisequarter";
        String actualUrl= Driver.getDriver().getCurrentUrl();


        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();


    }


    @Test (priority = 30)
    public void youtubeTesti() throws InterruptedException{
        // youtube ana sayfaya gidip, youtube gittigimizi test edelim
        Driver.getDriver().get("https://www.youtube.com");
        Thread.sleep(2000);
        Driver.getDriver().navigate().refresh();

        // url youtube iceriyor mu test edelim
        String expectedIcerik = "youtube";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();


    }
}