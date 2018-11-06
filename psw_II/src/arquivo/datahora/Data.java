package arquivo.datahora;

import java.io.Serializable;

public class Data implements Serializable{
		private byte dia;
		private byte mes;
		private short ano;
	
	public Data(byte dia, byte mes, short ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data() {
		dia = 0;
		mes = 0;
		ano = 0;
	}
	
	public byte validaDia(byte dia) {
		if(dia > 31 || dia < 0)
			dia = 1;
		return dia;
	}
	
	public byte validaMes(byte mes) {
		if(mes > 12 || mes < 0)
			mes = 1;
		return mes;
	}
	
	public short validaAno(short ano) {
		if(ano < 0) 
			ano = 1;
		return ano;
	}
	
	public void setDia(byte dia) {
		this.dia = dia;
	}
	
	public byte getDia() {
		return dia;
	}
	
	public byte getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public byte incrementaDia() {
		dia++;
		return dia;
	}
	
	public byte incrementaMes() {
		mes++;
		return mes;
	}
	
	public short incrementaAno() {
		ano++;
		return ano;
	}
	
	public void zerar() {
		dia = 0;
		mes = 0;
		ano = 0;
	}
	
	public String mostraData() {
		return String.format("%02d/%02d/%02d", dia,mes,ano);
	}
	
	//metodo simplificado
	public static byte comparaData(Data data1, Data data2) {
		if(data1.getDia() == data2.getDia() && data1.getMes() == data2.getMes() && data1.getAno() == data2.getAno()) // iguais
			return 0;
		else if(data1.getDia() < data2.getDia() && data1.getMes() < data2.getMes() && data1.getAno() < data2.getAno()) //esquerda maior
			return 1;
		else if(data1.getDia() > data2.getDia() && data1.getMes() > data2.getMes() && data1.getAno() > data2.getAno()); //esquerda menor
			return -1;
	}
	
}