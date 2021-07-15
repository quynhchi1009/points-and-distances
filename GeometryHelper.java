package edu.hm.cs.bka.dev2.geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * Hilfsklasse für Geometrische Berechnungen.
 */
public class GeometryHelper {

  /**
   * Liefert alle Punkte innerhalb eines gegebenen Radius um einen vorgegebenen Punkt.
   *
   * @param center Mittelpunkt
   * @param radius Radius
   * @param points zu durchsuchende Punkte
   * @return Punkte im Radius um den Mittelpunkt, sortiert nach Entfernung vom Mittelpunkt
   */
  public static List<Point> pointsInDistance(Point center, double radius, List<Point> points) {
    List<Point> result = new ArrayList<>();

    // TODO: Punkte auswählen
    for (Point point : points) {
      if (point.distanceTo(center) <= radius) {
        result.add(point);
      }
    }
    // TODO: Rückgabe sortieren (Teilaufgabe 2)
    result.sort(new DistanceComparator(center));
    return result;
  }
}
