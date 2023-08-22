
import java.util.Scanner;

public class teste {
    public static void main(String [] args){
        System.out.println("Hello world");
        Scanner sc=new Scanner(System.in);
        System.out.print("INFORME O LADO DO QUADRADO");

        int lado = sc.nextInt();

        int area = lado*lado;

        System.out.print("Área do quadrado:"+area);


    }
}
