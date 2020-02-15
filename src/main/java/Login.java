import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    WebDriver driver;

    public Login(WebDriver myDriver) {
        driver = myDriver;
        PageFactory.initElements(myDriver, this);
    }

    public Login openURL() {
        driver.navigate().to("http://www.n11.com/");
        return this;
    }

    @FindBy(css = ".btnSignIn")
    private WebElement loginIcon;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "searchData")
    private WebElement searchData;

    @FindBy(css = ".searchBtn")
    private WebElement searchIcon;

    @FindBy(css = ".searchBtn")
    private WebElement pagination;

    @FindBy(css = ".proSubTitle")
    private WebElement product;

    @FindBy(css = ".btnAddBasket")
    private WebElement addCart;

    @FindBy(css = ".myBasket")
    private WebElement basket;

    @FindBy(css = ".spinnerUp.spinnerArrow")
    private WebElement productEnhancement;

    @FindBy(css = ".removeProd.svgIcon.svgIcon_trash")
    private WebElement removeBasket;


    public Login clickLoginIcon() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(loginIcon));
        loginIcon.click();
        return this;
    }

    public Login setEmail(String email) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys(email);
        return this;
    }

    public Login setPassword(String password) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys(password);
        return this;
    }

    public Login clickLoginButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
        return this;
    }

    public Login searchProduct(String searchProduct) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(searchData));
        searchData.sendKeys(searchProduct);
        return this;
    }

    public Login clickSearchIcon() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(searchIcon));
        searchIcon.click();
        return this;
    }

    public Login productAdd() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(product));
        product.click();
        return this;
    }

    public Login addToCart() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(addCart));
        addCart.click();
        return this;
    }

    public Login goToBasket() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(basket));
        basket.click();
        return this;
    }

    public Login productEnhancement() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(productEnhancement));
        productEnhancement.click();
        return this;
    }

    public Login deleteBasket() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(removeBasket));
        removeBasket.click();
        return this;
    }

}
