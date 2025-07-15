public class Usuario extends Pessoa {
  private String tipo;
  private double saldo; // saldo individual do usuário

  public Usuario(String nome, String cpf, String endereco, String telefone, String tipo) {
    super(nome, cpf, endereco, telefone);
    this.tipo = tipo;
    this.saldo = 0.0; // saldo inicia em 0
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getSaldo() {
    return saldo;
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
    }
  }

  public boolean sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo -= valor;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "Usuario{" +
        "nome='" + nome + '\'' +
        ", cpf='" + cpf + '\'' +
        ", endereco='" + endereco + '\'' +
        ", telefone='" + telefone + '\'' +
        ", tipo='" + tipo + '\'' +
        ", saldo= R$" + saldo +
        '}';
  }
}
