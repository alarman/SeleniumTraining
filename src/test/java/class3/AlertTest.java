package class3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        //driver.manage().window().maximize();

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);

        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert();

        alert.sendKeys("Text message");
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(1000);

        driver.quit();
    }
}
