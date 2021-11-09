/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Carrito {
    Scanner scan = new Scanner(System.in);
    List<String> carrito = new ArrayList<String>();
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
    
    public void Compras(){
        //List<String> carrito = new ArrayList<String>();
        System.out.println("¿Que productos desea comprar?\n(LIMITE DE 5 PRODUCTOS)");
        System.out.println("1. Smartphone\n2. Celular\n3. Telefono\n4. Camara\n5. Television\n6. Tablet\n7. Smartwatch\n8. Laptop\n9. Desktop\n10. Ver Carrito\n11. Salir");
        int compraOpcion = scan.nextInt();
        boolean continuar = true;
        while(continuar){
            if(compraOpcion ==1){
            System.out.println("Se ha agregado Su Smartphone a su carrito");
            carrito.add("1 - Smartphone");
            Precios.add(SmarphonePrice);
                continuar = false;
            }else if(compraOpcion ==2){
            System.out.println("Se ha agregado Su Celular a su carrito");
            carrito.add("1 - Celular");
                continuar = false;
            }else if(compraOpcion ==3){
            System.out.println("Se ha agregado Su Telefono a su carrito");
            carrito.add("1 - Telefono");
                continuar = false;
            }else if(compraOpcion ==4){
            System.out.println("Se ha agregado Su Telefono a su carrito");
            carrito.add("1 - Telefono");
                continuar = false;
        }
        }
    }
}
