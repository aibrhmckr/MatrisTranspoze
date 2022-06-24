import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Matrisin boyutlarini giriniz:");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int[][] diziA=new int[x][y];
        int[][] transA= new int[y][x];
        for(int i = 0 ; i < x; i++){
            for(int j = 0 ; j<y;j++){
                System.out.print("Dizinin "+ i+". satir "+j+". sutununu giriniz: ");
                diziA[i][j]=scanner.nextInt();
            }
        }
        for(int i = 0; i< y;i++){
            for(int j = 0; j<x;j++){
                transA[i][j]=diziA[j][i];
                System.out.print(transA[i][j]+" ");
            }
            System.out.println();
        }

    }
}
