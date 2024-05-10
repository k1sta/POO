import java.util.ArrayList;

public class Driver{
    public static void main(String[] args){
	ArrayList<Carta> maoJogador = new ArrayList<Carta>();
        
	for(int i = 0; i < 5; i++){
	    Carta temp = FactoryCarta.novaCarta();

	    System.out.println(temp.imprimir());

	    maoJogador.add(temp);
	}

	Pontuacao pontuacao = Pontuacao.getPontuacao();

	pontuacao.ganhaPontos(10);

	System.out.println(pontuacao.getPontos());
    }
}
