package collections;

import java.util.LinkedList;

public class MiidleValueInLinkedList {

	public static void main(String[] args) {

		LinkedList<String> l=new LinkedList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		l.add("f");
		System.out.println(l.size());
		//System.out.println(l.get(l.size()/2));
		if(l.size()%2==0){
			System.out.println(l.get(l.size()/2-1));
			System.out.println(l.get(l.size()/2));
		}
		
		//removing middle number
		/*System.out.println(l);
		l.remove(l.size()/2);
		System.out.println(l);*/
	}

}
