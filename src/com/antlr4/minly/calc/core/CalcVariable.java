package com.antlr4.minly.calc.core;

/**
 * Class base for Calc language variables
 * @author minlywang@foxmail.com
 * @since Apr 5, 2014
 * 
 */
public class CalcVariable extends CalcObject {

	private String variableName = null;
	private CalcValue	variableValue = null;
	
	/**
	 * Get a variable name
	 * @return String
	 */
	public String getVariableName() {
		return variableName;
	}
	
	/**
	 * Set a name for variable
	 * @param variableName
	 */
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
	
	/**
	 * Get a variable value
	 * @return St4ticValue
	 */
	public CalcValue getVariableValue() {
		return variableValue;
	}
	
	/**
	 * Set a value to variable
	 * @param variableValue
	 */
	public void setVariableValue(CalcValue variableValue) {
		this.variableValue = variableValue;
	}
	
}
