public class Tarefa {
    private static final long serialVersionUID = 1L;
    private final int id; // Tornando id final para imutabilidade
    private String descricao;
    private boolean concluida;

    // Construtor
    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia.");
        }
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    // Método toString
    @Override
    public String toString() {
        return id + ". " + descricao + (concluida ? " [Concluída]" : " [Pendente]");
    }
}
