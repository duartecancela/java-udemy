package classe;

public class ValorVsReferencia {

    static void porValor(double numero) {
        numero++;
    }

    static void porReferencia(Produto produto) {
        produto.preço++;
    }

    public static void main(String[] args) {
        double numero = 1;
        Produto produto = new Produto("Cnaeta", 1);
        Produto produto2 = produto;
        produto2.nome = "Lápis";

        porValor(numero);
        porReferencia(produto);

        System.out.println(numero);
        System.out.println(produto.preço);
        System.out.println(produto2.nome);
    }
}
