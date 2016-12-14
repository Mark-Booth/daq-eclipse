package org.eclipse.scanning.api.ui.auto;

/**
 * <pre>
 * Example:
 * <code>
 * 
	IModelDialog<SampleData> dialog = interfaceService.createModelDialog(getViewSite().getShell());
	dialog.setPreamble("Please define the sample data.");
	dialog.create();
	dialog.setSize(550,450); // As needed
	dialog.setText("Scan Area");
	dialog.setModel(sampleData);
	int ok = dialog.open();
    if (ok==Window.OK) {
		this.sampleData = dialog.getModel();
		// Do something with the newly edited model
	}
 * </code>
 * </pre>
 * 
 * 
 * @author Matthew Gerring
 *
 * @param <T> The model that the dialog edits
 */
public interface IModelDialog<T> {
	/**
	 * Standard return code constant (value 0) indicating that the window was
	 * opened.
	 *
	 * @see #open
	 */
	public static final int OK = 0;

	/**
	 * Standard return code constant (value 1) indicating that the window was
	 * canceled.
	 *
	 * @see #open
	 */
	public static final int CANCEL = 1;

	
	/**
	 * The model which we are editing
	 * @param model
	 * @throws exception if interface cannot be rendered from this model.
	 */
	void setModel(T model) throws InterfaceInvalidException;

	
	/**
	 * The model which we are editing
	 * @param model
	 */
	T getModel();


	/**
	 * Set the introduction to the model editor, used to help the user orientate what 
	 * they are doing, optional.
	 * @param preamble
	 */
	void setPreamble(String preamble);
	
	/**
	 * Call to create the Shell that the user interface will be shown on.
	 * This is required before setSize(...) and setText(...) are used.
	 */
	void create();
	
	/**
	 * Size of the dialog
	 * @param width
	 * @param height
	 */
	void setSize(int width, int height); // As needed
	
	/**
	 * Titlebar of the dialog shell
	 * @param label
	 */
	void setText(String label);
	
	/**
	 * Call 
	 * @return OK(0) if okay, CANCEL(1) if Cancelled
	 */
	int open();

	/**
	 * After the create method is called, the dialog will have a shell.
	 * @return
	 */
	T getControl();

}
