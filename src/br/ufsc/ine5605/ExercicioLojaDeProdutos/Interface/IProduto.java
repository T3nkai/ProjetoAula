package br.ufsc.ine5605.ExercicioLojaDeProdutos.Interface;

import br.ufsc.ine5605.ExercicioLojaDeProdutos.CategoriaProduto;

public interface IProduto {

    public CategoriaProduto getCategoria();
    public int getCodigo();
    public String getDescricao();
    public String getNome();
    public float getPreco();
    public int getQuantidade();
    public void setCategoria(CategoriaProduto categoria);
    public void setCodigo(int codigo);
    public void setDescricao(String descricao);
    public void setNome(String nome);
    public void setPreco(float preco);
    public void setQuantidade(int quantidade);
    
}
