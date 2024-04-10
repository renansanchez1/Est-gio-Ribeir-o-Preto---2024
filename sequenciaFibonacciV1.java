import java.util.Scanner;

public class sequenciaFibonacciV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        int anterior = 0;
        int atual = 1;
        int proximo = 0;

        while (proximo < numero) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        if (proximo == numero) {
            System.out.println("O número informado " + numero + " pertence à sequência de Fibonacci");
        } else {
            System.out.println("O número informado " + numero + " NÃO pertence à sequência de Fibonacci");
        }
    }
}
