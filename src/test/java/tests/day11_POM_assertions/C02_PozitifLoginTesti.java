package tests.day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utulities.ConfigReader;
import utulities.Driver;

public class C02_PozitifLoginTesti {

    @Test
    public void pozitifLoginTesti(){
        //qd anasayfaya gidin ve gecerli kullanici adi ve password ile giris yapin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));



        //login linkine tiklayin

        QdPage qdPage= new QdPage();
        qdPage.acceptCokies.click();
        qdPage.ilkLoginLinki.click();


        // gecerli kullanici adi ve password ile giris yapin


        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));



        qdPage.loginButonu.click();


        // basarili bir sekilde giris yapildigini test edin
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());

        Driver.closeDriver();
    }
}