package praticas.tudo;
/*
package praticas.ex6;
package praticas.ex7;
package praticas.ex8;
*/

public class Driver{
    public static void main(){
        Carta carta1 = FactoryCarta.novaCarta();
        Carta carta2 = FactoryCarta.novaCarta();
        Carta carta3 = FactoryCarta.novaCarta();

        System.out.println(carta1.imprimir);
        System.out.println(carta2.imprimir);
        System.out.println(carta3.imprimir);

    }
}
