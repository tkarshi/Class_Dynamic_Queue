//package Class_Dynamic_Queue;

public class Queue {

    QNode front, rear;

    public Queue(){

        this.front = this.rear = null;
    }
    
    void enqueue(Student Student){
        QNode temp = new QNode(Student);

        if (this.rear == null){
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;

    }

    void dequeue(Student Student){
        if(this.front == null){
            return;
        }
        
        
        this.front = this.front.next;

        if (this.front == null){
            this.rear = null;
        }
   }
}