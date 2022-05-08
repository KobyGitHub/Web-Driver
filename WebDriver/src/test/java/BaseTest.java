import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class BaseTest {
    private WebDriver driver;

    private void setUp(){
        setProperty("webdriver.chrome.driver", "resources/chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();

        System.out.println(driver.getTitle());
        driver.quit();

    }
    public static void  main(String args[]) {
        BaseTest test = new BaseTest();
        test.setUp();
    }
}
