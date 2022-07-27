package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(className = "section-content_logo")
    WebElement logoElement;
    @FindBy(id="btn-consultation-hero")
    public WebElement button;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean getLogoLink(String linkLogo) {
    return logoElement.getAttribute("xmlns").equals(linkLogo);
    }
    public String getButtonText(){
        return button.getText();
    }
}
