package com.Arbol;

import java.awt.*;

public class arbol {
    public static void main(String[] args) {
        //VARIABLES
        String t = "*"; //tipo de texto
        int z = 0; //contador 1
        int n = 0; //contador 2
        int y = 4; //numero de repeticiones
        int e = y * y; //incremento

        //inicio
        for (int w = 1; w <= y; w++) {
            for (int i = 1; i <= y; i++) {
                n = (w * i) + i;
                while (z < n) {
                    if (z == 0) {
                        int j = e - (n / 2);
                        while (z <= j) {
                            System.out.print(" ");
                            z++;
                        }
                        z = 0;
                    }
                    System.out.print(t);
                    z++;
                }
                z = 0;
                System.out.println();
            }
        }
        //fin del arbol
        //inicio del tronco
        while(z < y) {
            for (int k = 1; k < e; k++) {
                System.out.print(" ");
            }
            int l = 0;
            while (l < y){
                System.out.print(t);
                l++;
            }
            z++;
            System.out.println();
        }
    }
}
