import java.util.Random;

public class FactoryCarta{
    public static Carta novaCarta(){
        Carta carta = new Carta();
        carta.naipe = new Naipe();

        int lengthEnumCartas = eNumero.values().length;
        int lengthEnumNaipes = eNaipe.values().length;

        carta.numero = eNumero.values()[Random.nextInt(lengthEnumCartas)];
        carta.naipe.naipe = eNaipe.values()[Random.nextInt(lengthEnumNaipes)];

        return carta;
    }
}