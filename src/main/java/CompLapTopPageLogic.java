import static com.codeborne.selenide.Selenide.page;

public class CompLapTopPageLogic extends CompLapTopPageElement {
    public LapTopPageLogic clickOnLaptopsCategory() {
        laptopsCategory.click();
        return page(LapTopPageLogic.class);
    }
}
