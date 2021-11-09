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

public class Tablets extends Producto
{
    //Propiedades
    public String Enlace;

    //Metodos

    //Constructor//
    public Tablets()
    {
        Enlace = null;
    }

    /** 
     * @return
     */
    //Getters//
    public String getEnlace()
    {
        return Enlace;
    }

    /** 
     * @param
     */
    //Setters//
    public void setEnlace(String Enlace)
    {
        this.Enlace = Enlace;
    }

    //Información//
    @Override
    public void Info()
    {
        precio = 2000;
        serie = "SKU MTFR2LZA";
        marca = "Apple";
        fecha = "08/11/2021";
        marcador = "https://www.max.com.gt/apple-ipad-pro-129-wifi-1tb-space-gray-apple-mtfr2lza";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio de la tablet es: " + precio + " " + "dolares");
        System.out.println("La serie de la tablet es: " + serie);
        System.out.println("La marca de la tablet es: " + marca);
        System.out.println("La fecha de la tablet es: " + fecha);
        System.out.println("El marcador de la tablet es: " + marcador);
    }
    
    //Funcionalidades//
    @Override
    public void TomarFotos()
    {
        System.out.println("Tomando una foto desde mi tablet");
    }

    @Override
    public void Navegar()
    {
        System.out.println("Ingrese el enlace donde desee navegar: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("Visitando la dirección web: " + Enlace + " desde mi tablet");
    }

    @Override
    public void ReproducirVideo()
    {
        System.out.println("Ingrese el enlace del video que desee reproducir: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("El video: " + Enlace + " se esta reproduciendo desde mi tablet");
    }
    
    @Override
    public void Portable()
    {
        System.out.println("Mi tablet es muy facil de transportar");
    }
}
