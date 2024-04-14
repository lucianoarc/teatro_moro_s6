
package teatro_moro_s6;

import java.util.Scanner;


public class Teatro_moro_s6 {
                                                                                //definicion de variables estaticas / globales
static Scanner entrada = new Scanner(System.in);
static double estudiante=20;                                                    //variable estatica                                               
static double tercera_edad=40;                                                  //variable estatica
static double general=0.00;                                                     //variable estatica

class grupo{                                                                    //variable global
static int grupo=0;
}

class dospersonas{                                                              //variable global
static double dospersonas=30;
}

class trespersonas{                                                             //variable global
static double trespersonas=40;
}

class cuatropersonas{                                                           //variable global
static double cuatropersonas=50;
}

    public static void main(String[] args) {
        int edad=0,vip,plateaalta,palcos,preciobase=0,total=0,entrar;           //definicion de variables locales
        String edades,categoria,pagar,ubicacion=null;
        double descuento=0;                                                     //definicion de variables locales
        
        
        System.out.println("Bienvenido al Teatro Moro");                      //menu de inicio
        System.out.println("");
        System.out.println("Este 15/04/2024 Estara !Clase Sumativa_2! ");
        System.out.println("");
        System.out.println("Estudiante 20% descuento");
        System.out.println("Tercera Edad 40% descuento");
        System.out.println("");
        
        System.out.println(" 1- COMPRAR ENTRADA ");
        System.out.println(" 2- SALIR ");                                     //menu de inicio
        do{                                                                     //bucle del menu para una opcion invalida
        entrar=entrada.nextInt();
        switch (entrar){
            case 1:{                                                            //opcion de comprar una entrada
                System.out.println("    Entradas   -     Tarifas " );
                System.out.println("|  Categorias  |  Valor Entrada  |");
                System.out.println("|     Vip      |     $25.000     |");
                System.out.println("| Platea alta  |     $11.000     |"); 
                System.out.println("|    Palcos    |     $7.200      |");
                System.out.println("");
                System.out.println("Por favor ingresar su edad:");
        do{                                                             //bucle de la edad del usuario (entre 5 a 100 años) 
                edad = entrada.nextInt();
                    if (edad<5||edad>100){
                    System.out.println("edad incorrecta");}
        } while (edad<5 || edad>100);                                   //bucle de la edad del usuario (entre 5 a 100 años)
             
                    if (edad < 18) {
                    edades = "Estudiante";
                    } else if (edad >= 60) {
                    edades = "Tercera Edad";
                    } else {
                    edades = "General";
                    }
                    System.out.println("Su edad califica como ! " + edades +" ! ");
                    System.out.println("");
            
            
                    
                    if (edades.equalsIgnoreCase("estudiante")) {      // Descuentos según edad
                    descuento = estudiante; // Descuento estudiante
                    } 
                    else if (edades.equalsIgnoreCase("tercera edad")) {
                    descuento = tercera_edad; // Descuento tercera edad
                    }   
                    else  {
                    descuento=general;
                    }                                                           // Descuentos según edad
               

            
                    System.out.println("cuantas entradas necesitas (max 4 por persona)"); //opcion de comprar mas de una entrada
        do{                                                             
                        grupo.grupo=entrada.nextInt();
        switch (grupo.grupo){
            case 1:
                        System.out.println("perfecto 1 entrada ");
                        System.out.println("");
                        System.out.println("Que categoria necesitas?");
                        System.out.println("- Vip");
                        System.out.println("- Platea alta");
                        System.out.println("- Palcos");
                        entrada.nextLine();
        do{                                                                     //bucle para seleccion de categoria de entrada
                        categoria = entrada.nextLine().toLowerCase();           //.tolowercase(para que tranforme la cadena de caracter a minuscula)
                        System.out.println("");
        switch (categoria){
            case "vip":
                        vip = 25000;
                        total =(total+vip);
                        ubicacion= "Vip";
                        preciobase = 25000;
                        break;
            case "platea alta":
                        plateaalta =11000;
                        total = (total+plateaalta);
                        ubicacion = "Platea alta";
                        preciobase = 11000;
                        break;
            case "palcos":
                        palcos = 7200;
                        total = (total+palcos);
                        ubicacion= "Palcos";
                        preciobase = 7200;
                         break;
            default:
                        System.out.println("Categoria invalida.");
                        break;
                    }
        } while (!categoria.equalsIgnoreCase("vip")&& !categoria.equalsIgnoreCase("platea alta") && !categoria.equalsIgnoreCase("palcos"));// final del bucle de categoria de entrada
                        System.out.println("");                               // IMPRESION DE BOLETO O RESUMEN DE LA COMPRAR  
                        System.out.println("Resumen de la compra:");
                        System.out.println("Ubicacion del asiento: " + ubicacion);
                        System.out.println("Precio base de la entrada: $" + preciobase);
                        System.out.println("Descuento aplicado: " + descuento +"%");
                        descuento = (descuento /100);
                        descuento = (descuento * total);
                        total -=descuento;
                        System.out.println("Precio final a pagar: $" + total);
                        System.out.println("");                               //IMPRESION DE BOLETO O RESUMEN DE LA COMPRAR
        do{                                                                     //Bucle opcion pagar 
                        System.out.println("ingrese pagar para finalizar la compra");
                        pagar=entrada.nextLine().toLowerCase();
                    if (pagar.equalsIgnoreCase("pagar")){
                        System.out.println("");
                        System.out.println("COMPRA APROBADA");
                        System.out.println("QUE DISFRUTE EL EVENTO");}
                
                    else {
                        System.out.println(" !Opcion Invalida! ");
                        System.out.println("");
                        }
                    
        } while (!pagar.equalsIgnoreCase("pagar"));                   //final del bucle opcion pagar pagar
                        break;
            case 2:
                        System.out.println("perfecto 2 entradas");
                        System.out.println("");
                        System.out.println("por esta opcion te damos un 30% de descuento al final de tu compra ");
                        personasx2(edades);                                     //llamando al codigo personasx2
                        break;
            case 3:
                        System.out.println("perfecto 3 entradas");
                        System.out.println("");
                        System.out.println("por esta opcion te damos un 40% de descuento al final de tu compra ");
                        personasx3(edades);                                     //llamando al codigo personasx3
                        break;
            case 4 :
                        System.out.println("perfecto 4 entradas");
                        System.out.println("");
                        System.out.println("por esta opcion te damos un 50% de descuento al final de tu compra ");
                        personasx4(edades);                                     //llamando al codigo personax4
                        break;
            default:
                        System.out.println(" ! Opcion incorrecta ! ");
                        break;
                                            }
        }while (grupo.grupo<1||grupo.grupo>4);
                        break;
                    }                                                           //opcion 1-  comprar una entrada
            case 2:{                                                    //opcion 2- salir
                        System.out.println("! Hasta Luego !");
                        break;  
                    }                                                           //opcion 2- salir
            default:{                                                   //opcion en caso de error 
                        System.out.println(" !====Opcion Invalida====! ");
                        break;
                    }                                                           ////opcion en caso de error
            
                        }
        }while (entrar<1||entrar>2);                                            //final del bucle del menu para una opcion invalida
                        System.out.println("");
                        System.out.println("! FIN DEL PROGRAMA !");           //final del programa
                                                }
    
    
    
    
    public static void personasx2(String edades){                               //CODIGO PERSONASX2 (OPCION CUANDO EL USUARIO COMPRA 2 ENTRADAS)
        int vip,plateaalta,palcos,preciobase=0,total=0;
        String categoria,pagar,ubicacion=null;
        double descuento=0,descuentototal=0;
        
        System.out.println("Que categoria necesitas?");
        System.out.println("- Vip");
        System.out.println("- Platea alta");
        System.out.println("- Palcos");
        entrada.nextLine();
        do{
        categoria = entrada.nextLine().toLowerCase();
        System.out.println("");
             switch (categoria){
             case "vip":
                    vip = 25000;
                    total =(total+vip);
                    ubicacion= "Vip";
                    preciobase = 25000;
                    break;
            case "platea alta":
                    plateaalta =11000;
                    total = (total+plateaalta);
                    ubicacion = "Platea alta";
                    preciobase = 11000;
                    break;
            case "palcos":
                    palcos = 7200;
                    total = (total+palcos);
                    ubicacion= "Palcos";
                    preciobase = 7200;
                    break;
            default:
                    System.out.println("Categoria invalida.");
                    break;
                                }
             } while (!categoria.equalsIgnoreCase("vip")&& !categoria.equalsIgnoreCase("platea alta") && !categoria.equalsIgnoreCase("palcos"));
            
                    if (edades.equalsIgnoreCase("estudiante")) {
                    descuento = estudiante; // Descuento estudiante
                    } 
                    else if (edades.equalsIgnoreCase("tercera edad")) {
                    descuento = tercera_edad; // Descuento tercera edad
                    }
                    else  {
                    descuento=general;
                    }
                System.out.println("Resumen de la compra:");
                System.out.println("Ubicacion del asiento: " + ubicacion);
                System.out.println("cantidad de entradas: "+grupo.grupo);
                System.out.println("Precio base de la entrada: $" + preciobase);
                System.out.println("Precio parcial de las entradas: $" + (preciobase*grupo.grupo));
                total=(preciobase*grupo.grupo);
                descuentototal=(descuento+dospersonas.dospersonas);
                System.out.println("Descuento aplicado: " + descuentototal +"%");
                descuento = (descuentototal /100);
                descuento = (descuento * total);
                total -=descuento;
                System.out.println("Precio final a pagar: $" + total);
                System.out.println("");
        do{
                System.out.println("ingrese pagar para finalizar la compra");
                pagar=entrada.nextLine().toLowerCase();
                    if (pagar.equalsIgnoreCase("pagar")){
                        System.out.println("COMPRA APROBADA");
                        System.out.println("QUE DISFRUTE EL EVENTO");}
                    else {
                        System.out.println(" !Opcion Invalida! ");
                        System.out.println("");
                        }
                    
        } while (!pagar.equalsIgnoreCase("pagar"));
    }                                                                           //CODIGO PERSONASX2 (OPCION CUANDO EL USUARIO COMPRA 2 ENTRADAS)
    
    
    
    
    public static void personasx3(String edades){                               //CODIGO PERSONASX3 (OPCION CUANDO EL USUARIO COMPRA 3 ENTRADAS)
        int vip,plateaalta,palcos,preciobase=0,total=0;
        String categoria,pagar,ubicacion=null;
        double descuento=0,descuentototal=0;
        
        System.out.println("Que categoria necesitas?");
        System.out.println("- Vip");
        System.out.println("- Platea alta");
        System.out.println("- Palcos");
        entrada.nextLine();
        do{
        categoria = entrada.nextLine().toLowerCase();
        System.out.println("");
            switch (categoria){
            case "vip":
                    vip = 25000;
                    total =(total+vip);
                    ubicacion= "Vip";
                    preciobase = 25000;
                    break;
            case "platea alta":
                    plateaalta =11000;
                    total = (total+plateaalta);
                    ubicacion = "Platea alta";
                    preciobase = 11000;
                    break;
            case "palcos":
                    palcos = 7200;
                    total = (total+palcos);
                    ubicacion= "Palcos";
                    preciobase = 7200;
                    break;
            default:
                    System.out.println("Categoria invalida.");
                    break;
                    }
            } while (!categoria.equalsIgnoreCase("vip")&& !categoria.equalsIgnoreCase("platea alta") && !categoria.equalsIgnoreCase("palcos"));
                     if (edades.equalsIgnoreCase("estudiante")) {
                        descuento = estudiante; // Descuento estudiante
                    } 
                    else if (edades.equalsIgnoreCase("tercera edad")) {
                        descuento = tercera_edad; // Descuento tercera edad
                    }   
                    else  {
                        descuento=general;
                    }
                    System.out.println("Resumen de la compra:");
                    System.out.println("Ubicacion del asiento: " + ubicacion);
                    System.out.println("cantidad de entradas: "+grupo.grupo);
                    System.out.println("Precio base de la entrada: $" + preciobase);
                    System.out.println("Precio parcial de las entradas: $" + (preciobase*grupo.grupo));
                    total=(preciobase*grupo.grupo);
                    descuentototal=(descuento+trespersonas.trespersonas);
                    System.out.println("Descuento aplicado: " + descuentototal +"%");
                    descuento = (descuentototal /100);
                    descuento = (descuento * total);
                    total -=descuento;
                    System.out.println("Precio final a pagar: $" + total);
                    System.out.println("");
        do{
                    System.out.println("ingrese pagar para finalizar la compra");
                    pagar=entrada.nextLine().toLowerCase();
                    if (pagar.equalsIgnoreCase("pagar")){
                        System.out.println("COMPRA APROBADA");
                        System.out.println("QUE DISFRUTE EL EVENTO");}
                    else {
                        System.out.println(" !Opcion Invalida! ");
                        System.out.println("");
                }
                    
        } while (!pagar.equalsIgnoreCase("pagar"));
    }  
    


