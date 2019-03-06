package Prova.prova;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Componentes.Finish;
import Componentes.PesquisaGoogle;
import Componentes.Start;

/**
 * Hello world!
 * Autor João Victor
 */
public class Run
{	

	public static void main( String[] args ) throws Exception{

    	System.setProperty("webdriver.chrome.driver", "C:\\Proton\\ProtonClient\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try {
    		Start.run(driver);
			PesquisaGoogle.run(driver);
			Finish.run(driver);
		}catch(Exception e) {
			
		}
    	
    }
}