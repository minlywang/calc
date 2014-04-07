/**
 * Copyright (c) 2014 Jake Wang
 * https://github.com/minlywang/calc
 *
 * Licensed under MIT
 * http://www.opensource.org/licenses/mit-license.php
 */
package com.github.minlywang.dsl.calc.main;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.github.minlywang.dsl.calc.CalcLexer;
import com.github.minlywang.dsl.calc.CalcParser;
import com.github.minlywang.dsl.calc.Evaluator;

/**
 * Calculator
 * 
 * @author minlywang@foxmail.com
 * @since Apr 5, 2014
 * 
 */
public class Calculator {
	public static void main(String[] args) throws Exception {
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		CalcLexer lexer = new CalcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CalcParser parser = new CalcParser(tokens);
		ParseTree tree = parser.compilationUnit(); // parse

		Evaluator eval = new Evaluator();
		eval.visit(tree);
	}
}
