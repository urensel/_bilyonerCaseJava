package Listener;

import Utils.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        driver.get(baseUrl);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Fail !");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext context) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
