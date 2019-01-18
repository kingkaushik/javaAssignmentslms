package singlelinkedlist;

public class SingleLinkedList {
    public static void main(String[] args) {
        SList<String> stringSList=new SList<>();
        SListIterator<String> stringSListIterator=stringSList.iterator();

        stringSListIterator.insert("hello");
        System.out.println(stringSList.toString());
        stringSListIterator.insert("hi");
        System.out.println(stringSList.toString());
        stringSListIterator.delete();
        System.out.println(stringSList.toString());
    }
}
