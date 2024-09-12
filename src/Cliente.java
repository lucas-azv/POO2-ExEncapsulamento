public abstract class Cliente {
    private String nome;

    protected Cliente(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected abstract double aplicarDesconto();
}
