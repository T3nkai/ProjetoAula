package br.ufsc.ine5605.ExercicioBiblioteca;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros =  new ArrayList<>();

    public void incluirLivro(Livro livro){
        livros.add(livro);
    }
    public void excluirLivro(Livro livro){
        livros.remove(livro);
    }
}