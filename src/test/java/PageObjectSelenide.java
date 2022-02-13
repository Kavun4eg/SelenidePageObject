import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class PageObjectSelenide {
    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua/");
    }

    @Test
    public void selenideTest() {

        new MainPageLogic().clickOnLaptopsAndComputersCategory().clickOnLaptopsCategory().addFirstProductToCart().checkCounterInCartPopup(1).openCart();
        Assert.assertTrue(new LapTopPageLogic().checkProductInCart());
    }
}

