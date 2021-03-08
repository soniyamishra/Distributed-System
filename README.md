# Distributed-system Practical 1
# Client Server communication model: 
Client–server model is a distributed application structure that partitions tasks or workloads between the providers of a resource or service, called servers, and service requesters, called clients. Often clients and servers communicate over a computer network on separate hardware, but both client and server may reside in the same system. A server host runs one or more server programs, which share their resources with clients. A client does not share any of its resources, but it requests content or service from a server. Clients therefore initiate communication sessions with servers, which await incoming requests. Examples of computer applications that use the client–server model are Email, network printing, and the World Wide Web. 

 The client-server characteristic describes the relationship of cooperating programs in an application. The server component provides a function or service to one or many clients, which initiate requests for such services. Servers are classified by the services they provide. For example, a web server serves web pages and a file server serves computer files. A shared resource may be any of the server computer's software and electronic components, from programs and data to processors and storage devices. The sharing of resources of a server constitutes a service. 
 
# RMI (Remote Method Invocation) Practical 2
The RMI (Remote Method Invocation) is an API that provides a mechanism to create distributed application in java. The RMI allows an object to invoke methods on an object running in another JVM.

# Remote Procedure Call (RPC): Practical 3
A remote procedure call is an inter process communication technique that is used for clientserver-based applications. It is also known as a subroutine call or a function call. 
A client has a request message that the RPC translates and sends to the server. This request may be a procedure or a function call to a remote server. When the server receives the request, it sends the required response back to the client. The client is blocked while the server is processing the call and only resumed execution after the server is finished. 

# Mutual exclusion: Practical 5
Mutual exclusion is a concurrency control property which is introduced to prevent race conditions. It is the requirement that a process cannot enter its critical section while another concurrent process is currently present or executing in its critical section i.e. only one process is allowed to execute the critical section at any given instance of time. 
 
Distributed mutual exclusion algorithms must deal with unpredictable message delays and incomplete knowledge of the system state.  
Three basic approaches for distributed mutual exclusion:  
1. Token based approach  2. Non-token-based approach  3. Quorum based approach  
 
Token-based approach: • A unique token is shared among the sites.  • A site is allowed to enter its CS if it possesses the token. • Mutual exclusion is ensured because the token is unique. • Example: Suzuki-Kasami’s Broadcast Algorithm 

# Election algorithms Practical 6
Many distributed algorithms require the election of a special coordinator process; one that has a special role, or initiates something, or monitors something. Often it doesn't matter who the special process is, but one and only one must be elected, and it can't be known in advance who it will be. On a low-level you can think about the monitor in a token ring as an example. 
The assumptions of these algorithms are that every process can be uniquely identified (by IP address, for example), and that each process can find out the id of the other processes. What the processes don't know is which processes are up and which are down at any given point in time. 

# Clock synchronization algorithm: Practical 7
Clock synchronization is a method of synchronizing clock values of any two nodes in a distributed system with the use of external reference clock or internal clock value of the node. During the synchronization, many factors effect on a network. As discussed above, these factors need to be considered before correcting actual clock value. Based on the approach, clock synchronization algorithms are divided as Centralized Clock Synchronization and Distributed Clock Synchronization Algorithm. 
Distributed algorithm:
• There is particular time server. 
• The processor periodically reach an agreement on the clock value by averaging the time of neighbor clock and its local clock. 
• This can be used if no UTC receiver exist (no external synchronization is needed). Only internal synchronization is performed. 
• Processes can run different machine and no global clock to judge which event happened first.

# Two phase protocol follows following steps: Practical 8
Step1:
The co-ordinator send the VOTE_REQUEST message to all participants.
Step2:
When a participant receives a VOTE_REQUEST message,it returns either a VOTE_COMMIT message to the co-ordinator telling the co-ordinator that is prepared to commit or a VOTE_ABORT message.
Step3:
The co-ordinator collects all votes from the participants. If all participants had voted to commit the transaction then it sends GLOBAL_COMMIT message to all participants.Even if one participants had voted to abort the transaction then it send GLOBAL_ABORT message.

Step4:
Each participant that voted for a commit waits for the final reaction by the co-ordinator. If a participant receives a GLOBA_COMMIT message it locally commits the transaction else it abort 
the local transaction.




