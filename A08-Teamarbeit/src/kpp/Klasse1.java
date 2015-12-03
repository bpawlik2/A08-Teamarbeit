package kpp;
/**
 * Berechnung des Flaecheninhaltes von einem Rechteck, Kreises und Dreiecks
 * 
 * @author Jakub Kopanski
 * @version 30.11.2015
 */
public class Klasse1 {
	
	/**
	 * Flaecheninhalt von einem Rechteck wird berechnet
	 * 
	 * @param a Seite
	 * @param b Seite
	 * @return Flaecheninhalt
	 */
	double rechteck(double a, double b){
		double A;
		A = a*b;
		return A;
	}
	/**
	 * Flaecheninhalt von einem Kreis wird berechnet
	 * 
	 * @param r Radius
	 * @return Flaecheninhalt
	 */
	double kreis(double r){
		double A;
		A = (r*r)*Math.PI;
		return A;
		
	}
	/**
	 * Flaecheninhalt von einem Dreieck wird berechnet
	 * 
	 * @param a Seite 
	 * @param ha Hoehe
	 * @return Flaecheninhalt
	 */
	double dreieck(double a,double ha){
		double A;
		A = (a*ha)/2;
		return A;
		
	}
}
