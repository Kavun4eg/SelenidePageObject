import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CompLapTopPageElement {
    SelenideElement laptopsCategory = $(By.xpath("//div[@class='tile-cats']"));
}
