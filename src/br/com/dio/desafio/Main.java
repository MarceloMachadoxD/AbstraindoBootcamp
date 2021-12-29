package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(100);
        System.out.println(curso);



    }
}
