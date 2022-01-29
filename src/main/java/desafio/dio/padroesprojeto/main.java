package desafio.dio.padroesprojeto;

import static desafio.dio.padroesprojeto.Livraria.livrosDisponiveis;

//Padrões de Projetos Utilizados: Strategy, Builder

public class main {
    public static void main(String[] args) {
        Livros livro1 = new Livros("Harry Potter", "Ficção", "J K Rowling", 100);
        Livros livro2 = new Livros("The Witcher", "Ação", "Andrzej Sapkowski", 80);

        livrosDisponiveis.add(livro1);
        livrosDisponiveis.add(livro2);

        Cliente cliente1 = new Cliente.ClienteBuilder()
                .nomeCompleto("Carlos Jetosbaldo da Silva")
                .email("calorsjetosbaldosp@email.com")
                .nacionalidade("Brasileiro")
                .estado("SP")
                .cidade("São Paulo")
                .idade(20)
                .CPF(12345678912l)
                .criarCliente();

        System.out.println(cliente1);

        System.out.println("===============Livros Disponíveis===============");
        System.out.println(livrosDisponiveis + "\n");

        Livraria compras = new Livraria();
        compras.comprar(livro1, cliente1);

        System.out.println("===============Livros Disponíveis===============");
        System.out.println(livrosDisponiveis + "\n");

    }
}
