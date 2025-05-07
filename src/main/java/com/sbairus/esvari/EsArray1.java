package com.sbairus.esvari;

/**
 *
 * @author Fabio.Anelli
 */
import java.util.*;

public class EsArray1 {

    public static void main(String[] args) {
//        zizag();
//        MatriceTriangolare();
//        MaxDiagonaleMatrice();
        MatriceSimmetrica();
    }

    public static void MatriceTriangolare() {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimensione matrice?");
        int n = in.nextInt();
        int[][] mat = new int[n][n];

// inserimento elementi nella matrice
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Elemento in posizione " + i + "," + j + " ?: ");
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
        for (int i = 0; triangolare_inf && i != mat.length - 1; i++) {
            for (int j = i + 1; triangolare_inf && j < mat.length; j++) {
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

    public static void zizag() {
        int ar_num[] = {1, 3, 5, 7, 9, 10, 8, 6, 4, 2};
        int indx_end = ar_num.length - 1;

        for (int i = 0; i < 5; i++) {
            System.out.println(ar_num[i]);
            System.out.println(ar_num[indx_end]);
            indx_end = indx_end - 1;
        }
    }

    public static void MaxDiagonaleMatrice() {
        int max = 0;
        int[][] mat = new int[3][3];

        mat[0][0] = 19;
        mat[0][1] = 2;
        mat[0][2] = 3;

        mat[1][0] = 1;
        mat[1][1] = 9;
        mat[1][2] = 3;

        mat[2][0] = 1;
        mat[2][1] = 2;
        mat[2][2] = 13;

        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat.length; c++) {
                if (r == c) {
                    if (mat[r][c] > max) {
                        max = mat[r][c];
                        break;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void MatriceSimmetrica() {
        int[][] mat = new int[4][4];
        int[] arr_sup = new int[6];
        int[] arr_inf = new int[6];
        int arr_ind;

        mat[0][0] = 0;
        mat[0][1] = 2;
        mat[0][2] = 3;
        mat[0][3] = 4;        

        mat[1][0] = 2;
        mat[1][1] = 0;
        mat[1][2] = 5;
        mat[1][3] = 6;
        
        mat[2][0] = 3;
        mat[2][1] = 5;
        mat[2][2] = 0;
        mat[2][3] = 7;
        
        mat[3][0] = 4;
        mat[3][1] = 6;
        mat[3][2] = 7;
        mat[3][3] = 0;

        arr_ind = 0;
// Valorizzo i valori superiori nell'array superiore
        for (int r = 0; r < mat.length; r++) {
            for (int c = r + 1; c != mat.length; c++) {
                arr_sup[arr_ind] = mat[r][c];
                arr_ind++;
            }
        }

        arr_ind = 0;
// Valorizzo i valori inferiori nell'array inferiore
         for (int c = 0; c < mat.length; c++) {
             for (int r = c+1; r != mat.length; r++) {
                 arr_inf[arr_ind] = mat[r][c];
                 arr_ind++;
             }
         }

        boolean uguali = Arrays.equals(arr_sup, arr_inf);

        if (uguali) {
            System.out.println("La matrice e' simmetrica!!");
        } else {
            System.out.println("La matrice NON e' simmetrica!!");
        }
    }
}
