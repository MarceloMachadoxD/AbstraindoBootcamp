package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso("Java", "Java Avançado", 8);
        System.out.println(curso);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Java Avançado", LocalDate.now());

        System.out.println(mentoria);


    }
}
