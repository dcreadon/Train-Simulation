package hw4;


import api.Point;
import api.PointPair;


/**
 * Models a fixed link with three paths. 
 * Extends the AbstractLink class and also
 * implements crossable and traversable classes.
 * @author Declan Creadon
 *
 */
public class StraightLink extends AbstractLink {
	public StraightLink(Point p1, Point p2, Point p3) {
		super(new PointPair[] { new PointPair(p1, p2), new PointPair(p2, p1), new PointPair(p3, p1) });
	}
}
