/**********************************************************************
@File Vista.java
@Autor: Bryan Carlos Roberto España Machorro
        Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 09/11/2021

Programa que mostrará a los usuarios el menú de opciones para comprar
artículos.
**********************************************************************/

import java.util.Scanner;

public class Vista 
{
    //Propiedades
	private Scanner scan;
    Scanner entrada = new Scanner(System.in);
	Smartphone s = new Smartphone();
	Celulares c = new Celulares();
	Telefono t = new Telefono();
	Camara ca = new Camara();
	TV tv = new TV();
	Tablets ta = new Tablets();
	Smartwatch sw = new Smartwatch();
	Laptop l = new Laptop();
	Desktop d = new Desktop();
	
    //Métodos 
	
	//Constructor
	public Vista()
	{
		scan = new Scanner(System.in);
	}
	
	public void bienvenida()
	{
		System.out.println("\nBienvendi@ a la tienda 'Electronica Latinoamericana'!");
	}
	
	public int MenuOpciones()
	{
		int op;
		String s = "\nQue desea hacer?\n" +
					"1. Ver Productos\n" +
                    "2. Hacer compras\n" +
                    "3. Ver carrito\n" +
                    "4. Ver factura\n" +
                    "5. Ver sucursales\n" +
					"6. Salir\n";
		System.out.println(s);
		op = scan.nextInt();
		
		return op;
	}
	
	public void opcionInvalida()
	{
		System.out.println("\nHa elegido una opcin invalida.\n");
	}
    
	public void VerInfo()
	{
		boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nQue producto desea ver?");
            System.out.println("1. Smartphone");
            System.out.println("2. Celular");
            System.out.println("3. Telefono");
			System.out.println("4. Camara");
			System.out.println("5. Television");
			System.out.println("6. Tablet");
			System.out.println("7. Smartwatch");
			System.out.println("8. Laptop");
			System.out.println("9. Desktop");
            System.out.println("10. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Informacion de Smartphone\n");
                    s.Info();
                    break;
                case 2:
					System.out.println("Informacion de Celular\n");
					c.Info();
                    break;
                case 3:
					System.out.println("Informacion de Telefono\n");
                    t.Info();
                    break;
				case 4:
					System.out.println("Informacion de Camara\n");
                    ca.Info();
                    break;
				case 5:
					System.out.println("Informacion de Television\n");
                    tv.Info();
                    break;
				case 6:
					System.out.println("Informacion de Tablet\n");
                    ta.Info();
                    break;
				case 7:
					System.out.println("Informacion de Smartwatch\n");
                    sw.Info();
                    break;
				case 8:
					System.out.println("Informacion de Laptop\n");
                    l.Info();
                    break;
				case 9:
					System.out.println("Informacion de Desktop\n");
                    d.Info();
                    break;
                case 10:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
	}

