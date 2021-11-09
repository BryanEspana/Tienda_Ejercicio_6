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

import java.util.ArrayList;
import java.util.Scanner;

public class Producto{
    
    //Propiedades
    ArrayList<String> carrito = new ArrayList<String>();
    public int precio;
    public String serie;
    public String marca;
    public String fecha;
    public String marcador;
    Scanner entrada = new Scanner(System.in);

    //Métodos//

    //Constructor//
    public Producto()
    {
        precio = 0;
        serie = null;
        marca = null;
        fecha = null;
        marcador = null;
    }
        
    /** 
     * @return
     */
    //Getters//
    public int getPrecio()
    {
        return precio;
    }

    public String getSerie()
    {
        return serie;
    }

    public String getMarca()
    {
        return marca;
    }
    
    public String getFecha()
    {
        return fecha;
    }

    public String getMarcador()
    {
        return marcador;
    }

    /** 
     * @param
     */
    //Setters//
    public void setPrecio(int precio)
    {
        this.precio = precio;
    }

    public void setSerie(String serie)
    {
        this.serie = serie;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }    

    public void setMarcador(String marcador)
    {
        this.marcador = marcador;
    }

    //Información//
    public void Info()
    {
        
    }
    
    //Funcionalidades//
    public void HacerLlamada()
    {
        
    }
    
    public void TomarFotos()
    {
        
    }

    public void Navegar()
    {
        
    }

    public void ReproducirVideo()
    {
        
    }

    public void Portable()
    {
        
    }

    public void EjecutarJuego()
    {
        
    }

    public void TotalCompra()
    {
        
    }
}
