package singlelinkedlist;

public class SListIterator <T>{
    Node<T> head;
    Node<T> current;
    Node<T> iterator;
    public SListIterator() {
        this.head=null;
        this.current=null;
    }

    public void insert(T data)
    {
        if(head==null)
        {
           head=new Node<T>(data);
           head.next=null;
           current=head;
           iterator=head;
        }
        else
        {
            Node<T> node=new Node<>(data);
            current.next=node;
            current=node;
        }
        iterator=head;
    }

    public void insert(T data,int position)
    {
        if(position<=0)
        {
            System.out.println("given wrong position "+position);
        }
        else
        {
            if(position==1)
            {
                insert(data);
                return;
            }
            int sListPointer=1;
            Node<T> nodeLocator=head;
            int positionCheckingFlag=0;
            while(sListPointer!=position-1)
            {
                if(nodeLocator!=null)
                    nodeLocator=nodeLocator.next;
                else
                {
                    positionCheckingFlag=1;
                    break;
                }
                sListPointer++;
            }
            if(positionCheckingFlag==1)
            {
                System.out.println("The position "+position+" is invalid because there are only "+sListPointer+" nodes");
            }
            else
            {
                Node<T> node=new Node<>(data);
                node.next=nodeLocator.next;
                nodeLocator.next=node;
            }
        }
        iterator=head;
    }
    public void delete()
    {
        if(head!=null)
        {
            Node<T> node=head;
            head=node.next;
            node = null;
        }
        else
        {
            System.out.println("There is no element in slist to delete");
        }
        iterator=head;
    }
    public  void delete(int position)
    {
        if(head!=null)
        {
            Node<T> nodeLocator=head;
            int sListPointer=1;
            int positionCheckingFlag=0;
            while(sListPointer!=position-1)
            {
                if(nodeLocator!=null)
                    nodeLocator=nodeLocator.next;
                else
                {
                    positionCheckingFlag=1;
                    break;
                }
                sListPointer++;
            }
            if(positionCheckingFlag==1)
            {
                System.out.println("The position "+position+" is invalid because there are only "+sListPointer+" nodes");
            }
            else
            {
                if(position==1)
                    delete();
                else
                {
                    Node<T> nodeToBeDeleted=nodeLocator.next;
                    nodeLocator.next=nodeToBeDeleted.next;
                    if(current==nodeToBeDeleted)
                        current=nodeLocator;
                }
            }
        }
        else
        {
            System.out.println("There is no element in slist to delete");
        }
        iterator=head;
    }

    public boolean hasNext() {
        if(iterator!=null)
        {
            return true;
        }
        return false;
    }

    public Node<T> next() {
        if(iterator!=null) {
            Node<T> nextNode=iterator;
            iterator = iterator.next;
            return nextNode;
        }
        return null;
    }
}
