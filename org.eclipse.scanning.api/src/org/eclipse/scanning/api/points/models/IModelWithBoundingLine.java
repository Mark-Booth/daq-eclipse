package org.eclipse.scanning.api.points.models;

public interface IModelWithBoundingLine {

	public BoundingLine getBoundingLine();

	public void setBoundingLine(BoundingLine boundingLine);

	public int hashCode();

	public boolean equals(Object obj);

}