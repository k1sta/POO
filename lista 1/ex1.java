import java.util.Scanner;

class Ex01{
    public static void main(String[] args) {
        float tmp = 0, sum = 0;
        int n = -1;
        Scanner inputObj = new Scanner(System.in);
        
        do{
            sum += tmp;
            n++;

            System.out.println("Insert a grade or -1 to return the average: ");
            tmp = inputObj.nextFloat();
        }while(tmp != -1);   

        System.out.println("The average grade is " + (float)sum/n);

        inputObj.close();       
    }
}