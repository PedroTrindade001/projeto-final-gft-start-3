package desafio.dio.padroesprojeto;

public class PagamentoCartao implements PagamentoStrategy{

    @Override
    public void pagar(){
        System.out.println("Processando pagamento via Cartão...");
    }

    @Override
    public void pagamentoEfetuado(){
        System.out.println("Pagamento via Cartão efetuado com sucesso!");
    };


}
