package arquivo.datahora;

import java.io.Serializable;

public class Hora implements Serializable{
	private byte hora;
	private byte minuto;
	
	public byte validaHora(byte hora) {
		if(hora >= 24 || hora <= 0)
			hora = 0;
		return hora;
	}
	
	public byte validaMinuto(byte minuto) {
		if(minuto >= 60 || minuto <= 0)
			minuto = 0;
		return minuto;
	}
	
	public Hora(byte hora, byte minuto) {
		this.hora = validaHora(hora);
		this.minuto = validaMinuto(minuto);
	}
	
	public Hora() {
		hora = 0;
		minuto = 0;
	}
	
	public void setHora(byte hora) {
		this.hora = hora;
	}
	
	public byte getHora() {
		return hora;
	}
	
	public byte getMinuto() {
		return minuto;
	}

	public void setMinuto(byte minuto) {
		this.minuto = minuto;
	}

	public byte incrementaHora() {
		hora++;
		return hora;
	}
	
	public byte incrementaMinuto() {
		minuto++;
		return minuto;
	}
	
	public void zerar() {
		hora = 0;
		minuto = 0;
	}
	
	public String mostraHora() {
		return String.format("%02d:%02d",hora,minuto);
	}
	
	public static byte comparaHoras(Hora hora1,Hora hora2) {
		if(hora1.getHora() == hora2.getHora() && hora1.getMinuto() == hora2.getMinuto()) //iguais
			return 0;
		else if( (hora1.getHora() == hora2.getHora() && hora1.getMinuto() < hora2.getMinuto()) || (hora1.getHora() < hora2.getHora()) ) //esquerda menor
			return -1;
		else if( (hora1.getHora() == hora2.getHora() && hora1.getMinuto() > hora2.getMinuto()) || (hora1.getHora() > hora2.getHora()) ); //esquerda maior
			return 1;
	}
}