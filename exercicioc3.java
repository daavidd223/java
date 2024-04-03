import java.util.Scanner;

public class exercicioc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, operacao;
        System.out.println("Informe um número: ");
        numero=scan.nextInt();
        System.out.println("Agora diga qual operação você quer escolher.");
        System.out.println("1 - Soma  2 - Subtração  3 - Divisão  4 - Multiplicação");
        operacao=scan.nextInt();

        switch (operacao) {
            case 1:
            System.out.println("Tabuada (Soma)");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " + " + numero + " = ");
                System.out.println(i + numero);
                
            }
                break;
            
            case 2:
            System.out.println("Tabuada (Subtração)");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " - " + numero + " = ");
                System.out.println(i - numero);
                    
            }
                break;

            case 3:
            System.out.println("Tabuada (Divisão)");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ÷ " + numero + " = ");
                System.out.println(i / numero);
                
            }
                break;

            case 4:
            System.out.println("Tabuada (Multiplicação)");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " X " + numero + " = ");
                System.out.println(i * numero);
                
            }
                break;
            
            default:
                System.out.println("Número invalido,");
                break;
        }


        scan.close();
    }
}
