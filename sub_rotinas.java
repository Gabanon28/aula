import java.sql.SQLOutput;
import java.util.*;
public class sub_rotinas {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("informe a função que deseja \n " +
                "1:dobro \n " +
                "2:maior numero \n " +
                "3:media de 3 numeros \n " +
                "4:fatorial \n " +
                "5:somatorio\n");
        int esco=scan.nextInt();
        switch (esco) {
            case 1 : {
                System.out.println("digite um numero: ");
                int num = scan.nextInt();
                System.out.print(dobro(num));
            }
            case 2 : {
                System.out.println("digite um numero: ");
                int num1 = scan.nextInt();
                System.out.println("digite outro numero: ");
                int num2 = scan.nextInt();
                System.out.println(MaiorNumero(num1, num2));
            }
            case 3 : {
                System.out.println("Digite o primeiro numero: ");
                double x = scan.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double y = scan.nextDouble();
                System.out.println("Digite o terceiro numero: ");
                double z = scan.nextDouble();
                System.out.println(arit(x, y, z));
            }
            case 4 : {
                System.out.println("digite um numero: ");
                int num3 = scan.nextInt();
                System.out.println(fat(num3));
            }
            case 5 : {
                System.out.println("digite um numero: ");
                int num4 = scan.nextInt();
                System.out.println(som(num4));
            }
        }
    }
    static int dobro(int x) {
       return x*2;

    }
    static int MaiorNumero(int x, int y){
        if(x>=y){
            return x;
        } else {
            return y;
        }
    }
    static double arit(double x, double y, double z){
        return (x+y+z)/3;
    }
    public static int fat(int num3){
        int v=1;
        for(int i=1;i<=num3;i++){
            v=v*i;
        }
        return v;
    }
    public static int som(int num4){
        int v=0;
        for(int i=1;i<=num4;i++){
            v=v+i;
        }
        return v;
    }
}
