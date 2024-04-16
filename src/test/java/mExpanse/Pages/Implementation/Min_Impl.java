package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.Min_Interface;
import mExpanse.Pages.ObjectRepository.SauceOR;
import org.openqa.selenium.WebDriver;

public class Min_Impl implements Min_Interface {

    @Override
    public void min(WebDriver driver) throws InterruptedException {
        Operations.sendText(SauceOR.Locator.username, "standard_user",driver);
        Operations.sendText(SauceOR.Locator.password, "secret_sauce",driver);
        Operations.click(SauceOR.Locator.login,driver);

        Operations.click(SauceOR.Locator.p5_cart,driver);
        Thread.sleep(3000);
        System.out.println(SauceOR.UIElements.p5_name);
        System.out.println(SauceOR.UIElements.p5_des);

    }

}
