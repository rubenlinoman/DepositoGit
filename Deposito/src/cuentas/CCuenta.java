package cuentas;
/**
 * Esta clase implementa unha conta bancaria coas súas funcións principais
 * @author ruben
 * @version 1.0
 */
public class CCuenta {

	/**
	 * Nome do titular da conta
	 */
	private String nombre; 
	
	/**
	 * Número de conta bancaria
	 */
	private String cuenta;
	
	/**
	 * Saldo da conta
	 */
	private double saldo;
	
	/**
	 * Tipo de interés da conta
	 */
	private double tipoInteres;
	
	/**
	 * Construtor por defecto 
	 */
	public CCuenta() {
	}

	/**
	 * Construtor para crear obxectos de tipo CCuenta
	 * @param nom Nome do titular da conta
	 * @param cue Número de conta
	 * @param sal Saldo da conta
	 * @param tipo Tipo de interés da conta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}
	
	/**
	 * Método que informa do estado da conta
	 * @return o saldo actual
	 */
	public double estado() {
		return saldo;
	}
	
	/**
	 * Método que permite ingresar cartos na conta 
	 * @param cantidad Cantidade a ingresar na conta
	 * @throws Exception se a cantidade a ingresar é menor que 0
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Método que permite retirar cartos da conta
	 * @param cantidad Cantidade a retirar da conta
	 * @throws Exception se a cantidade é menor ou igual a 0 ou se a cantidade é maior ao saldo actual
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
	
	/**
	 * Método que permite obter o nome
	 * @return o nome da conta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que permite actualizar o nome da conta
	 * @param nombre Nome do titular da conta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que permite obter a conta
	 * @return a conta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método que permite actualizar a conta
	 * @param cuenta Número de conta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método que permite obter o saldo
	 * @return o saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método que permite actualizar o saldo
	 * @param saldo Saldo da conta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Método que permite obter o tipo de interés
	 * @return o tipo de interés
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Método que permite actualizar o tipo de interés
	 * @param tipoInteres Tipo de interés da conta
	 */
	public void setTipoInterés(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