	public void funcionalidades()
	{
		boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nQue producto desea ver?");
            System.out.println("1. Smartphone");
            System.out.println("2. Celular");
            System.out.println("3. Telefono");
			System.out.println("4. Camara");
			System.out.println("5. Television");
			System.out.println("6. Tablet");
			System.out.println("7. Smartwatch");
			System.out.println("8. Laptop");
			System.out.println("9. Desktop");
            System.out.println("10. Salir\n");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Funcionalidades de Smartphone\n");
                    System.out.println("\nQue funcionalidad desea ver?");
            		System.out.println("1. Hacer una llamada");
            		System.out.println("2. Tomar una foto");
            		System.out.println("3. Navegar");
					System.out.println("4. Reproducir un video");
					System.out.println("5. Portable");
					System.out.println("6. Salir\n");
					int opcion1 = scan.nextInt();
					switch(opcion1)
					{
						case 1:
							s.HacerLlamada();
							break;
						case 2:
							s.TomarFotos();
							break;
						case 3:
							s.Navegar();
							break;
						case 4:
							s.ReproducirVideo();
							break;
						case 5:
							s.Portable();
							break;
						case 6:
                    		System.out.println("Regresara al menu de funcionalidades!");
                    		continuar = false;
                    		break;   
                		default:
                    		System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    		continuar = true;
					}
                    break;
                case 2:
					System.out.println("Funcionalidades de Celular\n");
					System.out.println("\nQue funcionalidad desea ver?");
            		System.out.println("1. Hacer una llamada");
            		System.out.println("2. Portable");
					System.out.println("3. Salir\n");
					int opcion2 = scan.nextInt();
					switch(opcion2)
					{
						case 1:
							c.HacerLlamada();
							break;
						case 2:
							c.Portable();
							break;
						case 3:
                    		System.out.println("Regresara al menu de funcionalidades!");
                    		continuar = false;
                    		break;   
                		default:
                    		System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    		continuar = true;
					}
                    break;
                case 3:
					System.out.println("Funcionalidades de Telefono\n");
                    System.out.println("\nQue funcionalidad desea ver?");
            		System.out.println("1. Hacer una llamada");
            		System.out.println("2. Salir\n");
					int opcion3 = scan.nextInt();
					switch(opcion3)
					{
						case 1:
							t.HacerLlamada();
							break;
						case 2:
                    		System.out.println("Regresara al menu de funcionalidades!");
                    		continuar = false;
                    		break;   
                		default:
                    		System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    		continuar = true;
					}
                    break;
				case 4:
					System.out.println("Funcionalidades de Camara\n");
                    System.out.println("\nQue funcionalidad desea ver?");
            		System.out.println("1. Tomar una foto");
            		System.out.println("2. Reproducir un video");
					System.out.println("3. Portable");
					System.out.println("4. Salir\n");
					int opcion4 = scan.nextInt();
					switch(opcion4)
					{
						case 1:
							ca.TomarFotos();
							break;
						case 2:
							ca.ReproducirVideo();
							break;
						case 3:
							ca.Portable();;
							break;
						case 4:
                    		System.out.println("Regresara al menu de funcionalidades!");
                    		continuar = false;
                    		break;   
                		default:
                    		System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    		continuar = true;
					}
                    break;
				case 5:
					System.out.println("Funcionalidades de Television\n");
                    System.out.println("\nQue funcionalidad desea ver?");
            		System.out.println("1. Navegar");
            		System.out.println("2. Reproducir un video");
					System.out.println("3. Salir\n");
					int opcion5 = scan.nextInt();
					switch(opcion5)
					{
						case 1:
							tv.Navegar();
							break;
						case 2:
							tv.ReproducirVideo();
							break;
						case 3:
                    		System.out.println("Regresara al menu de funcionalidades!");
                    		continuar = false;
                    		break;   
                		default:
                    		System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    		continuar = true;
					}
                    break;
				case 6:
					System.out.println("Funcionalidades de Tablet\n");
                    System.out.println("\nQue funcionalidad desea ver?");
            		System.out.println("1. Tomar una foto");
            		System.out.println("2. Navegar");
					System.out.println("3. Reproducir un video");
					System.out.println("4. Portable");
					System.out.println("5. Salir\n");
					int opcion6 = scan.nextInt();
					switch(opcion6)
					{
						case 1:
							ta.TomarFotos();
							break;
						case 2:
							ta.Navegar();
							break;
						case 3:
							ta.ReproducirVideo();
							break;
						case 4:
							ta.Portable();
							break;
						case 5:
                    		System.out.println("Regresara al menu de funcionalidades!");
                    		continuar = false;
                    		break;   
                		default:
                    		System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    		continuar = true;
					}
                    break;
				case 7:
					System.out.println("Funcionalidades de Smartwatch\n");
                    System.out.println("\nQue funcionalidad desea ver?");
            		System.out.println("1. Hacer una llamada");
            		System.out.println("2. Tomar una foto");
            		System.out.println("3. Portable");
					System.out.println("4. Salir\n");
					int opcion7 = scan.nextInt();
					switch(opcion7)
					{
						case 1:
							sw.HacerLlamada();
							break;
						case 2:
							sw.TomarFotos();
							break;
						case 3:
							sw.Portable();
							break;
						case 4:
                    		System.out.println("Regresara al menu de funcionalidades!");
                    		continuar = false;
                    		break;   
                		default:
                    		System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    		continuar = true;
					}
                    break;
				case 8:
					System.out.println("Funcionalidades de Laptop\n");
					System.out.println("\nQue funcionalidad desea ver?");
            		System.out.println("1. Navegar");
					System.out.println("2. Reproducir un video");
					System.out.println("3. Ejecutar videojuegos");
					System.out.println("4. Portable");
					System.out.println("5. Salir\n");
					int opcion8 = scan.nextInt();
					switch(opcion8)
					{
						case 1:
							l.Navegar();
							break;
						case 2:
							l.ReproducirVideo();
							break;
						case 3:
							l.EjecutarJuego();
							break;
						case 4:
							l.Portable();
							break;
						case 5:
                    		System.out.println("Regresara al menu de funcionalidades!");
                    		continuar = false;
                    		break;   
                		default:
                    		System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    		continuar = true;
					}
                    break;
				case 9:
					System.out.println("Funcionalidades de Desktop\n");
                    System.out.println("\nQue funcionalidad desea ver?");
            		System.out.println("1. Navegar");
					System.out.println("2. Reproducir un video");
					System.out.println("3. Ejecutar videojuegos");
					System.out.println("4. Salir\n");
					int opcion9 = scan.nextInt();
					switch(opcion9)
					{
						case 1:
							d.Navegar();
							break;
						case 2:
							d.ReproducirVideo();
							break;
						case 3:
							d.EjecutarJuego();
							break;
						case 4:
                    		System.out.println("Regresara al menu de funcionalidades!");
                    		continuar = false;
                    		break;   
                		default:
                    		System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    		continuar = true;
					}
                    break;
                case 10:
                    System.out.println("Regresara al menu principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
	}

    public void Carrito()
	{
		
	}
	
	public void despedida()
	{
		System.out.println("\nAdios, que tenga feliz dia!\n");
	}
}
