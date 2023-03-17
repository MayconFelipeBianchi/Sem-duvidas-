 */
public class Aluno {

    private String nome;
    private int idade;
    private boolean repetente;
    private double notaMedia;
    private int numSala;
    private boolean cadastrado = false;

    public Aluno(String aNome, int aIdade) {
        this.nome = aNome;
        this.idade = aIdade;
    }

    public void setAluno(boolean aRepetente, double aNotaMedia, int aNumSala, boolean aCadastrado) {
        this.repetente = aRepetente;
        this.notaMedia = aNotaMedia;
        this.numSala = aNumSala;
        this.cadastrado = aCadastrado;
    }
    public boolean getCadastrado(){
        return this.cadastrado;
    }
}