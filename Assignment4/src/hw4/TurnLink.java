package hw4;

import api.Point;
import api.PointPair;

/**
 * Models a fixed link with three paths. 
 * Extends AbstractLink class and implements
 * the Crossable and Traversable classes.
 * @author Declan Creadon
 *
 */
public class TurnLink extends AbstractLink {

	public TurnLink(Point P1, Point P2, Point P3) {
		super(new PointPair[] { new PointPair(P1, P3), new PointPair(P2, P1), new PointPair(P3, P1) });
	}

}
