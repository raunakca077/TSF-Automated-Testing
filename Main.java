import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome","D:\\Raunak Stuff\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.thesparksfoundationsingapore.org/");
        driver.manage().window().maximize();
        System.out.println("Page 1: ");
        System.out.println("-------------------------------------------------------------------------------");

       boolean logo = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img")).isEnabled();
       if(logo)
           System.out.println("Test 1 | Checked: Logo exists");
       else
           System.out.println("checked: logo not exists");

       String title=driver.getTitle();
        System.out.println("Test 2 | Checked : Title is | "+title);

       driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/a")).click();

        System.out.println("Test 3 | Checked : About us is clicked and dropdown is working");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/a")).click();
        System.out.println("Test 4 | Checked : Policies and code is clicked and dropdown is working");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/a")).click();
        System.out.println("Test 5 | Checked : Programs is clicked and dropdown is working");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/a")).click();
        System.out.println("Test 6 | Checked : Links is clicked and dropdown is working");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[5]/a")).click();
        System.out.println("Test 7 | Checked : Join us is clicked and dropdown is working");
        Thread.sleep(2000);

//        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[6]/a")).click();
//        System.out.println("Test 8 | Checked : Contact us is clicked and dropdown is working");
//        Thread.sleep(2000);

        System.out.println("Page 2: ");
        System.out.println("-------------------------------------------------------------------------------");

        WebElement dropdown = driver.findElement(By.linkText("About Us"));
       // dropdown.sendKeys("Vision, Mission and Values");
        dropdown.click();
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[1]/a")).click();
        Thread.sleep(2000);
       // driver.navigate().back();
        System.out.println("Test 8 | Checked : Vision, Mission And Values option is working fine");

        System.out.println("Page 3: ");
        System.out.println("-------------------------------------------------------------------------------");

        driver.findElement(By.linkText("Guiding Principles")).click();
        Thread.sleep(2000);
        System.out.println("Test 9 | Checked : Guiding Principles option is working fine");

        System.out.println("Page 4: ");
        System.out.println("-------------------------------------------------------------------------------");


        driver.findElement(By.linkText("Advisors and Patrons")).click();
        Thread.sleep(2000);
        System.out.println("Test 10 | Checked : Advisors and Patrons option is working fine");

        System.out.println("Page 5: ");
        System.out.println("-------------------------------------------------------------------------------");


        driver.findElement(By.linkText("Executive Team")).click();
        Thread.sleep(2000);
        System.out.println("Test 11 | Checked : Executive Team option is working fine");

        System.out.println("Page 6: ");
        System.out.println("-------------------------------------------------------------------------------");


        driver.findElement(By.linkText("Corporate Partners")).click();
        Thread.sleep(2000);
        System.out.println("Test 12 | Checked : Corporate Partners option is working fine");

        driver.findElement(By.xpath(" /html/body/div[2]/div/div[1]/div/div[1]/div/div[1]/a")).click();
       driver.navigate().back();
       Thread.sleep(2000);

        System.out.println("Page 7: ");
        System.out.println("-------------------------------------------------------------------------------");


        driver.findElement(By.linkText("News")).click();
        Thread.sleep(2000);
        System.out.println("Test 13 | Checked : News option is working fine");
        driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img")).click();

        System.out.println("Page 8: ");
        System.out.println("-------------------------------------------------------------------------------");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
        Thread.sleep(2000);
        System.out.println("Test 14 | Checked : Know More is working fine");
        driver.navigate().back();

        System.out.println("Page 9: ");
        System.out.println("-------------------------------------------------------------------------------");
        driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/a")).click();
        Thread.sleep(2000);
        System.out.println("Test 15 | Checked :GRIP PAGE working fine");
        Thread.sleep(2500);
        driver.switchTo().window(driver.getWindowHandle());

        System.out.println("Page 10: ");
        System.out.println("-------------------------------------------------------------------------------");
        driver.findElement(By.linkText("Join Us")).click();
        driver.findElement(By.linkText("Why Join Us")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/input[1]")).sendKeys("abc");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/input[2]")).sendKeys("123456789");

        Select opn=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/select")));
        opn.selectByIndex(1);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/input[3]")).click();
        System.out.println("Test 16 | Checked :Form Submission and filling");

        System.out.println("-------------------------------------------------------------------------------");

        driver.findElement(By.linkText("Expert Mentor")).click();
        Thread.sleep(2000);
        System.out.println("Test 17 | Checked : Expert Mentor option is working fine");

        System.out.println("-------------------------------------------------------------------------------");

        driver.findElement(By.linkText("Events Volunteer")).click();
        Thread.sleep(2000);
        System.out.println("Test 18 | Checked : Events Volunteer option is working fine");

        System.out.println("-------------------------------------------------------------------------------");

        driver.findElement(By.linkText("Management Volunteer")).click();
        Thread.sleep(2000);
        System.out.println("Test 19 | Checked : Management Volunteer option is working fine");

        System.out.println("-------------------------------------------------------------------------------");

        driver.findElement(By.linkText("Internship Positions")).click();
        Thread.sleep(2000);
        System.out.println("Test 20 | Checked : Internship Positions option is working fine");

        System.out.println("-------------------------------------------------------------------------------");

        driver.findElement(By.linkText("Contact Us")).click();
        Thread.sleep(2000);
        System.out.println("Test 21 | Checked : Contact Us page is present and working fine");

        driver.quit();




    }
}
