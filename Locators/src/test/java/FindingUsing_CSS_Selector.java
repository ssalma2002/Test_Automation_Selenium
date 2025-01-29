import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingUsing_CSS_Selector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://the-internet.herokuapp.com/");
        chromeDriver.findElement(By.linkText("Form Authentication")).click();
        chromeDriver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        chromeDriver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
        chromeDriver.findElement(By.cssSelector("button.radius")).click();

    }
}
