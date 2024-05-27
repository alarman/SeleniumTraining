package class3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebDriver.Navigation navigate=driver.navigate();
        navigate.to("https://www.saucedemo.com");
        Thread.sleep(1000);
        navigate.back();
        Thread.sleep(1000);
        navigate.forward();
        Thread.sleep(1000);
        navigate.refresh();

        driver.quit();
    }
}
