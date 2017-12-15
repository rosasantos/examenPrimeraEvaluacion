import java.util.Scanner;


/**
 
 */


public class Numero {
	
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Introduzca el valor del primer número, mayor que cero y menor que mil");
	int n1=sc.nextInt();
	System.out.println("Introduzca el valor del segundo número, mayor que cero y menor que mil");	
	int n2=sc.nextInt();	
	sc.close();
	
	if(mayorQueCeroMenorQueMil(n1, n2)){
		System.out.println("Son corrrectos los números");
	
	}	
	else{System.out.println("Los números introducidos no cumplen la condición de ser mayores que cero y menores que mil.");
	}	

  }
	
	public static boolean mayorQueCeroMenorQueMil(int n1, int n2){
	boolean si=false;
	
	  if((n1>0 && n1<1000)&&(n2>0 &&n2<1000)){
	     si=true;	
	  }
	
	return si;
	}
	
	
	
 	
}

