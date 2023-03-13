package tests.day11_POM_assertions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class C06_SoftAssert {

    @Test
    public void webAppTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

        ZeroPage zeroPage=new ZeroPage();

        zeroPage.signInButonu.click();

        zeroPage.usernameKutusu.sendKeys("username");

        zeroPage.passwordKutusu.sendKeys("password");

        zeroPage.signInSubmitButonu.click();

        Driver.getDriver().navigate().back();

        zeroPage.onlineBanking.click();

        zeroPage.payBillLinki.click();

        zeroPage.purchaseFCButonu.click();

        Select select= new Select(zeroPage.currencyDropdown);
        ReusableMethods.bekle(2);
        select.selectByVisibleText("Eurozone (euro)");

        SoftAssert softAssert=new SoftAssert();
        String expectedSecim= "Eurozone (euro)";
        String actualSecim= select.getFirstSelectedOption().getText();
        softAssert.assertEquals(actualSecim,expectedSecim, "dropdownda eurozone secili degil");

        List<WebElement> optionsElementListesi= select.getOptions();
        List<String> actualOptionsStringList= ReusableMethods.stringListeCevir(optionsElementListesi);
        String[] expectedArr= {"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"};
        List<String> expectedOptionListesi = new ArrayList<>();

        for (String each: expectedArr
        ){
            expectedOptionListesi.add(each);
        }
        softAssert.assertEquals(actualOptionsStringList,expectedOptionListesi);


        softAssert.assertAll();
        Driver.closeDriver();


    }
}
