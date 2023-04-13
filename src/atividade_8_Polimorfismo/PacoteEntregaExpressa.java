package atividade_8_Polimorfismo;

public class PacoteEntregaExpressa extends Pacote{
	
	public PacoteEntregaExpressa(String nomeRemetente, String enderecoRemetente, String cidadeRemetente, String estadoRemetente, String cepRemetente,
			String nomeDestinatário, String enderecoDestinatário, String cidadeDestinatário, String estadoDestinatário, String cepDestinatário,
			int peso, int custo) {
		super(nomeRemetente, cepDestinatário, cepDestinatário, cepDestinatário, cepDestinatário, cepDestinatário, cepDestinatário, cepDestinatário, cepDestinatário, cepDestinatário, custo, custo);
	}
	
	public float calcularCusto(int peso, int custo, int taxa) {
		return (peso*custo)+(taxa*peso);
	}
	
	

}
