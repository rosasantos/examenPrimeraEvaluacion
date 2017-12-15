import java.util.Scanner;


/**
 Este programa recibe dos valores comprueba si son los esperados y ejecuta varios métodos
 * @author Rosa
 * @version 4.0
 */


public class Numero {
	
	public static void main (String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduzca el primer  número");
		int n1=sc.nextInt();
		System.out.println("Introduzca el segundo número");
		int n2=sc.nextInt();
		sc.close();
		
		if(mayorQueCeroMenorQueMil(n1, n2)){
			mayorDeLosDosNumeros(n1, n2);
		    diezPrimerosMultiplosDeTres(n2);
		    comprobarSiEsCapicua(n2);
			
		}
		else{System.out.println("Los números introducidos no cumplen la condicion de ser mayores que cero y menores de 1000");
			}
		
		
	}
	/**
	 * Método que comprueba si los números introducidos son mayores que cero y menores de mil
	 * @param n1 entero
	 * @param n2 entero
	 * @return si booleam
	 * */
	
	
	public static boolean mayorQueCeroMenorQueMil(int n1, int n2){
	boolean si=false;
	
	  if((n1>0 && n1<1000)&&(n2>0 &&n2<1000)){
	     si=true;	
	  }
	
	return si;
	}
		
	
	/**
	 * Método que comprueba cuál de los dos es el mayor
	 * @param n1 entero
	 * @param n2 entero
	 * */
	
	public static void  mayorDeLosDosNumeros(int n1, int n2){
    int mayor=n1;
       if(n2>mayor){
		 mayor=n2;
		 System.out.printf("El mayor de los dos números el  %2d%n  ",mayor );
		}
		else if(n2<mayor){
		  mayor=n1;	
		  System.out.printf("El mayor de los dos números es el: %2d%n ", mayor );	
		}
		else{
		  System.out.println("Los dos números son iguales " );
		}

	}
	
	
	/**
	 * Método que muestra los diez primeros múltiplos de tres del segundo número introducido
	 * @param n2 entero
	 * */
		
	public static void diezPrimerosMultiplosDeTres(int n2){
	int contador=0;
	 
	      for(int i=3; i<=n2; i=i+3){
			   if(contador<10){
                 contador++;
                 System.out.printf("El múltiplo de %d número %4d es:  %5d%n ", n2, contador, n2*i);	
		       } 
	     }
	  	
	}

	/**
	 * Método que comprueba si el segundo número es capicúa
	 * @param n2 entero
	 * */
	public static void comprobarSiEsCapicua(int n2){
	String nume2= Integer.toString(n2);	
	int contar=0;
	   for(int i=0; i<nume2.length(); i++){
	   
		   if(nume2.charAt(i)==nume2.charAt(nume2.length()-1-i)){
			contar++;
		   }
		}   
		   
	   if(contar==nume2.length()){
          System.out.printf("El numero %d si es capicúa", n2);  
	   }
	   else{
          System.out.printf("El numero %d%n  no es capicúa", n2); 
	   }
	   	
	}

	
}


