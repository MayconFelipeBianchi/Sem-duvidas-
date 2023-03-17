public class Turma {

    private int numSala;
    private String materia;
    private int qtdAlunos;
    private Aluno aluno;

    public Turma(int aNumSala, String aMateria, int aQtdAlunos, Aluno aluno) {
        this.numSala = aNumSala;
        this.materia = aMateria;
        this.qtdAlunos = aQtdAlunos;
        this.aluno = aluno;
    }
}