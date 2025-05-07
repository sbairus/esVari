package com.sbairus.esvari;

import java.util.*;

/**
 *
 * @author Fabio.Anelli
 */
public class EsMatriceTriangolare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimensione matrice?");
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        
// inserimento elementi nella matrice
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Elemento in posizione "+i+","+j+" ?: ");
                mat[i][j] = in.nextInt();
            }
        }
        
// verifica se la matrice è triangolare superiore
        boolean triangolare_sup = true;
        boolean triangolare_inf = true;
        for (int i = 0; triangolare_sup && i < mat.length; i++) {
            for (int j = 0; triangolare_sup && j < i; j++) {
                if (mat[i][j] != 0) {
                    triangolare_sup = false;
                }
            }
        }
        
        if (triangolare_sup) {
            System.out.println("La matrice e' triangolare superiore");
        } else {
            System.out.println("La matrice non e' triangolare superiore");
        }
        
        
// verifica se la matrice è triangolare inferiore
        for (int i = 0; triangolare_inf && i != mat.length-1; i++) {
            for (int j = i+1; triangolare_inf && j < mat.length; j++) {
                if (mat[i][j] != 0) {
                    triangolare_inf = false;
                }
            }
        }
        
        if (triangolare_inf) {
            System.out.println("La matrice e' triangolare inferiore");
        } else {
            System.out.println("La matrice non e' triangolare inferiore");
        }
        
    }
}
