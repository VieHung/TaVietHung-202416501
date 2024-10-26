import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so phan tu cua Array");
        int n = scanner.nextInt();

        int[] Arr = new int[n];

        for (int i=0; i<n; i++){
            Arr[i]= scanner.nextInt();
        }

        int Temp;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n;j++) {
                if (Arr[i]>Arr[j]){
                    Temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = Temp;
                }
            }
        }
        int sum = 0;
        System.out.print("Day so la:");
        for (int i=0; i<n; i++){
            sum += Arr[i];
            System.out.print(Arr[i]+ " ");    
        }
        System.out.println("\nTong cua day " + sum);
        System.out.println("Trung binh cua day " + sum/n);

        scanner.close();

    }
}