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
    }
}
