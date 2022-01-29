package desafio.dio.padroesprojeto;


public class Cliente {
    String nomeCompleto;
    String email;
    String nacionalidade;
    String estado;
    String cidade;
    int idade;
    long CPF;
    String livrosComprados;

    private Cliente(String nomeCompleto, String email, String nacionalidade, String estado, String cidade, int idade, long CPF) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.nacionalidade = nacionalidade;
        this.estado = estado;
        this.cidade = cidade;
        this.idade = idade;
        this.CPF = CPF;
    }

    public static class ClienteBuilder{
        String nomeCompleto;
        String email;
        String nacionalidade;
        String estado;
        String cidade;
        int idade;
        long CPF;

        public ClienteBuilder() {
        }

        public ClienteBuilder nomeCompleto(String nomeCompleto){
            this.nomeCompleto = nomeCompleto;
            return this;
        }

        public ClienteBuilder email(String email){
            this.email = email;
            return this;
        }
        public ClienteBuilder nacionalidade(String nacionalidade){
            this.nacionalidade = nacionalidade;
            return this;
        }
        public ClienteBuilder estado(String estado){
            this.estado = estado;
            return this;
        }
        public ClienteBuilder cidade(String cidade){
            this.cidade = cidade;
            return this;
        }
        public ClienteBuilder idade(int idade){
            this.idade = idade;
            return this;
        }
        public ClienteBuilder CPF(long CPF){
            this.CPF = CPF;
            return this;
        }

        public Cliente criarCliente(){
            return new Cliente(nomeCompleto, email, nacionalidade, estado, cidade, idade, CPF);
        }

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return
                "\n" +
                "Nome: " + nomeCompleto + "\n" +
                "Email: " + email + "\n" +
                "Nacionalidade: " + nacionalidade + "\n" +
                "Estado: " + estado + "\n" +
                "Cidade: " + cidade + "\n" +
                "Idade: " + idade + "\n" +
                "CPF: " + CPF + "\n";
    }

    public String getLivrosComprados() {
        return livrosComprados;
    }

    public void setLivrosComprados(String livrosComprados) {
        this.livrosComprados = livrosComprados;
    }
}
