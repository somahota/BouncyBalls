/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb3;

/**
 *
 * @author Soma
 */
import javax.swing.JApplet;
/**
 * Main Program to run as an applet.
 * The display area shall be 640x480.
 * 
 * @author Hock-Chuan Chua
 * @version October 2010
 */
public class MainApplet extends JApplet {
   @Override
   public void init() {
      // Run UI in the Event Dispatcher Thread (EDT) instead of the main thread.
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            setContentPane(new BallWorld(640, 480)); // BallWorld is a JPanel
         }
      });
   }
}
