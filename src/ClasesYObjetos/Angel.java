/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lugue
 */
public class Angel {
    public static ArrayList<Operacion> listEst = new ArrayList<Operacion>();
    
    Operacion est = new Operacion();
    Scanner in = new Scanner(System.in);
    
    
    public void inscribir(){
           System.out.println("\nCual es tu nombre?");
           est.setNombre(in.nextLine());

           System.out.println("\nCual es tu matricula?");
           est.setMatricula(in.nextLine());  
           
           //nomObjArrayList.add(nomObjEstudiantes)
           listEst.add(est);
    }
    
    public void mostrar(){
        Operacion est;
        
               for(int x = 0; x < listEst.size(); x++){
                   
                   est = listEst.get(x);
                   System.out.println( x+1 +" => "   +est.getNombre() +" - " +est.getMatricula());
               }
               in.next();
    }
}
