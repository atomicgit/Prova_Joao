package Prova.prova;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Componentes.Finish;
import Componentes.PesquisaGoogle;
import Componentes.Start;

class runProva {
	
	
	@Test
	void Run() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Proton\\ProtonClient\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Start.run(driver);
		PesquisaGoogle.run(driver);
		Finish.run(driver);
		

	}

}
