import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//modyfikatory dostępu w Java
//różnica między klasą, interfejsem, a klasą abstrakcyjną
public class UltimateQATest {
    String projectLocation = System.getProperty("user.dir");
    String ultimateQAURL = "https://ultimateqa.com/simple-html-elements-for-automation/";

    @Test
    public void testOne() {
        System.out.println(projectLocation);
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ultimateQAURL);
        
    }
}
