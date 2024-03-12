package calculos;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }


    // Nesse caso passa filme e serie
    //Tenho varias formas de referencias , olha o filme olha esse titulo -
    //isso é poliformismo, muitas formas de chamar
    public void inclui(Titulo t){
        System.out.println("Adionando duracao em minuto de : "+ t);
        tempoTotal+= t.getDuracaoEmMinutos();
    }
}
