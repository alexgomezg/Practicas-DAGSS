package solid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConverterApp {

    public static void main(String args[]) throws FileNotFoundException {
        UI mainUi = new UI();
        FileReader read = null;
        FileWriter writ = null;
        try {
            mainUi.showMessage("Nombre fichero entrada:");
            read = new FileReader(mainUi.getLine());
            mainUi.showMessage("Nombre fichero salida:");
            writ = new FileWriter(mainUi.getLine());
        } catch (FileNotFoundException filN) {
            System.err.print(filN);
        }
        try {
        TABtoXMLTransform tra = new TABtoXMLTransform();
        TextTransformer txt = new TextTransformer(read, writ, tra, "<products>", "</products>");
        txt.transform();
        }catch(Exception e){
            System.err.print(e);
        }
    }

}
