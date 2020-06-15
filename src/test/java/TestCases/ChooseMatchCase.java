package TestCases;

import Listener.Listener;
import TestCaseFunctions.ChooseMatchFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class ChooseMatchCase extends BaseTest {

    @Test
    public void chooseMatch() throws InterruptedException {
        ChooseMatchFunc chooseMatchFunc = new ChooseMatchFunc(driver);
        chooseMatchFunc.chooseMatch();
    }

}
