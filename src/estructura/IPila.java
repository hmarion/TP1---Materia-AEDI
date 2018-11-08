/**
 * Interface: IPila
 * 
 * Interface con los metodos utilizados por una Pila
 * 
 * @author Hector Marion
 * 
 * Version: 10.06.2018.2
 */

package estructura;

public interface IPila {

	public int tamanio();
	
	public boolean esVacia();
	
	public void apilar(Object O);
	
	public void desapilar();
	
	public Object cima();
	
}
