public class Pontuacao{
	private static Pontuacao instance;
	private int pontos;

	private Pontuacao(){}

	public static Pontuacao getPontuacao(){
		if(instance == null){
			instance = new Pontuacao();
			instance.pontos = 0;
		}
		return instance;
	}

	public void ganhaPontos(int x){
		this.pontos += x;
	}

	public int getPontos(){ return this.pontos;}
}
