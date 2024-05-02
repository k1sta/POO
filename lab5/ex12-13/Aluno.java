public class Aluno{
    String nome;
    int idade;
    int dre;
    Arraylist<Disciplina> = new Arraylist<Disciplina>;
    /*
    float altura;
    String cpf;
    String sexualidade;
    Boolean bruno18;
    Boolean salazar;
    Boolean foiManjado;
    Boolean ehOManjas;
    String linguagemFavorita;
    String signo;
    Boolean temPassagemNaDelegacia;
    String curso;
    protected int votoEm2022primeiroTurno, votoEm2022segundoTurno;
    String tipoSanguineo;
    private Boolean soropositivo;
    

    public String status() {
        if(linguagemFavorita.equals("Python")) {
            return "Rei";
        }
        else if (linguagemFavorita.equals("C/C++")) {
            return "É pessoa!";
        }
        else {
            return "Não é pessoa!";
        }
    }
    */

    public Aluno(String nome, int idade, int dre){
        this.nome = nome;
        this.idade = idade;
        this.dre = dre;
    }

    public Aluno(String nome, int dre){
        this.nome = nome;
        this.dre = dre;
    }
}