package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import pages.HepsiburadaPage;
import utilities.ConfigurationsReader;
import utilities.Driver;

import java.util.Set;

public class HepsiburadaStepDefinitions {

    HepsiburadaPage hepsiPage;
    public static String browser = "";

    @Given("The address {string} can be opened with the {string} browser.")
    public void theAddressCanBeOpenedWithTheBrowser(String url, String browser) {

        HepsiburadaStepDefinitions.browser = browser;

        if (browser.toLowerCase().contains("chrome")) {

            Driver.getDriver().get(url);

        } else if (browser.toLowerCase().contains("firefox")) {

            Driver.getDriver().get(url);

        } else {

            System.out.println("Geçerli bir browser parametresi giriniz");
            System.exit(-1);
        }
    }

    @When("On the home page that opens, click on the login or sign up menu.")
    public void on_the_home_page_that_opens_click_on_the_login_or_sign_up_menu() throws InterruptedException {

        Thread.sleep(3000);
        hepsiPage = new HepsiburadaPage();
        hepsiPage.girisButonClick.click();

    }

    @When("Click on the login link in the menu that opens.")
    public void click_on_the_login_link_in_the_menu_that_opens() throws InterruptedException {

        Thread.sleep(1000);
        hepsiPage.girisYapLink.click();
    }

    @Then("On the login form that opens, it is verified that the login tab is selected.")
    public void on_the_login_form_that_opens_it_is_verified_that_the_login_tab_is_selected() throws InterruptedException {

        Thread.sleep(1000);
        hepsiPage.selectedGirisYap.click();
    }

    @Then("Valid data is entered in the email address or phone number field and click on the login button.")
    public void valid_data_is_entered_in_the_email_address_or_phone_number_field_and_click_on_the_login_button() throws InterruptedException {
        Thread.sleep(1000);
        hepsiPage.emailTextBox.sendKeys(ConfigurationsReader.getProperty("email"));
        hepsiPage.emailGirisButton.click();
    }

    @When("Valid data is entered in the password field and the login button is clicked.")
    public void valid_data_is_entered_in_the_password_field_and_the_login_button_is_clicked() throws InterruptedException {

        Thread.sleep(1000);
        hepsiPage.passwordTextBox.sendKeys(ConfigurationsReader.getProperty("password"));
        hepsiPage.passwordGirisButton.click();
    }

    @Then("Verifies that the system has been successfully logged in")
    public void verifies_that_the_system_has_been_successfully_logged_in() throws InterruptedException {

        Thread.sleep(1000);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("hepsiburada.com"));
        Thread.sleep(5000);

    }

    @Given("Click on the Book, Movie, Music, Hobby tab and select the Novel category from the Book section.")
    public void click_on_the_book_movie_music_hobby_tab_and_select_the_novel_category_from_the_book_section() throws InterruptedException {

        Thread.sleep(3000);
        hepsiPage.menuSelect.click();
        Thread.sleep(1000);
        hepsiPage.foreignFilm.click();

    }

    @When("It has been checked whether the selected category page can be loaded.")
    public void ıt_has_been_checked_whether_the_selected_category_page_can_be_loaded() throws InterruptedException {


        Thread.sleep(2000);
        hepsiPage.reddetText.click();
        Thread.sleep(2000);
        Assert.assertTrue(hepsiPage.foreignFilmText.isDisplayed());

    }

    @When("The first film in the list is clicked.")
    public void the_first_film_in_the_list_is_clicked() throws InterruptedException {

        hepsiPage.clickWithJS(hepsiPage.filmList.get(0));
        Thread.sleep(1000);
    }

    @When("It has been checked whether the selected film page can be loaded.")
    public void ıt_has_been_checked_whether_the_selected_book_page_can_be_loaded() throws InterruptedException {

        hepsiPage.verifyingTheSelectedMovie();
        Thread.sleep(1000);
    }

    @When("The number of elements in the basket has been checked.")
    public void the_number_of_elements_in_the_basket_has_been_checked() {

        System.out.println("Sepetinizde = " + hepsiPage.basketCardItemCount() + " ürün bulunmaktadır.");
    }

    @When("The book has been added to the cart.")
    public void the_book_has_been_added_to_the_cart() throws InterruptedException {

        hepsiPage.basketAddToCardButton.click();
    }

    @Then("The number of elements in the basket was checked one by one and it was confirmed that the number increased.")
    public void the_number_of_elements_in_the_basket_was_checked_one_by_one_and_it_was_confirmed_that_the_number_increased() throws InterruptedException {

        hepsiPage.waitForVisibility(hepsiPage.checkoutButton,10);
        hepsiPage.checkoutButton.click();
        Thread.sleep(1000);
        hepsiPage.basketCountControl();
    }

    @And("Browser Closed")
    public void browserClosed() {

        Driver.quitDriver();
    }
}
