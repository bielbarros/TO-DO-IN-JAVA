public class Tarefa {
    private static final long serialVersionUID = 1L;
    private int id;
    private String descricao;
    private boolean concluida;

    // construtor.
    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    // metodos getters.
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }


    // metodovtoString para que o retorno não seja dados de memória.
    @Override
    public String toString() {
        return id + "." + descricao + (concluida ? " [Concluída]" : " [Pendente]");
    }

}