public class ClienteJuridico extends Cliente {
    public ClienteJuridico(String nome) {
        super(nome);
    }

    @Override
    public double aplicarDesconto() {
        return 0.2;
    }
}
