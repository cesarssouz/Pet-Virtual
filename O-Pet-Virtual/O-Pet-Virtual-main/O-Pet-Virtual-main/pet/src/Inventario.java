import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class ItemInventario {

    // Variáveis
    String nome;
    int quantidade;


    public ItemInventario(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}

public class Inventario {

    // Variavel input (Scanner).
    Scanner input = new Scanner(System.in);

    // Variavel de limite para guardar os itens.
    int capacidadeDeGuardar = 9;

    // Variavel lista onde guardar os itens
    List<ItemInventario> lista = new ArrayList<>();

    // Função para ver o inventário
    public void verBolsa() {

        // Condição caso o inventário esteja vazio
        if (lista.isEmpty()) {
            System.out.println("A bolsa está vazia.");

        // Condição para ver os itens da bolsa
        } else {
            System.out.println("\nItens na bolsa:");
            for (int i = 0; i < lista.size(); i++) {
                ItemInventario item = lista.get(i);
                System.out.println((i + 1) + ". " + item.nome + " (Quantidade: " + item.quantidade + ")");
            }
            System.out.println("Espaço restante: " + (capacidadeDeGuardar - lista.size()));
        }

        // Mensagem para perguntar ao player a proxima escolha.
        System.out.println("O que deseja fazer?");
        System.out.println("\n1.) Selecionar item 2.) Sair");
            // Variavel input (Scanner).
        int escolhaBolsa = input.nextInt();

        // Condição para o player fazer sua proxima escolha.
        switch (escolhaBolsa) {

            // Condição caso o player escolha selecionar algum item.
            case 1:

                // Printando o inventário
                System.out.println("\nItens na bolsa:");
                for (int i = 0; i < lista.size(); i++) {
                    ItemInventario item = lista.get(i);
                    System.out.println((i + 1) + ". " + item.nome + " (Quantidade: " + item.quantidade + ")");
                }
                System.out.println("Espaço restante: " + (capacidadeDeGuardar - lista.size()) + '\n');


                // Perguntando qual item o player deseja usar.
                System.out.println("\nQue item quer usar? (Digite o número do item)");
                int escolhaUsarBolsa = input.nextInt();

                // Condição para checar se o usuário escolheu um item do inventário.
                if (escolhaUsarBolsa >= 1 && escolhaUsarBolsa <= lista.size()) {
                    ItemInventario itemEscolhido = lista.get(escolhaUsarBolsa - 1);
                    System.out.println("Você escolheu: " + itemEscolhido.nome);
                    // Implementar ação do item

                // Condição caso o usuário escolha um item inválido
                } else {
                    System.out.println("Escolha inválida. Por favor, escolha um número entre 1 e " + lista.size());
                }
                break;

            // Condição caso o player escolha sair do menu da bolsa.
            case 2:

                break;

            // Condição de erro.
            default:

                break;
        }
    }

    // Função para adicionar itens.
    public void adicionarItem(String nome, int quantidade) {
        for (ItemInventario item : lista) {
            if (item.nome.equals(nome)) {
                item.quantidade += quantidade;
                System.out.println("+" + item.nome + ".");
                return;
            }
        }

        // Condição caso há espaço no inventário
        if (lista.size() < capacidadeDeGuardar) {
            lista.add(new ItemInventario(nome, quantidade));

        // Condição caso não há espaço no inventário
        } else {
            System.out.println("A bolsa está cheia! Não é possível adicionar mais itens.");
        }
    }


}
