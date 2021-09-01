package diagnostico;
import java.util.Scanner; //aqui se carga el paquete que se usara para el código.

public class MitadMatriz {
    
    public void mitad(){
        
        int matriz[][] = new int[3][3];		
        matriz[0][0] = 1;
    matriz[0][1] = 1;
    matriz[0][2] = 1;
    matriz[1][0] = 1;
    matriz[1][1] = 1;
    matriz[1][2] = 0;
    matriz[2][0] = 1;
    matriz[2][1] = 0;
    matriz[2][2] = 0;
    // Declaramos directamente la matriz y sus valores, colocando cada valor en su
    // respectivo lugar.
    
    for (int x=0; x < matriz.length; x++) {
  System.out.print("|");
  for (int y=0; y < matriz[x].length; y++) {
    System.out.print (matriz[x][y]);
    if (y!=matriz[x].length-1) System.out.print("\t");
    // Ponemos nuestro ciclo de repetición para poner como queremos la matriz
    // el orden que llevara, y como es que se mostrara.
  }
  System.out.println("|");
}
    }
    
}
