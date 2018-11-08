/**
 * Clase: Nodo
 * 
 * @author Hector Marion
 * 
 * Version: 11.06.2018.1
 */

package estructura;

public class Nodo{
	
	//Atributos de la Clase
	private Object dato;
	private Nodo referencia;
	
	//Constructores de la clase
	public Nodo(){
		
	}
	
	public Nodo(Object dato){
		this.dato = dato;
		this.referencia = null;
	}
	
	//Constructor para Nodo de Pila
	public Nodo(Object dato, Nodo referencia){
		this.dato = dato;
		this.referencia = referencia;
	}

	//Getters y Setters
	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public Nodo getReferencia() {
		return referencia;
	}

	public void setReferencia(Nodo referencia) {
		this.referencia = referencia;
	}

}
