package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Home page of appleinsider.ru
 */
public class MainPage {
    private final SelenideElement testBoxInput = $x("//input[@type='text']");

    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * The site is searched among the articles and the Enter button is pressed
     * @param searchString search string
     */
    public SearchPage search(String searchString){
        testBoxInput.setValue(searchString);
        testBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
