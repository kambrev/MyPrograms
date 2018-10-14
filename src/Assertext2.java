
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertext2 {


    @Test
    public void log11() {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://google.com");

        Assert.assertEquals( driver.getTitle(),"Google", "Strings are not matching");




    }



}
