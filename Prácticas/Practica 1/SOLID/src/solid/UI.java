/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class UI {

    public UI() {
    }
    public void showMessage(String line){
        System.out.println(line);
    }
    public String getLine(){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        return line;
    }
}
