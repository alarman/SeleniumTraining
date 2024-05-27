package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebInfo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.manage().window().maximize();

        //driver.findElement(By.id("user-name")).getTagName();
        WebElement webElement=driver.findElement(By.id("user-name"));
        System.out.println("Tag Name: "+webElement.getTagName());
        System.out.println("X, Y Name "+webElement.getRect().x + " " +webElement.getRect().y);

        WebElement element=driver.findElement(By.id("login-button"));
        System.out.println(element.getCssValue("font-family"));
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("font-size"));

        System.out.println(element.getAttribute("class"));

        Thread.sleep(2000);
        driver.quit();
    }
}
