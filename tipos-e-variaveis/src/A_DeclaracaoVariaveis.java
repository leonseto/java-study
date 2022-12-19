/*

Declaração de Variáveis

Variável é uma identificação de um espaço em memória, utilizado pelo nosso programa.
Seguindo as convenções em linguagem de programação, toda variável é composta por:
tipo de dados + identificação + valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:
<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

Exemplos abaixo:
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.

Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos.

Observe no exemplo abaixo: 	*/

public class A_DeclaracaoVariaveis {
    public static void main(String[] args) {
		byte idade = 101;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
			System.out.println("Idade: " + idade);
			System.out.println("Ano de Nascimento: " + ano);
			System.out.println("CEP: " + cep);
			System.out.println("CPF: " + cpf);
			System.out.println("Valor de Pi: " + pi);
			System.out.println("Salário: R$" + salario);
    }
}
/* 
Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e
alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional.
Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta
variável e temos consciência de seu valor na aplicação. Mas, cuidado!
 
Java é fortemente "tipado".

Veja o cenário abaixo:

TiposEVariaveis.java

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;

Por mais que tenhamos ciência do valor que numeroNormal 
cabe é um short, o Java não permite correr o risco.

*/