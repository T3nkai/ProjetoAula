package br.ufsc.ine5605.ExercicioAnimais;

/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
public abstract class Ave extends Animal {

    private int alturaVoo;

    public Ave(int tamanhoPasso, int alturaVoo) {
        super(tamanhoPasso);
        setAlturaVoo(alturaVoo);
    }

    public int getAlturaVoo() {
        return this.alturaVoo;
    }

    public void setAlturaVoo(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }

    public String voar() {
        return mover();
    }

    public String mover() {
        return super.mover() + " VOANDO";
    }

    public String produzirSom() {
        return "AVE: " + super.produzirSom();
    }
}
