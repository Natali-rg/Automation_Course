package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaBasic {

    private WebDriver driver;


    public JavaBasic(WebDriver driver) {
        this.driver = driver;
    }

    public void getCourseTitle(){
        String title=driver.getTitle();
        System.out.println(title);
    }

    public void getCourseRate(){
        WebElement rate=driver.findElement(By.className("course-rating_average"));
        System.out.println("Rating is "+rate.getText());
    }

    public void getCourseDescription(){
        //WebElement description=driver.findElement(By.className("course-descriptor"));//описание в названии курса
        WebElement description=driver.findElement(By.className("introduction_info"));//информация о курсе
        System.out.println(description.getText());
    }
}
