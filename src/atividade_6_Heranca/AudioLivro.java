package atividade_6_Heranca;

public class AudioLivro extends Publicacao{
	
	private int durMinutos, durSegundos;
	
	public AudioLivro(String titulo, float preco, int durMinutos, int durSegundos) {
		super(titulo, preco);
		this.durMinutos = durMinutos;
		this.durSegundos = durSegundos;
	}	
}
