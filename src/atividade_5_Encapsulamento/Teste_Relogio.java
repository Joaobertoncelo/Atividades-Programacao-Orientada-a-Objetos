package atividade_5_Encapsulamento;

public class Teste_Relogio {
	public static void main(String[] args) {
		//Instancia relogio
		Relogio relogio = new Relogio(12,45,30);
		
		
		//Mostra valor
		System.out.println("Horario Inicial: ");
		relogio.mostraHorario();
		
		//Set Horas
		relogio.setHoras(15);
		
		//mostra valor
		System.out.println("\nHorario Válido: ");
		relogio.mostraHorario();
		
		//set horas para valor invalido
		relogio.setHoras(30);
		
		//Mostra valor
		System.out.println("\nHorario Inválido: ");
		relogio.mostraHorario();
	}
}
