package cuentas;
/**
 * Esta clase implementa unha conta bancaria coas s�as funci�ns principais
 * @author ruben
 * @version 1.0
 */
public class CCuenta {

	/**
	 * Nome do titular da conta
	 */
	private String nombre; 
	
	/**
	 * N�mero de conta bancaria
	 */
	private String cuenta;
	
	/**
	 * Saldo da conta
	 */
	private double saldo;
	
	/**
	 * Tipo de inter�s da conta
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
	 * @param cue N�mero de conta
	 * @param sal Saldo da conta
	 * @param tipo Tipo de inter�s da conta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}
	
	/**
	 * M�todo que informa do estado da conta
	 * @return o saldo actual
	 */
	public double estado() {
		return saldo;
	}
	
	/**
	 * M�todo que permite ingresar cartos na conta 
	 * @param cantidad Cantidade a ingresar na conta
	 * @throws Exception se a cantidade a ingresar � menor que 0
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * M�todo que permite retirar cartos da conta
	 * @param cantidad Cantidade a retirar da conta
	 * @throws Exception se a cantidade � menor ou igual a 0 ou se a cantidade � maior ao saldo actual
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
	
	/**
	 * M�todo que permite obter o nome
	 * @return o nome da conta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo que permite actualizar o nome da conta
	 * @param nombre Nome do titular da conta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo que permite obter a conta
	 * @return a conta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * M�todo que permite actualizar a conta
	 * @param cuenta N�mero de conta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * M�todo que permite obter o saldo
	 * @return o saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * M�todo que permite actualizar o saldo
	 * @param saldo Saldo da conta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * M�todo que permite obter o tipo de inter�s
	 * @return o tipo de inter�s
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * M�todo que permite actualizar o tipo de inter�s
	 * @param tipoInteres Tipo de inter�s da conta
	 */
	public void setTipoInter�s(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
