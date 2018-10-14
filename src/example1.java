import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

    @Test
    public void login1()

    {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://www.demo.guru99.com/v4/");
    }


    @Test
    public void loginfb()

    {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net/index.php/sessions/login");
    }



}
