import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void arrayPrinter(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr){
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many numbers will you sort? [This must be non-negative number only]: ");
        int n = s.nextInt();
        if(n <= 0) System.out.println("size can't be zero or negative");
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++) {
            System.out.print(" #"+(i+1)+": ");
            int temp = s.nextInt();
            arr[i] = temp;
        }
        s.close();

        sort(arr);

        arrayPrinter(arr);
    }
}
