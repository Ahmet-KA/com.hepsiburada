package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class HepsiburadaPage {

    private WebDriverWait wait;

    public HepsiburadaPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR user-info']")
    public WebElement girisButonClick;

    @FindBy(xpath = "//*[@id='login']")
    public WebElement girisYapLink;

    @FindBy(xpath = "//*[@id='txtUserName']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@id='txtPassword']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id='btnLogin']")
    public WebElement emailGirisButton;

    @FindBy(xpath = "//*[@id='btnEmailSelect']")
    public WebElement passwordGirisButton;

    @FindBy(xpath = "//*[@class='_1TxjTFlVZPBnn-I7vOVL2U _2kBZQPq-lRfZa5Zbc9SbZn ']")
    public WebElement selectedGirisYap;

    @FindBy(xpath = "//*[text()='Kitap, Müzik, Film, Hobi']")
    public WebElement menuSelect;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-OIXGN6gTcuAXz_dkh8Yv item-2157']")
    public WebElement foreignFilm;

    @FindBy(xpath = "//*/li[1]/div/a")
    public List<WebElement> filmList;

    @FindBy(xpath = "//*[@class='product-name best-price-trick']")
    public WebElement firstFilmText;

    @FindBy(xpath = "//*[@id='cartItemCount']")
    public WebElement cardItemCount;

    private int cardItemCountControl;

    @FindBy(xpath = "//*[@class='checkoutui-Modal-iHhyy79iR28NvF33vKJb']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//*[text()='Reddet']")
    public WebElement reddetText;

    @FindBy(xpath = "//*[@class='gQjF21piuOrwYvanqai8']")
    public WebElement foreignFilmText;

    @FindBy(xpath = "//*[@class='button big with-icon']")
    public WebElement basketAddToCardButton;

    public void clickWithJS(WebElement element) {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    public void verifyingTheSelectedMovie() {

        String expected = filmList.get(0).getText();

        Set<String> handle = Driver.getDriver().getWindowHandles();
        String secondHandle = "";

        for (String each : handle) {

            if (!each.equals(Driver.getDriver().getWindowHandle())) {
                secondHandle = each;
            }
        }

        Driver.getDriver().switchTo().window(secondHandle);

        String actual = firstFilmText.getText();

        Assert.assertTrue(expected.contains(actual));
    }

    public String basketCardItemCount() {

        cardItemCountControl = Integer.parseInt(cardItemCount.getText());
        return cardItemCount.getText();
    }

    public void basketCountControl() {

        int cardItemCountBasket = Integer.parseInt(cardItemCount.getText()) - cardItemCountControl;

        if (cardItemCountBasket > 0){

            System.out.println("Sepet ekleme işlemi başarılı.");

        } else {

            Assert.fail(" Sepete ekleme işlemi başarısız.");

        }

    }

    public void waitForVisibility(WebElement element, int timeout) {

         wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
         wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
