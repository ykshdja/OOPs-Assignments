import java.util.Scanner;
public class distanceTest {


    private static distance readDistance(Scanner input, String label){
        System.out.println("Enter feet for" + label + " distance");
        float f = Float.parseFloat(input.nextLine());
        System.out.println("Enter inches for" + label + " distance:");
        float  i = Float.parseFloat(input.nextLine());
        return new distance(f,i);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        distance d1 = readDistance(input," first");
        distance d2 = readDistance(input," second");
        d1.sum(d2);
    }

}