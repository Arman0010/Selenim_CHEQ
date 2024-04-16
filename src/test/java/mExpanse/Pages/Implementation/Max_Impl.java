package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.Max_Interface;
import mExpanse.Pages.ObjectRepository.SauceOR;
import org.openqa.selenium.WebDriver;

public class Max_Impl implements Max_Interface {

    @Override
    public void max(WebDriver driver) throws InterruptedException {
        Operations.sendText(SauceOR.Locator.username, "standard_user",driver);
        Operations.sendText(SauceOR.Locator.password, "secret_sauce",driver);
        Operations.click(SauceOR.Locator.login,driver);

        Operations.click(SauceOR.Locator.p4_cart,driver);
        Thread.sleep(3000);
        System.out.println(SauceOR.UIElements.p4_name);
        System.out.println(SauceOR.UIElements.p4_des);
//        for(int i=0; i<6; i++){
//
//        }



    }

}
