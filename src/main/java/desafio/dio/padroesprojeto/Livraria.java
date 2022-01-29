package desafio.dio.padroesprojeto;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Livraria  {

    public static List<Livros> livrosDisponiveis = new LinkedList<>();
    PagamentoBoleto boleto = new PagamentoBoleto();
    PagamentoPix pix = new PagamentoPix();
    PagamentoCartao cartao = new PagamentoCartao();

    public void comprar(Livros livro, Cliente cliente){
        Scanner leitor = new Scanner(System.in);
        System.out.println("O livro "+ livro.getTitulo() + " custa R$" + livro.getPreco());
        System.out.println("Escolha uma forma de pagamento: " + "\n" + "1. Pagamento via Pix" + "\n" + "2. Pagamento via Cartao" + "\n" + "3. Pagamento via Boleto");
        int x = leitor.nextInt();
        if (x == 1){
            pix.pagar();
            cliente.setLivrosComprados(livro.getTitulo());
            System.out.println(cliente.nomeCompleto + " adquiriu com sucesso o livro: "+ cliente.getLivrosComprados());
            livrosDisponiveis.remove(livro);
        }  else if (x == 2){
            cartao.pagar();
            cliente.setLivrosComprados(livro.getTitulo());
            System.out.println(cliente.nomeCompleto + " adquiriu com sucesso o livro: "+ cliente.getLivrosComprados());
            livrosDisponiveis.remove(livro);
        } else if (x == 3){
            boleto.pagar();
            cliente.setLivrosComprados(livro.getTitulo());
            System.out.println(cliente.nomeCompleto + " adquiriu com sucesso o livro: "+ cliente.getLivrosComprados());
            livrosDisponiveis.remove(livro);
        } else {
            System.out.println("Forma de pagamento inválida");
        }
    }

}

