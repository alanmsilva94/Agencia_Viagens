package agenciaviagens;

public class Transporte {

    //Atributos
    private String tipo;
    private double valor;

    // Metódos Especiais
    public Transporte(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    //Métodos Públicos
    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

}
