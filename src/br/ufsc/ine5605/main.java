package br.ufsc.ine5605;

import br.ufsc.ine5605.ExemploLists.Aluno;
import br.ufsc.ine5605.ExemplosAbstratos.IArmazenar;
import br.ufsc.ine5605.ExemplosAbstratos.Circulo;

import br.ufsc.ine5605.ExemplosAbstratos.Figura;
import br.ufsc.ine5605.ExemplosAbstratos.Retangulo;

import java.util.*;

public class main {

    public static void main(String[] args) {


         // Codigo para testa o exercicio da pasta exemplo abstratos

//        Figura figura;
//        Retangulo retangulo;
//        Circulo circulo;
//
//        retangulo = new Retangulo(1.0f, 2, 3);
//        circulo = new Circulo(2.0f, 1.5f);
//
//        figura = new Retangulo(2.0F, 5, 3);
//        //figura = new Circulo(1.0f, 3.0f);
//        //           System.out.println("Area ratangulo: " + retangulo.calculaArea());
//        //           System.out.println("Area Figura: " + ((Retangulo)figura).calculaArea());
//
//        figura.desenho();
//
//        ArrayList<IArmazenar> armazenavels =  new ArrayList<>();
//        armazenavels.add(retangulo);
//
//        for (IArmazenar armazenavel : armazenavels) {
//            armazenavel.gravar();
//            armazenavel.recupera();
//        }

        //---------------------------------------------------------//


        //sera usado o hashSet arraylist linkedlist map

        List<Aluno> arrayList = new ArrayList<>();
        List<Aluno> linkedList = new LinkedList<>();
        Set<Aluno> hashSet = new HashSet<>();
        Map<String, Aluno> hashMap = new HashMap<>();

        // gera erro de tipo incompativeis
//      Set<Aluno> outroArrayList = new ArrayList<>();


        //trabalhando com arrayList
        Aluno aluno1 = new Aluno("123");
        Aluno aluno2 = new Aluno("456");
        Aluno aluno3 = new Aluno("789");

        arrayList.add(aluno1);
        arrayList.add(aluno2);
        arrayList.add(aluno2);
        arrayList.add(aluno3);

        System.out.println("Imprimindo ArrayList -------");

        for (Aluno aluno : arrayList){
            System.out.println("Aluno: " + aluno.getMatricula());
        }
        //trabalhando com hashset
        hashSet.add(aluno1);
        hashSet.add(aluno2);
        hashSet.add(aluno2);
        hashSet.add(aluno3);

        System.out.println(" ");
        System.out.println("Imprimindo hashSet -------");

        for (Aluno aluno : hashSet){
            System.out.println("Aluno: " + aluno.getMatricula());
        }

        //trabalhando com linkedList
        linkedList.add(aluno1);
        linkedList.add(aluno2);
        linkedList.add(aluno2);
        linkedList.add(aluno3);

        System.out.println(" ");
        System.out.println("Imprimindo linkedList -------");

        for (Aluno aluno : linkedList){
            System.out.println("Aluno: " + aluno.getMatricula());
        }



        // trabalhando com hashMap

        hashMap.put(aluno1.getMatricula(),aluno1);
        hashMap.put(aluno2.getMatricula(),aluno2);
        hashMap.put(aluno2.getMatricula(),aluno2);
        hashMap.put(aluno3.getMatricula(),aluno3);

        System.out.println(" ");
        System.out.println("Imprimindo hashMap value -------");

        for (Aluno aluno : hashMap.values()){
            System.out.println("Aluno: " +aluno.getMatricula());
        }
        System.out.println(" ");
        System.out.println("Imprimindo hashMap keys -------");

        for (String matAluno : hashMap.keySet()){
            System.out.println("Aluno: " +matAluno);
        }


        System.out.println(" ");
        Aluno aluno = hashMap.get("123");

        System.out.println("Key do aluno 123: "+aluno.getMatricula());
    }
}

