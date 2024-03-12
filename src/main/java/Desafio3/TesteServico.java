package Desafio3;

public class TesteServico {

    public static void main(String[] args) {

        Servico servico = new Servico("Faxina", 120);
        servico.calcularPrecoTotal(2);
        servico.aplicarDesconto(10);
        System.out.println(servico.getPrecoHora());
    }
}
