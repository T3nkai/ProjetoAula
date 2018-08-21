package br.ufsc.ine5605.animais;

/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

public class Canarinho extends Ave{

    public Canarinho(int tamanhoPasso, int alturaVoo){
        super(tamanhoPasso, alturaVoo);
    }

    public String cantar(){
        return super.produzirSom()+ "PIU";
    }

}

