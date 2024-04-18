public class Funcionario {
	private String nome;
	private int matricula;
	private double salario;
	private Funcionario chefe;

	public Funcionario(String n, int m, double s, Funcionario c){
		nome = n;
		matricula = m;
		salario = s;
		chefe = c;
	}

	public double bonus(Trimestre t){
		return salario * 0.1;
	}

	public String getNome(){
		return this.nome;
	}

	@Override
	public boolean equals(Object f1){
		if(f1 instanceof Funcionario && this.matricula == ((Funcionario) f1).matricula){
			return true;
		}
	
		return false;
	}
}
