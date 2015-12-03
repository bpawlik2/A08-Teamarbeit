package kpp; //Eine Zusammenarbeit von Piasecki,Pawlik,Kopanski

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Martin Piasecki
 *
 */
public class Klasse3 {
	// Attribute
	private ArrayList<Integer> list;

	/**
	 * Initialisiert die Werte (Konstruktor)
	 */
	public Klasse3() {
		list = new ArrayList<Integer>();
	}

	/**
	 * Added Zahlen zur Liste
	 * 
	 * @param i
	 */
	public void add(int i) {
		list.add(i);
	}

	/**
	 * Gibt das Maximum von beliebig vielen Werten zurück.
	 * 
	 * @param list
	 * @return
	 */
	public int max() {
		Collections.sort(list);
		return list.get(list.size() - 1);
	}

	/**
	 * Gibt das Minimum von beliebig vielen Werten zurück.
	 * 
	 * @param list
	 * @return
	 */
	public int min() {
		Collections.sort(list);
		return list.get(0);
	}

	/**
	 * Summiert das Minimum und das Maximum
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public int summe() {
		Collections.sort(list);
		int summe = list.get(0) + list.get(list.size() - 1);
		return summe;
	}

}
