package atividade_6_Heranca;

public class testePublicacao {
	public static void main(String[] args) {
		String titulo = new String();
		float preco = 0;
		int qtdPaginas = 200, durMinutos = 2, durSegundos = 32;
		Publicacao livro = new Livro(titulo, preco, qtdPaginas);
		Publicacao audioLivro = new AudioLivro(titulo, preco, durMinutos, durSegundos);
		
		livro.setTitulo("A cidade de bronze");
		audioLivro.setTitulo("Código limpo");
		livro.setPreco(80);
		audioLivro.setPreco(40);
		livro.setQtdPaginas(800);
		audioLivro.setDurMinutos(56);
		audioLivro.setDurSegundos(44);
		System.out.println("Livro: " + "\n"
					+ livro.getTitulo() + "\n"
					+ livro.getPreco() + "\n"
					+ livro.getQtdPaginas());
		System.out.println("\nAudio Livro: " + "\n" + 
					audioLivro.getTitulo() + "\n" +
					audioLivro.getPreco() + "\n" +
					audioLivro.getDurMinutos()+":"+audioLivro.getDurSegundos());
	}
}
