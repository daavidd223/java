import java.util.Scanner;

public class exercicioa {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Olá! Nós diga o índice de poluição a seguir:");

        double poluicao;
        poluicao=scan.nextDouble();

        if(poluicao >= 0.05 && poluicao <= 0.25){
            System.out.println("Indice de poluição aceitavel.");
        } else if(poluicao >= 0.3 && poluicao <= 0.39){
            System.out.println("O grupo 1 deve suspender suas atividades.");
        } else if(poluicao >= 0.4 && poluicao <= 0.49){
            System.out.println("O grupo 1 e 2 devem suspender suas atividades");
        } else if(poluicao >= 0.5){
            System.out.println("Todos os grupos devem suspender suas atividades.");
        } else{
            System.out.println("Indice invalido.");
        }

        scan.close();

    }
}
