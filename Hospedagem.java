package agenciaviagens;

public class Hospedagem {

    //Atributos
    private String descricao;
    private double diaria;

    // Metódos Especiais
    public Hospedagem(String descricao, double diaria) {
        this.descricao = descricao;
        this.diaria = diaria;
    }

    //Métodos Públicos
    public String getDescricao() {
        return descricao;
    }

    public double getDiaria() {
        return diaria;
    }
}
