//        Реализуйте очередь с помощью LinkedList со следующими методами: enqueue()
//        - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class Task2 {
    public static void main(String[] args) {
        HandMadeQueue handMadeQueue = new HandMadeQueue();
        handMadeQueue.enqueue("Водород");
        handMadeQueue.enqueue("Гелий");
        handMadeQueue.enqueue("Литий");
        handMadeQueue.enqueue("Бериллий");
        handMadeQueue.enqueue("Бор");
        handMadeQueue.enqueue("Углерод");
        handMadeQueue.enqueue("Азот");

        System.out.println(handMadeQueue.first());
        System.out.println(handMadeQueue.dequeue());
        System.out.println(handMadeQueue.first());
        System.out.println(handMadeQueue.dequeue());
        System.out.println(handMadeQueue.dequeue());
        System.out.println(handMadeQueue.dequeue());
        System.out.println(handMadeQueue.dequeue());
        System.out.println(handMadeQueue.dequeue());
        System.out.println(handMadeQueue.dequeue());
        System.out.println(handMadeQueue.dequeue());


    }
}
