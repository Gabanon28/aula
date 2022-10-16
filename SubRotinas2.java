import java.util.*;
public class SubRotinas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int x = scan.nextInt();
        System.out.println("digite o segundo numero: ");
        int y = scan.nextInt();
        System.out.println(soma(x, y));
        System.out.println(sub(x, y));
        System.out.println(mult(x, y)); 
    }

    public static int soma(int x, int y) {
        return x + y;
    }

    public static int mult(int x, int y) {
        return x * y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }
 }




