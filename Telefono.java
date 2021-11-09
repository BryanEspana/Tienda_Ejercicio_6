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

public class Telefono extends Celulares
{
    //Métodos
    
    //Información//
    @Override
    public void Info()
    {
        precio = 40;
        serie = "SKU KXTGB210LAB";
        marca = "Panasonic";
        fecha = "08/11/2021";
        marcador = "https://www.max.com.gt/electronicos/telefonos-fijos/telefono-dect-con-identificador-de-llamadas-panasonic-kxtgb210lab";

        setPrecio(precio);
        setSerie(serie);
        setMarca(marca);
        setFecha(fecha);
        setMarcador(marcador);

        System.out.println("El precio del telefono es: " + precio + " " + "dolares");
        System.out.println("La serie del telefono es: " + serie);
        System.out.println("La marca del telefono es: " + marca);
        System.out.println("La fecha del telefono es: " + fecha);
        System.out.println("El marcador del telefono es: " + marcador);
    }
    
    //Funcionalidades//
    @Override
    public void HacerLlamada()
    {
        System.out.println("\nIngrese el numero de celular: ");
		NumCelular= entrada.nextInt();
        setNumCelular(NumCelular);
        System.out.println("Llamando al número " + NumCelular + " desde mi telefono");
    }
}
