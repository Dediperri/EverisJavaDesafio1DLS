package variables;



/**
 * @author dlopezst
 *
 */

public class Developer {

	
	//Variable de instancia
	private String developerName = "";
	
	//Variable de instancia
	private int developerNumber = 0;
	
	//Variable de instancia
	private int holidays = 21;
	
	//Variable de clase (estatica)
	private static byte totalEmployees = 0;
	
	//Variable constante
	public final static String COMPANY = "Everis";
	
	
	/**
	 * Constructor que instancia la clase
	 * @param String developerName
	 * @param String developerNumber
	 * 
	 * */
	public Developer(String developerName) {
		this.setDeveloperName(developerName);
		limitTester();

		
	}
	
	/**
	 * Metodo que devuelve el numero total de empleados (int)
	 * */
	public byte getTotalEmployees() {
		
		
		return totalEmployees;
	} 
	
	/**
	 * Metodo que devuelve el numero de empleado (int)
	 * */
	public int getEmployeeNumber() {
		
		return developerNumber;
	}
	
	/**
	 * Metodo que le resta al dia de vacaciones el tiempo deseado
	 * @param int tiempoDescontado
	 * */
	public void takeHolidayTime(int discountedTime) {
		
		holidays -= discountedTime;
	}
	
	/**
	 * Metodo que devuelve los dias de vacaciones para ese trabajador (int)
	 * */
	public int getHolidays() {
		
		return holidays;
	}
	
	private void limitTester() {

		if(totalEmployees < 0 || totalEmployees > 126) {
			
			throw new IndexOutOfBoundsException("El máximo de empleados permitidos es de 127");
		}
		Developer.totalEmployees += 1;
		this.developerNumber = Developer.totalEmployees;
		
	}

	/**
	 * @return Devuelve el  developerName
	 */
	public String getDeveloperName() {
		return developerName;
	}

	/**
	 * Metodo set para el developerName
	 * @param String developerName
	 */
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

}
