import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_LinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://the-internet.herokuapp.com/");
        chromeDriver.findElement(By.partialLinkText("JavaScript onload")).click();
        Thread.sleep(2000);
        chromeDriver.navigate().back();
        chromeDriver.findElement(By.linkText("Form Authentication")).click();
        chromeDriver.findElement(By.name("username")).sendKeys("tomsmith");
        chromeDriver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        chromeDriver.findElement(By.className("radius")).click();
        chromeDriver.quit();

    }
}
