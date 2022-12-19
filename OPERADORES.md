            Operadores

Símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações.

Geralmente, as primeiras palavras que ouvimos em um curso de programação são: um programa é um conjunto de instruções lógicas que, quando executadas, produzem algum resultado. Com isso em mente, ao começar a criar as primeiras linhas de código, logo você notará que é comum receber dados do usuário, prover alguma lógica para processá-los e então apresentar o resultado desse processamento.


            Atribuição

Representado pelo símbolo de igualdade "=".
O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever
o valor de uma variável. em Java, definimos um tipo, nome e opcionalmente
atribuímos um valor à variável através do operador de atribuição. Exemplos abaixo:

public class A_Atribuicao {
    public static void main(String[] args) {
        String nome = "LEONARDO";
        int idade = 33;
        double peso = 67.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();
    }
}

            Aritméticos

Utilizado para realizar operações matemáticas entre valores 
numéricos, podendo se tornar ou não uma expressão mais complexa.

Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).

Exemplos de uso:

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

ATENÇÃO! O operador de adição (+), quando utilizado em variáveis 
            do tipo texto, realizará a “concatenação de textos”.


public class B_Aritmeticos {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
            System.out.println(nomeCompleto);

//Qual o resultado das expressoes abaixo?

        String concatenacao ="?";
            System.out.println(concatenacao); // ?
        concatenacao = 1+1+1+"1";
            System.out.println(concatenacao); // 31
        concatenacao = 1+"1"+1+1;
            System.out.println(concatenacao); // 1111
        concatenacao = 1+"1"+1+"1";
            System.out.println(concatenacao); // 1111
        concatenacao = "1"+1+1+1;
            System.out.println(concatenacao); // 1111
        concatenacao = "1"+(1+1+1); 
            System.out.println(concatenacao); // 13

    }
}

            Unários

Esses operadores, são aplicados juntamente com um outro operador aritmético.
Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter
valores numéricos e booleanos.

(+)  Operador unário de valor positivo – números são positivos s/ esse operador;
(-)  Operador unário de valor negativo – nega um número ou expressão aritmética;
(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
(!)  Operador unário lógico de negação – nega o valor de uma expressão booleana.



//Exemplos abaixo: 

public class C_Unarios {
    public static void main(String[] args) {
        int numero = 5;
   
        System.out.println(- numero); //Imprime numero negativo

//incrementando numero em mais 1 numero, imprime 6
            numero ++;
        System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);  // ops algo de errado não está certo

        System.out.println(numero);     // agora sim, numero virou 7

//ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

//Muito cuidado com ordem de precedência, dos operadores unários!

    }
}


            Ternário

O operador de condição ternária é uma forma resumida para definir uma condição e
escolher por um dentre dois valores. Você deve pensar numa condição ternária,
como se fosse uma condição IF normal, porém, de uma forma em que toda a sua
estrutura estará escrita numa única linha.

O operador ternário é representado pelos símbolos "?" e ":"
utilizados na seguinte estrutura de sintaxe: 

<Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>

Exemplos abaixo:


// Condicional utilizando estrutura If/Else

public class D_Ternario {         
   public static void main(String[] args) {
      int a, b;

      a = 5;
      b = 6;

       String resultado = "";
      if(a==b)
         resultado = "verdadeiro";
      else
         resultado = "falso";
      
      System.out.println(resultado); 


// Operador ternário é aplicado p/ qualquer tipo de valor.

//- Condicional utilizando o operador condicional ternário

      String resultado = (a==b) ? "verdadeiro" : "falso";
      System.out.println(resultado);
   }
}


            Relacionais

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões.
Neste caso, mais precisamente, definem se o operando à esquerda é igual, 
diferente, menor, menor ou igual, maior, maior ou igual ao da direita,
retornando um valor booleano como resultado.

==  Quando desejamos verificar se uma variável é IGUAL A outra.
!=  Quando desejamos verificar se uma variável é DIFERENTE da outra.
>   Quando desejamos verificar se uma variável é MAIOR QUE a outra.
>=  Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
<   Quando desejamos verificar se uma variável é MENOR QUE outra.
<=  Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

*/

