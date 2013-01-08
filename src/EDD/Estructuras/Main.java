/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         PropertyConfigurator.configure("log4j.properties"); // se llama al archivo en el cual se declaran las propiedades.
        Ventana ven = new Ventana();
        ven.setVisible(true);
    }
}
