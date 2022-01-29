package desafio.dio.padroesprojeto;


public class Livros {
    String titulo;
    String genero;
    String autor;
    double preco;

    public Livros(String titulo, String genero, String autor, double preco) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return
                "\n" +
                "Titulo: " + titulo + "\n" +
                "Gènero: " + genero + "\n" +
                "Autor: " + autor + "\n" +
                "Preço: " + preco + "\n";
    }

    public void clear (Livros livro){
        livro.setAutor(null);
        livro.setGenero(null);

        livro.setAutor(null);
    }

    }
