package a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
    public static void main(String[] args) {
//Set up the chrome path
        System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver.exe");
//Instance of variable
        WebDriver driver = new ChromeDriver()
//Nabigate
        driver.get("https://demo.nopcommerce.com/login?returnurl=%2F/");
//Registration
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/span[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Tushar");
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Panchani");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("12");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("March");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1993");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("panchani1008@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("panchani");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("panchani");
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();

//Login and log out//

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("panchani1008@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("panchani");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();




    }
}