public class QNode {
    int data;
    QNode next;

    public QNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class DynamicQueue{
    QNode rear , front;

    public DynamicQueue() {
        this.rear = null;
        this.front = null;
    }
    public void insert_queue(int data){
        QNode newNode = new QNode(data);
        if(this.rear==null){
            System.out.println("que was empty adding new queue");
            this.rear=newNode;
            this.front=newNode;
        }
        this.rear.next= newNode;
        this.rear=newNode;
    }



    public void delete_queue(){
        if (this.rear==null){
            System.out.println("cannot delete an empty queue");
        }
        QNode temp=this.front;
        this.front = this.front.next;
        if (this.front==null){
            this.rear=null;
        }

    }
    public void PrintDynamicQueue(){
    printingrecursively(this.front);

    }
    public void printingrecursively(QNode temp){
        if (temp == null){
//            System.out.print(temp.data + " ");
            return;

        }
        System.out.print(temp.data + " ");
        printingrecursively(temp.next);
    }
    public void reversePrintDynamicQueue(){
        reversePrintRecursive(this.rear);
        System.out.println();
    }

    private void reversePrintRecursive(QNode temp){
        if (temp == null) {
            return;
        }
        reversePrintRecursive(temp.next);
        System.out.print(temp.data + " ");
    }




}

