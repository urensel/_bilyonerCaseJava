package TestCases;

import Listener.Listener;
import TestCaseFunctions.BulletinCheckFunc;
import TestCaseFunctions.ChooseMatchFunc;
import TestCaseFunctions.SignInFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class Case extends BaseTest {
    @Test
    public void caseStudy() throws InterruptedException {
        SignInFunc signInFunc = new SignInFunc(driver);
        ChooseMatchFunc chooseMatchFunc = new ChooseMatchFunc(driver);
        BulletinCheckFunc bulletinCheckFunc = new BulletinCheckFunc(driver);
        signInFunc.signIn();
        chooseMatchFunc.chooseMatch();
        bulletinCheckFunc.bulletinCheck();
    }
}
