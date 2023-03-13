package utulities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {
    public static void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<String> stringListeCevir(List<WebElement> webElementList){

        List<String> stringListesi= new ArrayList<>();

        for (WebElement eachElemet: webElementList
        ){
            stringListesi.add(eachElemet.getText());
        }
        return stringListesi;



    }

}
