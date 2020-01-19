package simplestUiTest;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimplestUiTestHomework {
    //homework start
    private WebDriver driver;
/*
    @BeforeClass
    public void setUp(){

        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void setUpDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

    @Test
    public void firstUiTest(){




        String baseUsr =  ("https://selenium.dev/");
        driver.get(baseUsr);
        String currentUrl = driver.getCurrentUrl();

        assertEquals(currentUrl, baseUsr);
        String projectUrl = ("https://selenium.dev/projects/");
        driver.get(projectUrl);

        String projectsCurrentUrl = driver.getCurrentUrl();

        assertEquals(projectsCurrentUrl, projectUrl);

        String mainPageTitle = ("Selenium Projects");
        String mainPageCurrentTitle = driver.getTitle();

        assertEquals(mainPageCurrentTitle,mainPageTitle);

    }

    @Test
    public void openSeleniumDownload(){

        String downloadUrl =  ("https://selenium.dev/downloads/");
        driver.get(downloadUrl);
        String downloadcheckUrl = driver.getCurrentUrl();

        assertEquals(downloadcheckUrl, downloadUrl);

        String downloadPageTitle = ("Downloads");
        String downloadPageCurrentTitle = driver.getTitle();

        assertEquals(downloadPageCurrentTitle,downloadPageTitle);


    }

    @Test
    public void openSeleniumProject(){

        String projectUrl = ("https://selenium.dev/projects/");
        driver.get(projectUrl);

        String projectsCurrentUrl = driver.getCurrentUrl();

        assertEquals(projectsCurrentUrl, projectUrl);

        String projectPageTitle = ("Selenium Projects");
        String projectPageCurrentTitle = driver.getTitle();

        assertEquals(projectPageCurrentTitle,projectPageTitle);

    }

    @Test
    public void openSeleniumDocumentation(){

        String documentationUrl = ("https://selenium.dev/documentation/en/");

        driver.get(documentationUrl);

        String documentationCurrentUrl = driver.getCurrentUrl();
        assertEquals(documentationCurrentUrl, documentationUrl);

        String documentationPageTitle = ("The Selenium Browser Automation Project :: Documentation for Selenium");
        String documentatitonPageCurrentTitle = driver.getTitle();

        assertEquals(documentationPageTitle,documentationPageTitle);
    }

    @Test
    public void openSeleniumSupport(){

        String supportUrl = ("https://selenium.dev/support/");
        driver.get(supportUrl);

        String supportCurrentUrl = driver.getCurrentUrl();
        assertEquals(supportCurrentUrl,supportUrl);

        String supportPageTitle =("Selenium Support");
        String supportPageCurrentTitle =driver.getTitle();

        assertEquals(supportPageCurrentTitle,supportPageTitle);

    }

    @Test
    public void openSeleniumBlog(){

        String blogUrl = ("https://selenium.dev/blog/");
        driver.get(blogUrl);

        String BlogCurrentUrl = driver.getCurrentUrl();
        assertEquals(BlogCurrentUrl,blogUrl);

        String blogPageTitle = ("Selenium Blog");
        String blogPageCurrentTitle = driver.getTitle();

        assertEquals(blogPageCurrentTitle,blogPageTitle);
    }

    //homework end



*/


}
