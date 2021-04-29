/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author starco
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner entrada=new Scanner(System.in);
                System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[ejercicio 1]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");  
        System.out.println(""); 
            System.out.println("suma consecutiva del 0 al 10");
                for (int i=0; i<=10; i++) {
            System.out.println(i);
        
        }
        System.out.println(""); 
         System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[ejercicio 2]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"); 
           System.out.println(""); 
         int fac=1;
                 int nu=10;
                 
                 for (int i = nu; i>0; i--){
                 fac=fac*i;
                 
                 }
                 System.out.println("El factorial de " + nu+ " es : " +fac);
                  System.out.println("");
                  System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[ejercicio 3]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"); 
                   System.out.println("");
      int n;
          System.out.println("Introduzca un número");
          n=entrada.nextInt();
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        System.out.println(resultado); 
        
        System.out.println(""); 
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[ ejercicio 4]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"); 
                  System.out.println(""); 
                   System.out.println("Introduzca el un numero para sacar la media:");
        Scanner leer = new Scanner (System.in);
        int sum = 0;
        int nume = 0;
        int cont = leer.nextInt();
        for (int i = cont; i >=0 ; i--) {
            sum= sum + nume;
            nume++;
        }
        float media = sum/cont;
        System.out.println("la media es:"+media);
                   System.out.println("");
        
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[ejercicio 5]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"); 
       System.out.println(""); 
       
       
        System.out.println("Introduzca un número");
      
        int num []= new int [3];
        int su=0;
         for (int i=0; i<3; i++ ){
         num[i]=entrada.nextInt();
         su= su+num[i];
         System.out.println("La suma es: "+ su);
         }
        int  ma= num[0];
        int me=num[0];
        for (int i=0; i< num.length; i++){
        
            if (num[i]>ma){
            ma=num[i];
            }
            if (num[1]<me){
            me=num[1];
            }
            
        }
        int dis=ma-me;
        float prom= su/3;
        System.out.println("El promedio es: " + prom); 
        System.out.println("El número mayor es " + ma + " y el número menor es "+ me); 
        System.out.println("La distancia entre los números es: "+ dis); 
        
        
        
        
        System.out.println(""); 
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[ejercicio 6]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"); 
        System.out.println(""); 
        
        System.out.println("Matriz de dias de la semana");
        String[] diasSe;
        diasSe = new String[7];
        diasSe [0] = "Lunes";
        diasSe [1] = "Martes";
        diasSe [2] = "Miercoles";
        diasSe [3] = "Jueves";
        diasSe [4] = "Viernes";
        diasSe [5] = "Sabado";
        diasSe [6] = "Domingo";
        for (String diasSe1 : diasSe) {
            System.out.println(diasSe1);

        } 
        
        
        
        System.out.println(""); 
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[ ejercicio 7]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"); 
        System.out.println(""); 
              System.out.println("Matriz de personajes de Star War");
        String StWar[][] = new String[3][4];
        StWar[0][0]="Darth Vader";
        StWar[0][1]="Luke Skywalker";
        StWar[0][2]="Yoda";
        StWar[0][3]="Leia Organa";
        StWar[1][0]="Obi-Wan Kenobi";
        StWar[1][1]="Chewbacca";
        StWar[1][2]="Han Solo";
        StWar[1][3]="Palpatine";
        StWar[2][0]="R2-D2";
        StWar[2][1]="C-3PO";
        StWar[2][2]="Maz Kanata";
        StWar[2][3]="Darth Maul";
        int i,j;
        for (i = 0;i < StWar.length; i++){
            for(j = 0; j < StWar[i].length; j++){
                System.out.print("["+StWar[i][j]+"]");

            }
        }   

        
        System.out.println(""); 
        
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°[ejercicio 8]°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"); 
           System.out.println("");
           
         
        System.out.println("Modelo del gato");
        char cat[][]= new char[3][3];
        cat[0][0]='o';
        cat[0][1]='x';
        cat[0][2]='x';
        cat[1][0]='o';
        cat[1][1]='x';
        cat[1][2]='o';
        cat[2][0]='x';
        cat[2][1]='o';
        cat[2][2]='o';
       for (char[] cat1 : cat) {
            System.out.println("|" + cat1[0] + "|" + cat1[1] + "|" + cat1[2] + "|");
        }
        
       
    
    }
    
    

}
    
  

    

    
    

