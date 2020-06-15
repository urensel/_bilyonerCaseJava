package TestCases;

import Listener.Listener;
import TestCaseFunctions.BulletinCheckFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class BulletinCheckCase extends BaseTest {

    @Test
    public void bulletinChech() throws InterruptedException {
        BulletinCheckFunc bulletinCheckFunc = new BulletinCheckFunc(driver);
        bulletinCheckFunc.bulletinCheck();
    }
}
