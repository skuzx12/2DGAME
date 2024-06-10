package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Inputs.inputMouse;
import Inputs.inputTastiera;

import static utilz.Costanti.ConstantiGiocatore.*;
import static utilz.Costanti.Direzioni.*;

public class PannelloGioco extends JPanel {
	private inputMouse inputMouse;

	private float xDelta = 100, yDelta = 100;
	private BufferedImage Immagine;
	private BufferedImage[][] Animazioni;
    private int TickAnimaz, VelocitaAnimaz = 15, IndiceAnimaz;
    private int AzioneGiocatore = FERMO;
	
	
	public  PannelloGioco() {
	 inputMouse inputMouse = new inputMouse(this);
	 
	 ImportaImmagine();
	 CaricaAnimazioni();
	 
	 setPanelSize();
     addKeyListener(new inputTastiera(this));
	 addMouseListener(inputMouse);
	 addMouseMotionListener(inputMouse);
	}
	
	
	private void CaricaAnimazioni() {
		Animazioni = new BufferedImage[9][6]; 
		
		for(int j = 0; j < Animazioni.length; j++)
		  for(int i = 0; i < Animazioni[j].length; i++)
			Animazioni[j][i] = Immagine.getSubimage(i*64, j*40, 64, 40);
			
		
	}


	private void ImportaImmagine() {
		InputStream is = getClass().getResourceAsStream("/SpritePersonaggioPrincipale.png");
		try {
			Immagine = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
	}

	
	private void setPanelSize() {
		Dimension dimensioniGUI = new Dimension(1280,800);
		setPreferredSize(dimensioniGUI);
	}
	
	
	private void AggiornaTickAnimazione() {
		TickAnimaz ++;
		if(TickAnimaz >= VelocitaAnimaz) {
			TickAnimaz = 0;
			IndiceAnimaz++;
			if(IndiceAnimaz >= NumeroDiSprite(AzioneGiocatore)) {
				 IndiceAnimaz = 0;
				
			}
			
		}
		
		
	}

	
	public void paintComponent(Graphics g){
	  super.paintComponent(g);
	  AggiornaTickAnimazione();
	  
	  g.drawImage(Animazioni[AzioneGiocatore][IndiceAnimaz], (int)xDelta, (int)yDelta, 256, 160, null);
	}
 
}
