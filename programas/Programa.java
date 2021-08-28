package programas;

import java.util.Scanner;

import classes.Pessoa;



public class Programa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int CAPACIDADE = 20; 
    Pessoa[] pilotos = new Pessoa[CAPACIDADE];
    int opcao, qtdCadastrados = 0;

    do {
      System.out.println("Escolha uma opção:");
      System.out.println("0 - Sair");
      System.out.println("1 - Incluir piloto");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.println("3 - Localizar piloto pelo CPF");
      System.out.println("4 - Expandir capacidade de armazenamento");
      System.out.print("Opção: ");

      opcao = sc.nextInt();
      sc.nextLine(); 

      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:
          
          if (qtdCadastrados == CAPACIDADE) {
            System.out.println("Não há mais espaço para armazenar pilotos.");
            continue;
          }

          Pessoa piloto = new Pessoa();

          System.out.print("Nome: ");
          piloto.setNome(sc.nextLine());

          System.out.print("Sobrenome: ");
          piloto.setSobrenome(sc.nextLine());

          System.out.print("CPF: ");
          piloto.setCpf(sc.nextLine());

          System.out.print("Brevê: ");
          piloto.setBreve(sc.nextLine());
          
          pilotos [qtdCadastrados] = piloto;

          qtdCadastrados = qtdCadastrados + 1;
          break;
        case 2:
          
          if (qtdCadastrados == 0) {
            System.out.println("Não há pilotos cadastrados.");
            continue;
          }

         
          System.out.println("====================");
          System.out.println("LISTAGEM DE pilotoS");
          System.out.println("====================");

          for (int i = 0; i < qtdCadastrados; i++) {
            Pessoa c  = pilotos[i];
            System.out.printf("Nome completo: %s %s - Cpf: %s - Brevê: %s\n", c.getNome(), c.getSobrenome(), c.getCpf(), c.getBreve());
            
          }
          break;
          case 3:
          System.out.print("Digite o cpf do piloto: ");
          String CPFpiloto = (sc.nextLine());
         for (int i = 0; i < qtdCadastrados; i++){
            Pessoa c  = pilotos[i];
            String CPFregistrado = pilotos[i].getCpf();
           if (CPFpiloto.equals(CPFregistrado)) {
            System.out.printf("Nome completo: %s %s - Cpf: %s - Brevê: %s\n", c.getNome(), c.getSobrenome(), c.getCpf(), c.getBreve());
            continue;
           }
          } 
          break; 
          case 4:
          System.out.print("Digite a nova capacidade de pilotos: ");
          int CapacidadeNova = (sc.nextInt());
         if (CapacidadeNova > 20){
            Pessoa[] pilotos2 = new Pessoa[CapacidadeNova];
          pilotos2 = pilotos;
          CAPACIDADE = CapacidadeNova;
          System.out.println("A nova capacidade foi definida.");
          }
          else 
          System.out.println("A nova capacidade não pode ser menor que a anterior.");
          break;
         default:
          System.out.println("Opção inválida!");
          break;
        }
    } while (opcao != 0);

    sc.close();
  }
  }
