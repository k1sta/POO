import java.util.Scanner;
import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        Guess guessObj = new Guess();

        System.out.println("Think of a number...");

        guessObj.guessingCall(scObj);

        System.out.println("Your number was guessed in " + guessObj.getCounter() + " tries!");

        scObj.close();
    }
}

class Guess{
    private static int counter = 0;

    public int getCounter(){
        return counter;
    }

    public boolean guessingCall(Scanner scObj){
        counter++;
        Random rand = new Random();
        int guess = rand.nextInt(101);
        char tmp;

        System.out.println("The number is " + guess + "? (y/n)");
        tmp = scObj.nextLine().charAt(0);

        if (tmp == 'y' || tmp == 'Y'){
            return true;
        } else if (tmp == 'n' || tmp == 'N'){
            System.out.println("The number is bigger or lower? (</>)");
            tmp = scObj.nextLine().charAt(0);

            if(tmp == '<'){
                guessingCall(scObj, 0, guess);
            } else {
                guessingCall(scObj, guess + 1, 100);
            }
        }

        return false;
    }

    private boolean guessingCall(Scanner scObj, int base, int teto){
        counter++;
        Random rand = new Random();
        int guess = rand.nextInt(teto - base) + base;
        char tmp;

        System.out.println("The number is " + guess + "? (y/n)");
        tmp = scObj.nextLine().charAt(0);

        if (tmp == 'y' || tmp == 'Y'){
            return true;
        } else if (tmp == 'n' || tmp == 'N'){
            System.out.println("The number is bigger or lower? (</>)");
            tmp = scObj.nextLine().charAt(0);

            if(tmp == '<'){
                guessingCall(scObj, base, guess);
            } else {
                guessingCall(scObj, guess + 1, teto);
            }
        }

        return false;
    }
}
