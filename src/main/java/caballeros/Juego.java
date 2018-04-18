package caballeros;

public class Juego {
	
	Caballero malo;
	Caballero bueno;
	
	
	public void setCaballeroBueno(Caballero bueno){
		this.bueno = bueno;
	}
	
	public void setCaballeroMalo(Caballero malo){
		this.malo = malo;
	}

	public void buenoAtacarAlMalo() {
		
		if (bueno.getPoder() == "METEORO_PEGASO"){
			
			if (malo.getVidaArmadura() > 0){
				malo.setVidaArmadura( malo.getVidaArmadura() -50);
			}else{
				malo.setVida(malo.getVida() - 50);
			}
		}
		
		if (bueno.getPoder() == "GRAN_CUERNO"){
			
			if (malo.getVidaArmadura() > 0){
				malo.setVidaArmadura( malo.getVidaArmadura() -75);
			}else{
				malo.setVida(malo.getVida() - 75);
			}
		}
		
	}

	public void maloAtacarAlBueno() {

		if (malo.getPoder() == "METEORO_PEGASO"){
			
			if (bueno.getVidaArmadura() > 0){
				bueno.setVidaArmadura( bueno.getVidaArmadura() -50);
			}else{
				bueno.setVida(bueno.getVida() - 50);
			}
		}
		
		if (malo.getPoder() == "GRAN_CUERNO"){
			
			if (bueno.getVidaArmadura() > 0){
				bueno.setVidaArmadura( bueno.getVidaArmadura() -75);
			}else{
				bueno.setVida(bueno.getVida() - 75);
			}
		}		
	}
}
