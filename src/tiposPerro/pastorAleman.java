package tiposPerro;

/**
 * 
 * @author jhons
 *
 */
public class pastorAleman {
	public String tama�o;
	public String pelaje;
	public String peso;
	
	/**
	 * 
	 * @param tama�o
	 * @param pelaje
	 * @param peso
	 */
	public pastorAleman(String tama�o, String pelaje, String peso) {
		// TODO Auto-generated constructor stub
		this.tama�o = tama�o;
		this.pelaje = pelaje;
		this.peso = peso;
	}
	
	/**
	 * 
	 */
	public void truco() {
		System.out.println("*se hace el muerto*");
	}

	/**
	 * 
	 */
	public void saludar() {
		System.out.println("*wooof wooof wooof rrrrrrr*");
	}
	
	/**
	 * 
	 */
	public void mostrarDatos() {
		System.out.println("Tama�o "+ tama�o +" Pelaje "+ pelaje+ " Peso "+ peso);
	} 
}