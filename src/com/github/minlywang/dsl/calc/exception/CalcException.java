package com.github.minlywang.dsl.calc.exception;

/**
 * Exception base of all Calc language exception
 * 
 * @author Jake.Wang@bstek.com
 * @since Apr 7, 2014
 * 
 */
public class CalcException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CalcException(String message) {
		super(message);
	}

}
