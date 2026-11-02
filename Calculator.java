/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
    import java.util.Scanner;
/**
 * DIENG Baye-Badou 
 * ING1 BDML2
 * Addition d'entiers
 * Exo2
 * @author badou
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quelle operation ?: 1)addition 2)soustraction 3)multiplication 4)division 5)modulo");
            int operateur = sc.nextInt();
            
            if (operateur < 1 || operateur > 5) {
            System.err.println("erreur de saisie");
            } else {
 
            System.out.print("Entrez le premier nombre : ");
            int operande1 = sc.nextInt();
            System.out.print("Entrez le second nombre : ");
            int operande2 = sc.nextInt();
            
            switch (operateur) {
                case 1 -> System.out.println("Résultat : " + (operande1 + operande2));
                case 2 -> System.out.println("Résultat : " + (operande1 - operande2));
                case 3 -> System.out.println("Résultat : " + (operande1 * operande2));
                case 4 -> {
                    if (operande2 != 0)
                        System.out.println("Résultat : " + ((double) operande1 / operande2));
                    else
                        System.err.println("Division par zéro impossible");
                }
                case 5 -> {
                    if (operande2 != 0)
                        System.out.println("Résultat : " + (operande1 % operande2));
                    else
                        System.err.println("Modulo par zéro impossible");
                }
                default -> System.err.println("erreur de saisie");
            }
        }
    }
} 
