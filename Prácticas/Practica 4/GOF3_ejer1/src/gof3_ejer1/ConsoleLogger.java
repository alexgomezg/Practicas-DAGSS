/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alex
 */
package gof3_ejer1;

public class ConsoleLogger extends Logger{
		
	public ConsoleLogger(Logger l,int p) {
		super(l,p);
	}

	protected void _log(String msg, int prior) {
		System.out.println(msg);

	}
}
