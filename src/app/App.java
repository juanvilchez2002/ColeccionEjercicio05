
package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        
        //creamos el conjunto
        HashSet<String> paisesSet = new HashSet();
        
        String op = "";
        
        System.out.println("--- Paises ---");
        System.out.println("");
        
        do{
            System.out.print("Ingrese un pais: ");
            paisesSet.add(consola.nextLine().toUpperCase());
            
            System.out.print("¿Desea ingresar otro pais? (S/N): ");
            op = consola.nextLine();
            
            System.out.println("");
            if(!op.equalsIgnoreCase("s")) break;
        }while(true);

        //ordenar
        System.out.println("--- Ordenando Alfabeticamente ---");
        ArrayList<String> paisesList = new ArrayList(paisesSet);
        Collections.sort(paisesList);
        for(String pais: paisesList){
            System.out.println(pais);
        }
        
        //eliminando un elemento
        System.out.println("");
        System.out.println("--- Elimnando un Pais ---");
        System.out.print("Ingrese un Pais: ");
        String paisEliminar = consola.nextLine().toUpperCase();
        boolean flag = true;
        
        Iterator<String> itPais = paisesSet.iterator();
        
        while(itPais.hasNext()){
            if(itPais.next().equals(paisEliminar)){
                itPais.remove();
                flag=false;
            }
        }
        
        if(flag) System.out.println("Pais no encontrado.");
        System.out.println("");
        for(String pais: paisesSet){
            System.out.println(pais);
        }
        
    }
    
}
