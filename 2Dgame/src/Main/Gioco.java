package Main;


public class Gioco implements Runnable  {
	
	private PannelloGioco PannelloGioco;
	private GUIgioco GUIgioco;
	private Thread ThreadGioco;
	private final int SET_FPS = 144;
	
	public Gioco(){
		PannelloGioco = new PannelloGioco();
		GUIgioco = new GUIgioco(PannelloGioco);
		PannelloGioco.requestFocus();
		IniziaLoopGioco();
	}
	
	private void IniziaLoopGioco() {
	 ThreadGioco = new Thread(this);
	 ThreadGioco.start();
		}
	 


	@Override
	public void run() {
	  double tempoPerFrame = 1000000000.0 / SET_FPS;
	  long UltimoFrame = System.nanoTime();
	  long tempoOra = System.nanoTime();
	  
	  int NumFps = 0;
	  long UltimoControllo = System.currentTimeMillis();
	  
	  
	  while(true) {
		    tempoOra = System.nanoTime();
			if(tempoOra - UltimoFrame >= tempoPerFrame) {
				
				PannelloGioco.repaint();
				UltimoFrame = tempoOra;
				NumFps++;
			}
			 
			  if(System.currentTimeMillis() - UltimoControllo >= 1000) {
				  UltimoControllo = System.currentTimeMillis();
				  System.out.println("Il numero di fps è" + " " + NumFps);
				  NumFps = 0;
				  
			    }
		}
		
	}
		

	
}

