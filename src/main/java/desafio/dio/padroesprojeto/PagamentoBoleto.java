package desafio.dio.padroesprojeto;

public class PagamentoBoleto implements PagamentoStrategy{

    @Override
    public void pagar(){
        System.out.println("Processando Pagamento via Boleto...");
    }

    @Override
    public void pagamentoEfetuado(){
        System.out.println("Pagamento via Boleto efetuado com sucesso!");
    };


}
