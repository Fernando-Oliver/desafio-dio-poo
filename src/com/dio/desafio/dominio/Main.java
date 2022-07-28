package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();

		curso1.setTitulo("Java");
		curso1.setDescricao("Curso java");
		curso1.setCargaHoraria(8);
//		System.out.println(curso1);

		Curso curso2 = new Curso();

		curso1.setTitulo(" js");
		curso1.setDescricao("Curso js");
		curso1.setCargaHoraria(4);
//		System.out.println(curso2);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mneotia js");
		mentoria1.setDescricao("descrição mentoria js");
		mentoria1.setData(LocalDate.now());
//		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devFernando = new Dev();
		devFernando.setNome("Fernando");
		devFernando.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Fernando: " +devFernando.getConteudoInscrito());
		System.out.println("---------------");
		devFernando.progredir();
		System.out.println("Conteúdos inscritos Fernando: " +devFernando.getConteudoInscrito());
		System.out.println("---------------");
		System.out.println("Conteúdos concluidos Fernando: " + devFernando.getConteudoConcluido());
		System.out.println("XP: " + devFernando.calcularTotalXp());
		
		System.out.println("---------------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Camila: " +devCamila.getConteudoInscrito());
		System.out.println("---------------");
		devCamila.progredir();
		System.out.println("Conteúdos inscritos Camila: " +devCamila.getConteudoInscrito());
		System.out.println("---------------");
		System.out.println("Conteúdos concluidos Camila: " + devCamila.getConteudoConcluido());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		
	}

}
