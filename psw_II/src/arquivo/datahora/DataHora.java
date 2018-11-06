package arquivo.datahora;

import java.io.Serializable;

public class DataHora implements Serializable {
	private Data data;
	private Hora hora;
	
	public DataHora(Data data,Hora hora) {
		this.data = data;
		this.hora = hora;
	}
	
	public DataHora() {
		data  = new Data();
		hora = new Hora();
	}
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public String toString() {		
		return String.format("%s - %s", data.mostraData(),hora.mostraHora());
	}
}