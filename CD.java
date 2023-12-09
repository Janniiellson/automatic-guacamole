public class CD extends Midia {
    private int numeroMusicas;
    private String tipo;

    // Construtor
    public CD(int codigo, double preco, String nome, int numeroMusicas) {
        super(codigo, preco, nome);
        this.numeroMusicas = numeroMusicas;
        this.tipo = "CD";
    }

    // Método para obter detalhes do CD
    public String getDetalhes() {
        return "Tipo: " + tipo + "\n" +
               "Código: " + getCodigo() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Preço: " + getPreco() + "\n" +
               "Número de Músicas: " + numeroMusicas;
    }

    // Método setter para definir o número de músicas
    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }

    // Método para inserir dados do CD
    public void inserirDadosCD(int codigo, double preco, String nome, int numeroMusicas) {
        setCodigo(codigo);
        setPreco(preco);
        setNome(nome);
        this.numeroMusicas = numeroMusicas;
    }

    // Função cd() que mostra o nome do álbum
    public void cd() {
        System.out.println("Nome do Álbum: " + getNome());
    }

    // Exemplo de uso
    public static void main(String[] args) {
        // Criando uma instância da classe CD
        CD meuCD = new CD(3, 15.99, "Álbum XYZ", 15);

        // Imprimindo detalhes usando o método getDetalhes
        System.out.println(meuCD.getDetalhes());

        // Modificando o número de músicas usando o método setNumeroMusicas
        meuCD.setNumeroMusicas(18);

        // Imprimindo detalhes atualizados
        System.out.println(meuCD.getDetalhes());

        // Utilizando a função cd() para mostrar o nome do álbum
        meuCD.cd();
    }
}
