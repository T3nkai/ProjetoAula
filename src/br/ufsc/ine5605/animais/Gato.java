package br.ufsc.ine5605.animais;
/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

public class Gato extends Mamifero{
    public Gato(){
        super(2, 2);
    }
    public String miar(){
        return super.produzirSom()+ " SOM: MIAU";
    }

}
