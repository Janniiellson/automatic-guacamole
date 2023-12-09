// Classe Moto
class Moto extends Veiculo {
    private boolean partidaEletrica;
    private int ano;

    // Construtor
    public Moto(String modelo, double preco, boolean partidaEletrica, int ano) {
        super(modelo, preco);
        this.partidaEletrica = partidaEletrica;
        this.ano = ano;
    }

    // Implementação do método printDados para Moto
    @Override
    public void printDados() {
        System.out.println("Tipo: Moto");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço: " + getPreco());
        System.out.println("Partida Elétrica: " + (partidaEletrica ? "Sim" : "Não"));
        System.out.println("Ano: " + ano);
    }

    // Getter para o ano
    public int getAno() {
        return ano;
    }
}
