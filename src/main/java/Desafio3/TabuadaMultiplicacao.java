package Desafio3;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("tabuada de multiplicacao do " + numero +": ");
        for (int i = 1; i < 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }
    }
}
