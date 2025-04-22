package clases;

public class Cubo {
	
	int lado;

	// CONSTRUCTOR 
	
	public Cubo (int lado) {
		
		this.lado= lado;
	
	}
	
	public Cubo () {
		
		this.lado= 1;
	}
	
	// METODOS
	
	/**
	 * 
	 * Calcular la superficie del cubo 
	 * @return la superficie en metros
	 */
	
	public int superficie (int lado) {
		
		int area = lado * lado;
		return 6 * area;
		
	}
	
	/**
	 * 
	 * Calcular el volumen del cubo 
	 * @return el volumen en metros
	 */
	
	public int volumen (int volum) {
		
		int volumen = lado * lado * lado;
		return volumen;
		
	}
	
	
	
	
}
