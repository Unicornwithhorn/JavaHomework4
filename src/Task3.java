import java.util.Iterator;
import java.util.LinkedList;

//        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(35);
        linkedList.add(663);
        linkedList.add(24);
        linkedList.add(61);
        linkedList.add(8);
        linkedList.add(42);
        linkedList.add(18);
        Iterator iterator = linkedList.iterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum +=(int) iterator.next();
        }
        System.out.println(sum);
    }
}
