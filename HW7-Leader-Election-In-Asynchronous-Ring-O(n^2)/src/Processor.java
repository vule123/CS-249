import java.util.Observable;
import java.util.Observer;

/**
 * Performs all the processor related tasks
 *
 * @author Sample
 * @version 1.0
 */


public class Processor implements Observer, Runnable {

	int id;
	int leaderId;
	Processor leftNeighbor;
	Processor rightNeighbor;
	Buffer myBuffer;
	boolean isElectedAsLeader;
	boolean terminate;
    
    
    /**
     * @param id of the processor
     */
    public Processor(int pid) {
        myBuffer = new Buffer();
    	id = pid;
    	leaderId = -1;
    	isElectedAsLeader = false;
    	terminate = false;
    	myBuffer.addObserver(this); // processor observes its buffer
    }
    
    public void setLeftNeighbor(Processor lNeighbor) {
    	leftNeighbor = lNeighbor;
    }

    public void setRightNeighbor(Processor rNeighbor) {
    	rightNeighbor = rNeighbor;
    }

    public int getID() {
    	return id;
    }
    
    public Buffer getBufferData() {
    	return myBuffer;
    }
   
    boolean isTerminated() {
    	return terminate == true;
    }

    /**
     * Overloaded method, called with single argument
     * This method will add a message to this processors buffer.
     * Other processors will invoke this method to send a message to this Processor
     *
     * @param message Message to be sent
     */
    public void sendMessageToMyBuffer(Message message) {
        myBuffer.saveMessage(message);
    }

    /**
     * Gets called when a Processor receives a message in its buffer
     * Processes the message received in the buffer
     */
    public void update(Observable observable, Object arg) {
        Message message = (Message) arg;
        MessageType msgType = message.getMessageType();
        int msgPID = message.getPID();
        switch(msgType) {
        case PROBE:
        	msgPID = message.getPID();
        	if (msgPID > id) {
        		leftNeighbor.sendMessageToMyBuffer(message);
        	} else if (msgPID == id) {
        		isElectedAsLeader = true;
        		leaderId = id;
        		terminate = true;
        		Message terminateMsg = new Message(MessageType.TERMINATE, leaderId);
        		leftNeighbor.sendMessageToMyBuffer(terminateMsg);
        	}
        case TERMINATE:
        	msgPID = message.getPID();
        	leaderId = msgPID;
        	terminate = true;
        	if (!leftNeighbor.isTerminated()) {
        		leftNeighbor.sendMessageToMyBuffer(message);
        	}
        }
    }

    public void run() {
		try {
			// If processor receives no message, send probe message with its processor id to next right processor (clockwise direction)
			if (!isTerminated() && getBufferData().getTotalMessageCount() == 0) {
				Message message = new Message(MessageType.PROBE, id);
				Thread.sleep(200);
				leftNeighbor.sendMessageToMyBuffer(message);
				System.out.println("Processor " + id + " sending Probe with its own ID");
			}
		} catch (Exception ex) {
			System.out.println("Exception in Thread run");
		}
	}
    
    public void announceLeader() {
    	System.out.println("Processor " + id + ": My leader is " + leaderId);
    }
}