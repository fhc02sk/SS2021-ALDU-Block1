package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLinkedList {

	@Test
	public void getPos() {
		LinkedList<String> ll = new LinkedList<>();
		assertEquals("Leere Liste: pos==0", 0, ll.getPos(new String("leer")));
		String a = new String("eins");
		ll.add(a);
		assertEquals("Unbekanntes Element, Test1", 0, ll.getPos(new String("leer")));
		assertEquals("Element = first", 1, ll.getPos(a));
		ll.add(new String("zwei"));
		ll.add(new String("drei"));
		a = new String("vier");
		ll.add(a);
		assertEquals("Element = last", 4, ll.getPos(a));
		assertEquals("Unbekanntes Element, Test2", 0, ll.getPos(new String("leer")));
	}

	@Test
	public void removeString() {
		LinkedList<String> ll = new LinkedList<>();
		String a = new String("eins");
		assertFalse("Leere Liste", ll.removeObject(a));
		ll.add(a);
		assertTrue("Einziges Element", ll.removeObject(a));
		String b = new String("zwei");
		String c = new String("drei");
		String d = new String("vier");
		ll.add(a);
		ll.add(b);
		ll.add(c);
		ll.add(d);
		assertTrue("Letztes Element", ll.removeObject(d));
		assertTrue("Element in Mitte", ll.removeObject(b));
		assertTrue("Erstes Element", ll.removeObject(a));

	}



	


}