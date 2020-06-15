package TestCaseFunctions;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class BulletinCheckFunc extends BasePage {
    public BulletinCheckFunc(WebDriver driver) {
        super(driver);
    }

    public By gameNameBulletin = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div");
    public By deleteSavedCoupon = By.cssSelector("#root > div.page.page--coupons > div.coupons__content > div > div > div:nth-child(2) > div > div:nth-child(1) > div.coupon-row__header > i.icon.ic_trash.coupon-row__header__trash > svg");
    public By deleteConfirm = By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div[3]/div[1]/button");

    public void bulletinCheck() throws InterruptedException {
        driver.get(bulletinUrl);
        Thread.sleep(1000);
        String siteTitle = driver.getTitle();
        assertEquals(siteTitle, "İddaa Kuponlarım | Bilyoner");
        assertEquals(gameName, element(gameNameBulletin).getAttribute("textContent"));
        element(deleteSavedCoupon).click();
        Thread.sleep(1000);
        element(deleteConfirm).click();
    }
}
