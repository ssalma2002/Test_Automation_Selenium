import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestNG {
    WebDriver chromedriver ;
    @BeforeTest
    public void prepare(){
        WebDriverManager.chromedriver().setup();
        chromedriver =  new ChromeDriver();
    }
    @AfterTest
    public void tearDown(){
        chromedriver.quit();
    }

    @Test
    public void openBrowser() throws InterruptedException {
        System.out.println("Openning Browser...");
        chromedriver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
    }

    @Test
    public void signUp(){
        System.out.println("Signing Up");
    }

    @Test
    public void logIn(){
        System.out.println("Logging In...");
    }
    @Test
    public void addToCart(){
        System.out.println("Add To Cart");
    }
    @Test
    public void logOut(){
        System.out.println("Logging Out...");
    }
    @Test
    public void closeBrowser(){
        System.out.println("Closing Browser...");
    }
}
