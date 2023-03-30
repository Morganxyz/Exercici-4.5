import java.util.Scanner;

public class M4_Ex5_Daniel_Amat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		char operChar = ' ';
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escriu una xifra: ");
		num1 = entrada.nextInt();
		System.out.print("Escriu una altra xifra: ");
		num2 = entrada.nextInt();
		System.out.print("Ara escriu un operador entre els següents (+,-,*,/) : ");
		//oper = entrada.nextln();
		operChar = entrada.next().charAt(0);
	  
		if(operChar == '+') {
			System.out.print("El resultat de la suma del primer i segon nombre es: " + (num1 + num2));
		
		}else if (operChar == '-') {
			System.out.print("El resultat de la resta del primer i segon nombre es: " + (num1 - num2));
			
		}else if (operChar == '*') {
			System.out.print("El resultat de la resta de la multiplicacio del primer i segon nombre es: " + (num1 * num2));
			
		}else if (operChar == '/') {
			System.out.print("El resultat de la divisio del primer i segon nombre es: " + ((float)(num1 / num2)));
			
	} else {
		System.out.print("L´operador es incorrecte");
	}
	}
}
