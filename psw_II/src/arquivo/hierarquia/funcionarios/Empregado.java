package arquivo.hierarquia.funcionarios;

public class Empregado {
	private String nome;
	private String departamento;
	private int horasTrabalhadasNoMes;
	private float salarioPorHora;
	
	public Empregado(String nome, String departamento, int horasTrabalhadasNoMes, float salarioPorHora) {
		this.nome = nome;
		this.departamento = departamento;
		this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
		this.salarioPorHora = salarioPorHora;
	}
	
	public void mostraDados() {
		System.out.println("Nome: "+this.nome+"\nDepartamento: "+this.departamento+"\nHoras Trabalhadas no Mes: "
	+this.horasTrabalhadasNoMes+"\nSalario por Hora: "+this.salarioPorHora);
	}
	
	public float calculaSalarioMensal() {
		float salario = horasTrabalhadasNoMes * salarioPorHora;
		return salario;
	}
	
	public int horasExtras() {
		int horasExtras = horasTrabalhadasNoMes - 220;
		return horasExtras;
	}
	
}