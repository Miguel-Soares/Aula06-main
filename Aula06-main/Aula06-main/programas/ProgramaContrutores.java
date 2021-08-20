package programas;

import classes.Vetor;

public class ProgramaContrutores {
  public static void main(String[] args) {
    // Pessoa p1 = new Pessoa();
    // System.out.println(p1.getIdade());

    Vetor vet = new Vetor(10);
    System.out.println(vet.tamanho());

    vet = new Vetor(10);
    System.out.println(vet.tamanho());
  }
}