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

/**
 *
 * @author Bryan
 */
public class Celulares extends Producto
{
    //Propiedades
    public int NumCelular;

    //Metodos

    //Constructor//
    public Celulares()
    {
        NumCelular = 0;
    }

    /** 
     * @return
     */
    //Getters//
    public int getNumCelular()
    {
        return NumCelular;
    }

    /** 
     * @param
     */
    //Setters//
    public void setNumCelular(int NumCelular)
    {
        this.NumCelular = NumCelular;
    }

    //Información//
    @Override
    public void Info()
    {
        precio = 60;
        serie = "SKU HIU962";
        marca = "Hisense";
        fecha = "08/11/2021";
        marcador = "https://www.max.com.gt/hisense-u962-liberado-gris-hisense-hiu962";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio del celular es: " + precio + " " + "dolares");
        System.out.println("La serie del celular es: " + serie);
        System.out.println("La marca del celular es: " + marca);
        System.out.println("La fecha del celular es: " + fecha);
        System.out.println("El marcador del celular es: " + marcador);
    }
    
    //Funcionalidades//
    @Override
    public void HacerLlamada()
    {
        System.out.println("\nIngrese el numero de celular: ");
		NumCelular= entrada.nextInt();
        setNumCelular(NumCelular);
        System.out.println("Llamando al número " + NumCelular + " desde mi celular");
    }

    @Override
    public void Portable()
    {
        System.out.println("Mi celular es muy facil de transportar");
    }
}
