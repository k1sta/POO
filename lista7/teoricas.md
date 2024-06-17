# Questão 1

O padrão de projeto Observer tem, como objetivo, criar uma relação de Publisher/Subscriber, onde uma classe é responsável por atualizar as informações de outros objetos de classes distintas.

# Questão 2

Delimitar explicitamente os métodos que pertencem à estrutura Observer e os que são detalhes de implementação daquela classe específica.

# Questão 3

No Observer clássico, o Publisher atualiza **todos** os Subscribers ao receber atualizações. Já no Lazy Observer, o Publisher atualiza as próprias informações e os Subscribers optam por atualizar-se.

# Questão 4

Em situações onde os Publishers possuem um fluxo muito intenso de informações.

# Questão 5

A diferença fundamental, entre os dois, é que o Set **não permite duplicatas**, enquanto List permite.

# Questão 6

Exceções são acontecimentos inesperados a uma regra de negócio específica de uma aplicação.

# Questão 7

Basta criar uma nova classe que herda de java.lang.Exception.

# Questão 8

O tratamento de uma exceção ocorre (no Java) quando o código previne possíveis acontecimentos inesperados utilizando, por exemplo, blocos de `try` e `catch`. Além disso, quando um método **lança** uma exceção, ele interrompe a sua execução e delega o tratamento dela à função "abaixo" dela na pilha de chamada.

# Questão 9

Checked exceptions são exceções que, indiscutivelmente, devem ser tratadas pelo seu código, se não a compilação não ocorre. Já as Unchecked exceptions são exceções que são facilmente evitáveis pelo programador através da lógica do código, que, geralmente, não precisam ser tratadas.

# Questão 10

A questão quer nos mostrar que, quando um bloco `catch(Exception e)` possui, como parâmetro, um tipo de exceção que difere da exceção lançada dentro do bloco `try`, o método interrompe sua execução e lança a exceção pro método chamador.

# Questão 11

