import driverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import util.Util;

import java.util.List;

public class Test {
   /* static final By SEARCH = By.xpath("//*[@id=\"contains\"]/h1/yt-formatted-string");
    static final String text = "";*/
    static final String BASEURL="https://dnipro.ithillel.ua/";
    //static final String BASEURL="https://ithillel.ua/courses/java-basic";

    static WebDriver driver = DriverFactory.getDriver("CHROME");
    static HomePage homePage = new HomePage(driver);

    static {
        driver.get(BASEURL);
    }

    public static void main(String[] args) throws Exception{



//        homePage.testingCourseButtonClick();
//        //System.out.println(driver.getTitle());
//        //TestingPage testingPage= PageFactory.initElements(driver, TestingPage.class);если нет конструктора
//
//        TestingPage testingPage=new TestingPage(driver);//с конструктором
//        testingPage.buttonClick();//с конструктором
//
//        driver.findElement(By.id("input-name-consultation")).sendKeys(DataUserProvider.getName());
        /*JavaBasic javaBasic=new JavaBasic(driver);
        javaBasic.getCourseTitle();
        javaBasic.getCourseRate();
        javaBasic.getCourseDescription();*/

        /*List<Integer> listAges=new ArrayList<>(10);//проверка домашки
        for (Integer f:listAges){
            listAges.add((int) (Math.random() * 100));
            System.out.println(listAges);
        }*/
        driver.get("https://ithillel.ua/");
        By locator=By.id("swiper-coaches");
        Util.scrollToElementVisibilityOf(driver,locator);
        WebElement block=driver.findElement(By.className("swiper-wrapper"));
        List<WebElement> list=block.findElements(By.className("swiper-slide"));
        System.out.println(list.size());
        for(WebElement l:list){
            System.out.println(l.findElement(By.className("review-card_content cms-insert")).getText());
        }







        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {
            driver.quit();
        }


        driver.quit();
    }
}
