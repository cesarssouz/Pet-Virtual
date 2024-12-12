import java.util.Scanner;
import java.util.ArrayList;

public class Loja {

    Scanner input = new Scanner(System.in);

    public void comprar() {

        System.out.println("Olá! O que deseja?");
        System.out.println("1.) Comprar \n2.) Vender \n3.) Sair.");
        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Erro! Digite 1,2 ou 3.\n");
                System.out.println(" O que deseja? \n1.) Comprar \n2.) Vender \n3.) Sair.");
                break;
        }


    }

}
