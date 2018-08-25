package br.ufsc.ine5605.ExercicioBiblioteca;

public class Autor {
    private int codigo;
    private String nome;

    public Autor(int codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
    }



    public String getNome(){
        return this.nome;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }


}