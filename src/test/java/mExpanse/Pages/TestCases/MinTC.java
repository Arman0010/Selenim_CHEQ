package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.Min_Impl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)
public class MinTC extends BaseClass{
    Min_Impl obj= new Min_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }


    @Test
    public void Min() throws InterruptedException {
        obj.min(driver);
    }

    @AfterClass
    public void  testCaseTearDown() {
        tearDown();
    }
}
