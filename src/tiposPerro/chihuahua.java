package tiposPerro;

/**
 * 
 * @author jhons
 *
 */
public class chihuahua {
	public String tama�o;
	public String pelaje;
	public String peso;
	
	/**
	 * 
	 * @param tama�o
	 * @param pelaje
	 * @param peso
	 */
	public chihuahua(String tama�o, String pelaje, String peso) {
		// TODO Auto-generated constructor stub
		this.tama�o = tama�o;
		this.pelaje = pelaje;
		this.peso = peso;
	}
	
	/**
	 * 
	 */
	public void truco() {
		System.out.println("*da la patita*");
	}

	/**
	 * 
	 */
	public void saludar() {
		System.out.println("*wooof wooof*");
	}
	
	/**
	 * 
	 */
	public void mostrarDatos() {
		System.out.println("Tama�o "+ tama�o +" Pelaje "+ pelaje+ " Peso "+ peso);
	} 
}
