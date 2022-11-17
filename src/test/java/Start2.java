import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Start2 {
    WebDriver wd;

    @BeforeMethod
    public void preCon(){
        wd = new ChromeDriver();
        //login
        wd.get("https://telranedu.web.app/home");
        System.out.println("Start preCond");

    }
    @Test
    public void addContact(){

    }
    @AfterMethod
    public void postCon(){
        //return to home page
        System.out.println("Start postCond");
        wd.quit();

    }
}
