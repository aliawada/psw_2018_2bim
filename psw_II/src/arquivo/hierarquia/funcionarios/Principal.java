package arquivo.hierarquia.funcionarios;

import arquivos.*;

public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("awada","013","30/01/1999","CC","20/09/2018",5000F);
		Funcionario f2 = new Funcionario("awada","013","30/01/1999","CC","20/09/2018",5000F);
		Funcionario f3 = new Funcionario("a","a","a","a","1",5000F);
		Empresa empresa = new Empresa("cnpj");
		
		empresa.adicionaFuncionario(f1);
		empresa.adicionaFuncionario(f2);
		empresa.adicionaFuncionario(f3);
		empresa.removeFuncionario(f2);
		
		ManipuladorArquivo.escritor("arquivoEmpresa.txt","Empresa: " + empresa.toString());
		ManipuladorArquivo.leitor("arquivoEmpresa.txt");
		
		Empresa empresa2 = new Empresa("cnpj",null);
		
		Serialize.serialize(empresa2);
		Deserialize.deserialize(empresa2);
	}

}