import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleaftercl {

    static WebDriver driver;

    @BeforeClass

    public static void refrence()
    {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test

    public void login()

    {


        driver.get("http://www.facebook.com");
    }


    @Test

    public void loginother()

    {
        driver.get("http://www.gmail.com");

    }

    @AfterClass

    public static void afterclass() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

}



