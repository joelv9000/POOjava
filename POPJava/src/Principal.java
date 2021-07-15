import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaBancaria cuenta_personal = new CuentaBancaria("joel Vargas",-463.10f);
		CuentaBancaria cuenta_secundaria = new CuentaBancaria("joel v",-6524.00f);
		cuenta_secundaria.setSaldo(1239.75f);
		System.out.println(cuenta_secundaria.getSaldo()); 
		
		/*menu cajero.
		 * 1.retiro
		 * 2.deposito
		 * 3.Imprimir saldo
		 * 4.Estado de cuenta
		 * 5.agregar beneficiario
		 * 6.salir
		 
		 */
		/*
		int opcion =0;
		
		do {
		
		Scanner leer = new Scanner(System.in);
		//imprime cuenta bancaria
		
		System.out.println("Menu cuenta Bancaria");
		System.out.println("Ingresa la opcion deseada");
		System.out.println("1.Retiro");
		System.out.println("2.Deposito");
		System.out.println("3.Imprimir saldo");
		System.out.println("4.Estado de cuenta");
		System.out.println("5.Agregar Beneficiario");
		System.out.println("6. salir");
		
		//definimos variable
		 opcion =leer.nextInt();
		
		//switch valora una opcion
		switch(opcion) {
		case 1:
			
			System.out.println("Inggrese la cantidad a retirar");
			Float monto = leer.nextFloat();
			cuenta_personal.retiros(monto);;
			break;
			
		case 2:
			
			System.out.println("Ingrese la ccantidad a depositar");
		    float deposito = leer.nextFloat();
		    cuenta_personal.depositos(deposito);
		    break;
		    
		case 3:
			System.out.println("Su saldo actual es:"+
		     cuenta_personal.consultarSaldo());
			break;
			
		case 4:
			System.out.println("El beneficiario de la cuenta es:"+
			cuenta_personal.beneficiario);
			break;
			
			
		case 5:
			System.out.println("Ingrese el nombre del beneficiario");
			String nombre = leer.next();
			cuenta_personal.beneficiario = nombre;
			break;
			
		case 6:
		    
		}
		
		}while(opcion !=6);
		
		*/
	}
	
}
		
		
		/*
		CuentaBancaria cuenta_papa = new CuentaBancaria();
		
		System.out.println("Ingresa el monto a depositar");
		Scanner leer = new Scanner(System.in);
		float deposito = leer.nextFloat();
		
		System.out.println("Ingresar un monto a retirar");
		float retiro =leer.nextFloat();
		
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.println(cuenta_personal.beneficiario);
		
		cuenta_personal.beneficiario ="Joel Vargas";
		cuenta_personal.consultarSaldo();

		System.out.println("Su saldo actual es:  "+ cuenta_personal.consultarSaldo());
	    System.out.println(cuenta_personal.beneficiario);
	    
	    */

		