package Componentes;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Start {
	public static void run(WebDriver driver) throws Exception{
		driver.get("http://www.google.com");		
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
}
