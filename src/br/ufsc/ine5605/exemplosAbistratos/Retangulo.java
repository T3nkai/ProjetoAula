package br.ufsc.ine5605.exemplosAbistratos;


/**
 *
 * @author leand
 */
public class Retangulo extends Figura implements IArmazenar{

    private int lado1;
    private int lado2;

    public Retangulo(float tamanho, int lado1, int lado2) {
        super(tamanho);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public float calculaArea() {
        return lado1 * lado2;
    }

    @Override
    public void desenho() {
        System.out.println("Desenho de um retangulo");
    }


    @Override
    public void gravar() {
        System.out.println("Gravou no banco");
    }

    @Override
    public IArmazenar recupera() {
        System.out.println("Recpera do banco");
        return this;
    }
}
