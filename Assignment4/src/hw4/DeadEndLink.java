package hw4;

import api.PointPair;
import api.PositionVector;
/**
 * This class represents a dead-end link in the train tracks. 
 * @author Debow
 *
 */
public class DeadEndLink extends AbstractLink {
	public DeadEndLink() {
		super(new PointPair[] { new PointPair(null, null) });
	}

	public void shiftPoints(PositionVector positionVector) {
	}
}
