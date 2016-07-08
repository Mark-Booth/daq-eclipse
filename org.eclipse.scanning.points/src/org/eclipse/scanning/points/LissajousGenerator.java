package org.eclipse.scanning.points;

import java.util.Iterator;

import org.eclipse.scanning.api.points.AbstractGenerator;
import org.eclipse.scanning.api.points.IPosition;
import org.eclipse.scanning.api.points.PointsValidationException;
import org.eclipse.scanning.api.points.models.LissajousModel;

public class LissajousGenerator extends AbstractGenerator<LissajousModel> {

	@Override
	public Iterator<IPosition> iteratorFromValidModel() {
		return new LissajousIterator(this);
	}

	@Override
	protected void validateModel() {
		if (model.getPoints() < 1) throw new PointsValidationException("Must have one or more points in model!");
	}

// Original implementation of createPoints() TODO delete this

//	@Override
//	public List<Point> createPoints() throws GeneratorException {
//
//		// Pick A and B so we will fill the bounding rectangle
//		double A = model.getBoundingBox().getWidth() / 2;
//		double B = model.getBoundingBox().getHeight() / 2;
//		double xCentre = model.getBoundingBox().getxStart() + A;
//		double yCentre = model.getBoundingBox().getyStart() + B;
//		// double maxRadius = Math.sqrt(radiusX * radiusX + radiusY * radiusY);
//
//		List<Point> pointList = new ArrayList<>();
//
//		// TODO work out if we should only allow closed paths?
//		// TODO need to calculate maxTheta needed to close the path.
//		double maxTheta = 20 * Math.PI;
//		double theta = 0;
//		while (theta <= maxTheta) {
//			double x = xCentre + A * Math.sin(model.getA() * theta + model.getDelta());
//			double y = yCentre + B * Math.cos(model.getB() * theta);
//			if (containsPoint(x, y)) {
//				pointList.add(new Point(-1, x, -1, y));  // TODO What are data indices?
//			}
//			theta += model.getThetaStep();
//		}
//		return pointList;
//	}

}
