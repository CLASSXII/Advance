public class Node
{

   int value ;
   Node nextNode;
   
   public Node()
   {
        value=0;
        nextNode =null;
    }
    public void setNextNode(Node n)
    {
        nextNode=n;
    }
    public void setValue(int val)
    {
        value =val;
    }
}