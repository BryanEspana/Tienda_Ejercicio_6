/***************************************************************************
@File Factura.java
@Autor: Bryan Carlos Roberto España Machorro
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 09/11/2021

Programa que tendra los metodos y las propiedades de la clase factura.
***************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class Factura 
{
    //Propiedades
    public String NombreCliente;
    public String Nit;
    public String FechaFactura;
    public int NumeroFactura;
    public Random rand;
    Scanner entrada = new Scanner(System.in);

    //Métodos

    //Constructor
    public Factura()
    {
        rand = new Random();
        NombreCliente = null;
        Nit = null;
        FechaFactura = null;
        NumeroFactura = rand.nextInt() * 100; 
    }

    /** 
     * @return
     */
    //Getters//
    public String getNombreCliente()
    {
        return NombreCliente;
    }

    public String getNit()
    {
        return Nit;
    }

    public String getFechaFactura()
    {
        return FechaFactura;
    }

    public int getNumeroFactura()
    {
        return NumeroFactura;
    }

    /** 
     * @param
     */
    //Setters//
    public void setNombreCliente(String NombreCliente)
    {
        this.NombreCliente = NombreCliente;
    }

    public void setNit(String Nit)
    {
        this.Nit = Nit;
    }

    public void setFechaFactura(String FechaFactura)
    {
        this.FechaFactura = FechaFactura;
    }

    public void setNumeroFactura(int NumeroFactura)
    {
        this.NumeroFactura = NumeroFactura;
    }

    //Pedir Datos//
    public void Datos()
    {
        System.out.println("\nIngrese su nombre: ");
		NombreCliente= entrada.next();
        System.out.println("Ingrese el numero de NIT: ");
		Nit = entrada.next();
        System.out.println("Ingrese la fecha actual: (formato: dd/mm/aaaa)");
		FechaFactura = entrada.next();
        NumeroFactura = rand.nextInt() * 10;
        
        setNombreCliente(NombreCliente);
        setNit(Nit);
        setFechaFactura(FechaFactura);
        setNumeroFactura(NumeroFactura);

        System.out.println("Nombre del cliente: " + NombreCliente);
        System.out.println("Numero de NIT: " + Nit);
        System.out.println("Fecha: " + FechaFactura);
        System.out.println("Numero de Factura: " + NumeroFactura);
    }
}  
