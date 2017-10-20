import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String args[]) {

    	Processor processor1 = new Processor(1); 
    	Processor processor2 = new Processor(2); 
    	Processor processor3 = new Processor(3);
    	Processor processor4 = new Processor(4);
    	Processor processor5 = new Processor(5);

    	// Set neighbors to processors
    	processor1.setLeftNeighbor(processor5);
    	processor1.setRightNeighbor(processor2);
    	processor2.setLeftNeighbor(processor1);
    	processor2.setRightNeighbor(processor3);
    	processor3.setLeftNeighbor(processor2);
    	processor3.setRightNeighbor(processor4);
    	processor4.setLeftNeighbor(processor3);
    	processor4.setRightNeighbor(processor5);
    	processor5.setLeftNeighbor(processor4);
    	processor5.setRightNeighbor(processor1);

    	List<Processor> processors = new ArrayList<>();
    	processors.add(processor1);
    	processors.add(processor2);
    	processors.add(processor3);
    	processors.add(processor4);
    	processors.add(processor5);
    	
    	// Print topology of processors
    	Processor tempProcessor = processor1;
    	int i = 0;
    	while(tempProcessor.rightNeighbor != null && i <= 5) {
    		System.out.print("Processor " + tempProcessor.getID());
    		if (i != 5) {
    			System.out.print(" -> ");
    		} else {
    			System.out.println();
    		}
    		tempProcessor = tempProcessor.rightNeighbor;
    		i++;
    	}
    	
        ExecutorService executor = Executors.newFixedThreadPool(5);
        try {
        	for (Processor p : processors) {
        		executor.submit(p);
        	}
        	
        	Thread.sleep(3000);
        	executor.shutdown();
        	
        	if (executor.isShutdown()) {
        		for (Processor p : processors) {
        			p.announceLeader();
        		}
        	}
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}