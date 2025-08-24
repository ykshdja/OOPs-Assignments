/**
 * 
 */


import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;
public class program {
    public static void main(String[] args)  {
      Scanner input = new Scanner(System.in);
      while(true){
        try{
            System.out.println("Enter a Single Letter: ");
            String token = input.next();
            if(token.length()!=1){
                throw new InputMismatchException();
            }
            char ch = Character.toLowerCase(token.charAt(0));
            if(!Character.isLetter(ch)){
                throw new InputMismatchException();
            }
            if (isVowel(ch)){
                System.out.println(ch + " is a vowel.");
            }else{
                System.out.println(ch +" is a consonant");
            }break;
        }catch
        (InputMismatchException e){
            System.out.println("Invalid Input Please enter exactlyone alphabetic character");
            input.nextLine();
        } 
      }
      input.close();
    }

    private static boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
}