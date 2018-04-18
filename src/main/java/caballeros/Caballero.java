package caballeros;

public class Caballero {
	
	private String poder;
	private String tipoDeArmadura;
	private int vidaCaballero;
	private int vidaArmadura;
	
	public Caballero(String poder,String tipoDeArmadura){
		
		this.poder = poder;
		this.tipoDeArmadura = tipoDeArmadura;
		this.vidaCaballero = 100;
		
		if (this.tipoDeArmadura == "BRONCE"){
			
			this.vidaArmadura = 100;
			
		}else if (this.tipoDeArmadura == "DORADA" ){
			
			this.vidaArmadura = 300;
			
		}else{
			
			//no conozco la armadura
			this.vidaArmadura = 0;
		}
	}
	
	public String getTipoDeArmadura(){
		return tipoDeArmadura;
	}

	public String getPoder() {
		return poder;
	}
	
	public int getVida(){
		return vidaCaballero;
	}
	
	public void setVida(int vida){
		this.vidaCaballero = vida;
	}
	
	public int getVidaArmadura(){
		return vidaArmadura;
	}
	
	public void setVidaArmadura(int vidaArmadura){
		this.vidaArmadura = vidaArmadura;
	}
}
