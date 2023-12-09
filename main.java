import java.util.Scanner;

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

// Classe Carro
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

// Classe Moto
class Moto extends Veiculo {
 
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Cadastro de Veículos!");

        // Lista de veículos cadastrados
        Carro meuCarro = null;
        Moto minhaMoto = null;

        while (true) {
            System.out.println("\nEscolha a opção:");
            System.out.println("1 - Inserir Carro");
            System.out.println("2 - Inserir Moto");
            System.out.println("3 - Realizar Levantamento");
            System.out.println("4 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    meuCarro = cadastrarCarro(scanner);
                    break;
                case 2:
                    minhaMoto = cadastrarMoto(scanner);
                    break;
                case 3:
                    realizarLevantamento(meuCarro, minhaMoto);
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static Carro cadastrarCarro(Scanner scanner) {
        System.out.println("\nCadastro de Carro:");

        System.out.print("Modelo do Carro: ");
        String modelo = scanner.next();

        System.out.print("Preço do Carro: ");
        double preco = scanner.nextDouble();

        System.out.print("Número de Portas: ");
        int numeroPortas = scanner.nextInt();

        System.out.print("Ano do Carro: ");
        int ano = scanner.nextInt();

        System.out.print("Quilometragem do Carro: ");
        int quilometragem = scanner.nextInt();

        Carro carro = new Carro(modelo, preco, numeroPortas, ano, quilometragem);

        System.out.println("\nRelatório do Carro:");
        carro.printDados();

        return carro;
    }

    private static Moto cadastrarMoto(Scanner scanner) {
        System.out.println("\nCadastro de Moto:");

        System.out.print("Modelo da Moto: ");
        String modelo = scanner.next();

        System.out.print("Preço da Moto: ");
        double preco = scanner.nextDouble();

        System.out.print("Partida Elétrica (true/false): ");
        boolean partidaEletrica = scanner.nextBoolean();

        System.out.print("Ano da Moto: ");
        int ano = scanner.nextInt();

        Moto moto = new Moto(modelo, preco, partidaEletrica, ano);

        System.out.println("\nRelatório da Moto:");
        moto.printDados();

        return moto;
    }

    private static void realizarLevantamento(Carro carro, Moto
            totalDepois += moto.getPreco();
        }

        System.out.println("\nTotal de Preços após os ajustes: " + totalDepois);
    }
}
