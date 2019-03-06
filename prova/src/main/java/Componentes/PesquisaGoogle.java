package Componentes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Prova.prova.Diretores;
import Prova.prova.Filmes;

public class PesquisaGoogle {
	
	public static void run(WebDriver driver) throws Exception{
		
		String nome="";
    	int idade;
    	String filme = "";
    	int ano;
    	String cad="1";
    	String nome_diretor;
    	String nome_filmes;
    	String resultados;
    	
    	
    	ArrayList<Diretores> diretorList = new ArrayList<Diretores>();
    	ArrayList<Filmes> filmesList = new ArrayList<Filmes>();
    	
    	while(cad.equals("1")) {
    		
    		String verificador1 = "n";
    		String verificador2 = "n";
    		
	    	nome = JOptionPane.showInputDialog(null,"Digite o nome do diretor do filme: ");
	    	String S_idade = "";
	    	while(verificador1.equals("n")) {
	    		S_idade = JOptionPane.showInputDialog(null,"Digite a idade do direitor do filme: ");
	    		if(!S_idade.matches("^[0-9]*$") || S_idade.isEmpty()){
		    		JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro: entrada de dados errado", 1);
	    		}else {
		    		verificador1 = "s";
		    	}
	    		
	    	}
	    	idade = Integer.parseInt(S_idade);
	    	filme = JOptionPane.showInputDialog(null,"Digite o nome do filme:");
	    	String S_ano = "";
	    	while(verificador2.equals("n")) {
	    		S_ano = JOptionPane.showInputDialog(null,"Digite o ano de lançamento do filme: ");
	    		if(!S_ano.matches("^[0-9]*$") || S_ano.isEmpty()){
		    		JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro: entrada de dados errado", 1);
	    		}else {
		    		verificador2 = "s";
		    	}
	    		
	    	}
	    	ano = Integer.parseInt(S_ano);
	    	
	    	Diretores diretor = new Diretores(nome, idade);
	    	diretorList.add(diretor);
	    	
	    	Filmes filmes = new Filmes(filme,ano);
	    	filmesList.add(filmes);
	    	
	    	cad = JOptionPane.showInputDialog(null,"Deseja cadastrar outro filme digite 1 se não digite 2");
    	}
    	

				
		//.length()
		for(int i=0; i<diretorList.size(); i++) {
			
			nome_diretor = diretorList.get(i).getNome();
			nome_filmes = filmesList.get(i).getFilme();
			
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(nome_diretor+" "+nome_filmes+Keys.chord(Keys.ENTER));
			
			resultados = driver.findElement(By.xpath("//div[@id='resultStats']")).getText();

			String array[] ;
			array = resultados.split(" ",4);
			
			resultados = array[0]+" "+array[1]+" "+array[2];
			
			JOptionPane.showMessageDialog(null, "Filme: "+filmesList.get(i).getFilme()+"\n"+resultados , "Resultados", 1);
			
			System.out.println(filmesList.get(i).getFilme());
			System.out.println(resultados);              
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
			
		}
		
	}
}
