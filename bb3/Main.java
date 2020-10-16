/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb3;

import javax.swing.JFrame;

/**
 *
 * @author Soma
 */
public class Main {
   // Entry main program
   public static void main(String[] args) {
      // Run UI in the Event Dispatcher Thread (EDT), instead of Main thread
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            JFrame frame = new JFrame("Bouncy Balls game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new BallWorld(640, 480)); // BallWorld is a JPanel
            frame.pack();            // Preferred size of BallWorld
            frame.setVisible(true);  // Show it
         }
      });
   }
}