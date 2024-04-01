import java.util.Scanner;



class ex1{
	private static final double pi = 3.14159;
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Insert the external radius:");
		double extRadius = myObj.nextDouble();
		System.out.println("Insert the internal radius:");
		double intRadius = myObj.nextDouble();

		double area = pi * (extRadius * extRadius - intRadius * intRadius);
		
		System.out.println("The result is: " + area);
		
		myObj.close();
	}
}

class ex2{
	public static void main (String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Insert your name:");
		String name = myObj.nextLine();
		System.out.println("Insert your age:");
		String age = myObj.nextLine();
		System.out.println("Insert your height (in meters):");
		String height = myObj.nextLine();

		System.out.println("\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "Height: " + height);
		
		myObj.close();
	}
}

class ex3{
	public static void main (String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Insert your grades separated by a space:");
		double grade1 = myObj.nextDouble(), grade2 = myObj.nextDouble();

		double medium = (grade1 + grade2)/2;

		if (medium >= 7){
			System.out.println("Approved with " + medium);
		} else if ((medium >= 3) && (medium < 7)){
			System.out.println("Assigned to Final Exam with " + medium);
		} else{
			System.out.println("FAILED! TRY AGAIN YOU DUMB STUPID F");
		}
		
		myObj.close();
	}
}


class ex4{
	public static void main (String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Insert your number to calculate the fatorial: ");
		int n = myObj.nextInt();
		
		int result = fatorial(n);

		System.out.println("The result is: " + result);
		
		myObj.close();
	}

	public static int fatorial (int n){
		if (n == 1)
			return 1;
		return n * fatorial (n - 1);
	}
}

