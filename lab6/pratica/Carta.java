public class Carta implements Printavel{
    public class Naipe{
        //tipo enum para naipe (OUROS, ESPADAS, PAUS, COPAS)
        eNaipe naipe;
    }

    //tipo enum para o numero (ÁS, DOIS, TRES, ... , DAMA, REI)
    private eNumero numero;
    private Naipe naipe;

    //construtor
    public Carta(){
	this.naipe = new Naipe();
    }

    public void setNumero(eNumero numeroInserido){
    	this.numero = numeroInserido;
    }

    public void setNaipe(eNaipe naipeInserido){
    	this.naipe.naipe = naipeInserido;
    }

    @Override
    public String imprimir(){
        return this.numero + " de " + this.naipe.naipe;
    }

}
