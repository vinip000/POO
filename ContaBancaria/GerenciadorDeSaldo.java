import java.util.Scanner;

public class GerenciadorDeSaldo {
    private Scanner scanner;

    public GerenciadorDeSaldo(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menuSaldo(Usuario usuario){ 
        int escolha; 
        do { 
            System.out.println("\n=== Menu de Saldo para " + usuario.getNome() + " ===");
            System.out.println("1. Realizar Depósito");
            System.out.println("2. Sacar");
            System.out.println("3. Visualizar Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    realizarDeposito(usuario);
                    break;
                case 2: 
                    realizarSaque(usuario);
                    break;
                case 3: 
                    visualizarSaldo(usuario);
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }
        } while (escolha != 4);
    }

    private void realizarDeposito(Usuario usuario){ 
        System.out.print("Digite o valor para depositar: ");
        double valor = scanner.nextDouble();
        usuario.depositar(valor);
        System.out.println("Depósito realizado. Saldo atual: R$ " + usuario.getSaldo());
    }

    private void realizarSaque(Usuario usuario){
        System.out.print("Digite o valor para sacar: ");
        double valor = scanner.nextDouble();
        if (usuario.sacar(valor)) {
            System.out.println("Saque realizado. Saldo atual: R$ " + usuario.getSaldo());
        } else {
            System.out.println("Saque inválido. Verifique o saldo.");
        }
    }

    private void visualizarSaldo(Usuario usuario){
        System.out.println("Saldo atual de " + usuario.getNome() + ": R$ " + usuario.getSaldo());
    }
}
