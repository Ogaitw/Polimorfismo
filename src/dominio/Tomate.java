package dominio;

public class Tomate extends  Produto{
    public static final  double IMPOSTO_POR_CENTO =0.21;
    private  String dataDeValidade;
    public Tomate(String nome, double valor, String dataDeValidade) {
        super(nome, valor);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto tomate");
        return this.valor*IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
