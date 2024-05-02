### Questão 5

2 mensagens

vw liga 2 vezes paizao

### Questão 6

Deu merda. O ponteiro para o array foi ANULADO, PENALIDADE MAXIMA. POrtanto, na hora de LIGAR O carrinho da lista, ele ligou NADA, pois foi ANULADO. INFELIZMENTE. Entretanto, nosso carrinho AINDA EXISTE. Boa sorte encontrando-o perdido na stack, esperando a graça eterna de um memory leak para retornar a vida.

### Questão 7

sim. estao perdidos

### Questão 9

Falam em veículo (em liga), pois o método liga não foi sobrescrito na classe Ônibus, sendo utilizado o da classe mãe "Veiculo". Já o método desliga não foi sobrescrito na classe Onibus, sendo utilizao o da classe mãe "Veiculo Terrestre"

### Questão 10

A correção do erro é simples: basta remover "String modelo;"
da classe Onibus. Assim, quando este é construido, o valor do modelo é atribuido para a variável da classe mãe, que é utilizada nos métodos liga e desliga. 