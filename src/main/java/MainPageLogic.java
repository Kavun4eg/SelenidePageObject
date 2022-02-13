import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageElement{
    public CompLapTopPageLogic clickOnLaptopsAndComputersCategory() {
        laptopsAndComputersCategoryInSideMenu.click();
        return page(CompLapTopPageLogic.class);
    }
}
