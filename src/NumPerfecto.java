/*
Un número perfecto es un entero positivo, que es igual a la suma de todos los
enteros positivos (excluido el mismo) que son divisores del número. El primer
número perfecto es 6, ya que los divisores de 6 son 1, 2 y 3 y 1+2+3=6.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumPerfecto {

	public static String leercadena(){
		String cad="";
		BufferedReader br;
		br=new BufferedReader (new InputStreamReader(System.in));
		try{
			cad=br.readLine();
		} catch (IOException e){e.printStackTrace();}
		return cad;
	}
	
	public static int leernumero() {
		
		String cad=leercadena();
		return Integer.parseInt(cad);
	}
		
	public static boolean esdivisor(int num, int d) {
		
		return (num%d==0)? true : false; 
	}
	
	public static int sumadivisores(int num) {
		
		int suma=1;
		for(int i=2;i<num;i++) {
			if (esdivisor(num,i)) {
				suma += i;
			}
		}
		return suma;
	}
	
	public static void calcularnperfectos(int limite) {
		int sumad;
		
		for (int i=2;i<limite;i++) {
			sumad=sumadivisores(i);
			if (sumad==i) {
				System.out.print(i+ " ");
			}
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
	
		int n;
		
		System.out.println("Cálculo numeros perfectos: ");
		System.out.print("Limite de cálculo: ");
		n=leernumero();
		if (n>0) {
			calcularnperfectos(n);
		}else {
			System.out.println("¡limite no válido!");
		}
	}

}
