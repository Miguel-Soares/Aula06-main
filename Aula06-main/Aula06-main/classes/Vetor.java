package classes;

public class Vetor {
  private int dados[];

  public Vetor(int tamanho) {
    dados = new int[tamanho];
  }

  public int tamanho() {
    return dados.length;
  }
}
