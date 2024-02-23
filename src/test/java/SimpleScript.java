import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleScript {

    public static void main (String[] args){
        final String WEBDRIVER = "webdriver.chrome.driver";
        final String PATH_DRIVER = "C:\\Users\\JULIO\\IdeaProjects\\MiPrimerScript\\src\\test\\resources\\chromedriver.exe";
        System.setProperty(WEBDRIVER, PATH_DRIVER);

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.pe/");
        String tituloPagina = driver.getTitle();
        System.out.print(tituloPagina);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();

        }

    }


}
