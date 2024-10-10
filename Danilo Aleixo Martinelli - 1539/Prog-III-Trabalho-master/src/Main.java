public class Main {
    public static void main(String[] args) {
        FormaManager manager = new FormaManager();

        // Adicionando formas com cores diferentes
        manager.addForma("Vermelho", "0,0", 20);
        manager.addForma("Verde", "10,10", 40);
        manager.addForma("Azul", "20,20", 60);

        // Adicionando formas com a mesma cor
        manager.addForma("Vermelho", "30,30", 15);
        manager.addForma("Verde", "40,40", 30);

        // Apresentando todas as formas
        manager.apresentar();
    }
}