                                                                                //CODIGO PERSONASX3 (OPCION CUANDO EL USUARIO COMPRA 3 ENTRADAS)
public static void personasx4(String edades){                                   //CODIGO PERSONASX4 (OPCION CUANDO EL USUARIO COMPRA 4 ENTRADAS)
        int vip,plateaalta,palcos,preciobase=0,total=0;
        String categoria,pagar,ubicacion=null;
        double descuento=0,descuentototal=0;
        
            System.out.println("Que categoria necesitas?");
            System.out.println("- Vip");
            System.out.println("- Platea alta");
            System.out.println("- Palcos");
            entrada.nextLine();
            do{
            categoria = entrada.nextLine().toLowerCase();
            System.out.println("");
            switch (categoria){
            case "vip":
                    vip = 25000;
                    total =(total+vip);
                    ubicacion= "Vip";
                    preciobase = 25000;
                    break;
            case "platea alta":
                    plateaalta =11000;
                    total = (total+plateaalta);
                    ubicacion = "Platea alta";
                    preciobase = 11000;
                    break;
            case "palcos":
                    palcos = 7200;
                    total = (total+palcos);
                    ubicacion= "Palcos";
                    preciobase = 7200;
                    break;
            default:
                    System.out.println("Categoria invalida.");
                    break;
                    }
            } while (!categoria.equalsIgnoreCase("vip")&& !categoria.equalsIgnoreCase("platea alta") && !categoria.equalsIgnoreCase("palcos"));
                    if (edades.equalsIgnoreCase("estudiante")) {
                        descuento = estudiante; // Descuento estudiante
                    } 
                    else if (edades.equalsIgnoreCase("tercera edad")) {
                        descuento = tercera_edad; // Descuento tercera edad
                    }
                    else  {
                        descuento=general;
                    }
            System.out.println("Resumen de la compra:");
            System.out.println("Ubicacion del asiento: " + ubicacion);
            System.out.println("cantidad de entradas: "+grupo.grupo);
            System.out.println("Precio base de la entrada: $" + preciobase);
            System.out.println("Precio parcial de las entradas: $" + (preciobase*grupo.grupo));
            total=(preciobase*grupo.grupo);
            descuentototal=(descuento+cuatropersonas.cuatropersonas);
            System.out.println("Descuento aplicado: " + descuentototal +"%");
            descuento = (descuentototal /100);
            descuento = (descuento * total);
            total -=descuento;
            System.out.println("Precio final a pagar: $" + total);
            System.out.println("");
        do{
                System.out.println("ingrese pagar para finalizar la compra");
                pagar=entrada.nextLine().toLowerCase();
                    if (pagar.equalsIgnoreCase("pagar")){
                        System.out.println("COMPRA APROBADA");
                        System.out.println("QUE DISFRUTE EL EVENTO");}
                    else {
                        System.out.println(" !Opcion Invalida! ");
                        System.out.println("");
                }
                    
        } while (!pagar.equalsIgnoreCase("pagar"));
    }                                                                           //CODIGO PERSONASX4 (OPCION CUANDO EL USUARIO COMPRA 4 ENTRADAS)
}
