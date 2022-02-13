public class LapTopPageLogic  extends  LapTopPageElement{
    public LapTopPageLogic addFirstProductToCart() {
        buyFirstProductBtn.click();
        return this;
    }

    public LapTopPageLogic checkCounterInCartPopup(int size) {
        cartCounterBtn.innerText().trim();
        cartCounterBtn.equals(size);
        return this;
    }

    public LapTopPageLogic openCart() {
        cartCounterBtn.click();
        return this;
    }

    public boolean checkProductInCart() {
        String titleOfProductInCart = titleProductInCartPopup.innerText().trim();
        return titleOfProductInCart.equals(titleOfFirstProductOnSearchPage.innerText().trim());
    }
}
