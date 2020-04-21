import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            System.out.println("Enter index of array :");
            int index = scan.nextInt();
            array[index] = number;
        }
        catch (Exception e){
            System.out.println("Error ! Error !");
        }


    }
}
