<h1 align="center">
  Aulas Práticas Java - Generation Brasil
</h1>

## Boas Práticas de Nomeação

| Tipo de Identificador  | Convenção                                                        | Exemplo                  |
|------------------------|------------------------------------------------------------------|----------------------------|
| Variáveis              | camelCase (letra minúscula no início e letras maiúsculas nas palavras subsequentes) | `nomeCompleto`, `idadeUsuario` |
| Constantes             | SNAKE_CASE (letras maiúsculas separadas por underscore)          | `VALOR_CONSTANTE`, `TAMANHO_MAXIMO` |
| Métodos                | camelCase (letra minúscula no início e letras maiúsculas nas palavras subsequentes) | `calcularSalario`, `obterNomeCompleto` |
| Classes                | PascalCase (letra maiúscula no início e letras maiúsculas nas palavras subsequentes) | `Pessoa`, `ContaBancaria`  |
| Interfaces             | PascalCase (letra maiúscula no início e letras maiúsculas nas palavras subsequentes) | `Runnable`, `Listagem`     |
| Pacotes                | Tudo em letras minúsculas                                        | `com.empresa.projeto`      |

Além dessas convenções, aqui estão algumas boas práticas gerais ao nomear variáveis em Java:

- Use nomes significativos e descritivos para suas variáveis, para que fique claro qual é a finalidade delas.
- Evite usar abreviações ou siglas obscuras em nomes de variáveis, a menos que sejam amplamente reconhecidas e compreendidas.
- Use nomes de variáveis em inglês, pois é uma prática comum na comunidade de desenvolvimento Java e torna o código mais fácil de entender para um público mais amplo.
- Evite prefixos ou sufixos desnecessários em nomes de variáveis, a menos que sejam exigidos por convenções específicas do seu projeto.
- Mantenha uma consistência ao nomear variáveis dentro do seu código, seguindo as mesmas convenções e padrões em todos os lugares.


<h2 align="center">
 Laços Condicionais em Java
</h2>

### Laços Condicionais If

#### Exercício 1 - Laço Condicional If
O exercício 1 é um programa Java simples que compara a soma de dois números com um terceiro número inserido pelo usuário. 
Ele utiliza estruturas condicionais, leitura de entrada e exibição de mensagens no console. 

| Pontos de Aprendizado                                    |
|----------------------------------------------------------|
| Declaração de pacote e importação de classes             |
| Utilização da classe Scanner para realizar a leitura de entrada do usuário.|
| Uso de estrutura condicional `if-else if-else`            |
| Utilização de operadores de comparação para realizar as verificações |

#### Exercício 2 - Laço Condicional If
O exercício 2 é um programa Java simples que verifica se um número digitado pelo usuário é par ou ímpar, positivo ou negativo. Ele utiliza estruturas condicionais, leitura de entrada e exibição de mensagens no console. 

| Pontos de Aprendizado                                    |
|----------------------------------------------------------|
| Operações de divisão e comparação para determinar as características do número|

#### Exercício 3 - Laço Condicional If
O exercício 3 é um programa Java que verifica se uma pessoa está apta para doar sangue com base em informações fornecidas, como nome, idade e se é a primeira doação. Ele utiliza estruturas condicionais, leitura de entrada e exibição de mensagens no console.

| Pontos de Aprendizado                                                                                       |
|------------------------------------------------------------------------------------------------------------|
| Declaração e uso de variáveis do tipo String, int e boolean.                                               |
| Comparação de strings ignorando diferenças de maiúsculas e minúsculas usando o método equalsIgnoreCase().   |
| Manipulação de quebras de linha pendentes com o método nextLine() após a leitura de um valor numérico.     |
| Utilização de constantes (idadeMin e idadeMax) para facilitar a modificação dos critérios de doação.       |
| Tratamento de entrada inválida usando uma mensagem de erro e o comando return para encerrar o programa.     |

