public class Carta implements Printavel{
    //tipo enum para o numero (ÁS, DOIS, TRES, ... , DAMA, REI)
    eNumero numero;
    
    public class Naipe{
        //tipo enum para naipe (OUROS, ESPADAS, PAUS, COPAS)
        eNaipe naipe;
    }

    @Override
    public String imprimir(){
        return this.numero + "de" + this.naipe.naipe;
    }

}