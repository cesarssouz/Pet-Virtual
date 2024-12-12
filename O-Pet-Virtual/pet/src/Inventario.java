import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class ItemInventario {

    String nome;
    int quantidade;

    public ItemInventario(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}

public class Inventario {

    Scanner input = new Scanner(System.in);

    int capacidadeDeGuardar = 9;
    List<ItemInventario> lista = new ArrayList<>();

    public void verBolsa() {
        if (lista.isEmpty()) {
            System.out.println("A bolsa está vazia.");
        } else {
            System.out.println("\nItens na bolsa:");
            for (int i = 0; i < lista.size(); i++) {
                ItemInventario item = lista.get(i);
                System.out.println((i + 1) + ". " + item.nome + " (Quantidade: " + item.quantidade + ")");
            }
            System.out.println("Espaço restante: " + (capacidadeDeGuardar - lista.size()));
        }

        System.out.println("O que deseja fazer?");
        System.out.println("\n1.) Usar item 2.) Sair");
        int escolhaBolsa = input.nextInt();

        switch (escolhaBolsa) {

            case 1:

                System.out.println("\nItens na bolsa:");
                for (int i = 0; i < lista.size(); i++) {
                    ItemInventario item = lista.get(i);
                    System.out.println((i + 1) + ". " + item.nome + " (Quantidade: " + item.quantidade + ")");
                }
                System.out.println("Espaço restante: " + (capacidadeDeGuardar - lista.size()));


                System.out.println("\nQue item quer usar?");
                int escolhaUsarBolsa = input.nextInt();


                if (escolhaUsarBolsa >= 1 && escolhaUsarBolsa <= lista.size()) {
                    ItemInventario itemEscolhido = lista.get(escolhaUsarBolsa - 1);
                    System.out.println("Você escolheu: " + itemEscolhido.nome);
                    // Implementar ação do item
                } else {
                    System.out.println("Escolha inválida. Por favor, escolha um número entre 1 e " + lista.size());
                }

                break;
            case 2:

                break;
            default:

                break;
        }
    }

    public void adicionarItem(String nome, int quantidade) {
        for (ItemInventario item : lista) {
            if (item.nome.equals(nome)) {
                item.quantidade += quantidade;
                System.out.println("+" + item.nome + ".");
                return;
            }
        }

        if (lista.size() < capacidadeDeGuardar) {
            lista.add(new ItemInventario(nome, quantidade));
            System.out.println(nome + " foi adicionado à bolsa.");
        } else {
            System.out.println("A bolsa está cheia! Não é possível adicionar mais itens.");
        }
    }


}
