/**
 * Clase: Main
 * 
 * Clase en la que se ejecuta el programa.
 * Se puede realizar carga, muestra y eliminacion de los distintos tipos de vehiculos
 * 
 * @author Hector Marion
 * 
 * Version: 24.06.2018.2
 */

package vista;

import java.util.ArrayList;
import java.util.Scanner;	

import estructura.ColaLista;
import estructura.Nodo;
import estructura.PilaLista;
import modelo.Automovil;
import modelo.Motocicleta;
import modelo.Motor;
import modelo.Vehiculo;

public class Main {
	
	public static void main(String[] args) {
		
		int opcion1 = 1; //Opcion para utilizar en el menu	
		ColaLista vehiculo = new ColaLista(); //Lista enlazada para cargar los tipos de vehiculos ingresados
		
		while(opcion1 != 0){ 		
			try{				
				Scanner sc = new Scanner (System.in);
	
				System.out.println("\nBienvenido al Menu de Seleccion");
				System.out.println("1 - Registrar nuevo Automovil"); 
				System.out.println("2 - Registrar nuevo Motocicleta"); 
				System.out.println("3 - Mostrar proximo Vehiculo a reparar"); 
				System.out.println("4 - Reparar Vehiculo con registro de pasos"); 
				System.out.println("5 - Reparar Vehiculo sin registro de pasos"); 
				System.out.println("6 - Listar Automovil"); 
				System.out.println("7 - Listar Motocicleta"); 
				System.out.println("8 - Listar Vehiculos"); 
				System.out.println("0 - Salir.");
				System.out.print  ("Ingrese la opcion seleccionada: ");
		
				opcion1 = sc.nextInt(); 
				
				switch (opcion1){
				
					case 1: //Registrar un Automovil
						sc = new Scanner(System.in);
						boolean cargarVin = true; //Variable que se utiliza para verificar que no se duplique el vin
						System.out.print("Ingrese el vin del Automovil: ");
						String vin = sc.nextLine(); 
						if(vehiculo.getPrimero() != null){
							Nodo auxiliar1 = new Nodo(vehiculo.primero(), vehiculo.getPrimero().getReferencia());
							do{
								Vehiculo verificarVin = (Vehiculo) auxiliar1.getDato();
								if(vin.equals(verificarVin.getVin())){
									cargarVin = false;
									System.out.println("El VIN ya esta cargado en el sistema");
								}
								auxiliar1 = auxiliar1.getReferencia();
							}while(auxiliar1 != null && cargarVin == true);
						}
						if(cargarVin){  //Si el vin no esta duplicada se solicita el resto de los datos para realizar el ingreso del Automovil
							boolean airbag;
							System.out.print("Vehiculo tiene airbag (Ingrese 1 si tiene, 2 si no tiene)?: ");
							int valorAirbag = sc.nextInt();
							if(valorAirbag == 1){
								airbag = true;
							}else{
								airbag = false;
							}
							System.out.print("Ingrese la cantidad de cilindradas del Automovil: ");
							int cilindradas = sc.nextInt();
							System.out.print("Ingrese la cantidad de Litros del Automovil: ");
							double litros = sc.nextDouble();
							Motor motor = new Motor(litros, cilindradas);
							Automovil automovil = new Automovil(airbag, vin, motor);
							vehiculo.encolar(automovil);
						}
						break;
			
					case 2: //Registrar una Motocicleta
						sc = new Scanner (System.in);
						boolean cargarVin1 = true;
						System.out.print("Ingrese el vin de la Motocicleta: ");
						String vin1 = sc.nextLine();
						if(vehiculo.getPrimero() != null){
							Nodo auxiliar2 = new Nodo(vehiculo.primero(), vehiculo.getPrimero().getReferencia());
							do{
								Vehiculo verificarVin = (Vehiculo) auxiliar2.getDato();
								if(vin1.equals(verificarVin.getVin())){
									cargarVin1 = false;
									System.out.println("El VIN ya esta cargado en el sistema");
								}
								auxiliar2 = auxiliar2.getReferencia();
							}while(auxiliar2 != null && cargarVin1 == true);
						}
						if(cargarVin1){ //Si el vin no esta duplicada se solicita el resto de los datos para realizar el ingreso de la Motocicleta
							System.out.print("Motocicleta tiene encendido automatico (Ingrese 1 si tiene, 2 si no tiene)?: ");
							boolean encendido;
							int valorEncendido = sc.nextInt();
							if(valorEncendido == 1){
								encendido = true;
							}else{
								encendido = false;
							}
							System.out.print("Ingrese la cantidad de cilindradas de la Motocicleta: ");
							int cilindradas1 = sc.nextInt();
							System.out.print("Ingrese la cantidad de Litros de la Motocicleta: ");
							double litros1 = sc.nextDouble();
							Motor motor1 = new Motor(litros1, cilindradas1);
							Motocicleta motocicleta = new Motocicleta(vin1, encendido, motor1);
							vehiculo.encolar(motocicleta);
						}
						break;
						
					case 3: //Metodo para mostrar el proximo vehiculo a reparar
						if(vehiculo.esVacia()){
							System.out.println("No hay vehiculos para reparar");
						}else{
							System.out.println(vehiculo.primero().toString());
						}
						break;
						
					case 4: //Metodo para reparar un Vehiculo con registro de pasos
						if(vehiculo.esVacia()){
							System.out.println("No hay vehiculos para reparar");
						}else{
							//System.out.println("Vehiculo a Reparar: " + vehiculo.primero().toString());
							int opcion2 = 1;
							PilaLista pilaPasos = new PilaLista();
							while(opcion2 !=0){
								System.out.println("\nBienvenido al Menu de Registro de Pasos");
								System.out.println("1 - Iniciar un nuevo desarme"); //Falta
								System.out.println("2 - Indicar nueva pieza removida"); //Falta
								System.out.println("3 - Consultar ultima paso realizado"); //Falta
								System.out.println("4 - Eliminar ultimo paso realizado"); //Falta
								System.out.println("5 - Mostrar todos los pasos a realizar"); //Falta
								System.out.println("0 - Salir.");
								System.out.print  ("Ingrese la opcion seleccionada: ");
								
								opcion2 = sc.nextInt();
								
								switch(opcion2){
								
									case 1: //Metodo para Iniciar una nueva lista de pasos
										sc = new Scanner (System.in);
										if(!pilaPasos.esVacia()){
											System.out.println("Ya tiene registrado una lista de pasos");
										}else{
											System.out.println("Vehiculo a Reparar: " + vehiculo.primero().toString());
											System.out.print("Indique el primer paso del desarme: ");
											String paso = sc.nextLine();
											pilaPasos.apilar(paso);
										}
										break;
										
									case 2: //Metodo para agregar una nueva pieza removida
										sc = new Scanner (System.in);
										if(pilaPasos.esVacia()){
											System.out.println("Debe iniciar un nuevo desarme");
										}else{
											System.out.print("Indique nueva pieza removida: ");
											String paso = sc.nextLine();
											pilaPasos.apilar(paso);
										}
										break;
										
									case 3: //Metodo para consultar la ultima pieza removida
										if(pilaPasos.esVacia()){
											System.out.println("No hay registro de Pasos");
										}else{
											System.out.println("El ultimo paso realizado es: " + pilaPasos.cima());
										}
										break;
									
									case 4: //Metodo para eliminar el ultimo paso realizado
										if(pilaPasos.esVacia()){
											System.out.println("No hay registro de Pasos");
										}else{
											System.out.println("Se elimino el ultimo paso realizado");
											pilaPasos.desapilar();
										}
										break;
										
									case 5: //Metodo para mostrar todos los pasos a realizar
										if(pilaPasos.esVacia()){
											System.out.println("No hay registro de Pasos");
										}else{
											ArrayList<Object> vectorPasos = new ArrayList<>();
											Nodo auxiliarPasos = new Nodo(pilaPasos.cima(), pilaPasos.getCima().getReferencia());
											do{
												vectorPasos.add(auxiliarPasos.getDato());
												auxiliarPasos = auxiliarPasos.getReferencia();
											}while(auxiliarPasos != null);
											for(int i = vectorPasos.size()-1; i >= 0; i--){
												System.out.println("Paso " + (vectorPasos.size()-i) + ": " + vectorPasos.get(i));
											}
										}
										break;
										
									case 0: //Salir del Menu de Pasos
										if(!pilaPasos.esVacia()){
											System.out.println("Debe completar el armado del vehiculo para finalizar");
											opcion2 = 1;
										}else{
											System.out.println("Se reparo el vehiculo");
										}
										break;
										
									default:
										System.out.println("La opcion ingresada es incorrecta");
								}
							}
							vehiculo.desencolar();
						}
						break;
						
					case 5: //Metodo para reparar un Vehiculo sin registro de pasos
						if(vehiculo.esVacia()){
							System.out.println("No hay vehiculos para reparar");
						}else{
							System.out.println("Vehiculo a Reparar: " + vehiculo.primero().toString());
							vehiculo.desencolar();
							System.out.println("Se reparo el vehiculo");
						}
						break;
						
					case 6: //Mostrar solo la lista de Automoviles
						if(vehiculo.esVacia()){
							System.out.println("No hay vehiculos ingresados");
						}else{
							Nodo auxiliar = new Nodo(vehiculo.primero(), vehiculo.getPrimero().getReferencia());
							System.out.println("Lista de Automoviles");
							do{
								if(auxiliar.getDato() instanceof Automovil){
									System.out.println(auxiliar.getDato().toString());
								}
								auxiliar = auxiliar.getReferencia();
							}while(auxiliar != null);
						}
						break;
						
					case 7: //Mostrar solo la lista de Motocicletas
						if(vehiculo.esVacia()){
							System.out.println("No hay vehiculos ingresados");
						}else{
							Nodo auxiliar = new Nodo(vehiculo.primero(), vehiculo.getPrimero().getReferencia());
							System.out.println("Lista de Motocicletas");
							do{
								if(auxiliar.getDato() instanceof Motocicleta){
									System.out.println(auxiliar.getDato().toString());
								}
								auxiliar = auxiliar.getReferencia();
							}while(auxiliar != null);
						}
						break;
					
					case 8: //Mostrar toda la lista de Vehiculos
						if(vehiculo.esVacia()){
							System.out.println("No hay vehiculos ingresados");
						}else{
							Nodo auxiliar = new Nodo(vehiculo.primero(), vehiculo.getPrimero().getReferencia());
							System.out.println("Lista de los Vehiculos");
							do{
								System.out.println(auxiliar.getDato().toString());
								auxiliar = auxiliar.getReferencia();
							}while(auxiliar != null);
						}
						break;
					
					case 0: //Salir del Programa
						System.out.println("Gracias por utilizar nuestro programa!");
						break;
						
					default:
						System.out.println("La opcion ingresada es incorrecta");
				}
			}catch(Exception e){
				System.out.println("Ingreso un caracter no valido");
			}
		}
	}
}
