package arquivo.hierarquia.funcionarios;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable{
	private String departamento;
	private String dataEntrada;
	private float salario;
	
	public Funcionario(String nome, String cpf, String dataNascimento, String departamento, String dataEntrada,
			float salario) {
		super(nome, cpf, dataNascimento);
		this.departamento = departamento;
		this.dataEntrada = dataEntrada;
		this.salario = salario;
	} 

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}


	public String toString() {
		return "[nome= "+ nome +", cpf= "+cpf+", departamento=" + departamento + ", dataEntrada=" + dataEntrada + ", salario=" + salario
				+ "]";
	}
}