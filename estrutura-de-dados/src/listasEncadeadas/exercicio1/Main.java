package listasEncadeadas.exercicio1;

public class Main {
  public static void main(String[] args) {
    ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

    minhaListaEncadeada.add("Test1");
    minhaListaEncadeada.add("Test2");
    minhaListaEncadeada.add("Test3");
    minhaListaEncadeada.add("Test4");
    
    System.out.println(minhaListaEncadeada.get(0));
    System.out.println(minhaListaEncadeada);

    System.out.println(minhaListaEncadeada.remove(3));
    System.out.println(minhaListaEncadeada);
  }
}
