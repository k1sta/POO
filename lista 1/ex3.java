import java.util.Scanner;

class Ex03{
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        
        Sphere sph = new Sphere(inputObj.nextDouble());

        System.out.printf("%.4f\n", sph.getVolume());

        inputObj.close();
    }
}

class Sphere{
    private static double pi = 3.14159;
    private double radius, area, volume;

    public Sphere(double r){
        this.radius = r;
        this.area = 4 * r * r * pi;
        this.volume = 4.0/3.0 * pi * r * r * r;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.area;
    }

    public double getVolume(){
        return this.volume;
    }
}