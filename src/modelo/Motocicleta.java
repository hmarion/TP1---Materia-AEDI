/**
 * Clase: Motocicleta
 * 
 * Clase que extiende de Vehiculo para realizar ingreso de Motocicletas
 * 
 * @author Hector Marion
 * 
 * Version: 04.06.2018.1
 */

package modelo;

public class Motocicleta extends Vehiculo{
	
	//Atributos de la clase
	private boolean encendidoEletrico;

	//Getter y Setter de la clase
	public boolean isEncendidoEletrico() {
		return encendidoEletrico;
	}

	public void setEncendidoEletrico(boolean encendidoEletrico) {
		this.encendidoEletrico = encendidoEletrico;
	}

	//Constructor de la clase Motocicleta
	public Motocicleta(String vin, boolean encendidoEletrico, Motor motor) {
		super(vin, motor);
		this.encendidoEletrico = encendidoEletrico;
	}

	//Metodo toString para mostrar todos los datos de la Motocicleta
	public String toString() {
		return "Motocicleta: VIN " + getVin() + ", Encendido Electrico " + verificarEncendido(encendidoEletrico) + ", " + getMotor().toString();
	}
	
	//Metodo que verifica el dato booleano del atributo encendidoElectrico que se utiliza en el toString
	public String verificarEncendido(boolean encendido){
		if(encendido == true){
			return "Si";
		}else{
			return "No";
		}
	}

}
