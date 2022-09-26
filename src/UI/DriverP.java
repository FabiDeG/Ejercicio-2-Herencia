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
        System.out.println("6. Cantidad de documentos que se ha prestado a un cliente según su tipo");
        System.out.println("7. Cantidad de revistas de una materia en la biblioteca");
        System.out.println("8. Determinar stock de libros o artículos");
        System.out.println("9. Crear un usuario de la biblioteca nuevo");
        System.out.println("10. Terminar el programa");
        System.out.println("\n");
    }
	
	public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String opcion = "";
        Books Libro = NewBook();
        Magazine revista = NewMagazine();
        Article articulo = NewArticle();
        Client cliente = NewClient();
        
        while(!opcion.equals("10")) {
            MostrarMenu();
            opcion = "" + escaner.nextInt();
            
        }
        
	}
	
	public static Books NewBook() {
        Books Libro = new Books(null, null, null, null, null, null, null);
        return Libro;
    }

    public static Magazine NewMagazine() {
    	Magazine revista = new Magazine(null, null, null, null, null);
        return revista;
    }
    
    public static Article NewArticle() {
    	Article articulo = new Article(null, null, null, null, null, null);
        return articulo;
    }

    public static Client NewClient() {
    	Client cliente = new Client();
        return cliente;
    }
}


