import java.util.NoSuchElementException;

public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode tail;
    private int size;
    private int index;

    public void addToFront(Player player){
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    public void printList(){
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null){
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void firstRemove(){
        if (head == null) throw new NoSuchElementException();
        if (head == tail) head = tail = null;
        else head = head.getNextPlayer();
        size--;
    }

    public void getSize(){
        System.out.println("Linked List Elements: " + size);
        System.out.println();
    }

    public void contains(Player player){
        PlayerNode current = head;
        boolean flag = false;
        while ((current != null) && (current.getPlayer() != player)){
            current = current.getNextPlayer();
        }
        if (current != null){
            flag = true;
        }
        System.out.println(flag);
        System.out.println();
    }

    public void indexOf(Player player){
        PlayerNode current = head;
        index = 0;
        while (player != current.getPlayer()){
            current = current.getNextPlayer();
            index++;
            if (current == null){
                return;
            }
        }
        System.out.println(index);
    }
}
