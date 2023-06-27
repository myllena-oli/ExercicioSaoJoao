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
        setNomeProduto(entrada.next());
        System.out.println("Informe a quantidade: ");
        setQuantidade(entrada.nextInt());
        System.out.println("Informe o valor unitário do produto: ");
        setValorUnitario(entrada.nextDouble());

        System.out.println("Informe a quantidade de ingredientes do produto: ");
        int quantidadeIngred = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i <quantidadeIngred ; i++) {
            System.out.println("Informe o ingrediente " + (i+1) +":");
            ingredientes.add(entrada.next());
        }
        Produto produto = new Produto(getNomeProduto(), getQuantidade(),getValorUnitario(),getIngredientes());
        produtos.add(produto);

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
