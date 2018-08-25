package br.ufsc.ine5605.ExercicioBiblioteca;

import java.util.ArrayList;
import java.util.List;


public class Livro {
    private int codigo;
    private int ano;
    private String titulo;
    private List<Capitulo> capitulos = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private Editora editora;

//    public Livro(int codigo,String titulo, int ano, Editora editora, Autor autores[], int codigoCapitulo, String tituloCaptulo) {
//        setCodigo(codigo);
//        setTitulo(titulo);
//        setAno(ano);
//        setEditora(editora);
//        incluirAutor(autores);
//        incluirCapitulo(codigoCapitulo, tituloCaptulo);
//
//    }

    public Livro(int codigo,String titulo, int ano, Editora editora, Autor autores, int codigoCapitulo, String tituloCaptulo) {
        setCodigo(codigo);
        setTitulo(titulo);
        setAno(ano);
        setEditora(editora);
        incluirAutor(autores);
        incluirCapitulo(codigoCapitulo, tituloCaptulo);

    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public Editora getEditora() {
        return this.editora;
    }



    //    public void incluirAutor(Autor autor[]) {
//
//        if (autor.length == 1) {
//
//            autores.add(autor[0]);
//        } else {
//            for (int i = 0; i < autor.length; i++) {
//                autores.add(autor[i]);
//            }
//        }
//    }

    public void incluirAutor(Autor autor) {
        boolean encontrou =  false;
        if( autor != null ) {
            for (Autor autorExistente : autores) {
                if (autor.getNome().equals(autorExistente.getNome()) && autorExistente.getCodigo() == autor.getCodigo()) {
                    encontrou = true;
                }
            }
            if (!encontrou) {
                autores.add(autor);
            }
        }
    }

    //    public void excluirAutor(Autor autor[]) {
//        for (int i = 0; i < autor.length; i++) {
//            if (autores.contains(autor[i])) {
//                autores.remove(autor[i]);
//            }
//        }
//    }
    public void excluirAutor(Autor autor) {
        if(autor != null && autores.contains(autor)) {
            autores.remove(autor);
        }
    }

    public void incluirCapitulo(int numero, String tituloCaptulo) {
        if (findCapituloByTitulo(tituloCaptulo) == null) {
            Capitulo capitulo = new Capitulo(numero, tituloCaptulo);
            capitulos.add(capitulo);
        }
    }

    public void excluirCapitulo(String tituloCap){
        if(tituloCap != null) {

            capitulos.remove(findCapituloByTitulo(tituloCap));

        }
    }

    public Capitulo findCapituloByTitulo(String capTitulo){

        for(Capitulo capitulo: capitulos ){
            if(capTitulo.equals(capitulo.getTitulo())){
                return capitulo;
            }
        }
        return null;
    }
}