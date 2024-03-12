package modelos;

public class Titulo {

    private String nome;
    private boolean incluidoNoPlano;
    private  double somaDasAvaliacoes;
    private int totalAvaliacao;
    private int duracaoEmMinutos;
    private int anoLancamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public  int getAnoLancamento(){
        return anoLancamento;
    }

    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public double getSomaDasAvaliacoes(){
        return totalAvaliacao;
    }

    public void exibiTecnica(){
        System.out.println("Nome do filme" + nome);
        System.out.println("Ano de lancamento" + anoLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes=somaDasAvaliacoes+nota;
        totalAvaliacao= totalAvaliacao+1;
    }

    public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes/totalAvaliacao;
    }
}
