public class Message {
	
	MessageType messageType;
	int id;
	
	public Message(MessageType mt, int pid) {
		messageType = mt;
		id = pid;
	}

	public MessageType getMessageType() {
		return messageType;
	}
	
	public int getPID() {
		return id;
	}
}