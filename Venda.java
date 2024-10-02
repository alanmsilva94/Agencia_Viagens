package agenciaviagens;

public class Venda {

    //Atributos
    private String cliente;
    private String formaPgto;
    private PacoteViagem pacote;
    private double cotacao;

    // Métodos Especiais
    public Venda(String cliente, String formaPgto, PacoteViagem pacote, double cotacao) {
        this.cliente = cliente;
        this.formaPgto = formaPgto;
        this.pacote = pacote;
        this.cotacao = cotacao;
    }

    //Métodos Públicos
    public double vendaTotalReais() {
        return pacote.totalPacote() * cotacao;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFormaPgto() {
        return formaPgto;
    }

    public PacoteViagem getPacote() {
        return pacote;
    }

    public double getCotacao() {
        return cotacao;
    }
    
        public void exibirInformacoes() {
        System.out.print("\n");
        System.out.print("--------------------------| DETALHES DA VENDA |--------------------------\n");
        System.out.print("Cliente: " + getCliente() + "\n");
        System.out.print("Forma de pagamento: " + getFormaPgto() + "\n");
        System.out.print("Pacote de viagem: " + pacote.getDestino() + "\n");
        System.out.print("Cotação do dólar: US$ " + getCotacao() + "\n");
        System.out.print("Taxas adicionais em dólar: US$ " + pacote.getTaxasAdicionais() + "\n");
        System.out.print("Margem de lucro em  %: " + pacote.getMargemLucro() + " - Valor do lucro em dólar: US$ " + pacote.valorLucro() + "\n");
        System.out.print("Valor do pacote em dólar: US$ " + pacote.totalPacote() + "\n");
        System.out.print("Valor do pacote em reais: R$ " + vendaTotalReais() + "\n");
        System.out.print("-------------------------------------------------------------------------\n");
        System.out.print("\n");
    }

}
