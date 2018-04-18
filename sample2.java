



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import org.junit.Assert;
 
public class Example  {
  public static void main(String[] args) {
 
    // Create an instance of the driver
    WebDriver driver = new FirefoxDriver();
 
    // Navigate to a web page
    driver.get("http://www.sword-activerisk.com/");
 
    // Perform actions on HTML elements, entering text and submitting the form
    WebElement searchElement     = driver.findElement(By.name("s"));
    searchElement.sendKeys("active");

    WebElement formElement        = driver.findElement(By.id("searchForm"));
  
    //searchElement.submit(); // submit by text input element
    formElement.submit();        // submit by form element
 
 
    // Anticipate web browser response, with an explicit wait
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement resultElements = wait.until(
           ExpectedConditions.presenceOfElementLocated(By.id("internal-page-content"))
            );


      List list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div[1]/article/h3/a"));

	for(WebElement element:list)
	{
 
		element.click()
 		WebElement anchorResult  = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("xxxxx"))

		String message                 = anchorResul.getText();
    		String successMsg             = "xxxxxx.";
    		Assert.assertEquals (message, successMsg);
            );

 
	}
 

 
    // Conclude a test
    driver.quit();
 
  }
}