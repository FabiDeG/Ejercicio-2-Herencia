package UI;
import java.util.Scanner;
import Documents.Article;
import Documents.Books;
import Documents.Magazine;
import People.Client;

public class DriverP {
	public DriverP() {
    }
	public static void MostrarMenu() {
        System.out.println("Bienvenid@ a la biblioteca");
        System.out.println("Por favor elige cual de las siguientes acciones desesas realizar");
        System.out.println("1. Insertar un libro");
        System.out.println("2. Según la ID, devolver un título de cualquier publicación");
        System.out.println("3. Cantidad de documentos por materia");
        System.out.println("4. Realizar un préstamo");
        System.out.println("5. Realizar una devolución");
        System.out.println("6. Cantidad de documentos que se ha prestado a un cliente según su tema");
        System.out.println("7. Cantidad de revistas de un determinado tema en la biblioteca");
        System.out.println("8. Determinar stock de libros o artículos");
        System.out.println("9. Crear un usuario de la biblioteca nuevo");
        System.out.println("10. Terminar el programa");
        System.out.println("\n");
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String opcion = "";
        
        while(!opcion.equals("10")) {
            MostrarMenu();
            opcion = "" + in.nextInt();
            if (opcion.equals("1")) {
            	Scanner in1 = new Scanner(System.in);
            	Books[] misLibros = new Books[1];
            	for (int i = 0; i < 1; i++) {
                	misLibros[i] = new Books(null, args, args, args, args, args, args);
        			System.out.println("ID del libro: " + (i + 1));
					misLibros[i].setID(in1.nextInt());
        			System.out.println("Título del libro: " + (i + 1));
        			misLibros[i].setTitle(in1.nextLine());
        			System.out.println("El autor del libro: " + (i + 1));
        			misLibros[i].setAuthor(in1.nextLine());
        			System.out.println("La editorial del libro: " + (i + 1));
					misLibros[i].setPublisher(in1.nextInt());
        			System.out.println("Tema: " + (i + 1));
        			misLibros[i].setTopic(in1.nextLine());
        			System.out.println("El total de ejemplares: " + (i + 1));
        			misLibros[i].setCopy(in1.nextLine());
        			System.out.println("Estado de los libros: " + (i + 1));
        			misLibros[i].setStatus(in1.nextLine());
        			MostrarMenu();
            	} }if (opcion.equals("2")) {
            		for (int i = 0; i < 2; i++) {
            			System.out.println("ID del libro: " + (i + 1));
            			String id = in.nextLine();
            			boolean existe = Books.contains(id);
            			if (existe) {
            				System.out.println(Books.contains(id));
            			} else {
            				System.out.println("El libro no existe");
            			}
            		}
            	}if (opcion.equals("3")) {
            		
            	}
            }
        }
	}




