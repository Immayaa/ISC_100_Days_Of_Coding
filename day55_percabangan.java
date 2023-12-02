package Immayaa;

import java.util.Scanner;

public class day55_percabangan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
    
        System.out.print("masukan usia = ");
        int umur = sc.nextInt();

        if (umur < 0) {
            System.out.println("umur seseorang ");
        } else if (umur < 17){
            System.out.println("masih boncil ki deu ");
        }else if (umur < 30){
            System.out.println("dewasa mi ");
        }else{
            System.out.println("maueng tongang mi ");
        }
    }
}
