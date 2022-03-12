// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class NokiaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void nokia() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1074, 672));
    driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("q")).sendKeys("amazon phone");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("#rso > .g:nth-child(13) .LC20lb")).click();
    driver.findElement(By.cssSelector("#sobe_d_b_7_2 .a-dynamic-image")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#sobe_d_b_7_2 .a-dynamic-image"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    js.executeScript("window.scrollTo(0,112)");
    driver.close();
  }
}
