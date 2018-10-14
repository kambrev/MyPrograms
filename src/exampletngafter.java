
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class exampletngafter {

    static WebDriver driver;

    @BeforeMethod

    public void ref()

    {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test

    public void log()

    {
        driver.get("http://www.facebook.com");

    }

    @Test

    public void login2()

    {
        driver.get("http://www.gmail.com");
    }


    @AfterMethod

    public void eampl()

    {
        driver.close();
    }


}
