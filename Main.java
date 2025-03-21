public class Main {
    public static void main(String[] args) {
        // Bolsa de Chocolatinas
        Bolsa<Chocolatina> bolsacho = new Bolsa<Chocolatina>(3);
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsacho.add(c);
        bolsacho.add(c1);
        bolsacho.add(c2);
        for (Chocolatina chocolatina : bolsacho) {
            System.out.println("Chocolatina: " + chocolatina.getMarca());
        }

        // Bolsa de Golosinas
        Bolsa<Golosina> bolsagolo = new Bolsa<Golosina>(2);
        Golosina g1 = new Golosina("Caramelo", 0.5);
        Golosina g2 = new Golosina("Chicle", 0.2);
        bolsagolo.add(g1);
        bolsagolo.add(g2);
        for (Golosina golosina : bolsagolo) {
            System.out.println("Golosina: " + golosina.getNombre() + " - Peso: " + golosina.getPeso());
        }
    }
}