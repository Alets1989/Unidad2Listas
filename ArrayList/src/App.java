public class App {
    public static void main(String[] args) throws Exception {

        
        SinglyLinkedList lista = new SinglyLinkedList();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);
        lista.buscar(30);
        lista.mostrar();
        System.out.println("");
        System.out.println("El nodo se ha eliminado correctamente");
        lista.eliminar(30);
        lista.mostrar();
    }
}
