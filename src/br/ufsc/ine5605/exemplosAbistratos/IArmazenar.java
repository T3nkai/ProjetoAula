package br.ufsc.ine5605.exemplosAbistratos;

public interface IArmazenar {
    public void gravar();

    public IArmazenar recupera();
}
