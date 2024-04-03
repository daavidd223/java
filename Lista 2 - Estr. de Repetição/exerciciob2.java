import java.util.Scanner;

public class exerciciob2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n1,n2,n3,n4,n5, maior, menor;

        System.out.println("Olá, você irá nos informar 5 algarismos. Começando pelo primeiro:");
        n1=scan.nextFloat();

        System.out.println("Agora o segundo:");
        n2=scan.nextFloat();

        System.out.println("Agora o terceiro:");
        n3=scan.nextFloat();
        
        System.out.println("O quarto algarismo:");
        n4=scan.nextFloat();

        System.out.println("Por fim, o quinto e último algarismo:");
        n5=scan.nextFloat();

        maior = (Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5));
        menor = (Math.min(Math.min(Math.min(Math.min(n1, n2), n3), n4), n5));

        if(n1 < 0 || n2 < 0 || n3 < 0 || n4 < 0 || n5 < 0){
            System.out.println("Ocorreu um erro. Revise os algarismos digitados.");
        } else{
            System.out.println("O maior valor é: "+maior);
            System.out.println("E o menor valor é: "+menor);
        }



        scan.close();
    }
}
