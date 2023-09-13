package hw4;

import api.Crossable;
import api.Path;
import api.Point;
import api.PointPair;
import api.PositionVector;

/**
 * I noticed that several classes in the codebase contained a PointPair[] array. 
 * To simplify and minimize the code, I proposed creating a super constructor in
 *  AbstractLink that would require all child classes to call it. Depending on 
 *  the class, the parameters for the super constructor would differ. By doing 
 *  this, the getNumPaths method in AbstractLink could be used by most classes 
 *  without the need for explicit implementation. Instead, they could rely on 
 *  the length of their PointPair array. This approach allows all classes to 
 *  inherit from AbstractLink and leverage its pre-defined methods.
 * @author Declan Creadon
 */
public abstract class AbstractLink implements Crossable {
	private PointPair[] PointPair; //created to hold the points
	private boolean IsTrainMoving = false; //used to indicate whether the train is moving or not

	/**
     * Shifts the points in the given PositionVector.
     * 
     * @param positionVector The PositionVector to shift the points for
     */
	@Override
	public void shiftPoints(PositionVector positionVector) {
		if (IsTrainMoving == false) {
			Point tempPoint = getConnectedPoint(positionVector.getPointB());
			positionVector.setPointA(tempPoint);
			Path tempPath = tempPoint.getPath();
			Point pathP1 = tempPath.getPointByIndex(0);
			Point pathP2 = tempPath.getPointByIndex(tempPath.getNumPoints() - 1);

			if (tempPoint.equals(pathP1)) {
				positionVector.setPointB(tempPath.getPointByIndex(1));
			} else {
				positionVector.setPointB(pathP2);
			}
		}

	}

	/**
     * Constructs a new AbstractLink object with the specified PointPairs.
     * 
     * @param ptpairs The array of PointPairs used to construct this link
     */
	protected AbstractLink(PointPair[] ptpairs) {
		this.PointPair = ptpairs;
	}

	 /**
     * 
     * @param index The index of the PointPair to retrieve
     * @return The PointPair at the specified index
     */
	protected PointPair getPointPair(int index) {
		return PointPair[index];

	}

	/**
     * 
     * @param point The point to find the connected point for
     * @return The connected point to the given point, or null if no connection exists
     */
	@Override
	public Point getConnectedPoint(Point point) {
		for (PointPair p : PointPair) {
			if (p.getPointA() == point) {
				return p.getPointB();
			}
		}
		return null;
	}

	 /**
     * Signals that a train has entered the crossing.
     */
	@Override
	public void trainEnteredCrossing() {
		IsTrainMoving = true;

	}

	/**
     * Signals that a train has exited the crossing.
     */
	@Override
	public void trainExitedCrossing() {
		IsTrainMoving = false;

	}

	/**
     * 
     * @return The number of paths in this link
     */
	@Override
	public int getNumPaths() {
		return PointPair.length;
	}

}
