/**
* Juego de adivinar un n�mero entre 0 y 100. Tienes cinco oportunidades
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int oportunidades = 5;
		int numeroIntroducido;
		boolean acertado = false;
		int numeroMisterioso = (int)(Math.random() * 101);
		System.out.println("Estoy pensando un n�mero del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");
		do {
		System.out.print("Introduce un n�mero: ");
		numeroIntroducido = sc.nextInt();
		oportunidades--;
		if ( (numeroIntroducido > numeroMisterioso) && (oportunidades > 0) ){
		System.out.println("El n�mero que estoy pensando es menor que " + numeroIntroducido);
		System.out.println("Te quedan " + oportunidades + " oportunidades.");
		}
		if ( (numeroIntroducido < numeroMisterioso) && (oportunidades > 0) ){
		System.out.println("El n�mero que estoy pensando es mayor que " + numeroIntroducido);
		System.out.println("Te quedan " + oportunidades + " oportunidades.");
		}
		if (numeroIntroducido == numeroMisterioso) {
		acertado = true;
		System.out.println("�Enhorabuena! �has acertado!");
		}
		} while (!acertado && (oportunidades > 0));
		if (!acertado) {
		System.out.println("Lo siento, no has acertado, el n�mero que estaba pensando era el "+ numeroMisterioso);
		}
		}
		}
