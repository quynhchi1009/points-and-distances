package edu.hm.cs.bka.dev2.geometry;

import java.util.Collections;
import java.util.Comparator;

/**
 * Comparator (Vergleicher) für zwei Punkte. Die Ordnung der Punkte soll dabei dem Abstand von einem
 * festen Punkt (Mittelpunkt) entsprechen.
 *
 * <p>Achtung: Streng genommen sollte der Comparator für Punkte mit gleichem Abstand auch
 * eine Ordnungdefinieren, z.B. nach X- und Y-Wert sortieren. Soll nur sortiert werden, reicht
 * aber eine "Ordnung" nach Entfernung.
 */
public class DistanceComparator implements Comparator<Point> {

  public Point mittelpunkt;

  public DistanceComparator(Point mittelpunkt) {
    this.mittelpunkt = mittelpunkt;
  }

  // TODO: Instanzvariable und Konstruktor ergänzen!


  @Override
  public int compare(Point o1, Point o2) {
    if (o1.distanceTo(mittelpunkt) < o2.distanceTo(mittelpunkt)) {
      //-1 zurückgibt, wenn o1 dichter am Mittelpunkt liegt als o2
      return -1;
    } else if (o1.distanceTo(mittelpunkt) > o2.distanceTo(mittelpunkt)) {
      //– 1 zurückgibt, wenn o1 weiter vom Mittelpunkt entfernt liegt als o2
      return 1;
    } else if (o1.distanceTo(mittelpunkt) == o2.distanceTo(mittelpunkt)) {
      //– 0 zurückgibt, wenn beide gleich weit entfernt liegen
      return 0;
    } else {
      return 0;
    }
  }
}
