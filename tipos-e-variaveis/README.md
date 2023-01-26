Tipos e Variáveis

Tipos de dados

No Java, existem algumas palavras reservadas, para a representação dos tipos de dados básicos, que precisam ser manipulados, para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).

Os oito tipos primitivos em Java são:
 int, byte, short, long, float, double, boolean e char – esses tipos não são considerados objetos e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)

Tabela de Tipos Primitivos e seus valores:

Tipo    Memória     Valor Mínimo                    Valor Máximo               <br>
byte    1 byte      -128                            127                        <br>
short   2 byte      -32.768                         32.767                     <br>
int     4 bytes     -2.147.483.648                  2.147.483.647              <br>
long    8 bytes     -9.223.372.036.854.775.808      9.223.372.036.854.775.807  <br>

Os tipos primitivos, que podem conter partes fracionárias, podem ser representados por dois tipos:

Tipo    Memória     Mínimo              Máximo          Precisão    <br>
float   4 bytes     -3,4028E + 38       3,4028E + 38    6~7 dígitos <br>
double  8 bytes     -1,7976E + 308      1,7976E + 308   15 dígitos  <br>

Apesar de o tipo float, ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

Atualmente, com os computadores modernos, se tornou desnecessário utilizar os tipos short e byte, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido. 

Da mesma forma, dificilmente utilizaremos o tipo long, pois não é tão comum trabalharmos com valores tão grandes. 

Portanto, para representar números, na grande maioria das vezes, utilizaremos o tipo int , para representar números inteiros ou double  para representar números fracionados. 

O ponto mais relevante, em compreender a definição dos tipos de dados é o momento da definição do tipo para uma variável. Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou o salário de um funcionário?
