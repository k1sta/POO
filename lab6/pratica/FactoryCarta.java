import java.util.Random;

public class FactoryCarta{
    public static Carta novaCarta(){
	Random r = new Random();
        Carta carta = new Carta();

        int lengthEnumCartas = eNumero.values().length;
        int lengthEnumNaipes = eNaipe.values().length;

        carta.setNumero(eNumero.values()[r.nextInt(lengthEnumCartas)]);
        carta.setNaipe(eNaipe.values()[r.nextInt(lengthEnumNaipes)]);

        return carta;
    }
}
