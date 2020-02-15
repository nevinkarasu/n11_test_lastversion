import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_32bit\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testCase() {

        WebDriver driver=new ChromeDriver();
        Login login = new Login(driver);

        login.openURL()
                .clickLoginIcon()
                .setEmail("testn11user@gmail.com")
                .setPassword("1234qwer")
                .clickLoginButton()
                .searchProduct("Bilgisayar")
                .clickSearchIcon()
                .productAdd()
                .addToCart()
                .goToBasket()
                .productEnhancement()
                .deleteBasket();

    }
}
