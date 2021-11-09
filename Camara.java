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


public class Camara extends Producto{
    //Propiedades
    public String Enlace;

    //Metodos

    //Constructor//
    public Camara()
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
        precio = 100;
        serie = "SKU DSCW800B";
        marca = "Sony";
        fecha = "08/11/2021";
        marcador = "https://www.max.com.gt/camara-digital-20-mpixel-video-hd-sony-dscw800b";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio de la camara es: " + precio + " " + "dolares");
        System.out.println("La serie de la camara es: " + serie);
        System.out.println("La marca de la camara es: " + marca);
        System.out.println("La fecha de la camara es: " + fecha);
        System.out.println("El marcador de la camara es: " + marcador);
    }
    
    //Funcionalidades//
    @Override
    public void TomarFotos()
    {
        System.out.println("Tomando una foto desde mi camara");
    }

    @Override
    public void ReproducirVideo()
    {
        System.out.println("Ingrese el enlace del video que desee reproducir: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("El video: " + Enlace + " se esta reproduciendo desde mi camara");
    }

    @Override
    public void Portable()
    {
        System.out.println("Mi camara es muy facil de transportar");
    }
}
