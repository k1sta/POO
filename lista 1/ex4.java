import java.util.Scanner;

class Ex04{
    public static void main(String[] args) {
		Calculadora calcObj = new Calculadora();
		Scanner inputObj = new Scanner(System.in);

		while(true){	
			System.out.print("OPcode: ");
			if(calcObj.setOp(inputObj.nextLine().charAt(0)) == 1){
				break;
			}
		
			for(int i = 1; i <= 2; i++){
				System.out.print(i + " number: ");
				calcObj.setNum(i, inputObj.nextFloat());		
			}

			System.out.println("");
			
			inputObj.nextLine(); //buffer
		
			calcObj.operate();

			System.out.println("");
		}

		inputObj.close();
	}
}

class Calculadora{
	private char op;
	private float n1, n2;
	
	public int setOp(char exOp){
		if (exOp != '+' && exOp != '-' && exOp != '*' && exOp != '/'){
			System.out.println("opcode not valid, bye");
			return 1;
		}
		
		this.op = exOp;
		return 0;
	}
	
	public int setNum(int i, float n){
		if (i == 1){
			this.n1 = n;
		} else if (i == 2){
			this.n2 = n;
		} else{
			System.out.println("unknown number identifier");
			return 1;
		}

		return 0;
	}

	public void operate(){
		switch(this.op){
			case '+':
				System.out.println(n1 + n2);
				break;
			case '-':
				System.out.println(n1 - n2);
				break;
			case '*':
				System.out.println(n1 * n2);
				break;
			case '/':
				System.out.println(n1 / n2);
				break;
			default:
				System.out.println("Op code not found 404");
				break;
		}	
	}
}
