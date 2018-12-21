package lecturaArchivosClase;

// Fig. 14.12: PruebaLeerArchivoTexto.java

// Fig. 14.12: PruebaLeerArchivoTexto.java
// Este programa prueba la clase LeerArchivoTexto.

public class PruebaLeerArchivoTexto2
{
   public static void main( String args[] )
   {
      LeerArchivoTexto1 aplicacion = new LeerArchivoTexto1();

      aplicacion.abrirArchivo();
      aplicacion.leerRegistros(); // clientes.txt
      //aplicacion.leerRegistros2(); // datos.txt
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaLeerArchivoTexto