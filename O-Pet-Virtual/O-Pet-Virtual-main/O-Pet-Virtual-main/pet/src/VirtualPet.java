import java.util.Scanner;
import java.util.ArrayList;

class   VirtualPet {
    String nome = "Gatinho";
    int idade = 0;

    public VirtualPet(String nome) {
        this.nome = nome;
    }

    // Colocar o nome do pet
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Stats do Pet
    int nivelDeHigiene = 10;
    int nivelDeFome = 10;
    int nivelDaSede = 10;
    int nivelDeEnergia = 20;
    int nivelDeFelicidade = 0;
    int nivelDeIntimidade = 10;

    public void atacando() {
        try {

            System.out.println("\n(" + nome + ")" + " *Arranha*");
            Thread.sleep(1500);
            nivelDeIntimidade -= 2;
            System.out.println("(você) AWGH!");
            Thread.sleep(1500);
            System.out.println("-2 intimidade");
            Thread.sleep(1500);
            System.out.println("Intimidade: " + nivelDeIntimidade);

        } catch (InterruptedException e) {

            System.out.println("Ocorreu um erro durante a execução do jogo...");
            e.printStackTrace();

        }
    }

    public void maisIntimidade() {

    }

    public void menosIntimidade() {
        try {

            System.out.println("\nO gato não gostou de seus atos");
            nivelDeIntimidade -= 2;
            Thread.sleep(1000);
            System.out.println("-2 Intimidade");
            Thread.sleep(1000);
            System.out.println("Intimidade: " + nivelDeIntimidade);

        } catch (InterruptedException e) {

            System.out.println("Ocorreu um erro durante a execução do jogo...");
            e.printStackTrace();
        }
    }

    public void limpando() {

    }

    public void comendo() {
        try {

            System.out.println('\n' + nome + " se aproxima, cheirando oque tem na mão.");
            Thread.sleep(2000);
            System.out.println("("+ nome +") *comendo*");
            // Implementar o aumento de stats dependendo de qual comida o pet esta comendo

        } catch (InterruptedException e) {

            System.out.println("Ocorreu um erro durante a execução do jogo...");
            e.printStackTrace();
        }
    }

    public void descansando() {

    }

    public void brincando() {

    }

    public void verificar_stats() {
        System.out.println("\nStatus atual de " + nome + ":");
        System.out.println("Higiene: " + nivelDeHigiene);
        System.out.println("Fome: " + nivelDeFome);
        System.out.println("Sede: " + nivelDaSede);
        System.out.println("Energia: " + nivelDeEnergia);
        System.out.println("Felicidade: " + nivelDeFelicidade);
        System.out.println("Intimidade: " + nivelDeIntimidade);
        System.out.println("Idade: " + idade);
    }



}
