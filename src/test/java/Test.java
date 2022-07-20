import driverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.TestingPage;
import util.DataUserProvider;

public class Test {
   /* static final By SEARCH = By.xpath("//*[@id=\"contains\"]/h1/yt-formatted-string");
    static final String text = "";*/
    static final String BASEURL="https://dnipro.ithillel.ua/";
    static WebDriver driver = DriverFactory.getDriver("CHROME");
    static HomePage homePage = new HomePage(driver);

    static {
        driver.get(BASEURL);
    }

    public static void main(String[] args) throws Exception{



        homePage.testingCourseButtonClick();
        //System.out.println(driver.getTitle());
        //TestingPage testingPage= PageFactory.initElements(driver, TestingPage.class);если нет конструктора

        TestingPage testingPage=new TestingPage(driver);//с конструктором
        testingPage.buttonClick();//с конструктором

        driver.findElement(By.id("input-name-consultation")).sendKeys(DataUserProvider.getName());





        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {
            driver.quit();
        }


        driver.quit();
    }
}
