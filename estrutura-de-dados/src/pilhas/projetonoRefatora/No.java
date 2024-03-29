package pilhas.projetonoRefatora;

public class No<T> {
  private T conteudo;
  private No proximono;  

  public No(T conteudo) {
    this.proximono = null;
    this.conteudo = conteudo;
  }

  public T getConteudo() {
    return conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public No getProximono() {
    return proximono;
  }

  public void setProximono(No<T> proximono) {
    this.proximono = proximono;
  }

  @Override
  public String toString() {
    return "No{" +
          "conteudo='" + conteudo + '\'' +
          '}';
  }
}
