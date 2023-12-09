class Carro extends Veiculo {
    private int numeroPortas;
    private int ano;
    private int quilometragem;

    // Construtor
    public Carro(String modelo, double preco, int numeroPortas, int ano, int quilometragem) {
        super(modelo, preco);
        this.numeroPortas = numeroPortas;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    // Implementação do método printDados para Carro
    @Override
    public void printDados() {
        System.out.println("Tipo: Carro");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: " + getPreco());
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem);
    }

    // Getter para o ano
    public int getAno() {
        return ano;
    }

    // Getter para a quilometragem
    public int getQuilometragem() {
        return quilometragem;
    }
}
