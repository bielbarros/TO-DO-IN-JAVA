import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consome o newline deixado pelo nextInt()

            switch (escolha) {
                case 1:
                    System.out.print("Descrição da Tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    gerenciador.listarTarefas();
                    break;
                case 3:
                    System.out.print("ID da Tarefa para marcar como concluída: ");
                    int idConcluida = scanner.nextInt();
                    gerenciador.marcarComoConcluida(idConcluida);
                    break;
                case 4:
                    System.out.print("ID da Tarefa para remover: ");
                    int idRemover = scanner.nextInt();
                    gerenciador.removerTarefa(idRemover);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close(); // Fecha o Scanner
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
