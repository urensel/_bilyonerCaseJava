package TestCaseFunctions;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertNotNull;

public class SignInFunc extends BasePage {
    public SignInFunc(WebDriver driver) {
        super(driver);
    }

    public By signInMenu = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/button");
    public By tcknBox = By.id("username");
    public By passwordBox = By.id("password");
    public By loginBtn = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/form/div[3]/button");
    public By userItem = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/i[1]");

    public void signIn() throws InterruptedException {
        Thread.sleep(1000);
        element(signInMenu).click();
        sendKeys(tcknBox,tckn);
        sendKeys(passwordBox,password);
        element(loginBtn).click();
        assertNotNull(userItem);
    }
}
