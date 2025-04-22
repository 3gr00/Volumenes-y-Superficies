package clases;

public class Cilindro {

	int radio, altura;
	
	public Cilindro (int radio, int altura) {
		
		this.radio = radio;
		this.altura = altura;
		
	}
	
	public Cilindro ()  {
		
		this.radio= 1;
		this.altura= 1;
		
	}
	
	// METODOS
	
	/**
	 * Calcular la superficie del Cilindro
	 * @return La superficie en metros
	 */
	
	public int superficie () {
		
		int superficie = 2* (int) Math.PI * radio * radio + 2* (int) Math.PI * radio* altura;
		
		return superficie;
	}
	
	/**
	 * Calcular el volumen del Cilindro
	 * @return El volumen en metros
	 */
	
	public int volumen () {
		
		int area= (int) Math.PI * radio * radio;
		int superficie = area * altura;	
		return superficie;
		
	}
	
	
	
}
