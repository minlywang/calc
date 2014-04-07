/**
 * Copyright (c) 2014 Jake Wang
 * https://github.com/minlywang/calc
 *
 * Licensed under MIT
 * http://www.opensource.org/licenses/mit-license.php
 */
package com.github.minlywang.dsl.calc.core;

/**
 * Class base of Calc values
 * 
 * @author minlywang@foxmail.com
 * @since Apr 5, 2014
 * 
 */
@SuppressWarnings("rawtypes")
public class CalcValue extends CalcObject {

	private Class type = null;
	private Object value = 0;

	/**
	 * Get a value class type
	 * 
	 * @return Class
	 */
	public Class getType() {
		if (type != null)
			return type;
		return int.class;
	}

	/**
	 * Set value class type
	 * 
	 * @param type
	 */
	public void setType(Class type) {
		this.type = type;
	}

	/**
	 * Get value as long (remember this language can operate just integers, if
	 * you don't know it please read the artile of this tutorial)
	 * 
	 * @return long
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * Set value as long
	 * 
	 * @param value
	 */
	public void setValue(Object value) {
		this.value = value;
	}
}
