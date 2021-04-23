package linkedlist;

public class LinkedList<T>
{
    private Node<T> first; // Zeiger, zeigt auf erste Element

    private Node<T> last; // Zeiger, zeigt auf letzte Element

    private Node<T> iterator;

    /**
     * Einfuegen eines neuen Objekts am Ende der Liste
     * @param a Object
     */
    public void add(T a) {
        Node<T> newElement = new Node<>(a);
        if (first == null) {
            // Liste ist leer
            first = newElement;
            last = newElement;
        }
        else {
            // Liste ist schon befüllt
            last.setNext(newElement);
            last = newElement;
        }
    }

    /**
     * Gibt Object an bestimmter Position zurueck. Ausgehend von first muss die Liste von vorne nach hinten
     * durchgegangen werden, bis das Element an der Position pos erreicht wurde.
     * @param pos Position, Nummerierung startet mit 1
     * @return Object|null
     */
    public T get(int pos) {

        Node<T> n = first;
        int index = 1;
        while (index != pos && n != null) {
            index++;
            n = n.getNext();
        }

        return n != null ? n.getValue() : null;
    }

    /**
     * Entfernen des Elements an der angegebenen Position
     *
     * @param pos
     */
    public void remove(int pos) {
        // 1. Ausgehend von first, bis zum Element an der Position pos hin navigieren.
        //  (siehe get)
        // 2. Überprüfen ob pos überhaupt gefunden wurde
        // 3. Aufpassen, wenn pos das erste Element ist,
        //  dann muss first nämlich auch geändert werden
        // 4. Next richtig setzen
        // 5. Aufpassen, wenn pos das letzte Element ist, dann muss last
        //  nämlich auch geändert werden

        Node<T> n = first;
        Node<T> prev = null;
        int cnt = 1;

        while (cnt != pos && n != null) {
            cnt++;
            prev = n;
            n = n.getNext();
        }

        if (n == null)
            return ;

        if (pos == 1) {
            Node<T> delete = first;
            first = first.getNext();
            delete.setNext(null);
        }
        else if (prev.getNext() == last){
            last = prev;
        }
        else if (prev != null){
            prev.setNext(prev.getNext().getNext());
        }
    }

    /**
     * Retourniert die Position eines Objects in der Liste
     * @param a Zu suchende Object
     * @return int Position oder 0, wenn Object nicht gefunden
     */
    public int getPos(T a) {

        Node<T> n = first;
        int index = 1;
        while (n != null && n.getValue() != a) {
            index++;
            n = n.getNext();
        }

        return n != null ? index : 0;
    }

    /**
     * Loescht eine angegebene Object aus der Liste
     * @param a Zu loeschende Object
     * @return boolean true:  Object geloescht,
     *                 false: Object nicht gefunden
     */
    public boolean removeObject(T a) {

        int index = getPos(a);
        if (index == 0)
            return false;

        remove(index);
        return true;
    }

    public void reset(){
        iterator = first;
    }

    public T next() {
        if (iterator == null)
            return null;

        T value = iterator.getValue();
        iterator = iterator.getNext();
        return value;
    }

}