/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto1
{
   private Scanner entrada;

   // permite al usuario abrir el archivo
   public void abrirArchivo()
   {
      try
      {
         entrada = new Scanner( new File( "data_estadios.txt" ) );
      } // fin de try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error al abrir el archivo." );
         System.exit( 1 );
      } // fin de catch
   } // fin del m�todo abrirArchivo

   // lee registro del archivo
   
   // lee registro del archivo
   public ArrayList<Estadio> leerRegistros()
   {
      ArrayList<Estadio> lista = new ArrayList<>();
      OperacionData o = new OperacionData();
      try // lee registros del archivo, usando el objeto Scanner
      {
         entrada.nextLine();
         while ( entrada.hasNext() )
         {
             Estadio e = new Estadio();//para que no se sobreescriban los datos en el arreglo
             String linea = entrada.nextLine();
             ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
             e.setNombre_estadio(linea_partes.get(0)); //. get es para obtener un dato de un arraylist
             e.setTipo_deporte(linea_partes.get(1));
             //e.setCapacidad(Double.parseDouble(linea_partes.get(2))); //cambia el dato de String a double
             double v = Double.parseDouble(linea_partes.get(2));
             e.setCapacidad(v);
             lista.add(e);
         } // fin de while
         
         //o.agregarInformacion(lista);
         //System.out.printf("El promedio es: %f", o.obtenerPromedioCapacidad());
         
         
      } // fin de try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "El archivo no esta bien formado." );
         entrada.close();
         System.exit( 1 );
      } // fin de catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error al leer del archivo." );
         System.exit( 1 );
      } // fin de catch
      return lista;
   } // fin del m�todo leerRegistros
   // cierra el archivo y termina la aplicaci�n
   public void cerrarArchivo()
   {
      if ( entrada != null )
         entrada.close(); // cierra el archivo
   } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto