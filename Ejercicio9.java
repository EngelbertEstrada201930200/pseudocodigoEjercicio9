import java.util.*;
public class Ejercicio9 {


	public static void main (String[] args){

		int temp1, temp2;
		double suma1, suma2;
		double cant1, prom2, cant2;

	
		cant1 =0; 
		cant2 = 0;
		suma2 = 0;
		suma1 = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println ( " Ingrese el par de Temperatura (T1 y T2)");
		temp1 = entrada.nextInt();
		temp2 = entrada.nextInt();

		while ( temp1 > 0){

			if ( temp1 >= 5 && temp1 <= 15){

				suma1 = suma1+temp1;
				cant1 = cant1+1;

			} else if ( temp2 >= 5 && temp2 <= 15){

					suma2 = suma2+temp2;
					cant2 = cant2+1;
				}

			System.out.println ( " Ingrese el par de Temperatura (T1 y T2)");
		temp1 = entrada.nextInt();
		temp2 = entrada.nextInt();

		}

		prom2 = suma2/cant2 ;

		System.out.print (" El promedio de T1 es: " +suma1/cant1);
		System.out.print (" El promedio de T2 es: " + prom2);


	}
}