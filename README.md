# points-and-distances

The method List<Point> pointsInDistance(Point center, double radius, List<Point> points) of the GeometryHelper class in the ...geometry package is to create a second list from a list of points in the plane containing exactly those points which have a maximum distance radius from a center point center. The returned list should contain these points in ascending distance from the center.

1.1 Selection of points in the radius:
- the method pointsInDistance(..) returns a list with the points in the given radius (initially without sorting)!
Hints:
- The distance calculation between two points is implemented in the distanceTo(..) method of the Point class.

1.2 Sorting the points in the return
The method Collections.sort(...) implements a sorting procedure. A list of numbers or a list of strings could be sorted directly (by size or alphabetically, respectively) with it. 
The package ...geometry contains a class DistanceComparator, which implements the required interface Comparator<Point>.
