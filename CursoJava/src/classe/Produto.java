package classe;

public class Produto {
    String nome;
    double preço;
    static double desconto;

    Produto() {

    }

    Produto(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    double precoComDesconto() {
        return preço - preço * desconto;
    }
}
