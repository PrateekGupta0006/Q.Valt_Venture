/*
Question
    Vault Venture

      In a massive warehouse, Zara manages 106 containers, numbered from 1 to 106, each holding a value equal to its
      number. Due to special instructions, the values of containers within specified ranges [P, Q] are changed to
      zero. Given M such ranges, which may overlap, calculate the total sum of all container values after applying
      these instructions.

    Constraints:
      0 ≤ M ≤ 105
      1 ≤ P ≤ Q ≤ 106
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       //Making container
        int[] containers = new int[106];
        for(int i=0; i<106; i++){
            containers[i] = i+1;
        }

        //printing original container
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int l=0; l<106; l++){
            System.out.print( containers[l] + " ");
            if( l == 54 ){System.out.println();}
        }
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        //introducing variables
        int P;
        int Q;
        int M;
        int sum = 0;

        //getting correct value of M
        do{System.out.print("Enter value of M: ");
        M = scanner.nextInt();
        } while(M < 0 || M > 105);

        //getting value of range
        for(int j=0; j<M; j++){
            System.out.println("Enter Range(P Q): ");
            P = scanner.nextInt();
            Q = scanner.nextInt();

            //loop to get correct value
            while( Q <= P | P<1 | Q > 106){
                if(P == Q){
                  System.out.println("P cannot be equal to Q!");
                }
                else if(Q <= P){
                    System.out.println("P cannot be bigger than Q!");
                }
               else if(P < 1){
                  System.out.println("P cannot be less than 1!");
               }
               else{
                  System.out.println("Q cannot be grater than 106!");
               }

                System.out.println("Please try again: ");
                P = scanner.nextInt();
                Q = scanner.nextInt();
            }

            //converting values to zero
            for(int k = P; k <= Q ; k++){
                containers[k-1] = 0;
            }

        }

        //printing new container
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int l=0; l<106; l++){
            System.out.print( containers[l] + " ");
            if( l == 54 ){System.out.println();}
        }
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        //calculating and printing sum of all values of containers
        for(int container : containers){
            sum += container;
        }
        System.out.println("\nThe total sum of all the values of the containers is: " + sum);

        scanner.close();
    }
}