package classes;

public class Piloto {
  private String nome;
  private String sobrenome;
  private String matricula;
  private String cpf;
  private String aeronave;

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getAeronave() {
    return aeronave;
  }

  public void setAeronave(String aeronave) {
    this.aeronave = aeronave;
  }

  

}
