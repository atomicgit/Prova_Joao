package Prova.prova;

public class Filmes {

	private String filme = "";
	private int ano;
	
	public String getFilme() {
		return this.filme;
	}
	public void setFilme(String filme) {
		this.filme = filme;
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Filmes(String filme, int ano) {
		this.filme = filme;
		this.ano = ano;
	}
	
}
