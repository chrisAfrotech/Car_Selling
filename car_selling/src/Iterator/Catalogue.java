package Iterator;

//le <T> signifie que l'interface Iterator peut être utilisée pour créer des itérateurs pour n'importe quel type d'élément.
public interface Catalogue<T> {
    Iterator<T> createIterator();
}