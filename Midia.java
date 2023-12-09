public class Midia {
    public static void main() {

        Midia minhaMidia = new Midia(1, 29.59, "Clube Da Luta");

        minhaMidia.imprimirDados();

        minhaMidia.setPreco(39.99);

        minhaMidia.imprimirDados();
    }
    private int codigo;
    private double preco;

    private String nome;

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    // Métodos setters
    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para imprimir os dados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
        System.out.println("Nome: " + nome);
    }
}