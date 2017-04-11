/*
Implement an algorithm to delete a node in the middle(i.e any node but the first and last node not necessarily the exact middle node) of a singly linked list, given only access to that node.

Example

Input the node c from the linked list a->b->c->d->e->f
Result : nothing is returned but the the new linked list looks like a->b->d->e->f

You are not given access to the head of the node
*/

class NodeP12
{
    char data;
    NodeP12 next;
    public NodeP12(char data) // constructor
    {
        this.data = data;                 // initialize data
    }
    public void displayLink()      // display ourself
    {
        System.out.print("{" + data + "} ");
     }
}  // end class NodeP12


public class DeleteKthNodeP12 {

public  boolean Solution (NodeP12 toDelete)
{
    if(toDelete == null || toDelete.next == null)
        return false;
    NodeP12 next = toDelete.next;
    toDelete.data = next.data;
    toDelete.next = next.next;
 //   Solution(next);
    return true;
}

    public static void main(String[] args){
        NodeP12 a =new NodeP12('a');
        NodeP12 b =new NodeP12('b');
        NodeP12 c =new NodeP12('c');
        NodeP12 d =new NodeP12('d');
        NodeP12 e =new NodeP12('e');
        NodeP12 f =new NodeP12('f');
        NodeP12 head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.print("List (first-->last): ");
            NodeP12 current = head;       // start at beginning of list
            while(current != null)      // until end of list,
            {
                current.displayLink();   // print data
                current = current.next;  // move to next link
            }
        System.out.println("");
         current = head;
        DeleteKthNodeP12 p = new DeleteKthNodeP12();
        p.Solution(c);
        System.out.print("List (first-->last): ");
            while(current != null)      // until end of list,
            {
                current.displayLink();   // print data
                current = current.next;  // move to next link
            }
            System.out.println("");
    }
}