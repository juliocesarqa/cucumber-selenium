package bdd.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOM {

    public static WebDriver webDriver(){
        final String WEBDRIVER = "webdriver.chrome.driver";
        final String PATH_DRIVER = "C:\\Users\\JULIO\\IdeaProjects\\MiPrimerScript\\src\\test\\resources\\chromedriver.exe";
        System.setProperty(WEBDRIVER, PATH_DRIVER);

        WebDriver driver;
        driver = new ChromeDriver();
        return driver;
    }

    public void iniciarNavegador(String url){
        webDriver().get(url);
        webDriver().manage().window().maximize();
    }
    public void onClick(WebElement element){
        element.click();
    }

    public void type(WebElement element, String text){
        element.sendKeys(text);
    }

    public String getText (WebElement element){
        return element.getText();
    }

    public void quitDriver(){
        webDriver().quit();
    }

}
