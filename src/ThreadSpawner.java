import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.BrokenBarrierException;

/**
 * This class holds a main function, which connects to each Client and directs them to a Server thread they can
 * communicate with.
 *
 * @author Dylan, Nathanael, James, Vaibhav, Jordan
 * @version November 13, 2022
 */
public class ThreadSpawner {

    public static void main(String[] args) {
        try (
                var socket = new ServerSocket(10101);
        ) {
            while (true) {
                Server.barrier.reset();
                var listenerThread = new Thread(new Server(socket));
                listenerThread.start();

                try {
                    Server.barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}