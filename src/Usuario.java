
public class Usuario extends Persona {

	private String nombres, apellidos, nCuenta;
	private int edad;
	private static int acum = 0;
	private int saldo = 0;

	public Usuario() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * @return la edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 *            para guardar.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @param apellidos
	 *            para guardar
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return el nombre completo.
	 */
	public String getNombreC() {
		String cadena = nombres + " " + apellidos;
		return cadena;
	}

	/**
	 * @param nombres
	 *            para guardar
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNcuenta() {
		return nCuenta;
	}

	public void setNcuenta() {
		acum++;
		nCuenta = "2018" + acum;

	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo += saldo;
	}

	@Override
	public String toString() {
		String cadena = "\n*************************************\n"+"NOMBRE: " + nombres + " " + apellidos + "\nEdad: " + edad + "\nNumero de cuenta: " + nCuenta
				+ "\n\n**Tenga en cuenta que el numero \n" + "de cuenta se pedira a la hora de\n"
				+ "hacer retirios y consignaciones**"+"\n*************************************\n";
		return cadena;
	}

}
