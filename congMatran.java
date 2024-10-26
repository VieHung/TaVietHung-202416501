import java.util.Scanner;

public class congMatran {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dien so hang");
        int so_hang = scanner.nextInt();
        
        System.out.println("Dien so cot");
        int so_cot = scanner.nextInt();

        int[][] matranA = new int[so_hang][so_cot];
        int[][] matranB = new int[so_hang][so_cot];
        int[][] matranTong = new int[so_hang][so_cot];

        for ( int i=0; i < so_hang; i++){
            for ( int j=0; j < so_cot; j++ ){
                System.out.println("Nhap phan tu hang " + i + " cot " + j + " cua ma tran A");
                matranA[i][j] = scanner.nextInt();
            }
        }

        for ( int i=0; i < so_hang; i++){
            for ( int j=0; j < so_cot; j++ ){
                System.out.println("Nhap phan tu hang " + i + " cot " + j + " cua ma tran B");
                matranB[i][j] = scanner.nextInt();
            }
        }

        for ( int i=0; i < so_hang; i++){
            for ( int j=0; j < so_cot; j++ ){
                matranTong[i][j]=matranA[i][j] + matranB[i][j];
            }
        }

        for ( int i=0; i < so_hang; i++){
            for ( int j=0; j < so_cot; j++ ){
                System.out.print(matranTong[i][j] + " ");
            }
            System.out.println(" ");
        }
        scanner.close();

    }
}