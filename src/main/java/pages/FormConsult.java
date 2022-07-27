package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormConsult {
    @FindBy(id="form-consultation")
    WebElement form;

    public boolean isEnabledForm(){
        return form.isEnabled();
    }
}
