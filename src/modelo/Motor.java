/**
 * Clase: Motor
 * 
 * Clase que se utiliza para cargar los datos del motor
 * 
 * @author Hector Marion
 * 
 * Version: 04.06.2018.1
 */

package modelo;

public class Motor {
	
	//Atributos de la clase
	private double qLitros; 
	private int qCilindros;
	
	//Getters y Setters de la clase
	public double getqLitros() {
		return qLitros;
	}
	public void setqLitros(double qLitros) {
		this.qLitros = qLitros;
	}
	public int getqCilindros() {
		return qCilindros;
	}
	public void setqCilindros(int qCilindros) {
		this.qCilindros = qCilindros;
	}
	
	//Constructor de la clase Motor
	public Motor(double qLitros, int qCilindros) {
		this.qLitros = qLitros;
		this.qCilindros = qCilindros;
	}
	
	//Metodo toString para mostrar todos los datos del Motor
	public String toString() {
		return "Motor: Litros " + qLitros + ", Cilindros " + qCilindros;
	}

}
