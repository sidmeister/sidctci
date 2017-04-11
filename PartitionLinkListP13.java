/*
Write a code to partition a link list around a value x, such that all node less than x come after all nodes greater than equal to x;if x is contained in the list,the values of x only need to be after the elements less than x(see below). The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.

EXAMPLE
Input: 3->5->8->5->10->2->1 [partition = 5]
Output 3->1->2->>5->5->10->8

*/

class NodeP13
{
    int data;
    NodeP13 next;
    public NodeP13(int data) // constructor
    {
        this.data = data;                 // initialize data
    }
    public void displayLink()      // display ourself
    {
        System.out.print("{" + data + "} ");
    }
}  // end class NodeP13


public class PartitionLinkListP13 {

    public NodeP13 Solution (NodeP13 n, int x)
    {
        NodeP13 head = n;
        NodeP13 tail = n;
        while(n!=null)
        {
            if(n.data < x)
            {
                n.next = head;
                head = n;
            }
            else
            {
                n.next= tail;
                tail = n;
            }
            n = n.next;
        }

    }

    public static void main(String[] args){
        NodeP13 a =new NodeP13(3);
        NodeP13 b =new NodeP13(5);
        NodeP13 c =new NodeP13(8);
        NodeP13 d =new NodeP13(5);
        NodeP13 e =new NodeP13(10);
        NodeP13 f =new NodeP13(2);
        NodeP13 g =new NodeP13(1);
        NodeP13 head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        PartitionLinkListP13 p = new PartitionLinkListP13();
        p.Solution(head);
    }
}