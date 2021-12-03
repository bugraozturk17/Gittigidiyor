import Tests.gıttıgıdıyorextends;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class gıttıgıdyor extends gıttıgıdıyorextends {

    @Test
    public void setupDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testinium\\Desktop\\gıttıgıdıyor\\gıttıgıdıyor\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(link);
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.cssSelector(login)).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(login2)).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id(loginıd)).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.id(loginıd)).sendKeys(logindata);
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id(passwd)).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id(passwd)).sendKeys(passwddata);
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id(submit)).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.name(search)).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.name(search)).sendKeys(searchdata);
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.name(search)).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,8000)", "");
        TimeUnit.SECONDS.sleep(1);


        //  logger.info("Rastgele ürün seçiliyor");
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int number = random.nextInt(31);
            System.out.println(number + ". ürün favorilere eklendı");

        }
        TimeUnit.SECONDS.sleep(3);
        js.executeScript("window.scrollBy(0,-8000)", "");
        driver.findElement(By.xpath(homepage)).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.name(search)).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.name(search)).sendKeys(searchdata2);
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.name(search)).sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(1);
        js.executeScript("window.scrollBy(0,3300)", "");
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath(canta)).click();
        TimeUnit.SECONDS.sleep(1);
        js.executeScript("window.scrollBy(0,700)", "");
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id(addbasket)).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(gotobasket)).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(addprod)).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(getAddprod)).click();
        TimeUnit.SECONDS.sleep(2);
        js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath(getAddprod)).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(gopay)).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.cssSelector(saveadress)).click();
        System.out.println("İlçenizi Seçmeyi Unuttunuz");
        TimeUnit.SECONDS.sleep(2);

        js.executeScript("window.scrollBy(0,1000)", "");
        TimeUnit.SECONDS.sleep(2);

        TimeUnit.SECONDS.sleep(2);

        driver.findElement(By.xpath(editcart)).click();
        TimeUnit.SECONDS.sleep(2);
        js.executeScript("window.scrollBy(0,300)", "");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(favadd)).click();
        TimeUnit.SECONDS.sleep(2);
        js.executeScript("window.scrollBy(0,400)", "");
        driver.findElement(By.cssSelector(deletefav)).click();
        TimeUnit.SECONDS.sleep(2);
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        TimeUnit.SECONDS.sleep(3);
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.gittigidiyor.com/");
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.cssSelector(logout)).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath(logout2)).click();
        TimeUnit.SECONDS.sleep(3);

        driver.close();
        driver.quit();
    }
}



