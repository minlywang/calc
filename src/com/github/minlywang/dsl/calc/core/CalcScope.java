/**
 * Copyright (c) 2014 Jake Wang
 * https://github.com/minlywang/calc
 *
 * Licensed under MIT
 * http://www.opensource.org/licenses/mit-license.php
 */
package com.github.minlywang.dsl.calc.core;

import java.util.Hashtable;

/**
 * Class base for scopes or blocks between ( do ... stop )
 * 
 * ... something ... do "here ... stop
 * 
 * like if or while statement
 * 
 * @author minlywang@foxmail.com
 * @since Apr 5, 2014
 * 
 */
public class CalcScope extends CalcObject {

	private Hashtable<String, CalcVariable> childs = new Hashtable<String, CalcVariable>();

	/**
	 * Constructor for setting up parent
	 * 
	 * @param parent
	 */
	public CalcScope(CalcObject parent) {
		super(parent);
	}

	/**
	 * return a childs hash
	 * 
	 * @return
	 */
	public Hashtable<String, CalcVariable> getChilds() {
		return childs;
	}

	/**
	 * Add a child (variable) to scope for variable lifecycle and variable
	 * visibility
	 * 
	 * @param name
	 * @param child
	 * @return boolean
	 */
	public boolean pushChild(String name, CalcVariable child) {
		return this.childs.put(name, child) != null;
	}

	/**
	 * Return a child by name, fetching finding in current scope and parents
	 * 
	 * @param name
	 * @return St4ticVariable
	 */
	public CalcVariable child(String name) {
		return child(name, this);
	}

	/**
	 * ;) closure for finding a variable by name
	 * 
	 * @param name
	 * @param scope
	 * @return St4ticVariable
	 */
	private CalcVariable child(String name, CalcScope scope) {
		if (scope.getChilds().containsKey(name)) {
			return scope.getChilds().get(name);
		} else if (scope.getParent() != null && scope.getParent() instanceof CalcScope) {
			return child(name, (CalcScope) scope.getParent());
		}
		return null;
	}

	/**
	 * Check existens of variables
	 * 
	 * @param name
	 * @return boolean
	 */
	public boolean existsChild(String name) {
		return existsChild(name, this);
	}

	/**
	 * ;) closure for finding a variable by name
	 * 
	 * @param name
	 * @param scope
	 * @return boolean
	 */
	private boolean existsChild(String name, CalcScope scope) {
		if (scope.getChilds().containsKey(name)) {
			return true;
		} else if (scope.getParent() != null && scope.getParent() instanceof CalcScope) {
			return existsChild(name, (CalcScope) scope.getParent());
		}
		return false;
	}
}
