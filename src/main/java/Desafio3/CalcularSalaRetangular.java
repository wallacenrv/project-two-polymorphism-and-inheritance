package Desafio3;

public class CalcularSalaRetangular implements CalculoGeometrico{


    @Override
    public void calcularArea(double largura, double altura) {
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area);

    }

    @Override
    public void calcularPerimetro(double largura, double altura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é: " + perimetro);

    }
}
