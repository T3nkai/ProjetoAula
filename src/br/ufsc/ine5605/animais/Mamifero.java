package br.ufsc.ine5605.animais;
/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

public abstract class Mamifero extends Animal{
    private int volumeSom;

    public Mamifero(int volumeSom, int tamanhoPasso){
        super(tamanhoPasso);
        setVolumeSom(volumeSom);
    }

    @Override
    public String produzirSom(){
        return "MAMIFERO: " + super.produzirSom() + getVolumeSom();
    }

    public void setVolumeSom(int volumeSom){
        this.volumeSom = volumeSom;
    }

    public int getVolumeSom(){
        return this.volumeSom;
    }
}