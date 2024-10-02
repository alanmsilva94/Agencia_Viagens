package agenciaviagens;


public class PacoteViagem {

    //Atributos
    private String destino;
    private int qtdDias;
    private double taxasAdicionais;
    private double margemLucro;
    private Transporte transporte;
    private Hospedagem hospedagem;

    // Métodos Especiais
    public PacoteViagem(String destino, int qtdDias, double taxasAdicionais, double margemLucro, Transporte transporte, Hospedagem hospedagem) {
        this.destino = destino;
        this.qtdDias = qtdDias;
        this.taxasAdicionais = taxasAdicionais;
        this.margemLucro = margemLucro;
        this.transporte = transporte;
        this.hospedagem = hospedagem;
    }

    //Métodos Públicos
    public double totalHospedagem() {
        return hospedagem.getDiaria() * qtdDias;
    }

    public double totalVenda() {
        return (totalHospedagem() + transporte.getValor()) ;
    }

    public double valorLucro() {
        return (totalVenda() * (margemLucro / 100));
    }

    public double totalPacote() {
        return (totalHospedagem() + transporte.getValor() + taxasAdicionais + valorLucro());
    }

    public String getDestino() {
        return destino;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public double getTaxasAdicionais() {
        return taxasAdicionais;
    }
    
    public double getMargemLucro() {
        return margemLucro;
    }

    public void detalhesPacote() {
        System.out.print("\n");
        System.out.print("--------------------------| PACOTE DE VIAGEM |--------------------------\n");
        System.out.print("Destino: " + getDestino()+"\n");
        System.out.print("Transporte: " + transporte.getTipo()+"\n");;
         System.out.print("Valor do transporte em dólar: US$ " + transporte.getValor()+"\n");
        System.out.print("Tipo da hospedagem: " + hospedagem.getDescricao()+"\n"); 
        System.out.print("Valor da diária em dólar: US$ " + hospedagem.getDiaria()+"\n");
        System.out.print("Total da hospedagem em dólar: US$ " + totalHospedagem()+"\n");
        System.out.print("-------------------------------------------------------------------------\n");
        System.out.print("\n");
    }

}
