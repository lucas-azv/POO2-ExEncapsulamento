public class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double aplicarImposto() {
        return getPrecoBase() * 0.1;
    }

    public double aplicarTaxaAdicional() {
        return 50;
    }

    public double calcularPrecoFinal(Cliente cliente) {
        double desconto = cliente.aplicarDesconto();
        double precoComDesconto = getPrecoBase() * (1 - desconto);
        double precoFinal = precoComDesconto + aplicarImposto() + aplicarTaxaAdicional();

        if (precoFinal < 0) {
            precoFinal = 0;
        }

        return precoFinal;
    }
}
