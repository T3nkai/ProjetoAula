package br.ufsc.ine5605.animais;

/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

public class Cachorro extends Mamifero {

    public Cachorro(){
        super(3,3);
    }
    public String latir(){
        return super.produzirSom()+ " SOM: AU";
    }
}
