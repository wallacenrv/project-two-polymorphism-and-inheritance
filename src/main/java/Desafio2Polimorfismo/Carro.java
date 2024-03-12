package Desafio2Polimorfismo;

public class Carro {

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

   public void definirModelo(String modelo){
       this.modelo = modelo;
   }

   public void definirPrecos(double precoAno1, double precoAno2, double precoAno3){
       this.precoAno1 = precoAno1;
       this.precoAno2 = precoAno2;
       this.precoAno3 = precoAno3;
   }

    public void exibirPrecoMinimoMaximo() {
        double menorPreco = Math.min(precoAno1, Math.min(precoAno2, precoAno3));
        double maiorPreco = Math.max(precoAno1, Math.max(precoAno2, precoAno3));
        System.out.println("Menor preço: R$" + menorPreco);
        System.out.println("Maior preço: R$" + maiorPreco);
    }
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        exibirPrecoMinimoMaximo();

    }


    private void exibirMenorPreco(){
        double menorPreco = Math.min(precoAno1, Math.min(precoAno2, precoAno3));
        double maiorPreco = Math.max(precoAno1, Math.max(precoAno2, precoAno3));
        System.out.println("Menor preço: R$" + menorPreco);
        System.out.println("Maior preço: R$" + maiorPreco);

    }



}
