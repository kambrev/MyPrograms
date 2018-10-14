import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertex1 {


    @Test

    public void log() {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://www.demo.guru99.com/v4/");



        WebElement txtusern=driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input"));
        txtusern.sendKeys("mngr153806");


        WebElement txtpass= driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input"));
        txtpass.sendKeys("hUdAhus");

        WebElement txtlogin=driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
        txtlogin.click();


        String expected="Log out";

        WebElement logoutElement=driver.findElement(By.xpath("html/body/div[3]/div/ul/li[15]/a"));

        String actual=logoutElement.getText();

        Assert.assertEquals(actual,expected,"My Test is Failed");


    }
}
