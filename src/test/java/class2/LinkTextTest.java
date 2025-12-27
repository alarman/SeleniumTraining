package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("got log")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
