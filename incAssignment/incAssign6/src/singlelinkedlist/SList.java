package singlelinkedlist;

public class SList<T> {
    private SListIterator<T> sListIterator=new SListIterator<>();
    @Override
    public String toString() {

        String sList="Head";
        while(sListIterator.hasNext())
        {
            Node<T> next=sListIterator.next();
            sList+="->"+next.data;
        }
        if(sList.equalsIgnoreCase("head"))
            return "The list is empty";
        return sList;
    }

    public SListIterator<T> iterator()
    {
        return sListIterator;
    }
}
