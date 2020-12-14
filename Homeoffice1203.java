/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeoffice.pkg12.pkg03;
import java.util.Scanner;
/**
 *
 * @author Szalanics Szabolcs
 */
public class Homeoffice1203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String var = "i";
        Scanner sc;
        sc = new Scanner(System.in);
        do{
        int szamok1 =(int)  (Math.random()*20)+10;
        int szamok2 =(int)  (Math.random()*20)+10;
        int tomb1[] =new int[szamok1];
        int tomb2[] =new int[szamok2];
        int ujTomb[] = new int[szamok1+szamok2];
        int k = 0;
        for(int i =0;i<szamok1;i++){
            tomb1[i] = (int) (Math.random()*100)-50;
        }
        for(int i =0;i<szamok2;i++){
            tomb2[i] = (int) (Math.random()*100)-50;
        }
        for(int i =0;i<szamok1;i++){
            System.out.print(String.format("%,3d",tomb1[i])+" ");
        }
        System.out.println("\n");
        for(int i =0;i<szamok2;i++){
            System.out.print(String.format("%,3d",tomb2[i])+" ");
        }
        for(int i =0;i<szamok1;i++){
            if(tomb1[i]%5 == 0 && tomb1[i]%2 ==0 && tomb1[i] !=0){
                ujTomb[k] = tomb1[i];
                k++;
            }
        }
        for(int i =0;i<szamok2;i++){
            if(tomb2[i]%5 == 0 && tomb2[i]%2 == 0 && tomb2[i] !=0){
                ujTomb[k] = tomb2[i];
                k++;
            }
        }
        System.out.println("\n");
        for(int i =0;i<k;i++){
            System.out.print(String.format("%,3d",ujTomb[i])+" ");
        }
        int min =1000;
        int max = -1000;
        for(int i =0;i<k;i++){
            if(ujTomb[i]<min){
            min = ujTomb[i]; }
            if(ujTomb[i]>max){
            max = ujTomb[i]; }
        }
        System.out.println("\nmax= "+max+" min= "+min);
        System.out.println(0/5);
        if(max%min == 0){
            System.out.println("Igen");
        }
        System.out.println("Ha szeretné újra futtatni i/n: ");
        var = " ";
        var = sc.nextLine();
        }while("i".equals(var));
        
        System.out.println("A 8-as feladat hülyeség mert ha páros szám akkor nulla nem lehet benne.");
       

    }
    
}
