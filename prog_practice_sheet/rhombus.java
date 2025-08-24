/**
 * 2. Rhombus Structure - 
 * a. Ask the user for number of rows for the rhombus structure.
 * b. 
 */



import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        ErectedPyramid(rows);
        inverted_pyramid(rows);

    }


    static void ErectedPyramid(int n){
         for (int i = 0; i <n; i++)
            {
            for (int j = 0; j < n-i-1; j++)
            {
            System.out.print(" ");
            }
            for (int j = 0; j<=2*i+1; j++)
            {
            System.out.print("*");
            }
            for (int j = 0; j < n-i-1; j++)
            {
            System.out.print(" ");
            }

            System.out.println();

          }
    }

    static void inverted_pyramid(int N){
    for (int i = 0; i < N; i++)
      {
        for (int j =0; j<i; j++)
        {System.out.print(" ");
        }
       
        for(int j=0;j< 2*N -(2*i +1);j++){
            
            System.out.print("*");
        }
        
         for (int j =0; j<i; j++)
        {   
            System.out.print(" ");
        }
        
        System.out.println();
      }
}


}