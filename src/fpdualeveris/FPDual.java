/**
 * 
 */
package fpdualeveris;

import variables.Developer;

/**
 * @author dlopezst
 *
 */
public class FPDual {

	/**
	 * Metodo Main
	 * @param args
	 * */
	public static void main(String[] args) {

		variablesChallenge();

	}
	
	/**
	 * Metodo para instanciar a los desarrolladores y utilizar sus metodos y variables
	 * */
	private static void variablesChallenge() {
		
		//Instanciar y usar a los desarrolladores
		
		//Instancio los desarrolladores
		Developer dev1 = new Developer("Kiko");
		Developer dev2 = new Developer("Ana");
		Developer dev3 = new Developer("Lola");
		Developer dev4 = new Developer("Roberto");
				
		//Compruebo si el numero total de desarrolladores es igual para dev1 y para dev4
		System.out.println("El numero total de empleados es: " + dev1.getTotalEmployees());
		System.out.println("El numero total de empleados es: " + dev4.getTotalEmployees());
		
		//Muestro el numero de cada empleado
		System.out.println("El numero del empleado Kiko es: " + dev1.getEmployeeNumber());
		System.out.println("El numero del empleado Ana es: " + dev2.getEmployeeNumber());
		System.out.println("El numero del empleado Lola es: " + dev3.getEmployeeNumber());
		System.out.println("El numero del empleado Roberto es: " + dev4.getEmployeeNumber());
		
		//Se le descuenta al segundo desarrollador 2 dias de vacaciones
		dev2.takeHolidayTime(2);
		
		//Muestro el total de vacaciones por empleado
		System.out.println("El empleado Kiko tiene un total de: " + dev1.getHolidays() + " días de vacaciones");
		System.out.println("El empleado Ana tiene un total de: " + dev2.getHolidays() + " días de vacaciones");
		System.out.println("El empleado Lola tiene un total de: " + dev3.getHolidays() + " días de vacaciones");
		System.out.println("El empleado Roberto tiene un total de: " + dev4.getHolidays() + " días de vacaciones");
		
		
		//Imprimir la compañia de los empleados
		System.out.println("Compañia: " + Developer.COMPANY);
		
	} 

}
