package diagnostico;
import java.util.Scanner; //aqui se carga el paquete que se usara para el código.

public class MarcoAlrededor {
    
    public void marco(){
    
    Scanner teclado = new Scanner(System.in);
    // mandamos a llamar el paquete para convertirlo en un proceso y asi usarlo 
    // como un objeto dentro del código.
       
        System.out.print("Por favor ingrese el número de filas: ");
        int n = teclado.nextInt();
       // en la primer linea es la pregunta que le aparece al usuario y en la segunda
       // linea se guarda la respuesta del usuario.
        System.out.print("Por favor ingrese el número de columnas: ");
        int m = teclado.nextInt();
        // en la primer linea es la pregunta que le aparece al usuario y en la segunda
        // linea se guarda la respuesta del usuario.
            
            for(int i = 0; i < n; i++) {
                System.out.print("*");
                // Aquí declaramos como se nos presnetara la linea superior de los asteriscos.
            }
            System.out.println();
           
            for(int i = 0; i < m-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            // Estas lineas son para definir como se mostrara el centro de la forma, siendo
            // aqui cuando ponemos los espacios que tendra en blanco y como se acomodara 
            // con respecto a las lineas verticales y sus espacios correspondientes.
           
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            // Estas lineas son como las iniciales, pero aqui definimos como se mostraran
            // los asteriscos de la linea del contorno de abajo.
            System.out.println();
            // Este es un salto de linea para que no choquen las letras del programa y las
            // que coloca NetBeans.
        }
               
    }
    

