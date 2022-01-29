package desafio.dio.padroesprojeto;

public class PagamentoPix implements PagamentoStrategy{

    @Override
    public void pagar(){
        System.out.println("Processando pagamento via PIX...");
        pagamentoEfetuado();
    }

    @Override
    public void pagamentoEfetuado(){
        System.out.println("Pagamento via PIX efetuado com sucesso!");
    };

}
