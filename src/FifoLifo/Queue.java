package FifoLifo;

public class Queue {
    public static void main(String[] args) {
        FifoQueue fifoQueue = new FifoQueue();
        LifoQueue lifoQueue = new LifoQueue();

        fifoQueue.putNumber(5);
        fifoQueue.putNumber(6);
        fifoQueue.putNumber(7);


        System.out.println(fifoQueue.getNumber());
        System.out.println(fifoQueue.getNumber());
        System.out.println(fifoQueue.getNumber());

        lifoQueue.putNumber(5);
        lifoQueue.putNumber(6);
        lifoQueue.putNumber(7);

        System.out.println(lifoQueue.getNumber());
        System.out.println(lifoQueue.getNumber());
        System.out.println(lifoQueue.getNumber());

    }
}
