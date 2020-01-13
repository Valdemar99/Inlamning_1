
import java.util.Scanner;
import java.text.DecimalFormat;


public class Inlämning1b {
	/**
	 * Här är löneprogrammet som ska beräkna en anställds lön för veckan.
	 * Först frågar programmet efter ett namn, sedan timlön och antal timmar.
	 */

	public static void main(String[] args) {
		// Nu deklarerar jag strängar för namn och heltal för timmar och timlön
		String namn;
		double timlön;
		int antalTimmar;
		double lön;
		String avrundadLön;
		
		//Nu deklarer jag en skanner och ett decimalformat
		Scanner läsare = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		//Nu frågar jag om namn, timlön och antal timmar
		System.out.println("Vad är ditt namn?");
		namn = läsare.nextLine();
		
		System.out.println("Vad är din timlön?");
		timlön = läsare.nextDouble();
		
		System.out.println("Hur många timmar arbetade du förra veckan?");
		antalTimmar = läsare.nextInt();
		
		//Nu beräknas lönen
		lön = (double)timlön * antalTimmar;
		
		//Nu avrundar jag lönen, skriver namnet i versaler och skriver ut lönen.
		namn = namn.toUpperCase();
		avrundadLön = dec.format(lön);
		System.out.println(namn + ", du tjänade " + avrundadLön + " kr förra veckan.");
		
		
		//Nu stänger jag av scannern och decimalformatet
		läsare.close();
	}

}
