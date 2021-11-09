/***************************************************************************
@File Sucursal.java
@Autor: Bryan Carlos Roberto España Machorro
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 09/11/2021

Programa que tendra los metodos y las propiedades de la clase sucursal.
***************************************************************************/

import java.util.Scanner;
import java.io.*;

public class Sucursal 
{
    Scanner ScanInt = new Scanner(System.in);
        String sucursal1 = "--> Direccion: 10-75,\n--> Codigo: 1215684,\n--> Pais: Estados Unidos,\n--> Ciudad: California"; 
        String sucursal2 = "--> Direccion: 40-08,\n--> Codigo: 1857498,\n--> Pais: Guatemala,\n--> Ciudad: Jutiapa"; 
        String sucursal3 = "--> Direccion: 51-87,\n--> Codigo: 9873258,\n--> Pais: Guatemala,\n--> Ciudad: Xela"; 
        
        public void CrearSucursales()
        {
                File archi;  
                FileWriter archivo;
                PrintWriter escritor;
                archi = new File("sucursales.txt");
                if(!archi.exists())
                {
                try
                {
                        archi.createNewFile();
                        archivo = new FileWriter("C:\\Users\\S.Solorzano\\Documents\\Universidad\\Segundo semestre\\POO\\Ejercicios\\Ejercicio No. 6\\sucursales.txt",true);    
                        escritor = new PrintWriter(archivo);
                        escritor.println("Sucursales Tienda 'Electronica Latinoamericana'");
                        escritor.println("\nOpcion 1");
                        escritor.println("-Sucursal Estados unidos");
                        escritor.println(sucursal1);
                        escritor.println("\nOpcion 2");
                        escritor.println("-Sucursal Jutiapa");
                        escritor.println(sucursal2);
                        escritor.println("\nOpcion 3");
                        escritor.println("-Sucursal Xela");
                        escritor.println(sucursal3);
                        escritor.close();
                        archivo.close();
                }
                
                catch(IOException e)
                {
                        System.out.println("Error: " + e.getMessage());
                } 
                }
                else
                {
                try
                {
                        archivo = new FileWriter("C:\\Users\\S.Solorzano\\Documents\\Universidad\\Segundo semestre\\POO\\Ejercicios\\Ejercicio No. 6\\sucursales.txt",true);    
                        escritor = new PrintWriter(archivo);
                        escritor.println("Sucursales Tienda 'Electronica Latinoamericana'");
                        escritor.println("\nOpcion 1");
                        escritor.println("-Sucursal Estados unidos");
                        escritor.println(sucursal1);
                        escritor.println("\nOpcion 2");
                        escritor.println("-Sucursal Jutiapa");
                        escritor.println(sucursal2);
                        escritor.println("\nOpcion 3");
                        escritor.println("-Sucursal Xela");
                        escritor.println(sucursal3);
                        escritor.close();
                        archivo.close();
                }
                
                catch(IOException e)
                {
                        System.out.println("Error: " + e.getMessage());
                }     
                }
        }

        public String LeerTxt(String direccion)
        {
                String texto = "";
                
                try
                {
                        BufferedReader bf = new BufferedReader(new FileReader(direccion)); 
                        String temp = "";
                        String bfRead;

                        while((bfRead = bf.readLine()) != null)
                        {
                                temp = temp + "\n" +bfRead;
                        }

                        texto = temp;
                }
                catch(Exception e)
                {
                        System.err.println("No se encontro el archivo");        
                }

                return texto;
        }

        public void SucursalCercana(){
                System.out.println("¿Que sucursal le queda mas cercana?\n1."+sucursal1+"\n2."+sucursal2+"\n3."+sucursal3);
                int Num = ScanInt.nextInt();
                if(Num == 1){
                
                }
        }
}
