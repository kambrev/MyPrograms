import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class exampleclass {


    static WebDriver driver;

    @BeforeClass

    public void ref1()

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

    public void loghh()

    {
        driver.get("http://www.gmail.com");

    }

     @AfterClass

    public void last()
     {
         driver.close();
     }


}
