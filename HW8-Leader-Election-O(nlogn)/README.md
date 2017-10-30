What this is about!

This is an implementation of O(nlogn) algorithm of leader election in an asynchronous ring topology of processors.
This program asks for the number of processors to be created and then creates a ring topology of those processors with id starting from 1 to the number of processors.
Using multi threading with one thread for each processor, then this program runs the leader election algorithm.

Sample Output:

Enter number of Processors for the ring topology
4
Topology: Processor 1 -> Processor 2 -> Processor 3 -> Processor 4 -> Processor 1
Leader elected: P4, P4 sends Terminate message
P1: My leader is P4
P2: My leader is P4
P3: My leader is P4
P4: My leader is P4
