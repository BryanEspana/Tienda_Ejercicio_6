/***************************************************************************
@File Smartwatch.java
@Autor: Bryan Carlos Roberto España Machorro
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 09/11/2021

Programa que tendra los metodos y las propiedades de la clase smartwatch.
***************************************************************************/

public class Smartwatch extends Producto
{
    //Propiedades
    public int NumCelular;

    //Metodos

    //Constructor//
    public Smartwatch()
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
        precio = 350;
        serie = "SKU MYDP2LZA";
        marca = "Apple";
        fecha = "08/11/2021";
        marcador = "https://www.max.com.gt/marcas/productos-apple/prendas-electronicas-apple/apple-watch-se-gps-40mm-negro-apple-mydp2lza";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio del Smartwatch es: " + precio + " " + "dolares");
        System.out.println("La serie del Smartwatch es: " + serie);
        System.out.println("La marca del Smartwatch es: " + marca);
        System.out.println("La fecha del Smartwatch es: " + fecha);
        System.out.println("El marcador del Smartwatch es: " + marcador);
    }
    
    //Funcionalidades//
    @Override
    public void TomarFotos()
    {
        System.out.println("Se tomo una foto desde mi Smartwatch");
    }
    
    @Override
    public void HacerLlamada()
    {
        System.out.println("\nIngrese el numero de celular: ");
		NumCelular= entrada.nextInt();
        setNumCelular(NumCelular);
        System.out.println("Llamando al número " + NumCelular + " desde mi Smartwatch");
    }

    @Override
    public void Portable()
    {
        System.out.println("Mi Smartwatch es muy facil de transportar");   
    }
}
