package br.com.raijheckinny;

public class Boletin {
    public static void main(String args[]){
        Aluno aluno = new Aluno();

        //Cadastrando dados no Aluno
        aluno.setNome("Pedro Afonso Nunis");
        aluno.setNotaPortugues(5.2);
        aluno.setNotaGeografia(7.8);
        aluno.setNotaHistoria(3.5);
        aluno.setNotaMatematica(9.5);

        //Calculado a media no aluno das materias cadastradas
        aluno.TarefaCalcularMedia();
        aluno.imprimirDouble(aluno.getMedia());
    }
}
