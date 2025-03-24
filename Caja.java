public class Caja<T> {
    private T elemento;

    // Constructor
    public Caja(T elemento) {
        this.elemento = elemento;
    }

    // Método para obtener el elemento
    public T getElemento() {
        return elemento;
    }
    
    // Método para establecer un nuevo elemento
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public static void main(String[] args) {
        // Ejemplo de uso con Integer
        Caja<Integer> cajaEntero = new Caja<>(10);
        System.out.println("Elemento en la caja: " + cajaEntero.getElemento());
        
        // Modificar el elemento
        cajaEntero.setElemento(20);
        System.out.println("Nuevo elemento en la caja: " + cajaEntero.getElemento());
        
        // Ejemplo de uso con String
        Caja<String> cajaTexto = new Caja<>("Hola");
        System.out.println("Elemento en la caja: " + cajaTexto.getElemento());
        
        // Modificar el elemento
        cajaTexto.setElemento("Mundo");
        System.out.println("Nuevo elemento en la caja: " + cajaTexto.getElemento());
    }
}
