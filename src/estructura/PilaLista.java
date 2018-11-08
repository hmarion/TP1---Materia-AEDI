/**
 * Clase: PilaLista
 * 
 * Clase que realizar una Pila de Objetos en una Lista Enlazada
 * 
 * @author Hector Marion
 * 
 * Version: 11.06.2018.1
 */

package estructura;

public class PilaLista implements IPila{
	
	//Atributos de la clase PilaLista
	private Nodo cima;
	private int tamanio;
	
	//Getters y setters de Cima
	public Nodo getCima() {
		return cima;
	}

	public void setCima(Nodo cima) {
		this.cima = cima;
	}

	//Constructor de PilaLista sin parametros
	public PilaLista(){
		cima = null;
		tamanio = 0;
	}

	//Metodo para verificar si la lista esta vacia
	@Override
	public boolean esVacia(){
		if(cima == null){
			return true;
		}else{
			return false;
		}
	}
	
	//Metodo para apilar un objeto
	@Override
	public void apilar(Object o){
		cima = new Nodo(o, cima);
		tamanio++;
	}

	//Metodo para verificar el tamaño de la Pila
	@Override
	public int tamanio() {
		return  tamanio;
	}

	//Metodo para desapilar un objecto
	@Override
	public void desapilar() {
		if(esVacia()){
			System.out.println("La lista esta vacia");
		}else{
			if(tamanio == 1){
				cima = null;
			}else{
				cima = cima.getReferencia();
			}
			tamanio--;
		}
	}

	//Metodo para obtener el dato de la cima de la Pila
	@Override
	public Object cima() {
		if(esVacia()){
			return "La lista esta vacia";
		}else{
			return cima.getDato();
		}
	}

}
