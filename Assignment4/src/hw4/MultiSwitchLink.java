package hw4;

import api.PointPair;
/**
 * This class is designed to represent a link between multiple points in a train track.
 * It can also switch the connection between points. This class extends the 
 * AbstrackLink class and implements Crossable and Traversable.
 * @author Declan Creadon
 *
 */
public class MultiSwitchLink extends AbstractLink {
	private PointPair[] p;

	public MultiSwitchLink(PointPair[] linkTogether) {
		super(linkTogether);
		p = linkTogether;

	}

	public void switchConnection(PointPair pair, int index) {
		p[index] = pair;
	}
}
