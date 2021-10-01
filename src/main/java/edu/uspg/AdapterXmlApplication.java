package edu.uspg;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterXmlApplication.class, args);

		Scanner scn = new Scanner(System.in);

		int opcion = 0;
		String nombre;
		String apellido;
		int carnet;
		String Fnacimiento;
		String direccion;

		char registroPost = 'n';

		do {

			System.out.println(" ");
			System.out.println("\t ---Menú para registrar datos---");
			System.out.println("Escriba el número de la acción a realizar");
			System.out.println("1. Ingresar datos Alumnos");
			System.out.println("2. Mostrar datos en XML");
			System.out.println("3. Mostrar datos en JSON");
			System.out.println("4. Salir");
			System.out.print("--Opción:");
			opcion = scn.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Por favor ingrese los datos solicitados:");

				do {

					System.out.println("   Ingrese nombre: ");
					System.out.print(" -");
					nombre = scn.next();

					System.out.println("   Ingrese apellido: ");
					System.out.print(" -");
					apellido = scn.next();

					System.out.println("   Ingrese carnet: ");
					System.out.print(" -");
					carnet = scn.nextInt();

					System.out.println("   Ingrese fecha de nacimiento: ");
					System.out.print(" -");
					Fnacimiento = scn.next();

					System.out.println("   Ingrese dirección: ");
					System.out.print(" -");
					direccion = scn.next();

					System.out.println("Datos registrados correctamente");

					System.out.println("  --¿Desa agregar algún otro dato? s/n");
					System.out.print("Respuesta: ");
					registroPost = scn.next().charAt(0);

				} while (registroPost == 's');

				break;

			case 2:

				System.out.println("\t---Datos XML---");

				break;

			case 3:

				System.out.println("\t---Datos JSON---");

			}

		} while (opcion != 4);

	}

}
