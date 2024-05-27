package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();

        Select select=new Select(driver.findElement(By.cssSelector("select[name='country']")));
        select.selectByIndex(3);
        Thread.sleep(1000);
        select.selectByValue("ALGERIA");
        Thread.sleep(1000);
        select.selectByVisibleText("ALBANIA");
        Thread.sleep(1000);

        for (WebElement element : select.getOptions()){
            System.out.println(element.getText());
        }


        driver.quit();
    }
}
