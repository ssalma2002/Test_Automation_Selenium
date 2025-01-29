import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class myFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
//      String googleSource= driver.getPageSource();
        String googleHandle = driver.getWindowHandle();
        out.println("Google handle is : " +googleHandle);
        String googleTitle=driver.getTitle();
        out.println("Google title is : "+googleTitle);
        driver.navigate().to("https://www.udemy.com");
        String udemyTitle= driver.getTitle();
        out.println("Udemy title is :" +udemyTitle);
        String udemyurl =driver.getCurrentUrl();
        out.println("Udemy url is: "+ udemyurl );

//        Thread.sleep(1000);
        driver.navigate().back();
        String googleurl =driver.getCurrentUrl();
        out.println("Google url is: "+ googleurl );

        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        googleurl =driver.getCurrentUrl();
        out.println("Google url is: "+ googleurl );
        driver.navigate().refresh();
        driver.navigate().forward();
        udemyurl =driver.getCurrentUrl();
        out.println("Google url is: "+ udemyurl );
        Thread.sleep(3000);
        driver.quit();
    }
}
