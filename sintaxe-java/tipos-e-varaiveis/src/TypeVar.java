/* 
    Os oito tipos primitivos em Java são:
      int
      byte
      short
      long
      float
      double
      boolean
      char
    Esses tipos não são considerados objetos
      e portanto representam valores brutos.
      Eles são armazenados diretamente na 
      pilha de memória. (Memory stack)
*/

public class TypeVar {
    public static void main(String[] args) throws Exception {
      byte old = 123;
      short year = 2021;
      int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
      long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
      float pi = 3.14F;  // se for float deve terminar com "F"
      double salary = 1275.33;


      // variaveis e constante
		/*
		 * esta linha é considerada como declaração de variável iniciamos a existência
		 * variavel numero com valor 5 regra: tipo + nome + valor
		 */
		int numero = 5;

		/*
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 */
		numero = 10;

		System.out.print(numero);
		
		/*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
		
		VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
	}

}
