import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void start() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities cp=  new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY,options);
        options.merge(cp);
        wd= new ChromeDriver(options);
        //wd = new ChromeDriver();
        // wd.get("https://www.google.com/");
        wd.navigate().to("https://www.google.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        wd.close();
        wd.quit();


    }
}