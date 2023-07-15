import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.
public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Камень");
        linkedList.add("Ножницы");
        linkedList.add("Бумага");
        linkedList.add("Карандаш");
        linkedList.add("Огонь");
        linkedList.add("Вода");
        System.out.println(revers(linkedList));
    }
    public static LinkedList<String> revers (LinkedList<String> list){
        ListIterator<String> listIterator =list.listIterator(list.size());
        LinkedList<String> newlist = new LinkedList<>();
        while (listIterator.hasPrevious()) {
            newlist.add(listIterator.previous());
        }
        return newlist;
    }
}
