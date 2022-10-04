package paquete;

public class Variables {

	public static void main(String[] args) {
		// Variables sirven para almacenar informacion
		// Java es un lenguaje tipado. Las variables son de un 
		// tipo es decir, en una variable podemos almacenar un tipo
		// concreto de dato.
		// JS no es un lenguaje tipado
		/*
		 * Variables primitivas, guardamos la informacion dentro de
		 * de la variable
		 * 
		 */
          int numero = 5;
          System.out.println("La variable vale" + numero);
          numero = 10;
          System.out.println("La variable vale" + numero);
          boolean verdadero= true;
          long numnerosargos=12321212122L;
          double numeroDecimal = 123.456;
          char c= 'p';
          float numeroDecimalFloat = 123.456F;
          // float es mas pequeño que double
          // Varibales referencia
          /* En este tipo de variable No guardamos dentro el valor o la 
           * informacion, en este tipo de varibale guardamos 
           * la posicion de momeria donde se encuentra la informacion
           * es decir guardamos la posicion de memoria dl objeto.
           */
          String cadena = "Frase completa";
          
	}

}
