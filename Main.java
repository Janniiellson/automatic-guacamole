public class Main {

    public static void main(String[] args) {
        // Criando instância da classe Midia
        Midia minhaMidia = new Midia(1, 29.99, "Filme XYZ");

        // Imprimindo detalhes usando o método imprimirDados
        System.out.println("Detalhes da Midia:");
        minhaMidia.imprimirDados();
        System.out.println();

        // Criando instância da classe DVD
        DVD meuDVD = new DVD(2, 19.99, "Filme ABC", 10);

        // Imprimindo detalhes usando o método getDetalhes
        System.out.println("Detalhes do DVD:");
        System.out.println(meuDVD.getDetalhes());
        System.out.println();

        // Modificando o número de faixas usando o método setNumeroFaixas
        meuDVD.setNumeroFaixas(12);

        // Imprimindo detalhes atualizados
        System.out.println("Detalhes do DVD Atualizados:");
        System.out.println(meuDVD.getDetalhes());
        System.out.println();

        // Utilizando a função dvd() para mostrar o nome do filme
        System.out.println("Função DVD:");
        meuDVD.dvd();
        System.out.println();

        // Criando instância da classe CD
        CD meuCD = New CD(3, 15.99, "Álbum XYZ", 15)

        // Imprimindo detalhes usando o método getDetalhes
        System.out.println("Detalhes do CD:");
        System.out.println(meuCD.getDetalhes());
        System.out.println();

        // Modificando o número de músicas usando o método setNumeroMusicas
        meuCD.setNumeroMusicas(18);

        // Imprimindo detalhes atualizados
        System.out.println("Detalhes do CD Atualizados:");
        System.out.println(meuCD.getDetalhes());
        System.out.println();

        // Utilizando a função cd() para mostrar o nome do álbum
        System.out.println("Função CD:");
        meuCD.cd();
    }
}