public class E_Relacionais {
	public static void main(String[] args) {
		String nomeUm = "Leonardo";
		String nomeDois = "Leonardo";

		System.out.println(nomeUm == nomeDois);
		
		int numero1 = 1;
		int numero2 = 2;

//Usando boolean

		boolean simNao = numero1 == numero2;	
			System.out.print("Número 1 é igual a Número 2?" + simNao);

		simNao = numero1 != numero2;	
			System.out.print("Número 1 é diferente de Número 2?" + simNao);

		simNao = numero1 > numero2;	
			System.out.print("Número 1 é maior que o Número 2?" + simNao);

		simNao = numero1 < numero2;	
			System.out.print("Número 1 é menor que o Número 2?" + simNao);

		simNao = numero1 > numero2;	
			System.out.print("Número 1 é maior que o Número 2?" + simNao);

//Usando If

		if(numero1 == numero2){ //true
			System.out.println("Condição verdadeira");
		}	
		if(numero1 > numero2)
			System.out.print("Número 1 maior que o Número 2");

		if(numero1 < numero2)
			System.out.print("Número 1 menor que o Número 2");

		if(numero1 >= numero2)
			System.out.print("Número 1 maior ou igual que o Número 2");

		if(numero1 <= numero2)
			System.out.print("Número 1 menor ou igual que o Número 2");

		if(numero1 != numero2)
			System.out.print("Número 1 é diferente de o Número 2");
	}
}


            Comparações avançadas

Quando se refere a comparação de conteúdos na linguagem, devemos ter um 
certo domínio, de como o Java trata o armazenamento destes valores na memória.

Quando estiver mais familiarizado com a linguagem, recomendamos se 
aprofundar no conceito de espaço em memória Stack versus Heap.

Vamos a alguns exemplos para ilustrar:

Valor e referência: Precisamos entender que em Java tudo é objeto, logo, objetos 
diferentes podem ter as mesmas características, mas lembrando, são objetos diferentes.


public class F_ComparacoesAvancadas {
        public static void main(String [] args) {

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //true
        System.out.println(nome2.equals(nome3)); //true
        System.out.println(nome3.equals(nome4)); //true

        }
}


== versus equals: Existe uma relevância forte, em realizar comparações com == e equals 
na qual precisamos ter uma compreensão de quais as regras seguidas pela linguagem, exemplo:

public class F_ComparacoesAvancadas {
        public static void main(String[] args) {
        
        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true
        
        Integer numero1 = 130;
        Integer numero2 = 130;

        System.out.println(numero1 == numero2); //false
        
//A razão pela qual o resultado é false, é devido o Java tratar os valores
//Como objetos a partir de agora. Qual a solução ?
//Quando queremos comparar objetos, usamos o método equals:
        
        System.out.println(numero1.equals(numero2)); 

        }
}


            Lógicos

Representam o recurso que nos permite criar expressões
lógicas maiores, a partir da junção de duas ou mais expressões. 

&&  Operador Lógico "E"
||  Operador Lógico "OU"



public class G_Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = false;

//Abaixo utilizamos o operador lógico E para fazer a união de duas expressões. 
//Se condicao1 E condicao2 forem verdadeiras, executar código

		if(condicao1 && condicao2)
			System.out.print("Os dois valores são verdadeiros");

		if(condicao1 && ( 7 > 4 )){
			System.out.print("As duas condições são verdadeiras");
		}

//Se condicao1 OU condicao2 for verdadeira, executar código
		if(condicao1 || condicao2)
			System.out.print("Um dos valores é verdadeiro");

	}
}

            Expressões lógicas avançadas

Existem os operadores lógicos "&"(E)  e "||" (OU),
mas por que no exemplo acima, foram ilustradas as condições:

if (condicao1 && condicao2)  e  if(condicao1 || condicao2) ?

A duplicidade nos operadores lógicos é um recurso conhecido como Operador 
Abreviado, isso quer dizer que, se a condição1 atender aos critérios, 
não será necessário validar a condição2.

// ComparacaoAvancada.java

int numero1 = 1;
int numero2 = 1;

if(numero1 == 2 & numero2 ++ == 2 )
    System.out.println("As 2 condições são verdadeiras");

System.out.println("O numero 1 agora é " + numero1);
System.out.println("O numero 2 agora é " + numero2);

// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )

O mesmo acontece com o operador | e || , considerando que operador, agora representa
que se uma das alternativas for verdadeira, a outra nem precisa ser avaliada.