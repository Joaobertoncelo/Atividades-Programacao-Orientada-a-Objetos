package atividade_6_Heranca;

public class Publicacao {
	
	private String titulo;
	private float preco;
	private int qtdPaginas, durMinutos, durSegundos;
	
	public Publicacao(String titulo, float preco) {
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getQtdPaginas() {
		return qtdPaginas;
	}
	
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	
	public int getDurMinutos() {
		return durMinutos;
	}
	
	public void setDurMinutos(int durMinutos) {
		this.durMinutos = durMinutos;
	}
	
	public int getDurSegundos() {
		return durSegundos;
	}
	
	public void setDurSegundos(int durSegundos) {
		this.durSegundos = durSegundos;
	}

}
