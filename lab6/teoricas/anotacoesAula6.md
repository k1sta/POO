# Anotações sobre a aula 6

## Interface
Paradigma para definir tipos de dados e inter-relações entre objetos, muito semelhante a classes abstratas.

Não podem ser instanciadas, mas seus métodos não são necessariamente abstratos.

Ao contrário de relações de herança, uma classe pode implementar várias interfaces.

Exemplo:
```java
public interface Printavel {
    public abstract String retornaString();
}

public class Gerente extends Funcionario implements Printavel {
    
    // atributos específicos e outros métodos

    @Override
    public String retornaString() {
        return "Gerente " + this.nome + " com CPF " + this.cpf;
    }
}

```

## Tipos genéricos
Tipos genéricos são usados em classes, interfaces, atributos e métodos para deixar uma funcionalidade adaptável a diferentes tipos de dados sem a necessidade de reescrever a funcionalidade.

Pode ser vista como um “template” que define o tipo de dado usado somente em tempo de execução.

Principais vantagens de tipos genéricos: **Consolidação de código**, pois o código usando tipos genéricos é definido apenas uma vez; e **reutilização** de código, pois o código não depende de um tipo específico, podendo ser reutilizado com outros não previstos inicialmente.

```java
import java.util.ArrayList;

public interface Ordenavel<T> {
    public abstract ArrayList<T> ordena();
}

public class ControleFuncionario implements Ordenavel<Funcionario>{
    ArrayList<Funcionario> lista;
    
    @Override
    public ArrayList<Funcionario> ordena() {
        Collections.sort(this.lista, Comparator.comparing(func -> func.getNome()));
        return this.lista;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista_strings = new ArrayList<String>();
        lista_strings.add("Frase 1");
        lista_strings.add("Frase 2");
        lista_strings.add("Frase 3");
        System.out.println(lista_strings);
    }
}
```

## Padrões de projeto
Os padrões de projeto constituem técnicas de organização e planejamento para o desenvolvimento de um programa. Eles são designs genéricos, aplicados em vários problemas. Entretanto, deve adaptar-se ao projeto que está sendo aplicado.

Abordaremos 3 padrões: Singleton, Factory, Observer.

### Singleton
O padrão Singleton é um padrão de projeto que simboliza uma classe que é única por si só. Em outras palavras, existirá uma e apenas uma instância dessa classe em um projeto.

Geralmente, possui atributos e métodos que podem ser utilizados em **todo o programa**, como se fossem variáveis ou funções globais.

O desenvolvedor deve sintetizar um construtor que impeça a criação de mais de uma instância.

Exemplos de Singleton:
- Conversor de medidas em um sistema meteorológico
- Configurações de aplicativo
- Pontuação de jogo
- Classe para salvar log
- Classe para conectar com APIs externas / banco de dados

```java
public class Pontuacao{
    private static Pontuacao instance;
    private Pontuacao(){
    // método construtor privado
    }

    public static Pontuacao getPontuacao(){
        if (instance == null)
        instance = new Pontuacao();
    
        return instance;
    }
// outros métodos
}
```

### Factory
O padrão Factory representa uma classe que cria uma interface para que o seu programa possua métodos que **instanciam outras classes** sem utilizar diretamente os construtores.

Ela possui diversas vantagens, como:
- Encapsulamento da criação de objetos;
- Crítica implícita sobre a maneira como devemos instanciar o objeto;
- Legibilidade de código.

```java
public class Factory{
    public static Peca createPeca(String tipo){
    Peca peca_retorno;
    if(tipo.equals(“PecaI”)) {
    PecaI peca = new PecaI();
    peca_retorno = peca;
    }

    if(tipo.equals(“PecaT”)) {
        PecaT peca = new PecaT();
        peca_retorno = peca;
    }
    if(tipo.equals(“PecaL”)) {
        PecaL peca = new PecaL();
        peca_retorno = peca;
    }

    return peca_retorno;
    }
}
```