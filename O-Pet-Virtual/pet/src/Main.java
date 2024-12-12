import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Bem-vindo ao Simulador de Animal de Estimação Virtual!");
            Thread.sleep(5000);

            System.out.println("\nComeçando o Jogo.");
            Thread.sleep(1000);
            System.out.println("Começando o Jogo..");
            Thread.sleep(1000);
            System.out.println("Começando o Jogo...");
            Thread.sleep(1000);


            System.out.println("\nApós um dia de trabalho, você se depara com uma chuva forte e decide fazer uma pausa no parque até que a tempestade passe.");
            Thread.sleep(5000);
            System.out.println("\n*Som de chuva*");
            Thread.sleep(3000);
            System.out.println("*Gemido estranho*");
            Thread.sleep(1000);
            System.out.println("\n...");
            Thread.sleep(3000);
            System.out.println("\n(Você) Que barulho é esse?");
            Thread.sleep(3000);
            System.out.println("Congelando de frio, você se depara com um ser pequeno, indefeso, mas surpreendentemente feroz.");
            Thread.sleep(3000);
            System.out.println("Com a mão você tenta se aproximar...");
            Thread.sleep(1000);



            // Primeira ação do jogo

            Inventario inventario = new Inventario();

            Comida pao = new Comida("Pedaço de Pão", 10, 10, 0, 1, inventario);
            Comida garrafaAgua = new Comida("Garrafa d'água", 0, 10, 10, 1, inventario);

            VirtualPet pet = new VirtualPet("Gatinho");



            pet.atacando();

            Thread.sleep(1000);

            boolean conquistarGato = true;

            while (conquistarGato) {

                if (pet.nivelDeIntimidade == 0) {

                    conquistarGato = false;
                    System.out.println("Intimidade chegou a 0");
                    Thread.sleep(2000);
                    System.out.println("O gato fugiu com medo.");
                    Thread.sleep(3000);
                    System.out.println("Você perdeu! O gato se assustou.");

                } else if (pet.nivelDeIntimidade >= 20) {

                    conquistarGato = false;
                    System.out.println("O gato não tem mais medo de você!");
                    Thread.sleep(1000);
                    System.out.println("Intimidade: " + pet.nivelDeIntimidade);

                } else {

                    System.out.println("\nO gatinho está assustado.");
                    System.out.println("\nOque deseja fazer? 1.) se aproximar | 2.) ver bolsa | 3.) assustar ");
                    System.out.print("Opção: ");
                    int escolha = input.nextInt();

                    switch (escolha) {

                        case 1:
                            System.out.println("*Você se aproxima*");
                            Thread.sleep(1000);
                            pet.menosIntimidade();
                            break;
                        case 2:
                            inventario.verBolsa();

                        case 3:
                            System.out.println("*Você assustou o gato*");
                            Thread.sleep(2000);
                            System.out.println("*O gato fugiu*");
                            Thread.sleep(5000);
                            System.out.println("Você perdeu! O gato se assustou.");
                            conquistarGato = false;
                            break;
                        default:
                            System.out.println("erro... digite uma ação válida.");
                            break;
                    }
                }
            }

            // System.out.println("Digite o nome do seu animal de estimação:");
            // String nomePet = input.nextLine();
            // pet.setNome(nomePet);

        } catch (InterruptedException e) {
            System.out.println("Ocorreu um erro durante a execução do jogo...");
            e.printStackTrace();

        }


    }
}