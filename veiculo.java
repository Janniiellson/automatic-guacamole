// Classe abstrata Veiculo
abstract class Veiculo {
    private String modelo;
    private double preco;

    // Construtor
    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    // Método abstrato para garantir que cada subclasse implemente seu próprio método printDados
    public abstract void printDados();

    // Getter para o modelo
    public String getModelo() {
        return modelo;
    }

    // Getter para o preço
    public double getPreco() {
        return preco;
    }

    // Setter para o preço
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
