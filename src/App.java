import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("A resposta da soma e igual a: " + soma);

        sc.close();
    }
}
