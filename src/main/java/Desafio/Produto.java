package Desafio;

public class Produto {

    private String nome;
    private double preco;

public Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentualDesconto) {
        if (percentualDesconto > 0 && percentualDesconto <= 100) { // Verifica se o desconto é válido
            double desconto = preco * (percentualDesconto / 100); // Calcula o valor do desconto
            preco -= desconto; // Reduz o preço do produto
            System.out.println("Desconto aplicado: " + percentualDesconto + "%");
            System.out.println("Novo preço: " + preco);
        } else {
            System.out.println("O desconto deve ser um valor entre 0 e 100.");
        }
    }
}
