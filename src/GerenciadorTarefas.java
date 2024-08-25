import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;
    private int proximoId;

    // Construtor
    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
        proximoId = 1;
    }

    // Método para adicionar uma tarefa
    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(proximoId++, descricao));
    }

    // Método para listar todas as tarefas
    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    // Método para marcar uma tarefa como concluída
    public void marcarComoConcluida(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setConcluida(true);
                System.out.println("Tarefa " + id + " marcada como concluída.");
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }

    // Método para remover uma tarefa
    public void removerTarefa(int id) {
        boolean removido = tarefas.removeIf(tarefa -> tarefa.getId() == id);
        if (removido) {
            System.out.println("Tarefa " + id + " removida.");
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }
}
