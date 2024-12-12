public class Comida {

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

        if (quantidade > 0) {
            inventario.adicionarItem(this.nome, this.quantidade);
        }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Comida pao = new Comida("Pedaço de Pão", 10, 10, 0, 1, inventario);
        Comida garrafaAgua = new Comida("Garrafa d'água", 0, 10, 10, 1, inventario);

    }



}
