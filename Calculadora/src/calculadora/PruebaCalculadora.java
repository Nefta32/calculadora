package calculadora;

import java.util.Scanner;

public class PruebaCalculadora {
    public static void main(String[] args) {
        
        int opcion;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Calculadora aritmetica basica");
        System.out.println("Ingresa la operación que desean realizar de acuerdo a las siguientes opciones: ");
        System.out.printf("Teclea 1 para realizar una suma%nTeclea 2 para realizar una resta%n"
                + "Teclea 3 para realizar una multiplicación%nTeclea 4 para realizar una división%n"
                + "Tu opción: ");
        opcion=entrada.nextInt();
        //Llama al metodo sumar
        if(opcion==1){
            
        }
        //Llama al metodo restar
        if(opcion==2){
            
        }
        //Llama al metodo multiplicar
        if(opcion==3){
            
        }
        //Llama al metodo dividir
        if(opcion==4){
            
        }
        //Indica que la opcion ingresada no es valida
        else{
            System.out.println("La opcion ingresada no es valida");
        }
    }
}
