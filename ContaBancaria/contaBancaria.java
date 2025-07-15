import java.util.Scanner;

public class contaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeUsuario gerenciadorDeUsuario = new GerenciadorDeUsuario(scanner); 
        GerenciadorDeSaldo gerenciadorDeSaldo = new GerenciadorDeSaldo(scanner);
     
        int opcao;
        do { 
            System.out.println("\n=== Menu Principal ==="); 
            System.out.println("1. Gerenciar Saldo de um Usuário");
            System.out.println("2. Perfil Usuário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // limpar buffer
                    System.out.print("Digite o CPF do usuário para gerenciar o saldo: ");
                    String cpf = scanner.nextLine();
                    Usuario usuario = gerenciadorDeUsuario.buscarUsuarioPorCpf(cpf);
                    if (usuario != null) {
                        gerenciadorDeSaldo.menuSaldo(usuario);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 2: 
                    gerenciadorDeUsuario.menuGerenciamento();
                    break;
                case 3: 
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 3);
        
        scanner.close();
    }
}
