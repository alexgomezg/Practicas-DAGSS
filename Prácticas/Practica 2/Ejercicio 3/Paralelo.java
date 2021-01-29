/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof1_ejer3;

/**
 *
 * @author Alex
 */
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Paralelo extends Trabajo {

    public Paralelo() {
        super();
    }

    public void run() {

        ArrayList<Thread> hilosParalelo = new ArrayList<>();

        for (Runnable r : this.programas) {
            Thread t = new Thread(r);
            hilosParalelo.add(t);
            t.start();
        }

        for (Thread t : hilosParalelo) {
            try {
                t.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Paralelo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void addprograma(Runnable r) {
        super.addprograma(r);
    }
}
