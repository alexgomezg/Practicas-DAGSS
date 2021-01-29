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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileLogger extends Logger{
	
	private File f;
	
	public FileLogger(Logger l,int p,File f) {
		super(l,p);
		this.f = f;
	}

	@Override
	protected void _log(String msg, int prior) {
		PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream(f));			
			out.println(msg);
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
