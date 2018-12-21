package Prueba1;

// Fig. 14.12: PruebaLeerArchivoTexto.java

// Fig. 14.12: PruebaLeerArchivoTexto.java
// Este programa prueba la clase LeerArchivoTexto.

public class Ejecutora
{
   public static void main( String args[] )
   {
      LeerArchivoTexto1 aplicacion = new LeerArchivoTexto1();
      
      OperacionData operacion = new OperacionData();
      
      aplicacion.abrirArchivo();
      operacion.agregarInformacion(aplicacion.leerRegistros());
      System.out.printf("El promedio es: %f",operacion.obtenerPromedioCapacidad());
      
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaLeerArchivoTexto