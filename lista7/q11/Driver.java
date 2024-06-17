public class Driver{
	public static void main(String[] args) {
		try{
			Funcionario jose = new Funcionario("José", "Gerente", 0001, 45, 9000, null);
			Funcionario eugenio = new Funcionario("Eugênio", "Caixa", 9999, 22, 4500.00, jose);
			Funcionario roberto = new Funcionario("Roberto", "Motorista", 0003, 34, 2000, null);
			roberto = new Funcionario("Roberto", "Motorista", 0003, 34, 2000, roberto);
		} catch(Exception e){
			System.out.println("Erro: " + e);
		}

		try{
			Funcionario eugenio = new Funcionario("Eugênio", "Caixa", 9999, 22, 4500.00, null);
			eugenio.setChefe(eugenio);
		} catch(Exception e){
			System.out.println("Erro: " + e);
		}
	}	
}
