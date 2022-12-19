            Anatomia das classes

Uma classe bem estruturada, não quer guerra com ninguém!

A escrita de códigos de um programa é feita através da composição de palavras pré-definidas pela linguagem, com as expressões que utilizamos para determinar o nome do nossos arquivos, classes, atributos e métodos.

É muito comum mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que recomendam que toda a implementação do seu programa seja escrita na língua inglesa.

Sintaxe de declaração de uma nova classe:

public class AnatomiaClasses {

    //SEU CODIGO AQUI

}

- 99,9% das nossas classes iniciarão com public class;
- Toda classe precisa de nome, exemplo MinhaClasse;
- O nome do arquivo deve ser idêntico ao nome da classe pública;
- Após o nome, definir o corpo { } , onde iremos compor nossas classes com atributos e métodos.

public class AnatomiaClasses {
//CORPO DA CLASSE

    public static void main (String [] args) {
    //CORPO DO METODO main

    }
}

- É de suma importância que agora você consiga se localizar dentro do conjunto de chaves { } existentes em sua classe.
- Dentro de uma aplicação, recomenda-se que somente uma classe possua o método main, responsável por iniciar todo o nosso programa.
- O método main recebe seu nome main, sempre terá a visibilidade public, será difinido como static, não retornará nenhum valor com void e receberá um parâmetro do tipo array de caracteres String[].


            Padrão de Nomenclatura

Todo arquivo .java deve começar com letra MAIÚSCULA
Exemplo: Calculadora.java
Se a palavra for composta, a segunda palavra deve também ser maiúscula
Exemplo: CalculadoraCientifica.java

A classe deve possuir o mesmo nome do arquivo.java

Exemplo:

Nome do arquivo: CalculadoraCientifica.java
public class CalculadoraCientifica {}

Toda variável deve ser escrita com letra minúscula

Exemplos: ano, data

Se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA

Exemplo: anoFabricacao, dataValidade

O nome dessa prática para nomear variáveis dessa forma se chama "camelCase" 

Existe uma regra adicional para variáveis, quando na mesma queremos identificar que ela
não sofrerá alteração de valor. Exemplo: queremos determinar que uma variável de nome br
sempre representará "Brasil" e nunca mudará seu valor, logo, determinamos como escrita o
código abaixo:

String BR = "Brasil";
double PI = 3.14;
int ESTADOS_BRASILEIRO = 27;
int ANO_2000 = 2000;

Recomendações: Para declarar uma variável, podemos utilizar caracteres, números e símbolos,
sempre seguindo algumas regras da linguagem.

Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9;
Deve obrigatoriamente iniciar por uma letra (preferencialmente), _ ou $, jamais c/ número;
Deve iniciar com uma letra minúscula (boa prática – ver abaixo);
Não pode conter espaços;
Não podemos usar palavras-chave da linguagem;
O nome deve ser único dentro de um escopo.

Declaração INVÁLIDA de variáveis

int numero&um = 1;    Unicos símbolos permitidos são _ e $
int 1numero = 1;      Uma variável não pode começar com númerico
int numero um = 1;    Não pode ter espaço no nome da variável
int long = 1;         long faz parte das palavras reservadas da linguagem

Declaração VÁLIDA de variáveis

int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;


            Declarando Variáveis e Métodos

Declarar uma variável em Java segue sempre a seguinte estrutura:
(1)Tipo (2)NomeBemDefinido = (3)Atribuicao; (opcional em alguns casos)    

Exemplos:
int idade = 23;
double altura = 1.62;
Dog spike; //observe que aqui a variável spike não tem valor, é normal


Declarar um método em Java segue uma estrutura bem simples:
(1)TipoRetorno (2)NomeObjetivoNoInfinitivo (3)Parametro(s)

Exemplo:
int somar (int numeroUm, int numero2)
String formatarCep (long cep)


            Indentação:
Termo utilizado para escrever o código do programa de forma
hierárquica, facilitando a visualização e o entendimento do programa.

Exemplo:
Sem Indentação:

public class Indentacao { //Exemplo com BoletimEstudantil
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6)	
System.out.println("REPROVADO"); 
else if(mediaFinal==6)
System.out.println("PROVA MINERVA"); 
else
System.out.println("APROVADO"); 	
}
}

Com Indentação:
public class BoletimEstudantil {
    public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
		    System.out.println("REPROVADO");
		else if (mediaFinal == 6)
		    System.out.println("PROVA MINERVA");
		else
	    	System.out.println("APROVADO");
	}
}

            Organizando os arquivos

À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa
estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes
arquivos através de pacotes (packages)
    
Com o uso de pacotes, as nossas classes (.java) passam a possuir
duas identificações, o nome simples e nome qualificado:

Nome Simples: Nome do Arquivo
Exemplo: ContaBanco.

Nome Qualificado: Nome do Pacote + Nome do Arquivo
Exemplo: com.suaempresa.ContaBanco.


            Java Beans

Umas das maiores dificuldades na programação é escrever algoritmos legíveis, a níveis que
sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso, a linguagem
Java sugere através de convenções, uma escrita universal, para nossas classes, atributos,
métodos e pacotes.

Variáveis
- Uma variável deve ser clara, sem abreviações ou definição sem sentido;
- Uma variável é sempre no singular, exceto quando se referir a um array ou coleção;
- Defina um idioma único às variáveis. Se declarar variáveis em inglês, defina todas em inglês. 

Não recomendado

    double salMedio = 1500.23;    variavel abreviada, dificultando a compreensão
    String emails = "aluno@escola.com";   confuso se a variavel seria um array ou único e-mail
    String myName = "JOSE";   se idioma pt-BR, valor poder ser de outro idioma, mas nome da variável não

Recomendado
    public class JavaBeans {
 
    double salarioMedio = 1500.23;
    String email = "aluno@escola.com";
    String [] emails = {"aluno@escola.com","professor@escola.com"};
    String meuNome = "JOSE";
}