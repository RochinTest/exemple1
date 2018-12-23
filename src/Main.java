import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = 0;
        System.out.println("Введите число n :");
        Scanner sc = new Scanner(System.in);


        if (sc.hasNextInt()) {

            n = sc.nextInt();
            System.out.println("n^0= " + n * 0);
            System.out.println("n^1= " + n * 1);
            System.out.println("n^2= " + n * n);
            System.out.println("n^3=" + n * n * n);
        }
    }
}
