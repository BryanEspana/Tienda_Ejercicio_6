/***************************************************************************
@File Carrito.java
@Autor: Bryan Carlos Roberto España Machorro
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 09/11/2021

Programa que tendra los metodos y las propiedades de la clase carrito.
***************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Carrito 
{
    //Propiedades
    Scanner scan = new Scanner(System.in);
    List<String> carrito = new ArrayList<String>();
    int length = carrito.size();
    List<Integer> Precios = new ArrayList<Integer>();

    //Precios:
    protected int SmarphonePrice = 1500;
    protected int CelularPrice = 60;
    protected int TelefonoPrice = 40;
    protected int CamaraPrice = 100;
    protected int TelevisionPrice = 1000;
    protected int TabletPrice = 1000;
    protected int SmartwatchPrice = 350;
    protected int LaptopPrice = 1500;
    protected int DesktopPrice = 2000;
    protected int TotalPrecio = 0;
    
    public void setTotalPrecio(int TotalPrecio)
    {
        this.TotalPrecio = TotalPrecio;
    }
    
    public void Compras(){
        //List<String> carrito = new ArrayList<String>();
        System.out.println("¿Que productos desea comprar?");
        System.out.println("1. Smartphone\n2. Celular\n3. Telefono\n4. Camara\n5. Television\n6. Tablet\n7. Smartwatch\n8. Laptop\n9. Desktop\n10. Ver Carrito\n11. Salir\n");
        int compraOpcion = scan.nextInt();
        boolean continuar = true;
        while(continuar)
        {
            if(compraOpcion == 1)
            {
                System.out.println("Se ha agregado Su Smartphone a su carrito");
                carrito.add("1 - Smartphone");
                Precios.add(SmarphonePrice);
                continuar = false;
            }
            else if(compraOpcion == 2)
            {
                System.out.println("Se ha agregado Su Celular a su carrito");
                carrito.add("1 - Celular");
                Precios.add(CelularPrice);
                continuar = false;
            }
            else if(compraOpcion == 3)
            {
                System.out.println("Se ha agregado Su Telefono a su carrito");
                carrito.add("1 - Telefono");
                Precios.add(TelefonoPrice);
                continuar = false;
            }
            else if(compraOpcion == 4)
            {
                System.out.println("Se ha agregado Su camara a su carrito");
                carrito.add("1 - Camara");
                Precios.add(CamaraPrice);
                continuar = false;
            }
            else if(compraOpcion == 5)
            {
                System.out.println("Se ha agregado Su Television a su carrito");
                carrito.add("1 - Television");
                Precios.add(TelevisionPrice);
                continuar = false;
            }
            else if(compraOpcion == 6)
            {
                System.out.println("Se ha agregado Su Tablet a su carrito");
                carrito.add("1 - Tablet");
                Precios.add(TabletPrice);
                continuar = false;
            }
            else if(compraOpcion == 7)
            {
                System.out.println("Se ha agregado Su SmartWatch a su carrito");
                carrito.add("1 - SmartWatch");
                Precios.add(SmartwatchPrice);
                continuar = false;   
            }
            else if(compraOpcion == 8)
            {
                System.out.println("Se ha agregado Su Laptop a su carrito");
                carrito.add("1 - Laptop");
                Precios.add(LaptopPrice);
                continuar = false; 
            }
            else if(compraOpcion == 9)
            {
                System.out.println("Se ha agregado Su Desktop a su carrito");
                carrito.add("1 - Desktop");
                Precios.add(DesktopPrice);
                continuar = false; 
            }
            else if(compraOpcion == 10)
            {
                for (Integer data : Precios)
                {
                    TotalPrecio += data;
                }
                System.out.println("Su carrito de compras es:\n"+carrito);
                System.out.println("Su Precio total es:\n"+TotalPrecio);
                setTotalPrecio(TotalPrecio);
                continuar = false;
            }
            else
            {
                System.exit(0);
                continuar = true;
            }
        }
    }

    class Data 
    {
        int Precio;
        Data(int precio){
            this.Precio = precio;
        }
    }
}   
