package listasEncadeadas.exercicio1;

public class ListaEncadeada<T> {
  No<T> referenciaEntrada;

  public ListaEncadeada() {
    this.referenciaEntrada = null;
  }

  public void add(T conteudo) {
    No<T> novoNo = new No<>(conteudo);
    if (this.isEmpty()) {
      referenciaEntrada = novoNo;
      return;
    }

    No<T> noAuxiliar = referenciaEntrada;
  
    for (int i = 0; i < this.size() -1; i++) {
      noAuxiliar = noAuxiliar.getProximoNo();
    }
    noAuxiliar.setProximoNo(novoNo);
  }

  public T get(int index) {
    return getNo(index).getConteudo();
  }

  private No<T> getNo(int index) {
    validaIndice(index);
    
    No<T> noAuxiliar = referenciaEntrada;
    No<T> noRetorno = null;

    for (int i = 0; i <= index; i ++) {
      noRetorno = noAuxiliar;
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    return noRetorno;
  }

  public T remove(int index) {
    No<T> noPivor = this.getNo(index);

    if (index == 0) {
      referenciaEntrada = noPivor.getProximoNo();
      return noPivor.getConteudo();
    }

    No<T> noAnterior = getNo(index - 1);
    noAnterior.setProximoNo(noPivor.getProximoNo());
    return noPivor.getConteudo();
  }

  public int size() {
    int tamanhoLista = 0;
    No<T> referenciaAuxiliar = referenciaEntrada;

    while (true) {
      if (referenciaAuxiliar != null) {
        tamanhoLista ++;
        if (referenciaAuxiliar.getProximoNo() != null) {
          referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
        } else {
            break;
        }
      } else {
          break;
      }
    }

    return tamanhoLista;
  }

  private void validaIndice(int index) {
    int ultimoIndice = size() -1;
    if (index >= size()) {
      throw new IndexOutOfBoundsException("Indice " + index + "invalido." + "o tamanho maximo do array é " + ultimoIndice + ".");
    }
  }

  public boolean isEmpty() {
    return referenciaEntrada == null;
  }

  @Override
  public String toString() {
    String strRetorno = "";
    No<T> noAuxiliar = referenciaEntrada;

    for (int i = 0; i < this.size(); i++) {
      strRetorno += "[No{" + "conteudo=" + noAuxiliar.getConteudo() + "}] -->";
      noAuxiliar = noAuxiliar.getProximoNo();
    }
    strRetorno += "null";
    return strRetorno;
  }
}
