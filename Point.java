package edu.hm.cs.bka.dev2.geometry;

import java.util.Objects;

/**
 * Repräsentation eines Punktes.
 */
public class Point {

  private final double xvalue;
  private final double yvalue;

  public Point(double xvalue, double yvalue) {
    this.xvalue = xvalue;
    this.yvalue = yvalue;
  }

  public double getX() {
    return xvalue;
  }

  public double getY() {
    return yvalue;
  }

  @Override
  public String toString() {
    return "(" + xvalue + "/" + yvalue + ")";
  }

  /**
   * Bestimmt die Entfernung zu einem anderen Punkt.
   *
   * @param other anderer Punkt
   * @return euklidische Entfernung
   */
  public double distanceTo(Point other) {
    double xdist = xvalue - other.xvalue;
    double ydist = yvalue - other.yvalue;
    return Math.sqrt(xdist * xdist + ydist * ydist);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point point = (Point) o;
    return Double.compare(point.xvalue, xvalue) == 0
        && Double.compare(point.yvalue, yvalue) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(xvalue, yvalue);
  }
}
