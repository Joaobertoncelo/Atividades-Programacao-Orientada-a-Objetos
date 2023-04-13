package atividade_8_Polimorfismo;

public abstract class Pacote {
	
	String nomeRemetente, enderecoRemetente, cidadeRemetente, estadoRemetente, cepRemetente;
	String nomeDestinatário, enderecoDestinatário, cidadeDestinatário, estadoDestinatário, cepDestinatário;
	int peso, custo;
	
	public Pacote(String nomeRemetente, String enderecoRemetente, String cidadeRemetente, String estadoRemetente, String cepRemetente,
			String nomeDestinatário, String enderecoDestinatário, String cidadeDestinatário, String estadoDestinatário, String cepDestinatário,
			int peso, int custo) {
		this.nomeRemetente = nomeRemetente;
		this.enderecoRemetente = enderecoRemetente;
		this.cidadeRemetente = cidadeRemetente;
		this.estadoRemetente = estadoRemetente;
		this.cepRemetente = cepRemetente;
		this.nomeDestinatário = nomeDestinatário;
		this.enderecoDestinatário = enderecoDestinatário;
		this.cidadeDestinatário = cidadeDestinatário;
		this.estadoDestinatário = estadoDestinatário;
		this.cepDestinatário = cepDestinatário;
		if(peso>=0) {
			this.peso = peso;
		}
		if(custo>=0) {
			this.custo = custo;
		}
	}
	
	public float calcularCusto(int peso, int custo) {
		return peso * custo;
	}
}
