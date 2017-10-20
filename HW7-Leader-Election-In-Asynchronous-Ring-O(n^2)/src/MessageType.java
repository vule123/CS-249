/**
 * Messages that can be passed
 * @author Sample
 */
public enum  MessageType {
	// Terminate message sent when a processor elects itself as leader
	TERMINATE,
	// Probe message sent at the beginning when a processor's buffer is empty
	PROBE
}