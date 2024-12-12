public class Comida {

    // Variáveis
    VirtualPet pet = new VirtualPet("Gatinho");

    String nome;
    double feedFome;
    int nivelDeSabor;
    double feedSede;
    int quantidade;
    Inventario inventario;


    public Comida(String nome, double feedFome, int nivelDeSabor, double feedSede, int quantidade, Inventario inventario) {
        this.nome = nome;
        this.feedFome = feedFome;
        this.nivelDeSabor = nivelDeSabor;
        this.feedSede = feedSede;
        this.quantidade = quantidade;
        this.inventario = inventario;

        // Condição para adicionar item (caso tenha quantidade).
        if (quantidade > 0) {
            inventario.adicionarItem(this.nome, this.quantidade);
        }
    }





}
