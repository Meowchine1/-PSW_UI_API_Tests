package pagesUi;
import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$$x;

public class DescriptionPage {
    private final ElementsCollection productName = $$x("//span[@class='products-element__name']");

    public void checkName(String name) {
        Assert.assertEquals(productName.get(0).getText(), name);
    }
}