package TestCaseFunctions;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseMatchFunc extends BasePage {
    public ChooseMatchFunc(WebDriver driver) {
        super(driver);
    }

    public boolean findMatch = false;
    public int i = 0;
    public By footballBulletinBtn = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/a[2]/div[1]");
    public By gameList = By.xpath("//*[@class='event-row-prematch-v2 layout--3-2']");
    public By msbOne = By.className("icon-mbs--1");
    public By chosenMatch = By.className("odd--1");
    public By couponIcon = By.xpath("//*[@id=\"root\"]/button");
    public By saveIcon = By.xpath("//*[@id=\"root\"]/div[4]/div/div[1]/i[2]");
    public By gameNameCoupon = By.className("betslip-row__teams");

    public void chooseMatch() throws InterruptedException {
        Thread.sleep(1000);
        element(footballBulletinBtn).click();
        Thread.sleep(1000);
        while (findMatch == false) {
            if (list(gameList).get(i).findElements(msbOne).size() > 0) {
                list(gameList).get(i).findElements(chosenMatch).get(0).click();
                findMatch = true;
            }
            i++;
        }
        element(couponIcon).click();
        element(saveIcon).click();
        gameName = element(gameNameCoupon).getText();
    }
}
