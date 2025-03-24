package SergeiButorin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreaphotoTest {

        @Test
        public void CPTest() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://creaphoto.su");
            WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div[4]/button[1]"));
            submitButton.click();
            Thread.sleep( 1000 );
            WebElement textBox = driver.findElement(By.tagName("input"));
            textBox.sendKeys("Aikon");
            submitButton = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/form/div/div[4]/button"));
            submitButton.click();
            Thread.sleep( 1000 );
            WebElement message = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/form/div/div[6]/div/span[2]"));
            String value = message.getText();
            assertEquals("Псевдоним или пароль - не корректны", value);
            driver.quit();
        }
    }
