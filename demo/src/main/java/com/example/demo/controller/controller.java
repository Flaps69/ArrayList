package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static com.example.demo.service.service.*;

@SpringBootApplication
public class controller {

	public static void main(String[] args) {

		SpringApplication.run(controller.class, args);


		Scanner sc = new Scanner(System.in);

		//Se crea un ArrayList para guardar objetos de tipo Coche.

		System.out.println("Bienvenido al programa de prueba");

		while (true) {

			System.out.println("\nOPCIONES \n [1] Agregar coches  \n [2] Eliminar \n [3] Buscar" );
			System.out.println("Que accion desea realizar");
			int respuesta = sc.nextInt();


			if (respuesta == 1) {
				leerCoches();
			}
			if (respuesta == 2){
				eliminarCoche();
			}
			if (respuesta == 3){
				System.out.println("Busqueda por:\n [1] Coches \n [2] Orden Km \n [3] Marca");
				respuesta = sc.nextInt();
				if (respuesta == 1){
					System.out.println("Coches");
					mostrarCoches();
				} else if (respuesta == 2) {
					mostrarOrdenadosPorKm();
				} else if (respuesta == 3) {
					mostrarPorMarca();
				}
			}
		}
	}
}


