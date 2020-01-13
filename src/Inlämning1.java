
import java.util.Scanner;

public class Inlämning1 {

	public static void main(String[] args) {
		// Här deklarerar jag två strängar och sen en scanner: "ordIn"
		String ord1;
		String ord2;
		int längd;
		Scanner ordIn = new Scanner(System.in);
		
		//Nu samlar jag in orden
		System.out.println("Skriv ett ord.");
		ord1 = ordIn.nextLine();
		
		System.out.println("Skriv ett till.");
		ord2 = ordIn.nextLine();
		
		//Nu konkateneras strängarna, längden räknas ut och skrivs ut på konsollen.
		String samlat = ord1 + " " + ord2;
		längd = samlat.length();
		
		System.out.println(samlat);
		System.out.println(längd);
		
		// Här stänger jag av scannern "ordIn"
		ordIn.close();
	}

}
