public class Funcionario{
	private String nome;
	private String cargo;
	private int matricula;
	private int idade;
	private double salario;
	private Funcionario chefe;

	//construtor
	public Funcionario(String n, String cg, int m, int i, double s, Funcionario c) throws Exception{
		nome = n;
		cargo = cg;
		matricula = m;
		idade = i;
		salario = s;
		chefe = c;
		if (c != null){
			if (c.equals(this)){
				throw new ChefeInvalidoException("Um objeto Funcionário não conter uma referência a si próprio no atributo chefe\"");
			}
		}
	}

	//getters
	public String getCargo(){return this.cargo;}
	public int getMatricula(){return this.matricula;}
	public double getSalario(){return this.salario;}
	public String getNome(){return this.nome;}
	public Funcionario getChefe(){return this.chefe;}
	public int getIdade(){return this.idade;}
	
	//setters
	public void setCargo(String input){this.cargo = input;}
	public void setMatricula(int input){this.matricula = input;}
	public void setSalario(double input){this.salario = input;}
	public void setNome(String input){this.nome = input;}
	public void setIdade(int input){this.idade = input;}
	public void setChefe(Funcionario input) throws Exception{
		if (input != null){
			if (input.equals(this)){
				throw new ChefeInvalidoException("Um objeto Funcionário não conter uma referência a si próprio no atributo chefe\"");
			}
		}
		this.chefe = input;
	}

	

	@Override
	public boolean equals(Object f1){
		if(f1 instanceof Funcionario && this.matricula == ((Funcionario) f1).matricula){
			return true;
		}

		return false;
	}
}
