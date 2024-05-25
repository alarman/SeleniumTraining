package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsTestCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[class='submit-button btn_action']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
