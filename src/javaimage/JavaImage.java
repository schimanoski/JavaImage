
package javaimage;

import interfaceimage.NewJFrame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaImage {

    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
        
    }
    
}
