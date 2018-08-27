package br.ufsc.ine5605.ExemplosAbstratos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leand
 */
public class Circulo extends Figura {

    private float raio;

    public Circulo(float tamanho, float raio) {
        super(tamanho);
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public void desenho() {
        System.out.println("Desenho de um circulo");
    }

}
