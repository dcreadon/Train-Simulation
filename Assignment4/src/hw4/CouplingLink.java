package hw4;


import api.Point;
import api.PointPair;



/**
* The CouplingLink class represents a link between two points. 
* It is an implementation of the AbstractLink class and implements 
* the Crossable interface.
* @author Declan Creadon
*/
public class CouplingLink extends AbstractLink {
	public CouplingLink(Point p1, Point p2) {
		super(new PointPair[] { new PointPair(p1, p2), new PointPair(p2, p1) });
	}
}
