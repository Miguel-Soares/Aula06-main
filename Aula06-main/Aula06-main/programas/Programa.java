package programas;

import java.util.Scanner;

import classes.Piloto;

public class Programa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int CAPACIDADE = 2; // constante. Seu valor não muda após a atribuição inicial
    Piloto[] pilotos = new Piloto[CAPACIDADE];
    int opcao, qtdCadastrados = 0;

    do {
      System.out.println("Escolha uma opção:");
      System.out.println("0 - Sair");
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.println("3 - Localizar piloto pelo CPF");
      System.out.println("4 - Expandir capacidade de armazenamento");
      System.out.print("Opção: ");

      opcao = sc.nextInt();
      sc.nextLine(); // Limpa o ENTER q fica na entrada

      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:
          // Aqui dentro vai a programação para realizar o cadastro
          if (qtdCadastrados == CAPACIDADE) {
            System.out.println("Não há mais espaço para armazenar pilotos.");
            continue;
          }

          // Se chegou aqui, é porque tem espaço disponível...
          Piloto piloto = new Piloto();

          System.out.print("Nome: ");
          piloto.setNome(sc.nextLine());

          System.out.print("Sobrenome: ");
          piloto.setSobrenome(sc.nextLine());

          System.out.print("Matricula: ");
          piloto.setMatricula(sc.nextLine());

          System.out.print("CPF: ");
          piloto.setCpf(sc.nextLine());
          
          System.out.print("Aeronave ");
          piloto.setAeronave(sc.nextLine());
          
          pilotos[qtdCadastrados] = piloto;

          /*
           * TAMBÉM PODE SER ASSIM System.out.print("Nome: "); String nome =
           * sc.nextLine();
           * 
           * System.out.println("Sobrenome: "); String sobrenome = sc.nextLine();
           * 
           * System.out.print("Telefone: "); String telefone = sc.nextLine();
           * 
           * pilotos[qtdCadastrados] = new piloto(nome, sobrenome, telefone);
           */

          qtdCadastrados = qtdCadastrados + 1;
          break;
        case 2:
          // Aqui vai a programação para listar os cadastrados
          if (qtdCadastrados == 0) {
            System.out.println("Não há pilotos cadastrados.");
            continue;
          }

          // Se cheguei aqui, é porque tem gente cadastrada...
          System.out.println("====================");
          System.out.println("LISTAGEM DE pilotoS");
          System.out.println("====================");

          for (int i = 0; i < qtdCadastrados; i++) {
            Piloto c = pilotos[i];
            System.out.printf("Nome completo: %s %s - Telefone: %s\n", c.getNome(), c.getSobrenome(), c.getCpf(), c.getMatricula(), c.getAeronave());
            //System.out.println("Nome completo: " + c.getNome() + " " + c.getSobrenome() + " - Telefone: " + c.getTelefone());
          }
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);

    sc.close();
  }
}