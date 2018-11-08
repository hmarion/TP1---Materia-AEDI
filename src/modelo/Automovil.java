/**
 * Clase: Automovil
 * 
 * Clase que extiende de Vehiculo para realizar ingreso de Automoviles
 * 
 * @author Hector Marion
 * 
 * Version: 04.06.2018.1
 */

package modelo;

public class Automovil extends Vehiculo{

	//Atributos de la clase
	private boolean airbag;

	//Getter y Setter de la clase
	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	//Constructor de Automovil
	public Automovil(boolean airbag, String vin, Motor motor) {
		super(vin, motor);
		this.airbag = airbag;
	}

	//Metodo toString para mostrar todos los datos del Automovil
	public String toString() {
		return "Automovil: VIN " + getVin() + ", Airbag " + verificarAirbag(airbag) + ", " + getMotor().toString();
	}
	
	//Metodo que verifica el dato booleano del atributo airbag que se utiliza en el toString
	public String verificarAirbag(boolean airbag){
		if(airbag == true){
			return "Si";
		}else{
			return "No";
		}
	}
	
}
