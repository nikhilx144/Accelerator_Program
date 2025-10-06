import java.util.*;

class QueueArray {
    int[] arr;
    int front, rear, size, capacity;

    QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return ;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return ;
        }
        int removed = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + removed);
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueArray q = new QueueArray(50);

        while (sc.hasNext()) {
            String cmd = sc.next();
            if (cmd.equals("enqueue")) {
                int x = sc.nextInt();
                q.enqueue(x);
            } 
            else if (cmd.equals("dequeue")) q.dequeue();
            else if (cmd.equals("display")) q.display();
            else break;
        }
    }
}
