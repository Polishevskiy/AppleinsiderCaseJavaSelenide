import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта appleinsider.ru
 */
public class MainPage {
    private final SelenideElement testBoxInput = $x("//input[@type='text']");

    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * Выполняется поиск на сайте среди статей и нажимается кнопка Enter
     * @param searchString поисковая строка
     */
    public SearchPage search(String searchString){
        testBoxInput.setValue(searchString);
        testBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
