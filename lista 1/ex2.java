import java.util.Scanner;

class Ex02{
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        CBP available = new CBP();
        CBP passengers = new CBP();

        available.setChicken(inputObj.nextInt());
        available.setBeef(inputObj.nextInt());
        available.setPasta(inputObj.nextInt());

        passengers.setChicken(inputObj.nextInt());
        passengers.setBeef(inputObj.nextInt());
        passengers.setPasta(inputObj.nextInt());

        System.out.println(passengers.unluckyOnes(available));

        inputObj.close();
    }
}

class CBP{
    private int chicken, beef, pasta;

    public void setChicken(int n){
        this.chicken = n;
    }

    public void setBeef(int n){
        this.beef = n;
    }

    public void setPasta(int n){
        this.pasta = n;
    }

    public int getChicken(){
        return this.chicken;
    }

    public int getBeef(){
        return this.beef;
    }

    public int getPasta(){
        return this.pasta;
    }

    public int unluckyOnes (CBP n2){
        int sum = 0;

        if(this.chicken > n2.getChicken()) sum += this.chicken - n2.getChicken();
        if(this.beef > n2.getBeef()) sum += this.beef - n2.getBeef();
        if(this.pasta > n2.getPasta()) sum += this.pasta - n2.getPasta();
        
        return sum;
    }
}