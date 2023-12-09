public class DVD extends Midia {
    private int numeroFaixas;
    private String tipo;

    // Construtor
    public DVD(int codigo, double preco, String nome, int numeroFaixas) {
        super(codigo, preco, nome);
        this.numeroFaixas = numeroFaixas;
        this.tipo = "DVD";
    }

    // Método para obter detalhes do DVD
    public String getDetalhes() {
        return "Tipo: " + tipo + "\n" +
               "Código: " + getCodigo() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Preço: " + getPreco() + "\n" +
               "Número de Faixas: " + numeroFaixas;
    }

    // Método setter para definir o número de faixas
    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    public void inserirDadosDVD(int codigo, double preco, String nome, int numeroFaixas) {
        setCodigo(codigo);
        setPreco(preco);
        setNome(nome);
        this.numeroFaixas = numeroFaixas;
    }

    public void dvd() {
        System.out.println("Nome do Filme: " + getNome());
    }

    public static void main(String[] args) {
        // Criando uma instância da classe DVD
        DVD meuDVD = new DVD(2, 19.99, "Filme Clube da Luta", 10);

        // Imprimindo detalhes usando o método getDetalhes
        System.out.println(meuDVD.getDetalhes());

        // Modificando o número de faixas usando o método setNumeroFaixas
        meuDVD.setNumeroFaixas(12);

        // Imprimindo detalhes atualizados
        System.out.println(meuDVD.getDetalhes());

        // Utilizando a função dvd() para mostrar o nome do filme
        meuDVD.dvd();
    }
}
