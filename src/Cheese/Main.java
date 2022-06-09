/*
*	grupo  : 1-gdam
*	alumno : Daniel Fern�ndez Mateos
*	n.exp. : 7252
*	fecha  : 09/06/2022
 */
package Cheese;

/**
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * Método main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         
         ListaProductos lista = new ListaProductos("LISTA PRODUCTOS");
            
         Producto producto = new Producto ("numero", "tipo", 012345, 9876);
         lista.registraProducto(producto);
         producto.imprime_etiqueta();
         
         Producto producto2 = new Producto ("numero", "tipo", 023456, 8765);
         lista.registraProducto(producto);
         producto.imprime_etiqueta();
                
     }
}
