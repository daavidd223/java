import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] idades = new int[7];
        System.out.println("Digite a idade das 7 pessoas.");
        

        for (int i = 0; i < idades.length; i++) {      
            System.out.print("Digite a seguir: ");
            idades[i]=scan.nextInt();

        }

        int soma = 0;
        float media;

        for (int j = 0; j < idades.length; j++) {

            soma+=idades[j];
                
        }

        media = soma / idades.length;
        System.out.println("A média desses valores é: "+media);
 
        
        float[] pesos = new float[7];
        System.out.println("Digite o peso das 7 pessoas.");

        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Digite a seguir: ");
            pesos[i]=scan.nextFloat();       
        }

        float acima_90 = 0;

        for (int i = 0; i < pesos.length; i++) {
            if(pesos[i] > 89){
                acima_90++;

                
            }
        }

        System.out.println("A quantidade de pessoas acima dos 90 quilos é: "+acima_90+" pessoas");

        scan.close();
    }
}
