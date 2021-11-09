/***************************************************************************
@File TV.java
@Autor: Bryan Carlos Roberto España Machorro
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 09/11/2021

Programa que tendra los metodos y las propiedades de la clase tv.
***************************************************************************/

public class TV extends Producto
{
    //Propiedades
    public String Enlace;

    //Metodos

    //Constructor//
    public TV()
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
        precio = 1000;
        serie = "SKU UN65AU8000";
        marca = "Samsung";
        fecha = "08/11/2021";
        marcador = "https://www.max.com.gt/samsung-un65au8000-65-smart-led-tv-4kultra-hd-samsung-un65au8000";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio del TV es: " + precio + " " + "dolares");
        System.out.println("La serie del TV es: " + serie);
        System.out.println("La marca del TV es: " + marca);
        System.out.println("La fecha del TV es: " + fecha);
        System.out.println("El marcador del TV es: " + marcador);
    }
    
    //Funcionalidades//
    @Override
    public void Navegar()
    {
        System.out.println("Ingrese el enlace donde desee navegar: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("Visitando la dirección web: " + Enlace + " desde mi TV");
    }

    @Override
    public void ReproducirVideo()
    {
        System.out.println("Ingrese el enlace del video que desee reproducir: ");
		Enlace = entrada.next();
        setEnlace(Enlace);
        System.out.println("El video: " + Enlace + " se esta reproduciendo desde mi TV");
    }
}
