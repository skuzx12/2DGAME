package utilz;

public class Costanti {
	
	public static class Direzioni {
		public static final int SINISTRA = 0;
		public static final int SU = 0;
		public static final int DESTRA = 0;
		public static final int GIU = 0;
		
	}

	public static class ConstantiGiocatore {
		public static final int FERMO = 0;
		public static final int CORRERE = 1;
		public static final int SALTARE = 2;
		public static final int CADERE_VOLO = 3;
		public static final int ATTERRARE_TERRA = 4;
		public static final int COLPIRE = 5;
		public static final int ATTACCO_1 = 6;
		public static final int ATTACO_SALTO_1 = 7;
		public static final int ATTACCO_SALTO_2 = 8;
		
	public static int NumeroDiSprite(int azione_giocatore) {
		switch(azione_giocatore) {
		case CORRERE:
			return 6;
		case FERMO:
			return 5;
		case ATTERRARE_TERRA:
			return 2;
		case COLPIRE:
			return 4;
		case SALTARE:
		case ATTACCO_1:
		case ATTACO_SALTO_1:
		case ATTACCO_SALTO_2:
			return 3;
		case CADERE_VOLO:
		default:
			return 1;
		}
		
	}
		
		
		
		
	}
	
}
