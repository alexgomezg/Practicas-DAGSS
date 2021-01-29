/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author Alex
 */
public class TABtoXMLTransform implements Transform{
   
    public TABtoXMLTransform() {
    }
 
    @Override
    public String transform(String inputLine){
         String[] tokens = inputLine.split("\t");
        if (tokens.length != 2) {
            throw new IllegalArgumentException(
                    "the line does not contain 3 tokens");
        }
       return "<product>\n\t<name>" + tokens[0] + "</name>\n\t<price>"
                + tokens[1] + "</price>\n</product>";
    }
    
}
