package atividade_6_Heranca;

public class Livro extends Publicacao{
	
	private int qtdPaginas;
	
	public Livro(String titulo, float preco, int qtdPaginas) {
		super(titulo, preco);
		this.qtdPaginas = qtdPaginas;
	}
}
