import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para um cachorro
        System.out.println("Digite o nome do cachorro:");
        String nomeCachorro = scanner.nextLine();
        System.out.println("Digite a idade do cachorro:");
        int idadeCachorro = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite a raça do cachorro:");
        String racaCachorro = scanner.nextLine();

        Cachorro cachorro = new Cachorro(nomeCachorro, idadeCachorro, racaCachorro);
        System.out.println("\nInformações do cachorro:");
        cachorro.exibirInfo();

        // Entrada de dados para uma chinchila
        System.out.println("\nDigite o nome da chinchila:");
        String nomeChinchila = scanner.nextLine();
        System.out.println("Digite a idade da chinchila:");
        int idadeChinchila = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite a cor da pelagem da chinchila:");
        String corPelagemChinchila = scanner.nextLine();

        Chinchila chinchila = new Chinchila(nomeChinchila, idadeChinchila, corPelagemChinchila);
        System.out.println("\nInformações da chinchila:");
        chinchila.exibirInfo();

        // Entrada de dados para um canário
        System.out.println("\nDigite o nome do canário:");
        String nomeCanario = scanner.nextLine();
        System.out.println("Digite a idade do canário:");
        int idadeCanario = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite a cor das penas do canário:");
        String corPenasCanario = scanner.nextLine();

        Canario canario = new Canario(nomeCanario, idadeCanario, corPenasCanario);
        System.out.println("\nInformações do canário:");
        canario.exibirInfo();

        // Entrada de dados para um papagaio
        System.out.println("\nDigite o nome do papagaio:");
        String nomePapagaio = scanner.nextLine();
        System.out.println("Digite a idade do papagaio:");
        int idadePapagaio = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite a cor da plumagem do papagaio:");
        String corPlumagemPapagaio = scanner.nextLine();

        Papagaio papagaio = new Papagaio(nomePapagaio, idadePapagaio, corPlumagemPapagaio);
        System.out.println("\nInformações do papagaio:");
        papagaio.exibirInfo();

        scanner.close();
    }
}
