package Prova.prova;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Componentes.PesquisaGoogle;
import Componentes.Start;

/**
 * Hello world!
 * Autor João Victor
 */
public class Run
{	
	@Test	
	public static void main( String[] args ) throws Exception{

    	System.setProperty("webdriver.chrome.driver", "C:\\Proton\\ProtonClient\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try {
    		Start.run(driver);
			PesquisaGoogle.run(driver);
		}catch(Exception e) {
			
		}
    	
    }
}