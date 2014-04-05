package com.antlr4.minly.calc.core;

/**
 * Class base of all Calc language classes
 * 
 * @author minlywang@foxmail.com
 * @since Apr 5, 2014
 * 
 */
public class CalcObject {

	private CalcObject parent = null;

	/**
	 * void constructor
	 * 
	 */
	public CalcObject() {
		// nothing ...
	}

	/**
	 * Constructor with parent object
	 * 
	 * @param parent
	 */
	public CalcObject(CalcObject parent) {
		this.parent = parent;
	}

	/**
	 * Get an object parent
	 * 
	 * @return St4ticObject
	 */
	public CalcObject getParent() {
		return parent;
	}
}
