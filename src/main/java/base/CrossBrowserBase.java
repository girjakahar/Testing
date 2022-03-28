package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.json.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.browserstack.local.Local;

public class CrossBrowserBase {
	
	public static Logger log =LogManager.getLogger(CrossBrowserBase.class);
	public static Properties prop;
	public static String screenshotName;
	public RemoteWebDriver driver;
    private Local l;
    //public static final String USERNAME = "girjakahar_4kEVqO";
    //public static final String AUTOMATE_KEY = "GWisE2vkz9cr2qDDg2nD";
	
    
    @BeforeMethod(alwaysRun = true)
    @org.testng.annotations.Parameters(value = { "config", "environment" })
    @SuppressWarnings("unchecked")
    public void setUp(String config_file, String environment) throws Exception {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("src/main/resources/conf/"  +config_file);
        Object obj = jsonParser.parse(reader);
        JSONObject confobj=(JSONObject) obj;
        JSONObject envs = (JSONObject) confobj.get("environments");
        //JSONArray envsarray = (JSONArray) confobj.get("environments");
        //JSONObject config = (JSONObject) jsonParser.parse(new FileReader("src/main/resources/" + config_file));
    	//Object config = (Object) jsonParser.parse(new FileReader("src/main/resources/conf.json"));
        //JSONObject config=(JSONObject)config.parse(new FileReader("src/main/resources/" + config_file));
       // JSONObject envs = (JSONObject) config.get("environments");
        

        DesiredCapabilities capabilities = new DesiredCapabilities();

        Map<String, String> envCapabilities = (Map<String, String>) envs.get(environment);
        Iterator it = envCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
        }

        Map<String, String> commonCapabilities = (Map<String, String>) confobj.get("capabilities");
        it = commonCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (capabilities.getCapability(pair.getKey().toString()) == null) {
                capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
            }
        }

        String username = System.getenv("BROWSERSTACK_USERNAME");
        if (username == null) {
            username = (String) confobj.get("user");
        }

        String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
        if (accessKey == null) {
            accessKey = (String) confobj.get("key");
        }

        if (capabilities.getCapability("browserstack.local") != null
                && capabilities.getCapability("browserstack.local") == "true") {
            l = new Local();
            Map<String, String> options = new HashMap<String, String>();
            options.put("key", accessKey);
            l.start(options);
        }

        driver = new RemoteWebDriver(
                new URL("http://" + username + ":" + accessKey + "@" + confobj.get("server") + "/wd/hub"), capabilities);
         
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
    
        
	
	
    }   
    
    public CrossBrowserBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/base/data.properties");
			prop.load(ip);
		} catch (FileNotFoundException e)
		{
			log.error(e);
		} catch (IOException e) 
		{
			log.error(e);
		}
	}
    
    public static String getScreenShotPath(String testCaseName,RemoteWebDriver driver)throws IOException 
	  {     
		    StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
		    StackTraceElement e = stacktrace[2];
		    String methodName = e.getMethodName();

		    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		    File file = new File("");
		    String path = null;
		    String relPath=null;
		    try {
		        relPath="./Screenshots/" + methodName + source.getName();
		        path = file.getCanonicalPath() + "/reports/Screenshots/" + testCaseName + source.getName();
		        FileUtils.copyFile(source, new File(path));

		    } catch (IOException e1) {
		        // TODO Auto-generated catch block
		        e1.printStackTrace();
		    }

		    Reporter.log("SS +" + relPath + "");
		    return path ; 

		}

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        if (l != null) {
            l.stop();
        }
}
}
