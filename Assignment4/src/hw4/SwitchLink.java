package hw4;

import api.Point;
import api.PointPair;
/**
 * Models a switchable link with three paths. A boolean turn
 * determines which path trains take. Extends the AbstractLink class
 * and implements crossable and traversable classes. 
 * @author Declan Creadon
 *
 */
public class SwitchLink extends AbstractLink {

	private boolean turn;
	private Point p3;
	private Point p1;
	private Point p2;
	


	public SwitchLink(Point p1, Point p2, Point p3) {
		super(new PointPair[] { new PointPair(p1, p2), new PointPair(p3, p1), new PointPair(p2, p3) });
		this.p1 = p1;
		this.p3 = p3;
		this.p2 = p2;

	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	@Override
	public Point getConnectedPoint(Point p) {
		if (p == p1 && !turn) {
			return p2;
		} else if (p == p1 && turn) {
			return p3;
		} else if (p == p3) {
			return p1;
		} else if (p == p2) {
			return p1;
		}
		return null;
	}
}
