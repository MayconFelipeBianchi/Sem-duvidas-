package com.mycompany.listaexercicio03;

/**
 *
 * @author aluno
 */
public class Paciente {
    private String nome;
    private int idade;
    private String sexo;
    private String convenio; 
    public Sintomas sintoma;


    public void setPaciente(String aNome, int aIdade, String aSexo, String aConveneio){
        this.nome = aNome;
        this.idade = aIdade;
        this.sexo = aSexo;
        this.convenio = aConveneio;
    }

    public void setSintoma(Sintomas aSintoma){
        this.sintoma = aSintoma;
    }
}