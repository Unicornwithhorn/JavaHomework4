
public class HandMadeQueue {
    String[] arr = new String[10];
    int size;

    //  enqueue() - помещает элемент в конец очереди
    void enqueue(String element){
        if (size == arr.length){
            String[] temp = new String[size*2];
            System.arraycopy(arr,0,temp,0,size);
            arr = temp;
        }
        arr[size++] = element;
    }
//    dequeue() - возвращает первый элемент из очереди и удаляет его
    String dequeue(){
        try {
            String firstElement = arr[0];
            String[] temp = new String[size];
            System.arraycopy(arr, 1, temp, 0, size - 1);
            arr = temp;
            return firstElement;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    //        first() - возвращает первый элемент из очереди, не удаляя.
    String first(){
        if (arr.length == 0){
            return null;
        }
        return arr[0];
    }
}
