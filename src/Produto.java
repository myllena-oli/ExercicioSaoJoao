import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    Scanner entrada = new Scanner(System.in);
    private String nomeProduto;
    private int quantidade;
    private double valorUnitario;
    List<String> ingredientes = new ArrayList<>();
    List<Produto> produtos = new ArrayList<>();

    public Produto() {
    }

    public Produto(String nomeProduto, int quantidade, double valorUnitario, List<String> ingredientes) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.ingredientes = ingredientes;
    }
    public void cadastrarProduto(){
        System.out.println("Informe o nome do produto: ");
        setNomeProduto(entrada.nextLine());
        System.out.println("Informe a quantidade: ");
        setQuantidade(entrada.nextInt());
        System.out.println("Informe o valor unitário do produto: ");
        setValorUnitario(entrada.nextDouble());

        System.out.println("Informe a quantidade de ingredientes do produto: ");
        int quantidadeIngred = entrada.nextInt();
        entrada.nextLine();

        List<String> ingredientes = new ArrayList<>();
        for (int i = 0; i <quantidadeIngred ; i++) {
            System.out.println("Informe o ingrediente " + (i+1) +":");
            ingredientes.add(entrada.nextLine());
        }

        System.out.println("Produto cadastrado com sucesso! ");
        Produto produto = new Produto(getNomeProduto(), getQuantidade(),getValorUnitario(),ingredientes);
        produtos.add(produto);

    }

    public void verProdutos() {
        System.out.println("\nAqui estão os produtos!\n");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNomeProduto());

        }
        while (true) {
            System.out.println("\nDeseja ver algum produto específico? \n1 - Sim\n2 - Não");
            int opcao = entrada.nextInt();
            entrada.nextLine();
            if (opcao == 1) {
                System.out.println("Digite o nome do produto: ");
                produtoEspecifico(entrada.nextLine());
            } else if (opcao == 2) {
                return;
            } else {
                System.out.println("Opção inválida! Tente novamente...\n");
            }
        }

    }
    public void produtoEspecifico(String produtoSelecionado){
        Produto selecionado = null;
        for (Produto produto : produtos) {
            if(produto.getNomeProduto().equalsIgnoreCase(produtoSelecionado)){
                selecionado=produto;
            }
        }
        if (selecionado!=null){
            System.out.printf("Nome: %s    Quantidade: %d    Valor unitário: %.2f    Ingredientes: %s\n",
                    selecionado.getNomeProduto(), selecionado.getQuantidade(), selecionado.getValorUnitario(),
                    selecionado.getIngredientes());
        }else{
            System.out.println("Produto não encontrado.");
        }
    }
    public void valorTotal(){
        double valor = 00.00;
        for (Produto produto: produtos) {
            double soma = produto.getQuantidade() * produto.getValorUnitario();
            valor += soma;
        }
        System.out.println("A soma total dos produtos é "+ valor);
    }
    public void calcularPrecoTotal(){

        for (Produto produto : produtos) {

            System.out.println("Nome: " + produto.getNomeProduto() +" Preço Total:"+ (produto.getQuantidade()* produto.getValorUnitario()));

        }
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

}
