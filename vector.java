import java.util.Scanner;
import java.util.Locale;

public class vector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will be inputed in the system: ");
        int N = sc.nextInt();
        double[] vet = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Input the " + (i + 1) + " number: ");
            vet[i] = sc.nextDouble();

        }
        System.out.println();
        System.out.println("System registers : " + N + " numbers");
        for (int i = 0; i < N; i++) {
            System.out.println(vet[i]);
        }

        sc.close();
    }

}
