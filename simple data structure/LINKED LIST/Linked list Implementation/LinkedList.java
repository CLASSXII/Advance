public class LinkedList
{
 Node HEAD;
 Node TAIL;
 
 public LinkedList()
 {
     HEAD = new Node();
     TAIL =HEAD;
    }
    
    public void addNode(int n)
    {
        Node nw= new Node();
        nw.setValue(n);
        TAIL.setNextNode(nw);
        TAIL=nw;
        
    }
 
public static void main(String [] args)

{
    LinkedList ls = new LinkedList();
    System.out.println(ls.HEAD.value);
     System.out.println(ls.HEAD.nextNode);
     ls.addNode(9);
     System.out.println(ls.HEAD.value);
     System.out.println(ls.HEAD.nextNode);
     ls.addNode(10);
     ls.addNode(11);
     ls.addNode(12);
     Node start =ls.HEAD;
     while(start.nextNode != null)
     {
         System.out.println(start.value);
         start=start.nextNode;
        }
         
     
     
    
}
}