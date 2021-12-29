package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(100);

        Curso curso2 = new Curso();
        curso2.setTitulo("POO");
        curso2.setDescricao("Curso de POO");
        curso2.setCargaHoraria(100);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp de Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso2);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.InscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos()+"\n");

        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
         // dev1.progredir(); // se ativar vai lançar exceção


        System.out.println("Conteudos Concluidos" + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Atualizados" + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("-----------------------------------------------------");



        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.InscreverBootcamp(bootcamp);


        System.out.println("Conteudos Inscritos" + dev2.getConteudosInscritos() + "\n");

        dev2.progredir();

        System.out.println("Conteudos Concluidos" + dev2.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Atualizados" + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXP());







    }
}
