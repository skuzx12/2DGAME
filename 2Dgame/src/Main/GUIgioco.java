package Main;

import javax.swing.JFrame;

public class GUIgioco extends JFrame {
	
	public GUIgioco (PannelloGioco PannelloGioco){
		JFrame Finestra = new JFrame();
		
		Finestra.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Finestra.add(PannelloGioco);
		Finestra.setLocationRelativeTo(null);
		Finestra.setResizable(false);
		Finestra.pack();
		Finestra.setVisible(true);
		
	}
	
	
	
	
	
	
}
