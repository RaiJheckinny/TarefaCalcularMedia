package br.com.raijheckinny;

public class Aluno {

    private  String nome;
    private double notaPortugues;
    private double notaMatematica;
    private double notaHistoria;
    private double notaGeografia;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public double getNotaGeografia() {
        return notaGeografia;
    }

    public void setNotaGeografia(double notaGeografia) {
        this.notaGeografia = notaGeografia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    //Calcula a media das Materias cadatradas no boletin
    public void TarefaCalcularMedia(){
        double media = notaPortugues+notaGeografia+notaHistoria+notaMatematica/4;
        this.media = media;
    }

    //Imprimir conteudo do parametro
    public void imprimirDouble(Double numero){
        System.out.println(numero);
    }
}
