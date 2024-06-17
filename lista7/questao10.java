package lista7;

class Exercicio {

    public static int lista[] = new int[3];

    public static void main(String[] args) {
        try {
            System.out.println("inicio da main");
            Exercicio.metodo1();
            System.out.println("fim da main");
        } catch (Exception e) {
            System.out.println("Exceção genérica capturada");
        }
    }

    public static void metodo1() {
        try {
            System.out.println("inicio do metodo1");
            Exercicio.metodo2();
            System.out.println("fim do metodo1");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exceção índice fora do limites capturada");
        }
    }

    public static void metodo2() {
        try {
            System.out.println("inicio do metodo2");
            Exercicio.metodo3();
            System.out.println("fim do metodo2");
        } catch (NullPointerException e) {
            System.out.println("Exceção ponteiro nulo capturada");
        }
    }

    public static void metodo3() {
        try {
            System.out.println("inicio do metodo3");
            // comando(s) a ser(em) descrito(s)

            String s = null;
            char c = s.charAt(0);

            System.out.println("fim do metodo3");
        } catch (ArithmeticException e) {
            System.out.println("Exceção erro aritmético capturada");
        }
    }
}
