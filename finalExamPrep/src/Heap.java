public class Heap {
  private int[] heapArray;
  private int size;
  private int capacity;

  public Heap(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.heapArray = new int[capacity];
  }

  private int getParentIndex(int index) {
    return (index - 1) / 2;
  }

  private int getLeftChildIndex(int index) {
    return (2 * index) + 1;
  }

  private int getRightChildIndex(int index) {
    return (2 * index) + 2;
  }

  private void swap(int index1, int index2) {
    int temp = heapArray[index1];
    heapArray[index1] = heapArray[index2];
    heapArray[index2] = temp;
  }

  private void heapifyUp(int index) {
    int parentIndex = getParentIndex(index);
    if (parentIndex >= 0 && heapArray[parentIndex] > heapArray[index]) {
      swap(parentIndex, index);
      heapifyUp(parentIndex);
    }
  }

  private void heapifyDown(int index) {
    int leftChildIndex = getLeftChildIndex(index);
    int rightChildIndex = getRightChildIndex(index);
    int smallest = index;

    if (leftChildIndex < size && heapArray[leftChildIndex] < heapArray[smallest]) {
      smallest = leftChildIndex;
    }

    if (rightChildIndex < size && heapArray[rightChildIndex] < heapArray[smallest]) {
      smallest = rightChildIndex;
    }

    if (smallest != index) {
      swap(index, smallest);
      heapifyDown(smallest);
    }
  }

  public void insert(int value) {
    if (size == capacity) {
      System.out.println("Heap is full. Cannot insert more elements.");
      return;
    }

    heapArray[size] = value;
    heapifyUp(size);
    size++;
  }

  public int extractMin() {
    if (size == 0) {
      System.out.println("Heap is empty.");
      return -1;
    }

    int min = heapArray[0];
    heapArray[0] = heapArray[size - 1];
    size--;
    heapifyDown(0);

    return min;
  }/*class Node {
    int value;
    int priority;
    Node next;

    public Node(int value, int priority) {
        this.value = value;
        this.priority = priority;
        this.next = null;
    }
}

public class PriorityQueueLinkedList {
    private Node head;

    public PriorityQueueLinkedList() {
        this.head = null;
    }

    public void insert(int value, int priority) {
        Node newNode = new Node(value, priority);

        // If the list is empty or the new node has higher priority than the head
        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int extractMin() {
        if (head == null) {
            System.out.println("Priority queue is empty.");
            return -1;
        }

        int minValue = head.value;
        head = head.next;
        return minValue;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print("(" + current.value + ", " + current.priority + ") ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueLinkedList priorityQueue = new PriorityQueueLinkedList();
        priorityQueue.insert(5, 2);
        priorityQueue.insert(3, 1);
        priorityQueue.insert(8, 3);
        priorityQueue.insert(1, 1);
        priorityQueue.insert(10, 2);

        priorityQueue.display(); // Output: (3, 1) (1, 1) (5, 2) (10, 2) (8, 3)

        System.out.println("Extracted Min: " + priorityQueue.extractMin()); // Output: Extracted Min: 3

        priorityQueue.display(); // Output: (1, 1) (5, 2) (10, 2) (8, 3)
    }
}
*/

  public void display() {
    for (int i = 0; i < size; i++) {
      System.out.print(heapArray[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Heap heap = new Heap(10);
    heap.insert(5);
    heap.insert(3);
    heap.insert(8);
    heap.insert(1);
    heap.insert(10);

    heap.display(); // Output: 1 3 8 5 10

    System.out.println("Extracted Min: " + heap.extractMin()); // Output: Extracted Min: 1

    heap.display(); // Output: 3 5 8 10
  }
}
