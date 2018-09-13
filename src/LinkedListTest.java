public class LinkedListTest {
    public static void main(String[] args) {
        Node dummy = new Node(1);
        Node second = new Node(2);
        dummy.next = second;

        Node third = new Node(3);
        second.next = third;

        LinkedListTest llt = new LinkedListTest(); // this llt object contains dummy - third objects? why? They are not fields....
        System.out.println(llt.getLast(dummy));
         //llt.getLast(dummy);

    }

    public int getLast(Node first) {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }

        bark(); // why does this method can be called in getLast method?
        return current.value;
        //System.out.println(current.value);
    }

    private void bark() {
        System.out.println("wawawa");
    }

}
