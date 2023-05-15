import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class LoginTests        {
    WebDriver wd;

    @BeforeClass
    public void preCondition(){
        //open browser
        wd = new ChromeDriver();
        //open site
       // wd.navigate().to("");
        wd.get("");
    }
    @Test
    public void loginSuccess(){
        //open form(find element + clik)
        //fill email(find element + clik+clear+type)
        //fill password//fill email(find element + clik+clear+type)+clear+type)
        //submit from(find element + clik+clear+type)
    }
    @Test
    public void loginWrongEmail(){
        //open form
        //fill form
        //submit from
    }

   @Test
   public void loginWrongPassword(){
        //open form
        //fill form
        //submit from
    }

    @AfterClass
    public void posCondition(){
        //close browser
        wd.close();

    }
}
