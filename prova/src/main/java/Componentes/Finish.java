package Componentes;

import org.junit.After;
import org.openqa.selenium.WebDriver;

public class Finish {
	@After
	public static void run(WebDriver driver) throws Exception{
		driver.quit();
	}
	
}
