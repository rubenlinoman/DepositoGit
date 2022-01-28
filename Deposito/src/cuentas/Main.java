package cuentas;

/**
 * 
 * @author ruben
 *
 */
public class Main {

	public static void main(String[] args) {
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = operativa_cuenta(0);

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Erro ao retirar");
		}
		try {
			System.out.println("Ingreso en conta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Erro ao ingresar");
		}
	}

	private static CCuenta operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("O seu saldo actual é" + saldoActual);
		return cuenta1;
	}
}
