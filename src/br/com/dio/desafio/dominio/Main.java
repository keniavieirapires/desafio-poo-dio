package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("\nCurso Java");
        curso1.setDescricao("\nCurso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("\nCurso Js");
        curso2.setDescricao("\nDescrição Curso de Js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("\nMentoria de Java");
        mentoria.setDescricao("\nMentoria do Curso de Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("\nBootcamp Java Developer");
        bootcamp.setDescricao("\nDescrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Camila: \n"+devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos Inscritos Camila: \n"+devCamila.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos Camila: \n"+devCamila.getConteudosConcluidos());
        System.out.println("\nXP: "+devCamila.calcularTotalXp());

        System.out.println("---------------");

        Dev devKenia = new Dev();
        devKenia.setNome("Kenia");
        devKenia.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Kenia: \n"+devKenia.getConteudosInscritos());
        devKenia.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos Inscritos Kenia: \n"+devKenia.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos Kenia: \n"+devKenia.getConteudosConcluidos());
        System.out.println("\nXP: "+devKenia.calcularTotalXp());



















    }

}
