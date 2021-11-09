/********************************************************************
@File Driver.java 
@Autor: Bryan Carlos Roberto España Machorro
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 09/11/2021

Driver program que servira como controlador e implementa el menú 
de opciones para la compra de artículos. 
********************************************************************/

import java.util.ArrayList;
import java.util.List;

public class Driver 
{
    public static void main(String[] args)
    {
        //Propiedades//
		Vista vista = new Vista();
		Carrito carrito = new Carrito();
		Factura factura = new Factura();
		Sucursal sucursal = new Sucursal();
		vista.bienvenida();
		int opcion = 0;

        while (opcion != 6)
		{
			opcion = vista.MenuOpciones();
			
			if (opcion == 1)
			{
				//Ver Productos
				vista.VerInfo();
			}

			else if (opcion == 2)
			{
				//Hacer Compras
				vista.funcionalidades();
			}
            
            else if (opcion == 3)
			{
				//Ver Carrito
		    		carrito.Compras();
			}

            else if (opcion == 4)
			{
				//Ver Factura
		    		factura.Datos();
			}

            else if (opcion == 5)
			{
				//Ver Sucursales
		    		sucursal.CrearSucursales();
				System.out.println(sucursal.LeerTxt("C:\\Users\\S.Solorzano\\Documents\\Universidad\\Segundo semestre\\POO\\Ejercicios\\Ejercicio No. 6\\sucursales.txt"));
			}

            else if (opcion == 6)
			{
				//Salir
				vista.despedida();
			}
			
			else
			{
				vista.opcionInvalida();
			}	
		}
    }
}
