package hw4;

import api.PointPair;
/**
 * Models a link with a minimum of 2 to a maximum of 6 paths.
 * Extends AbstractLink and implements Crossable and Traversable.
 * @author Debow
 *
 */
public class MultiFixedLink extends AbstractLink {
	public MultiFixedLink(PointPair[] linkTogether) {
		super(linkTogether);
	}
}
