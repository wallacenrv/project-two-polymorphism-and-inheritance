package Desafio2Polimorfismo;

public class TesteCarro {

    public static void main(String[] args) {


        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("sedan");
        meuCarro.definirPrecos(3000, 3200, 3500);
        meuCarro.exibirInfo();
    }
}
