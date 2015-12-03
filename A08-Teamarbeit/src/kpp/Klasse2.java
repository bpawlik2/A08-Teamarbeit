package kpp;
// Eine Zusammenarbeit von Kopanski, Pawlik, Piasecki

/**
 * Volumen von einigen K�rpern werden asgerechnet
 * 
 * @author Bernhard Pawlik
 * @version 30.11.2015
 */
public class Klasse2 {

	/**
	 * Volumen einer Pyramide
	 * 
	 * @since 30.11.2015
	 * @param a
	 *            1.Seite
	 * @param b
	 *            2.Seite
	 * @param h
	 *            H�he
	 * @return
	 */
	double pyramide(double a, double b, double h) {
		double V;
		V = (a * b * h) / 3;
		return V;
	}

	/**
	 * Volumen eines Kegels
	 * 
	 * @since 30.11.2015
	 * @param r
	 *            Radius
	 * @param h
	 *            H�he
	 * @return
	 */
	double kegel(double r, double h) {
		double V;
		V = (r * r * Math.PI * h) / 3;
		return V;
	}

	/**
	 * Volumen eines Quaders
	 * 
	 * @since 30.11.2015
	 * @param a
	 *            1.Seite
	 * @param b
	 *            2.Seite
	 * @param h
	 *            H�he
	 * @return
	 */
	double quader(double a, double b, double h) {
		double V;
		V = a * b * h;
		return V;
	}

}
