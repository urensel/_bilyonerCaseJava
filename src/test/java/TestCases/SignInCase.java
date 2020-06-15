package TestCases;

import Listener.Listener;
import TestCaseFunctions.SignInFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class SignInCase extends BaseTest {

    @Test
    public void signIn() throws InterruptedException {
        SignInFunc signInFunc = new SignInFunc(driver);
        signInFunc.signIn();
    }
}
