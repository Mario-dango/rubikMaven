package com.egg;

public class Application {

    public static void main(String[] args) {
        System.out.println("Programa Cubo Rubik");
        char[][] caraBlue = {
            {'B', 'B'}, 
            {'B', 'B'}
        };
        char[][] caraWite = {
            {'W', 'W'}, 
            {'W', 'W'}
        };
        char[][] caraRed = {
            {'R', 'R'}, 
            {'R', 'R'}
        };
        char[][] caraYellow = {
            {'Y', 'Y'}, 
            {'Y', 'Y'}
        };
        char[][] caraOrange = {
            {'O', 'O'}, 
            {'O', 'O'}
        };
        char[][] caraGreen = {
            {'G', 'G'}, 
            {'G', 'G'}
        };
        char[][][] cuboRubik = {
            caraBlue, caraWite, caraRed, caraYellow, caraOrange, caraGreen
        };

        imprimirCubo(cuboRubik);
    }

    public static void imprimirCubo(char[][][] cuboRubikParaImprimir){
        for (int j = 0; j < cuboRubikParaImprimir[0].length; j++) {
            for (int j2 = 0; j2 < cuboRubikParaImprimir[0][j].length; j2++) {
                System.out.print(cuboRubikParaImprimir[0][j][j2] + " ");
            }  
            System.out.println();
        } 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < cuboRubikParaImprimir[i].length-1; j++) {
                for (int k = 0; k < cuboRubikParaImprimir[i][j].length; k++) {
                    System.out.print(cuboRubikParaImprimir[1][j][k] + " ");
                }    
                for (int k = 0; k < cuboRubikParaImprimir[i][j].length; k++) {
                    System.out.print(cuboRubikParaImprimir[2][j][k] + " ");
                }    
                for (int k = 0; k < cuboRubikParaImprimir[i][j].length; k++) {
                    System.out.print(cuboRubikParaImprimir[3][j][k] + " ");
                }    
                for (int k = 0; k < cuboRubikParaImprimir[i][j].length; k++) {
                    System.out.print(cuboRubikParaImprimir[4][j][k] + " ");
                }    
            } 
            System.out.println();
        }
        for (int j = 0; j < cuboRubikParaImprimir[5].length; j++) {
            for (int j2 = 0; j2 < cuboRubikParaImprimir[5][j].length; j2++) {
                System.out.print(cuboRubikParaImprimir[5][j][j2] + " ");
            }  
            System.out.println();
        } 
    }

    public static void rotarCaraDelCubo(char[][][] cuboRubikParaRotar, String sentidoDeLaRotacion, String caraParaRotar){
        //  Selecciono la cara
        int valorDeCaraParaRotar = 0;
        switch (caraParaRotar) {
            case "blue":
                valorDeCaraParaRotar = 0;
                break;
            case "wite":
                valorDeCaraParaRotar = 1;
                break;
            case "red":
                valorDeCaraParaRotar = 2;
                break;
            case "yellow":
                valorDeCaraParaRotar = 3;
                break;
            case "orange":
                valorDeCaraParaRotar = 4;
                break;
            case "green":
                valorDeCaraParaRotar = 5;
                break;        
            default:
                //  Nada
                break;
        }
        // Rotar en la cara, por dentro
        cuboRubikParaRotar[valorDeCaraParaRotar][1][0] = cuboRubikParaRotar[valorDeCaraParaRotar][0][0];
        cuboRubikParaRotar[valorDeCaraParaRotar][1][0] = cuboRubikParaRotar[valorDeCaraParaRotar][0][0];
        cuboRubikParaRotar[valorDeCaraParaRotar][1][0] = cuboRubikParaRotar[valorDeCaraParaRotar][0][0];
        cuboRubikParaRotar[valorDeCaraParaRotar][1][0] = cuboRubikParaRotar[valorDeCaraParaRotar][0][0];

        for (int i = 0; i < cuboRubikParaRotar[valorDeCaraParaRotar].length; i++) {
            for (int j = 0; j < cuboRubikParaRotar[valorDeCaraParaRotar].length; j++) {
                if (sentidoDeLaRotacion == "horario") {
                    cuboRubikParaRotar[valorDeCaraParaRotar][i+1][j] = cuboRubikParaRotar[valorDeCaraParaRotar][i][j];
                }
            }
        }
        //  Giro por fuera de la cara
    }
}
