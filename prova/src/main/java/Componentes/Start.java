package Componentes;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Start {
	@Before
	public static void run(WebDriver driver) throws Exception{
		driver.get("http://www.google.com");		
		driver.manage().window().maximize();
	}
}
