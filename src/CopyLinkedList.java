public class CopyLinkedList {
    Node dummy = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node forth = new Node(4);


    public static void main(String[] args) {
        CopyLinkedList abc = new CopyLinkedList();
        abc.dummy.next = abc.second;
        abc.second.next = abc.third;
        abc.third.next = abc.forth;
        CopyLinkedList llt = new CopyLinkedList();
        System.out.println(llt.getlastvalue(abc.dummy));
        //System.out.println(dummy.getlastvalue());
    }


    public int getlastvalue(Node input){
        while (input.next != null){
            input = input.next;
        }
        dummy.next=second;
        return input.value;
    }
}
