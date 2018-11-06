package arquivo.hierarquia.funcionarios;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable{
	private String cnpj;
	private List<Funcionario> func;
	
	public Empresa(String cnpj) {
		this.cnpj = cnpj;
		func = new ArrayList<Funcionario>();
	}
	
	public Empresa(String cnpj, List<Funcionario> func ) {
		this.cnpj = null;
		this.func = func;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void adicionaFuncionario(Funcionario funcionario)
 	{ 		
 		func.add(funcionario); 		
 	}
	
	public void removeFuncionario(Funcionario funcionario) {
		func.remove(funcionario);
	}
 	
	public void imprimiEmpresaComFuncionarios()
 	{
 		for(int i=0;i<func.size();i++){
 			System.out.printf("%s\n", func.get(i));
 		}
 	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", func=" + func + "]";
	}
	
 }