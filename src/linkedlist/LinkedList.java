package linkedlist;

public class LinkedList<T>
{
    private Node<T> first;

    private Node<T> last;

    private Node<T> iterator;

    /**
     * Einfuegen eines neuen Objekts am Ende der Liste
     * @param a Object
     */
    public void add(T a) {

    }



    /**
     * Gibt Object an bestimmter Position zurueck. Ausgehend von first muss die Liste von vorne nach hinten
     * durchgegangen werden, bis das Element an der Position pos erreicht wurde.
     * @param pos Position, Nummerierung startet mit 1
     * @return Object|null
     */
    public T get(int pos) {

        return null;
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



    }

    /**
     * Retourniert die Position eines Objects in der Liste
     * @param a Zu suchende Object
     * @return int Position oder 0, wenn Object nicht gefunden
     */
    public int getPos(T a) {


        return 0;
    }

    /**
     * Loescht eine angegebene Object aus der Liste
     * @param a Zu loeschende Object
     * @return boolean true:  Object geloescht,
     *                 false: Object nicht gefunden
     */
    public boolean removeObject(T a) {

        return true;
    }

    public void reset(){

    }

    public T next() {
        return null;
    }

}