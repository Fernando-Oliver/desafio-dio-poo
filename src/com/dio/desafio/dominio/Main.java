package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();

		curso1.setTitulo("Java");
		curso1.setDescricao("Curso java");
		curso1.setCargaHoraria(8);
		System.out.println(curso1);

		Curso curso2 = new Curso();

		curso1.setTitulo(" js");
		curso1.setDescricao("Curso js");
		curso1.setCargaHoraria(4);
		System.out.println(curso2);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mneotia js");
		mentoria1.setDescricao("descrição mentoria js");
		mentoria1.setData(LocalDate.now());
		System.out.println(mentoria1);
	}

}
