package br.ufsc.ine5605;

import br.ufsc.ine5605.ExemplosAbstratos.IArmazenar;
import br.ufsc.ine5605.ExemplosAbstratos.Circulo;

import br.ufsc.ine5605.ExemplosAbstratos.Figura;
import br.ufsc.ine5605.ExemplosAbstratos.Retangulo;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Figura figura;
        Retangulo retangulo;
        Circulo circulo;

        retangulo = new Retangulo(1.0f, 2, 3);
        circulo = new Circulo(2.0f, 1.5f);

        figura = new Retangulo(2.0F, 5, 3);
        //figura = new Circulo(1.0f, 3.0f);
        //           System.out.println("Area ratangulo: " + retangulo.calculaArea());
        //           System.out.println("Area Figura: " + ((Retangulo)figura).calculaArea());

        figura.desenho();

        ArrayList<IArmazenar> armazenavels =  new ArrayList<>();
        armazenavels.add(retangulo);

        for (IArmazenar armazenavel : armazenavels) {
            armazenavel.gravar();
            armazenavel.recupera();
        }
    }
}

