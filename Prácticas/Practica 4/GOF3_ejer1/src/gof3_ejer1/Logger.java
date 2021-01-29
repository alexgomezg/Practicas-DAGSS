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

import java.io.File;

public abstract class Logger {

	final int DEBUG = 0;
	public static final int INFO = 1;
	final int ERROR = 2;
	private int threshold;
	private static Logger singleton;
	private Logger next;
	
	public static Logger getInstance() {
		
		if(singleton == null) {
			singleton = new ConsoleLogger(new FileLogger(null,INFO,new File("log.txt")),INFO);
		}
		
		return singleton;
	}
	
	public Logger(Logger next, int threshold) {
		this.next = next;
		this.threshold = threshold;
	}
	
	
	public void log(String msg,int prior) {//Template method
		
		if(prior >= threshold) {
			_log(msg,prior);
		}
		if(this.next != null)
			next.log(msg, prior);
	}
	
	protected abstract void _log(String msg,int prior);
}
