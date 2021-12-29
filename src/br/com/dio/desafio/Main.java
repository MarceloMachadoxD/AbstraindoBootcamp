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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp de Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.InscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.InscreverBootcamp(bootcamp);


        System.out.println("Conteudos Inscritos" + dev2.getConteudosInscritos());





    }
}
