package kpp;

/**
 * @author Bernhard Pawlik
 * @version 30.11.2015
 */
public class Test {

	private Klasse1 kl1 = new Klasse1();
	private Klasse2 kl2 = new Klasse2();
	private Klasse3 kl3 = new Klasse3();

	/**
	 * Konstruktor, hier werden die Tests durchgeführt
	 * 
	 * @since 30.11.2015
	 */
	Test() {
		testKlasse1();
		System.out.println();
		testKlasse2();
		System.out.println();
		testKlasse3();
	}

	/**
	 * testet Klasse 1
	 * 
	 * @since 30.11.2015
	 */
	void testKlasse1() {
		System.out.println("Rechteck");
		System.out.println("	" + kl1.rechteck(4.0, 5.0));
		System.out.println("	" + kl1.rechteck(15.3, 17.8));
		System.out.println("Kreis");
		System.out.println("	" + kl1.kreis(7.0));
		System.out.println("	" + kl1.kreis(13.4));
		System.out.println("Dreieck");
		System.out.println("	" + kl1.dreieck(6.0, 8.0));
		System.out.println("	" + kl1.dreieck(8.6, 13.5));
	}

	/**
	 * testet Klasse 2
	 * 
	 * @since 30.11.2015
	 */
	void testKlasse2() {
		System.out.println("Pyramide");
		System.out.println("	" + kl2.pyramide(10.0, 5.0, 7.0));
		System.out.println("	" + kl2.pyramide(4.3, 5.6, 8.4));
		System.out.println("Kegel");
		System.out.println("	" + kl2.kegel(4.0, 5.0));
		System.out.println("	" + kl2.kegel(6.8, 12.9));
		System.out.println("Quader");
		System.out.println("	" + kl2.quader(5.0, 8.0, 4.0));
		System.out.println("	" + kl2.quader(7.9, 14.2, 3.4));
	}

	/**
	 * testet Klasse 3
	 * 
	 * @since 30.11.2015
	 */
	void testKlasse3() {
		kl3.add(2);
		kl3.add(7);
		kl3.add(5);
		System.out.println("Minimum");
		System.out.println("	" + kl3.min());
		System.out.println("Maximum");
		System.out.println("	" + kl3.max());
		System.out.println("Summe");
		System.out.println("	" + kl3.summe());
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Test t = new Test();
	}

}
