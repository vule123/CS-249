This is an implementation of Chandy Lamports Snap-shot algorithm.
The program is using the topology in the associated Topology.png

Sample output:
......
Doing some computation on 1
Doing some computation on 1
Processing Algorithm message....
Doing some computation on 1
Doing some computation on 1
Processing Algorithm message....
Doing some computation on 1
Doing some computation on 1
Processing Algorithm message....
Doing some computation on 1
Processing Algorithm message....
Doing some computation on 1
Doing some computation on 2
Doing some computation on 2
Processing Algorithm message....
Doing some computation on 2
Doing some computation on 2
Processing Algorithm message....
Doing some computation on 2
Processing Algorithm message....
Doing some computation on 2
Processing Algorithm message....
Doing some computation on 2
Processing Algorithm message....
Doing some computation on 3
Processing Algorithm message....
Doing some computation on 3
Doing some computation on 3
Processing Algorithm message....
Doing some computation on 3
Doing some computation on 3
Processing Algorithm message....
Doing some computation on 3
Processing Algorithm message....
Doing some computation on 3
Processing Algorithm message....
Recording my registers... Processor: 1
Recording my program counters...Processor: 1
Recording my local variables...Processor: 1
Starting recording Channel 21
Starting recording Channel 31
Recording my registers... Processor: 3
Recording my program counters...Processor: 3
Recording my local variables...Processor: 3
Starting recording Channel 23
Recording my registers... Processor: 2
Recording my program counters...Processor: 2
Recording my local variables...Processor: 2
Starting recording Channel 12
Channel 12 has stopped recording.
Channel 23 has stopped recording.
Channel 31 has stopped recording.
Channel 21 has stopped recording.
Doing some computation on 1
Processing Algorithm message....
Doing some computation on 3
Doing some computation on 2
Processing Algorithm message....
Doing some computation on 2
Processing Algorithm message....
Doing some computation on 1
Processing Algorithm message....
Doing some computation on 1
Doing some computation on 3
Doing some computation on 3
Processing Algorithm message....
Processing Algorithm message....
Doing some computation on 3
Processing Algorithm message....
Doing some computation on 3
Doing some computation on 2
Processing Algorithm message....
Doing some computation on 2
Doing some computation on 1
Processing Algorithm message....
------------------------Printing Snapshot for Processor P:1----------------------------
Number of Algorithms message received until first marker message = 6
Channel C:31
--------------------------------------------------------------------------------------------
------------------------Printing Snapshot for Processor P:2----------------------------
Number of Algorithms message received until first marker message = 3
--------------------------------------------------------------------------------------------
------------------------Printing Snapshot for Processor P:3----------------------------
Number of Algorithms message received until first marker message = 5
Channel C:23
--------------------------------------------------------------------------------------------

