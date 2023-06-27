import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        int opcao;
        System.out.println("=== Barraquinha de São João ===");

        do {
            System.out.println("==== MENU INICIAR ===");
            System.out.println(" Escolha uma opção ");
            System.out.println("1- Cadastrar produto");
            System.out.println("2- Ver produtos cadastrados");
            System.out.println("3- Ver valor total dos produtos");
            System.out.println("4- Sair...");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    produto.cadastrarProduto();
                    break;
                case 2:
                    //produto.verProdutos();
                    break;
                case 3:
                    //produto.valorTotal();
                    break;
                case 4:
                    System.out.println(" Saindo... ");
                    break;
                default:
                    System.out.println("Opçao invalida. Tente novamente!");
            }
            System.out.println();
        }while (opcao != '4');

    }
}