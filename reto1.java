package reto1;

import java.util.Scanner;


public class reto1 {

    public static void main(String[] args) {
        int cantLecturas = 0 , suma = 0; 
        double prom = 0.0;
        int lecturas[];
        String nivelRiesgo, nivelmayor, nivelmenor;
        int mayor = 0, menor =0 ;
        
        
        Scanner input = new Scanner(System.in);
        //System.out.println("Cuantas lecturas se van a leer? : ");  
        cantLecturas = Integer.parseInt(input.nextLine());
        
        
        lecturas = new int[cantLecturas];
        mayor = menor = lecturas[0];
        menor = 500;
        
        for (int i = 0; i < cantLecturas; i++) {
            //System.out.println("ingreso lectura");
            lecturas[i] = Integer.parseInt(input.nextLine());
            suma += lecturas[i];
            if (lecturas[i]>mayor){
                mayor=lecturas[i];
            }
            if (lecturas[i]<menor){
                menor = lecturas[i];
            }
        }
        
        prom = suma / cantLecturas;
              
        
        if (prom>80 && prom<=100) {
            nivelRiesgo = "INVIABLE SANITARIAMENTE";
        }else if (prom > 35 && prom <=80){
            nivelRiesgo = "ALTO";
        }else if(prom > 14 && prom <=35){
            nivelRiesgo = "MEDIO";
        }else if(prom > 5 && prom <=14){
            nivelRiesgo = "BAJO";
        }else {
            nivelRiesgo = "SIN RIESGO";
        }
        
        if (mayor>80 && mayor<=100) {
            nivelmayor = "INVIABLE SANITARIAMENTE";
        }else if (mayor > 35 && mayor <=80){
            nivelmayor = "ALTO";
        }else if(mayor > 14 && mayor <=35){
            nivelmayor = "MEDIO";
        }else if(mayor > 5 && mayor <=14){
            nivelmayor = "BAJO";
        }else {
            nivelmayor = "SIN RIESGO";
        }
        
        if (menor>80 && menor<=100) {
            nivelmenor = "INVIABLE SANITARIAMENTE";
        }else if (menor > 35 && menor <=80){
            nivelmenor = "ALTO";
        }else if(menor > 14 && menor <=35){
            nivelmenor= "MEDIO";
        }else if(menor > 5 && menor <=14){
            nivelmenor = "BAJO";
        }else {
            nivelmenor = "SIN RIESGO";
        }

        
        
        System.out.println(nivelRiesgo);
        System.out.println(nivelmayor);
        System.out.println(nivelmenor);
                
    }
    
}
