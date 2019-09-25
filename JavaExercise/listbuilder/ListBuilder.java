/*
 * enoch ajagbe
 * DataStructures 
 * Program 24.1 
 * 11/19/2017
 * Complete the work done in class involving the creation of MyArrayList by implementing the methods
 */
package listbuilder;

/**
 *
 * @author enoch
 */
public class ListBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyList<String> myArrayList = new MyArrayList<>();
        
        
       myArrayList.add("A");
       myArrayList.add("B");
       myArrayList.add("C");
       myArrayList.add("D");
       myArrayList.add("E");
       
       for (String word: myArrayList) {
           System.out.print(word + " ");
       }
       System.out.println();
       System.out.println("Should have A B C D E ");
       
      myArrayList.add(3, "C2");
        myArrayList.add(5, "D2");

        for (String word : myArrayList) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println("Should have:  A B C C2 D D2 E");

        System.out.println(myArrayList.get(3));
        System.out.println("Should have: C2");

        myArrayList.remove(3);
        myArrayList.remove(4);

        for (String word : myArrayList) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println("Should have:  A B C D E");

        myArrayList.clear();
        myArrayList.add("A");

        for (String word : myArrayList) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println("Should have:  A");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println("Tesing MyArrayList");

        myLinkedList.addFirst("B");
        myLinkedList.addFirst("A");
        myLinkedList.add("C");
        myLinkedList.add("D");
        myLinkedList.addLast("E");
        myLinkedList.addLast("F");
        myLinkedList.addLast("A");
        //same as addLast
        myLinkedList.add(1, "A2");
        myLinkedList.add(20, "Z");

        for (String word2 : myLinkedList) {
            System.out.print(word2);
        }

        System.out.println("");
        System.out.println("Should have: AA2BCDEFAZ");

        System.out.print(myLinkedList.get(5));
        System.out.print(myLinkedList.getFirst());
        System.out.print(myLinkedList.getLast());
        System.out.print(myLinkedList.indexOf("A"));
        System.out.print(myLinkedList.lastIndexOf("A"));
        System.out.println("");
        System.out.println("Should have: EAZ07");

        myLinkedList.set(myLinkedList.size() - 2, "Y");
        myLinkedList.remove(4);
        myLinkedList.removeFirst();
        myLinkedList.removeFirst();
        myLinkedList.removeLast();

        for (String word2 : myLinkedList) {
            System.out.print(word2);
        }
        System.out.println("");
        System.out.println("Should have: BCEFY");
    }
}
