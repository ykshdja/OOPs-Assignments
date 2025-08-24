/**
 * 3. a 
 */

import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr;
        arr = new int[5];
        System.out.println("Populate the Array of Size [5]");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("1. All the elements in an Array: ");
       //1. All its elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] );
        }
        //2. Sum of all elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("2. Sum of all Elements: " + sum);
        //3. Largest element in Array - 
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("3. Largest value in the Array: "+ max);
        //4. Smallest Value in the Array
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("4. Smallest Value in the Array: "+ min);

        //5. Second largest No. in the Array
        int largest = -1;
        int secondLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("5. Second Largest Element in an Array:" + secondLargest);

        //6. Sum of Alternative elements in an Array
        int altSum = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
            altSum+=arr[i];
            }
        }
        System.out.println("6. Sum of Alternative Elements in an Array: "+altSum);

        //7. Count Even Numbers in an Array - 
        int countEven = 0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2==0){
                countEven++;
            }
        }
        System.out.println("Count of Even Numbers in the Array:" + countEven);
        //8. Frequency of a Number in an Array - 
        System.out.println("Enter your Target number for Frequency");
        int targetNum = input.nextInt();
        int freq = countOccurance(arr, targetNum);
        if(freq>0){
            System.out.println("The Number "+ targetNum + " occurs in the array.");
            System.out.println("Its frequency is: " +  freq);
        }else{
            System.out.println("The Number " + targetNum + "did not occur in the given array");
        }


    }
    static int countOccurance(int []arr, int target){
        int countOcc = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                countOcc++;
            }
        }
        return countOcc;
    }
}