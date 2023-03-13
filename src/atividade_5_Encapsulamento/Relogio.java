package atividade_5_Encapsulamento;

public class Relogio {
	
	private int horas;
	private int minutos;
	private int segundos;
	
	public Relogio(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		
	}
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		if(horas>23) {
			this.horas = 0;
			this.minutos = 0;
			this.segundos = 0;
		}else {
			this.horas = horas;
		}
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		if(minutos>59) {
			this.minutos = 0;
			this.segundos = 0;
		}else {
			this.minutos = minutos;
		}
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		if (segundos>59) {
			this.segundos = 0;
		}else {
			this.segundos = segundos;
		}
	}
	
	public void mostraHorario() {
		System.out.printf("%02d:%02d:%02d",horas,minutos,segundos);
	}
}
