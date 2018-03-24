import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
	static ArrayList<Usuario> Usuarios = new ArrayList();
	static Scanner sc = new Scanner(System.in);

	public static void crear() {
		// TODO Auto-generated method stub
		// Declaración de variables para leer los datos de los usuarios
		String nombre;
		String apellido;
		int edad;
		// Variable auxiliar que contendrá la referencia a cada usuario nuevo.
		Usuario aux;
		int opc = 1;
		while (opc == 1) {
			// leer datos de cada usuario
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.print("Apellido: ");
			apellido = sc.nextLine();
			System.out.print("edad: ");
			edad = sc.nextInt();
			sc.nextLine(); // limpiar el intro
			aux = new Usuario(); // Se crea un objeto Usuario y se asigna su referencia a aux
			// se asignan valores a los atributos del nuevo objeto
			aux.setNombres(nombre);
			aux.setApellidos(apellido);
			aux.setEdad(edad);
			aux.setNcuenta();
			// se añade el objeto al final del array
			Usuarios.add(aux);
			System.out.println(aux.toString());
			System.out.println("¿Desea añadir un nuevo usuario? (SI=1-NO=2): ");
			opc = sc.nextInt();
			sc.nextLine(); // limpiar el intro
			if (opc == 2) {
				System.out.println("**********************************\n\n\n");
				break;
			}
		}
	}

	public static void Lista() {
		// TODO Auto-generated method stub
		System.out.println(Usuarios.toString()); // se invoca el método toString de la clase Usuario
	}

	public static void Consignar() {
		// TODO Auto-generated method stub
		System.out.println("Digite su numero de cuenta: ");
		String cuenta = sc.nextLine();
		for (int i = 0; i < Usuarios.size(); i++) {
			if (Usuarios.get(i).getNcuenta().equalsIgnoreCase(cuenta)) {
				System.out.println(Usuarios.get(i).toString());
				System.out.println("\nDIGITE LA CANTIDAD A CONSIGNAR: ");
				int cantidad = sc.nextInt();
				Usuarios.get(i).setSaldo(+cantidad);
				System.out.println("**********************************");
				System.out.println("Su Consignacion de: $" + cantidad);
				System.out.println("fue procesada correctamente.");
				System.out.println("**********************************\n\n\n");
			} else {
				System.out.println("La cuenta NO EXISTE.");
			}
		}
	}

	public static void Retirar() {
		// TODO Auto-generated method stub
		sc.nextLine(); // limpiar el intro
		System.out.println("Digite su numero de cuenta: ");
		String cuenta = sc.nextLine();
		for (int i = 0; i < Usuarios.size(); i++) {
			if (Usuarios.get(i).getNcuenta().equalsIgnoreCase(cuenta)) {
				System.out.println(Usuarios.get(i).toString());
				System.out.println("\nSu Saldo actual es: $" + Usuarios.get(i).getSaldo() + " Pesos.");
				System.out.println("\nDIGITE LA CANTIDAD A RETIRAR: ");
				int cantidad = sc.nextInt();
				int saldo = Usuarios.get(i).getSaldo();
				if (cantidad <= saldo) {
					Usuarios.get(i).setSaldo(-cantidad);
					System.out.println("**********************************");
					System.out.println("Su retiro fue satisfactorio.");
					System.out.println("**********************************");
				} else {
					System.out.println("**********************************");
					System.out.println("Su retiro no fue completado.");
					System.out.println("Va a ser redirigido al menu");
					System.out.println("**********************************\n\n\n");
				}
			} else {
				System.out.println("La cuenta NO EXISTE.");
			}
		}
	}

	public static void Consulta() {
		// TODO Auto-generated method stub
		sc.nextLine(); // limpiar el intro
		System.out.println("Digite su numero de cuenta: ");
		String cuenta = sc.nextLine();
		for (int i = 0; i < Usuarios.size(); i++) {
			if (Usuarios.get(i).getNcuenta().equalsIgnoreCase(cuenta)) {
				System.out.println("Señor/a" + Usuarios.get(i).getNombreC() + "\nSu Saldo actual es: $"
						+ Usuarios.get(i).getSaldo() + " Pesos.");
				System.out.println("**********************************\n\n\n");
			} else {
				System.out.println("La cuenta NO EXISTE.");
			}
		}
	}
}
