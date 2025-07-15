import java.util.Scanner;

import Controller.AlunoController;
import Controller.ProfessorController;
import Model.Aluno;
import Model.Professor;
import View.ProfessorView;
import View.AlunoView;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para cadastrar um Aluno ou 2 para cadastrar um Professor:");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (escolha == 1) {
            // Cadastro de Aluno
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("Digite o CPF do aluno:");
            String cpf = scanner.nextLine();

            System.out.println("Digite a matrícula do aluno:");
            String matricula = scanner.nextLine();

            Aluno aluno = new Aluno(nome, cpf, matricula);
            AlunoView alunoView = new AlunoView();
            AlunoController alunoController = new AlunoController(aluno, alunoView);
            alunoController.updateView();
        } else if (escolha == 2) {
            // Cadastro de Professor
            System.out.println("Digite o nome do professor:");
            String nome = scanner.nextLine();

            System.out.println("Digite o CPF do professor:");
            String cpf = scanner.nextLine();

            System.out.println("Digite o departamento do professor:");
            String departamento = scanner.nextLine();

            Professor professor = new Professor(nome, cpf, departamento);
            ProfessorView professorView = new ProfessorView();
            ProfessorController professorController = new ProfessorController(professor, professorView);
            professorController.updateView();
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}
