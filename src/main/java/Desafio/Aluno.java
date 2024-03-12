package Desafio;

public class Aluno {

    private String nome;
    private Double nota1;
    private Double nota2;
    private Double nota3;


    public Aluno(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;

    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getNota3() {
        return nota3;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double calcularMedia(){

       double soma = nota1 + nota2 + nota3 ;
        return soma /3;
    }
}
