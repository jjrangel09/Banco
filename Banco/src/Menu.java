import java.util.Scanner;

public class Menu {

	static Scanner sc = new Scanner(System.in);
	static Gestion obj1 = new Gestion();
	static int opcion;

	public static void principal() {
		while (opcion != 6) {
			System.out.println("*************************");
			System.out.println("MENU PRINCIPAL");
			System.out.println("1.-Crear Persona.");
			System.out.println("2.-Listado de usuarios.");
			System.out.println("3.-Consignacion.");
			System.out.println("4.-Retiros.");
			System.out.println("5.-Consulta de Saldo.");
			System.out.println("6.-Salir.");
			System.out.println("*************************");
			System.out.println("\nEscoja Una opcion: ");
			
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("**********************************\nCREACION DE USUARIOS\n\n");
				Gestion.crear();
				break;
			case 2:
				System.out.println("**********************************\nLISTADO DE USUARIOS\n\n");
				Gestion.Lista();
				break;
			case 3:
				System.out.println("**********************************\nCONSIGNACIONES\n\n");
				Gestion.Consignar();
				break;
			case 4:
				System.out.println("**********************************\nRETIROS\nOprima ENTER\n");
				Gestion.Retirar();
				break;
			case 5:
				System.out.println("**********************************\nCONSULTA DE SALDO\n\n");
				Gestion.Consulta();
				break;
			case 6:
				System.out.println("**********************************\nSALIENDO...\n\n");
				System.exit(1);
				break;
			default:
					System.out.println("La opcion no es valida.");
				break;
			}
		}
	}

}
