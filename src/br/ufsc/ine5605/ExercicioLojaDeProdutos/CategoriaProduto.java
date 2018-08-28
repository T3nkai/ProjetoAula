package br.ufsc.ine5605.ExercicioLojaDeProdutos;

import br.ufsc.ine5605.ExercicioLojaDeProdutos.Interface.ICategoriaProduto;

public class CategoriaProduto implements ICategoriaProduto {

    private String nome;
    private int codigo;

    public CategoriaProduto(int codigo, String nome){
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
