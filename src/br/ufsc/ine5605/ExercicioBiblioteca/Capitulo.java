package br.ufsc.ine5605.ExercicioBiblioteca;

public class Capitulo {

    private int numero;
    private String titulo;

    public Capitulo(int numero, String titulo) {
        setTitulo(titulo);
        setNumero(numero);
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}