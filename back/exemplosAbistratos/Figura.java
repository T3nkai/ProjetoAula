package br.ufsc.ine5605.ExemplosAbstratos;

/**
 *
 * @author leand
 */
public abstract class Figura {
    private float tamanho;

    public Figura (float tamanho){
        this.tamanho = tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public float getTamanho(){
        return tamanho;
    }
    public abstract void desenho();
}
