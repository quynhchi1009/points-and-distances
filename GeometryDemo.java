package edu.hm.cs.bka.dev2.geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * Beispiel für Verwendung von GeometryHelper.
 */
public class GeometryDemo {

  /**
   * Demo-Programm.
   *
   * @param args wird nicht verwendet
   */
  public static void main(String[] args) {
    List<Point> points = new ArrayList<Point>();
    points.add(new Point(-1, -1));
    points.add(new Point(1, 3));
    points.add(new Point(7, 7));
    points.add(new Point(6, -2));
    points.add(new Point(2, 2));
    points.add(new Point(4, 0));

    List<Point> closePoints = GeometryHelper.pointsInDistance(new Point(2, 2), 7, points);
    // Sollte dichte Punkte ausgeben in Reihenfolge:
    // (2,2), (1,3), (4,0), (-1,-1), (6,-2)
    System.out.println(closePoints);

  }
}
