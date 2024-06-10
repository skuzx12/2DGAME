package Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class inputTastiera implements KeyListener {
	 private Main.PannelloGioco PannelloGioco;
	 
	 public inputTastiera(Main.PannelloGioco PannelloGioco){
		 this.PannelloGioco = PannelloGioco;
	 }
	 
     @Override
	 public void keyTyped(KeyEvent e) {}
     @Override
	 public void keyReleased(KeyEvent e) {}
     @Override
	 public void keyPressed(KeyEvent e) {
    	switch(e.getKeyChar()) {
    	case KeyEvent.VK_W:
    		
    	    break;
    	case KeyEvent.VK_A:
    		
    	    break;
    	case KeyEvent.VK_S:
    		
    	    break;
    	case KeyEvent.VK_D:
    		
    	    break;
    	 }
     }
	  
}
