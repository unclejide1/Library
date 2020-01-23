package com.decagonhq;

public class Queue {
    private Borrowers queue[] = new Borrowers[5];
    private int size;
    private int front;
    private int rear;

    public int enqueue(Borrowers data){
        for (int i = front; i < size; i++) {
            Borrowers b = queue[i];
            if (data.getName().equals(b.getName())) {
//                System.out.println( data.getName() + " already exists in the queue");
                return -1;
            }
        }
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size = size + 1;
            return 0;
        }
            System.out.println("Queue is full borrow books out can not add \"" + data.toString() + "\" to the borrowers queue, please begin to lend book out");
            return 1;


    }
    public void show(){
        for(int i = 0; i<size; i++){
            System.out.print(queue[i].toString() + " ");
        }
    }

    public void show2(){
        System.out.println();
        System.out.print("[");
        for(int i = 0; i<size; i++){
            System.out.print(queue[(front+i)%5].toString() + " ,");
        }
        System.out.print("]");
        System.out.println();
    }

    public Borrowers dequeue(){
        if(!isEmpty()) {
            Borrowers data = queue[front];
//            Borrowers newData = new Borrowers("temp", "temp");
//            queue[front] = newData;
            System.out.println(data + " was deleted from the queue");
            front = (front + 1) % 5;
            size = size - 1;
            return data;
        }else {
            System.out.println("queue is empty, you can add more books to the queue");
        }
        return null;
    }

    public Borrowers[] getQueue() {
        return queue;
    }

    public void setQueue(Borrowers[] queue) {
        this.queue = queue;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public boolean isFull(){
        return getSize()==5;
    }
}
