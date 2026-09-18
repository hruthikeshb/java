
public class CustomLinkedList 
{
    private static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void display() 
    { 
        Node current = head;
        while(current != null) 
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }
    
    public void create(int[] arr) 
    {
        
        head = new Node(arr[0], null);
        Node current = head;
        
        for(int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i], null);
            current.next = node;
            current = node;
        }
    }

    public void insertBegin(int data)
    {
        Node node = new Node(data, head);
        head = node;
    }

    public void insertEnd(int data)
    {
        Node node = new Node(data, null);
        
        Node current = head;
        while(current.next != null) 
        {
            current = current.next;
        }
        current.next = node;
    }

    public void deleteBegin()
    {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteEnd()
    {
        
        Node current = head;
        while(current.next.next != null)
        {
            current = current.next;
        }
        current.next = null;
    }

    public void reverse()
    {
        
    }

    public static void main(String[] args)
    {
        CustomLinkedList list = new CustomLinkedList();
        
        int[] arr = {1, 2, -1, 3, 4};
        list.create(arr);
        list.display();
        
        System.out.println("\nAfter deleting end:");
        list.deleteEnd();
        list.display();

    }    
}
