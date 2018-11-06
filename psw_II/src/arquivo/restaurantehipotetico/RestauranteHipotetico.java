package arquivo.restaurantehipotetico;

import java.io.Serializable;
import java.util.Arrays;

public class RestauranteHipotetico implements Serializable{
	
	private int totalMesas;
	private float precoPrato;
	private float precoBebida;
	private float totalVendas;
	private int mesasOcupadas;
	
	private int qtdPratos[];//clientes por mesa 
	private int qtdBebidas[];//bebibas por mesa 
	
	public RestauranteHipotetico(int mesas) {
		totalMesas = mesas;
		
		qtdPratos = new int[totalMesas];
		qtdBebidas = new int[totalMesas];
		
	}
	
	public RestauranteHipotetico() {
		totalMesas = 0;
		
		qtdPratos = new int[totalMesas];
		qtdBebidas = new int[totalMesas];
	}
	
	public void custoBebida(float precoCusto) {
		precoBebida = precoCusto * 1.4F;
	}
	
	public void custoPrato(float precoCusto) {
		precoPrato = precoCusto * 1.25F;
	}
	
	//Adiciona uma bebida na mesa 
	public int adicionarBebida(int mesa) {
		if(qtdPratos[mesa] != 0) {
		qtdBebidas[mesa]++;
		return qtdBebidas[mesa];
		} else {
			System.out.println("Mesa sem clientes");
			return qtdBebidas[mesa] = 0;
		}
	}
	
	//Adiciona um cliente na mesa
	public int adicionarCliente(int mesa) {
		if(qtdPratos[mesa] == 0)
			mesasOcupadas++;
		qtdPratos[mesa]++;
		return qtdPratos[mesa];
	}
	
	//Calcula o valor da conta de uma determinada mesa
	public float calculaConta(int mesa) {
		float total = qtdBebidas[mesa] * precoBebida;
		total += qtdPratos[mesa] * precoPrato;
		return total;
	}
	public float dividirConta(int mesa) {
		if(qtdPratos[mesa] != 1)
		{
			float divisao = calculaConta(mesa) / qtdPratos[mesa];
			return divisao;
		}
		else return calculaConta(mesa);
	}
	//Fechar a conta de uma mesa
	public float fecharMesa(int mesa) {
		float valor = calculaConta(mesa);
		qtdBebidas[mesa] = 0;
		qtdPratos[mesa] = 0;
		totalVendas += valor;
		mesasOcupadas--;
		return valor;
	}
	
	public float impostoRestaurante() {
		float imposto = totalVendas * 0.0754F;
		return imposto;
	}

	@Override
	public String toString() {
		return "totalMesas=" + totalMesas + ", precoPrato=" + precoPrato + ", precoBebida="
				+ precoBebida + ", totalVendas=" + totalVendas + ", mesasOcupadas=" + mesasOcupadas + ", \nqtdPratos="
				+ Arrays.toString(qtdPratos) + ", \nqtdBebidas=" + Arrays.toString(qtdBebidas);
	}

	public int getTotalMesas() {
		return totalMesas;
	}

	public void setTotalMesas(int totalMesas) {
		this.totalMesas = totalMesas;
	}

	public float getPrecoPrato() {
		return precoPrato;
	}

	public void setPrecoPrato(float precoPrato) {
		this.precoPrato = precoPrato;
	}

	public float getPrecoBebida() {
		return precoBebida;
	}

	public void setPrecoBebida(float precoBebida) {
		this.precoBebida = precoBebida;
	}

	public float getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(float totalVendas) {
		this.totalVendas = totalVendas;
	}

	public int getMesasOcupadas() {
		return mesasOcupadas;
	}

	public void setMesasOcupadas(int mesasOcupadas) {
		this.mesasOcupadas = mesasOcupadas;
	}

	public int[] getQtdPratos() {
		return qtdPratos;
	}

	public void setQtdPratos(int[] qtdPratos) {
		this.qtdPratos = qtdPratos;
	}

	public int[] getQtdBebidas() {
		return qtdBebidas;
	}

	public void setQtdBebidas(int[] qtdBebidas) {
		this.qtdBebidas = qtdBebidas;
	}
	
	
	
	
}