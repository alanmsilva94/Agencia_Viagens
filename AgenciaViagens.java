package agenciaviagens;

import java.util.Scanner;

public class AgenciaViagens {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Obter detalhes do transporte
        System.out.print("Informe o tipo de transporte (ex: aéreo, rodoviário, marítimo): ");
        String tipoTransporte = input.nextLine();
        System.out.print("Informe o valor em dólar do transporte: US$ ");
        double valorTransporte = input.nextDouble();
        input.nextLine();

        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

        //Obter detalhes da hospedagem
        System.out.print("Informe a descrição da hospedagem: ");
        String descricaoHospedagem = input.nextLine();
        System.out.print("Informe o valor em dólar da diária: US$ ");
        double valor_diara = input.nextDouble();
         input.nextLine();

        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valor_diara);

        // Obter detalhes do pacote
        System.out.print("Informe o destino da viagem: ");
        String localDestino = input.nextLine();
        System.out.print("Informe a quantidade de dias que ficará hospedado: ");
        int diasHospedado = input.nextInt();
        System.out.print("Informe as taxas adicionais (caso tenha): US$ ");
        double taxa = input.nextDouble();
        System.out.print("Informe a margem de lucro em % sobre o pacote de viagem: ");
        double margem = input.nextDouble();
         input.nextLine();

        PacoteViagem viajar = new PacoteViagem(localDestino, diasHospedado,taxa,margem,transporte,hospedagem);

        viajar.detalhesPacote();

        //Obter detalhes da venda
        System.out.print("Informe o nome do cliente: ");
        String nome = input.nextLine();
        System.out.print("Informe a forma de pagamento: ");
        String forma_pgto = input.nextLine();
        System.out.print("Informe a cotação do dolar(atual): US$ ");
        double cotacao_dolar = input.nextDouble();

        Venda venda = new Venda(nome, forma_pgto, viajar, cotacao_dolar);

        venda.exibirInformacoes();
    }
}
