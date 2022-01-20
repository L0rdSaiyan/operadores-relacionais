/*

 Exercício de operadores relacionais. Operador que pode substituir, em alguns casos, as estruturas de controle condicionais If e Switch Case

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

    Scanner goku = new Scanner(System.in);
    
    int n1, n2;
    String r;

   System.out.println("Informe o primeiro número: ");
    n1=goku.nextInt();
     
     System.out.println("Informe o segundo número: ");
      n2=goku.nextInt();
      
      r = (n1>n2)?"O primeiro valor informado é o maior número.":"O segundo valor informado é o maior número";
      
      System.out.println(r);

	}
}