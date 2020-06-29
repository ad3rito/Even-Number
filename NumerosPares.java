import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] argss){
        Scanner ent = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Introduza o " + i + " numero");
            num = ent.nextInt();
            
            if(num % 2 == 0){
                contPar++;
            }

        }
        
        System.out.println("Foram introduzidos " + contPar + " numeros pares \n");
        
    }
}