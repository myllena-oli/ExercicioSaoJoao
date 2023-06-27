import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nomeProduto;
    private int quantidade;
    private double valorUnitario;
    List<String> ingredientes = new ArrayList<>();
    List<Produto> produtos = new ArrayList<>();

    public Produto(String nomeProduto, int quantidade, double valorUnitario, List<String> ingredientes) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.ingredientes = ingredientes;
    }

}