#### Exercício 4 - Laço Condicional If 
O exercício 4 é um exemplo de programa em Java que solicita ao usuário que faça escolhas sobre características de animais, e com base nessas escolhas, exibe o animal escolhido. Os principais pontos de aprendizado são:

| Pontos de Aprendizado                                                                                       |
|------------------------------------------------------------------------------------------------------------|
| Utilização de métodos para processar e manipular strings, como o método `toLowerCase()` para converter strings para minúsculas e o método `removerAcentos()` para remover acentos de uma string.                                              |
| Utilização de constantes de string para representar as opções disponíveis para escolha.  |
|Utilização de operadores de comparação, como `equalsIgnoreCase()`, para comparar strings independentemente de letras maiúsculas ou minúsculas.|


### Laços Condicionais Switch 


#### Exercício 1 - Laço Condicional Switch 
O exercício 1 apresenta um exemplo de uso do laço condicional switch em Java. O programa exibe uma lista de produtos com seus respectivos códigos e preços. Solicita ao usuário que digite o código do produto desejado e a quantidade comprada. Solicita ao usuário que digite o código do produto desejado e a quantidade comprada. Solicita ao usuário que digite o código do produto desejado e a quantidade comprada.

| Pontos de Aprendizado                                                            |
|----------------------------------------------------------------------------------|
| Uso do laço condicional `switch` para seleção de caminhos com base em valores.   |


#### Exercício 2 - Laço Condicional Switch
O exercício 2 é um algoritmo em Java que solicita ao usuário o nome do colaborador, o código do cargo e o salário. Em seguida, utilizando um laço condicional `switch`, determina o nome do cargo e o percentual de reajuste com base no código informado. O programa calcula o novo salário, adicionando o valor do reajuste ao salário atual, e exibe o nome do colaborador, o cargo e o novo salário na tela. 


| Pontos de Aprendizado                                                            |
|----------------------------------------------------------------------------------|
| Utilização do laço condicional `switch` para selecionar diferentes ações com base no valor da variável `codigoCargo`.  |


#### Exercício 3 - Laço Condicional Switch 
O exercício 3 é uma calculadora simples que lê dois números float, um código de operação matemática e realiza a operação selecionada, exibindo o resultado na tela.

| Pontos de Aprendizado                                                            |
|----------------------------------------------------------------------------------|
| Utilização do laço condicional `switch` para selecionar a operação a ser realizada com base no código de operação fornecido.|
| Realização das operações matemáticas dentro dos casos do `switch`.|
| Verificação especial para o caso de divisão por zero, exibindo uma mensagem adequada.|


<h2 align="center">
 Laços de Repetição em Java
</h2>
    
#### Exercício 1 - Laço de Repetição For 

 O exercício em Java recebe dois números do usuário e verifica se existem números dentro do intervalo entre esses dois números que são múltiplos de 3 e 5. O programa utiliza a estrutura condicional `if-else if-else` e um laço de repetição `for`. Ele também utiliza a classe `Scanner` para ler a entrada do usuário e exibe mensagens no console.

Pontos de Aprendizado:

| Sintaxe                                   | Descrição                                                         |
|-------------------------------------------|-------------------------------------------------------------------|
| `Scanner leia = new Scanner(System.in)`   | Cria uma instância da classe `Scanner` para ler a entrada do usuário a partir do console.|
| `num1 = leia.nextInt()`                   | Lê um número inteiro da entrada do usuário e armazena na variável `num1`.|
| `for(int i = num1; i < num2; i++)`         | Define um laço de repetição `for` que inicia a variável `i` com o valor de `num1`, itera enquanto `i` for menor que `num2` e incrementa `i` em cada iteração.|
| `if(i%3 == 0 && i%5 == 0)`                 | Verifica se `i` é um múltiplo de 3 e 5 utilizando o operador `%` para obter o resto da divisão por 3 e 5, e o operador lógico `&&` para verificar se ambas as condições são verdadeiras.|
| `System.out.println(...)`                  | Exibe uma mensagem no console.                                     |
