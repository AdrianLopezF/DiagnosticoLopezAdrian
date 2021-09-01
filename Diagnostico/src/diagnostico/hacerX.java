package diagnostico;
import java.util.Scanner; //aqui se carga el paquete que se usara para el código.

public class hacerX {
    
    public void laX(){
    
    Scanner entrada=new Scanner(System.in); 
        // mandamos a llamar el paquete para convertirlo en un proceso y asi usarlo 
        // como un objeto dentro del código.
        
            System.out.println("De cuantas columnas quiere la matriz?");
    int filas = entrada.nextInt();
    // en la primer linea es la pregunta que le aparece al usuario y en la segunda
    // linea se guarda la respuesta del usuario.
            System.out.println("De cuantas filas quiere la matriz?");
    int columnas = entrada.nextInt();
    // en la primer linea es la pregunta que le aparece al usuario y en la segunda
    // linea se guarda la respuesta del usuario.
    int arreglo [][] = new int[filas][columnas];
    // En esta linea mandamos a llamar los datos que introdujo el usuario y asi mismo
    // poder pasarlos a lo siguiente del codigo.

    for ( int i=0; i <filas;i++){
          for (int j=0;  j<columnas;j++){
                int x = i + 1;
                if((i==j)  ||  (j == (filas - x))){
                    arreglo[i][j] = '*';
    // aqui es donde elegimos que numero se pondra en la "X" que vamos a formar, pero no                
    // supe como ponerle el "*" 
                    System.out.print(arreglo[i][j] + " ");
// Aqui se desarrolla el ciclo for, donde se declara el valor inicial, el valor final y                    
// el proceso que se desarrolla, seguido de eso, viene el proceso del if, donde tenemos
// que indicar que hara si se cumple cierta condicion y que es lo que mostrara.
                }
                else{
                   arreglo[i][j] = 0;
                   System.out.print(arreglo[i][j] + " ");
// con el else se muestra lo mismo que el if, pero es una situacion que pasa cuando ocurre                   
// algo diferente a la indicacion principal del if.
                }
          }  
           System.out.println();
           // con esta linea, damos un pequeño salto de linea al final para que el resultado
           // no se junte con las letras que pone netBeans al final.
    }   
}
}
