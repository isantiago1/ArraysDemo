package com.example;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Como se declara un Array variante 02
		int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

		// Array de nombres

		String[] nombres = { "Tamara", "Jessica", "Carlos", "Adrian", "Maria Lopez", "Maria Jose", "Rosa", "Pablo",
				"Ivan", "Marly" };

		// para mostrar los elementos del array de nombres por consola
		// Variante #1. Imprimer cada elemento del array, utilizando una funcion
		// println.
		System.out.println(nombres[0]);
		System.out.println(nombres[1]);
		System.out.println(nombres[2]);

		// como se puede apreciar la variante #1 no sirve para nada.

		// Variante #2.
		// Implica utilizar una sentencia de control de flujo para recorrer el Array.
		// y lo veremos en la rama "sentenciasDeControlDeFlujo"

		// Primero con una sentencia FOR (clasica)

		for (int i = 0; i < nombres.length; i++) { // i++ es lo mismo que (i= i+1) i++ operador incremento
			System.out.println(nombres[i]);
		}

		// ejercicio 1: solamente mostrar los nombres que tienen 4 caracteres

		System.out.println("-----------------");
		for (int i = 0; i < nombres.length; i++) { // i++ es lo mismo que (i= i+1) i++ operador incremento
			if (nombres[i].length() > 4) {
				System.out.println(nombres[i]);
			}
		}

		// que diferencia hay en utilizar o operador de autoincremento, o decremento,
		// antes o despues?
		// para solucionar este problema, clasico de cuando uno empieza con un lenguaje
		// de programacion
		// utilizaremos JSHELL, que es como un shell, que es como Shell de Pyton que
		// antes Java no tenia.

		// Segundo con un FOR mejorado, en ocasiones, Mal llamado FOR each (por cada)
		// y digo mal llamado, porque la sentencia for each existe, como veremos
		// posteriormente.

	}
}
