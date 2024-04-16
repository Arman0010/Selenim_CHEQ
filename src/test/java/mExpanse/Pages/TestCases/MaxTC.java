package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.Max_Impl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)
public class MaxTC extends BaseClass{
    Max_Impl obj= new Max_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }


    @Test
    public void Max() throws InterruptedException {
        obj.max(driver);
    }

    @AfterClass
    public void  testCaseTearDown() {
        tearDown();
    }
}
