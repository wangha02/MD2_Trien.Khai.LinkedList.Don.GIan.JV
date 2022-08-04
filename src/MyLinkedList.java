public class MyLinkedList {
    public static void main(String[] args) {
        System.out.println("==============> TESTING <==============");
        TestMyLinkedList ll = new TestMyLinkedList(10);
        ll.addFirt(11);
        ll.addFirt(12);
        ll.addFirt(13);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.printList();
    }
}
