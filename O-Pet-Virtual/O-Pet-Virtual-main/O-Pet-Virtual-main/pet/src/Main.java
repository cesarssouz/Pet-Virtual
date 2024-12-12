import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Váriavel input(scanner).
        Scanner input = new Scanner(System.in);

        try {

            // Começo do jogo.
            System.out.println("Bem-vindo ao Simulador de Animal de Estimação Virtual!");
            Thread.sleep(5000);

            System.out.println("\nComeçando o Jogo.");
            Thread.sleep(1000);
            System.out.println("Começando o Jogo..");
            Thread.sleep(1000);
            System.out.println("Começando o Jogo...");
            Thread.sleep(1000);

            // Começo da história.
            System.out.println("\nApós um dia de trabalho, você se depara com uma chuva forte e decide fazer uma pausa no parque até que a tempestade passe.");
            Thread.sleep(5000);
            System.out.println("\n*Som de chuva*");
            Thread.sleep(3000);
            System.out.println("*Barulho estranho*");
            Thread.sleep(1000);
            System.out.println("\n...");
            Thread.sleep(3000);
            System.out.println("\n(Você) Que barulho é esse?");
            Thread.sleep(3000);
            System.out.println("\nCongelando de frio, você se depara com um ser pequeno, indefeso, mas surpreendentemente feroz.");
            Thread.sleep(3000);
            System.out.println("Com a mão você tenta se aproximar...");
            Thread.sleep(1000);


            // Primeira ação do jogo.

                // Criando variavel inventário.
            Inventario inventario = new Inventario();

                // Colocando itens, pedaço de pão e garrafa d'agua no inventário.
            Comida pao = new Comida("Pedaço de Pão", 10, 10, 0, 1, inventario);
            Comida garrafaAgua = new Comida("Garrafa d'água", 0, 10, 10, 1, inventario);

                // Criand variavel pet.
            VirtualPet pet = new VirtualPet("Gatinho");

                // Chamando função para começar a primeira interatividade com o player ("PVE").
            pet.atacando();
            Thread.sleep(1000);


            // Variavel para dar looping no "PVE".
            boolean conquistarGato = true;

            // Looping do "PVE".
            while (conquistarGato) {

                // Condição se o pet chegar a 0 de intimidade.
                if (pet.nivelDeIntimidade == 0) {

                    // Parando o looping.
                    conquistarGato = false;

                    // Mensagem de derrota.
                    System.out.println("Intimidade chegou a 0");
                    Thread.sleep(2000);
                    System.out.println("O gato fugiu com medo.");
                    Thread.sleep(3000);
                    System.out.println("Você perdeu! O gato se assustou.");

                 // Condição se o pet chegar a 20 de intimidade.
                } else if (pet.nivelDeIntimidade >= 20) {

                    // Parando o looping.
                    conquistarGato = false;

                    // Mensagem de vitória.
                    System.out.println("O gato não tem mais medo de você!");
                    Thread.sleep(1000);
                    System.out.println("Intimidade: " + pet.nivelDeIntimidade);

                // Condição para continuar o "PVE".
                } else {

                    System.out.println("\nO gatinho está assustado.");
                    System.out.println("\nOque deseja fazer? 1.) se aproximar | 2.) ver bolsa | 3.) assustar ");
                    System.out.print("Opção: ");

                    // Variavel para o player ter escolhar.
                    int escolha = input.nextInt();

                    switch (escolha) {

                        // Condição caso o player escolha se aproximar.
                        case 1:
                            System.out.println("*Você se aproxima*");
                            Thread.sleep(1000);
                            pet.menosIntimidade();
                            break;

                        // Condição caso o player escolha abrir o inventário.
                        case 2:
                            inventario.verBolsa();

                        // Condição caso o player escolha assustar o gato.
                        case 3:

                            // Mensagem de derrota
                            System.out.println("*Você assustou o gato*");
                            Thread.sleep(2000);
                            System.out.println("*O gato fugiu*");
                            Thread.sleep(5000);
                            System.out.println("Você perdeu! O gato se assustou.");

                            // Parando o looping.
                            conquistarGato = false;
                            break;

                        // Condição de erro.
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