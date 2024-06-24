//package Class_Dynamic_Queue;

public class run {
    public static void main(String[] args) {
        
        Queue q = new Queue();

        q.enqueue(new Student(1,"Student 1"));
        q.enqueue(new Student(2, "Student 2"));

        System.out.println("Queue Front:"+ q.front.Student.toString());
        System.out.println("Queue Rear:"+ q.rear.Student.toString());

        //System.out.println(s.pop().toString());
    }
}
