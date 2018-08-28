package br.ufsc.ine5605.ExercicioLojaDeProdutos;

import br.ufsc.ine5605.ExercicioLojaDeProdutos.Interface.ICategoriaProduto;
import br.ufsc.ine5605.ExercicioLojaDeProdutos.Interface.IControladorProdutos;
import br.ufsc.ine5605.ExercicioLojaDeProdutos.Interface.IProduto;

import java.util.ArrayList;
import java.util.List;

public class ControladorProdutos implements IControladorProdutos {

    private float inflacao;
    private List<CategoriaProduto> categoriaProdutos = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();


    public void atualizaPrecos(float inflacao) {
        float novoPreco = 0;
       for(Produto produto: produtos){
          novoPreco = produto.getPreco() * (1+(inflacao/100));
          produto.setPreco(novoPreco);
       }
    }


    public Produto getProdutoPeloCodigo(int codigo) {
       for ( Produto produto : produtos){
           if(produto.getCodigo() == codigo){
               return produto;
           }
       }
       return null;
    }


    public CategoriaProduto incluiCategoriaProduto(int codigo, String nome) {
        boolean conten = false;
        for(CategoriaProduto categoriaProduto : categoriaProdutos){
            if (nome.equals(categoriaProduto.getNome())){
                if(codigo == categoriaProduto.getCodigo()){
                    conten = true;
                }
            }
        }
        if(!conten){
            CategoriaProduto categoriaProduto = new CategoriaProduto(codigo, nome);
            categoriaProdutos.add(categoriaProduto);
            return categoriaProduto;
        }
        return null;

    }


    public Produto incluiProduto(int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria) {
        Produto produto = new Produto(codigo, nome, descricao, preco, quantidade, categoria);
        produtos.add(produto);
        return  produto;
    }
}
