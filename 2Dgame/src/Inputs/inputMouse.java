package Inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class inputMouse implements MouseListener,MouseMotionListener{
    private Main.PannelloGioco PannelloGioco;
    
    
	public inputMouse(Main.PannelloGioco PannelloGioco) {
	  this.PannelloGioco = PannelloGioco;
	}
	
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse Trasportato");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Cliccato");	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Premuto");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Rilasciato");
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

}
