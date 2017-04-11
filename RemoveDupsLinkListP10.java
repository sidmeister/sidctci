/*
Write oode to remove duplicates from a unsorted link list

FOLLOW UP

How would you solve this problem if a temporary buffer is not allowed
*/

public class RemoveDupsLinkListP10 {

    public void SolutionBuffer(Node head)
    {

        HashMap<Integer> map = new HashMap<>();
        Node prev = null;
        while(head!=null)
        {
            if(map.contains(head.data))
            {
                prev.next = head.next;
            }
            else
            {
                map.add(head.data);
                prev =  head;
            }
            head = head.next;

        }


    }

    public void SolutionNoBuffer(Node head)
    {

        while(head!=null)
        {
            Node runner = head;
            while(runner.next!=null)
            {
                if(runner.next.data == head.data)
                {
                    head.next = runner.next;
                }
                else
                {
                    runner = runner.next;
                }
            }
            head = head.next;
        }

    }

    public static void main(String[] args){

    }
}