/********************************************************************
@File Driver.java 
@Autor: Bryan Carlos Roberto España Machorro
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 09/11/2021

Driver program que servira como controlador e implementa el menú 
de opciones para la compra de artículos. 
********************************************************************/
package tienda;

import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Sucursal {
    
    Scanner ScanInt = new Scanner(System.in);
    String sucursal1 = "Direccion: 10-75,\nCodigo: 1215684,\nPais: Estados Unidos,\nCiudad: California"; 
    String sucursal2 = "Direccion: 40-08,\nCodigo: 1857498,\nPais: Guatemala,\nCiudad: Jutiapa"; 
    String sucursal3 = "Direccion: 51-87,\nCodigo: 9873258,\nPais: Guatemala,\nCiudad: Xela"; 
    public void CrearSucursales(){
        File archi;
        FileWriter archivo;
        PrintWriter Escrito;
        archi = new File("sucursales.txt");
        if(!archi.exists()){
            try{
                archi.createNewFile();
                archivo = new FileWriter("C:\\Users\\Bryan\\OneDrive - Universidad del Valle de Guatemala\\Documentos\\UVG");
                Escrito = new PrintWriter(archivo);
                Escrito.println("Direccion Estados unidos");
                Escrito.println(sucursal1); 
                Escrito.println("Direccion Jutiapa");
                Escrito.println(sucursal2);
                Escrito.println("Direccion Xela");
                Escrito.println(sucursal2);
                
                Escrito.close();
                archivo.close();
                
            }catch(IOException e){
                System.out.println("Error intentelo de nuevo");
            }
        }
        else{
            try{
                archivo = new FileWriter("C:\\Users\\Bryan\\OneDrive - Universidad del Valle de Guatemala\\Documentos\\UVG");
                
            } catch(IOException e){
                System.out.println("Error intentalo de nuevo.");
            }
        }
    }
    public void SucursalCercana(){
        System.out.println("¿Que sucursal le queda mas cercana?\n1."+sucursal1+"\n2."+sucursal2+"\n3."+sucursal3);
        int Num = ScanInt.nextInt();
        if(Num == 1){
            
        }
    }

    
}
