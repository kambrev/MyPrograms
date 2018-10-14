import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class examlebefore {
WebDriver driver;

    @Before

    public void refrence()
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

    @After

    public void afterclass() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

}
