import calculos.CalculadoraDeTempo;
import modelos.Episodio;
import modelos.Filme;
import modelos.FiltroRecomendacao;
import modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso chefão");
        meuFilme.setAnoLancamento(1900);
        meuFilme.setDuracaoEmMinutos(180);

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Avatar");
        meuFilme2.setAnoLancamento(1900);
        meuFilme2.setDuracaoEmMinutos(180);


        meuFilme.exibiTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Duracao em minutos "+ meuFilme.getDuracaoEmMinutos());

        System.out.println(meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.getTotalAvaliacao());
        System.out.println("A media foi : " + meuFilme.mediaDasAvaliacoes());



        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoLancamento(2000);
        lost.exibiTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        System.out.println("Duracao para maratonar Lost " + lost.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(meuFilme2);
        System.out.println(calculadoraDeTempo.getTempoTotal());


        Episodio primeiroEpisodio = new Episodio();
        primeiroEpisodio.setNumero(1);
        //primeiroEpisodio.setSerie(serie);
        primeiroEpisodio.setTotalVisualizacoes(300);

    FiltroRecomendacao filtro = new FiltroRecomendacao();
    filtro.filtrar(primeiroEpisodio);

    }
}
