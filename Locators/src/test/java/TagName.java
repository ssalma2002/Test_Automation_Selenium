import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://the-internet.herokuapp.com/");
        chromeDriver.findElement(By.linkText("Sortable Data Tables")).click();
        WebElement table = chromeDriver.findElement(By.tagName("table"));
        List<WebElement> list = chromeDriver.findElements(By.tagName("tr"));
        System.out.println(list.get(0).getText());
        System.out.println(list.get(1).getText());
        System.out.println(list.get(2).getText());
        System.out.println(list.get(3).getText());
        System.out.println(list.get(4).getText());

    }
}
