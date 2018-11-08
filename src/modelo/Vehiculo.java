/**
 * Clase: Vehiculo
 * 
 * Clase abstracta para cualquier tipo de vehiculo
 * 
 * @author Hector Marion
 * 
 * Version: 04.06.2018.1
 */

package modelo;

public abstract class Vehiculo {
	
	//Atributos de la Clase
	private String vin;
	private Motor motor;
	
	//Getters y Setters de los atributos
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	//Constructor de Vehiculo
	public Vehiculo(String vin, Motor motor) {
		super();
		this.vin = vin;
		this.motor = motor;
	}
	
	//Metodo abstracto toString 
	public abstract String toString();
	
}
