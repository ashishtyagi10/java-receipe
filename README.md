# java-receipe

1. A process has self contained execution enviornment. It has private set of basic run time resources and have its own memory space. 
2. Java can create additional process using `ProcessBuilder` class. Most execution of JVM run one process.
3. Thread is a lightweight process. Every process have one thread but can have multiple as well.
4. Thread can be created either implemeting Runnable interface or extending Thread class.
5. `Thread.sleep` causes current thread to suspand execution (two variation - miliseconds or nenoseconds) but can not be guranteed to be precise.  it throws `InterruptedException` when another thread interrupts the current thread while `sleep` is active.
6. The interrupt mechanism is implemented using an internal flag known as the interrupt status. Any method that exits by throwing `InterruptException` clears interrupt status. 

## Synchronization
Synchronization is process of preventing *Thread Interference* and *Memory Consistency Errors* which happened during thread communication. Drawback of synchronization would be *thread contention* which occure when two or more thread try to access same resources simultaneously and cause Java runtime to execute one or more thread slowly or suspend their execution.
### Thread Interference
When one thread interfere the result of another thread is called thread interfernce. For Example
Thread A: Retrieve c.
Thread B: Retrieve c.
Thread A: Increment retrieved value; result is 1.
Thread B: Decrement retrieved value; result is -1.
Thread A: Store result in c; c is now 1.
Thread B: Store result in c; c is now -1.
Final value might be -1

### Memory Consistency Error
*happen-before* relationship is a gurantee that memory writes by one statement is visible to another statement
* When a statement invokes Thread.start, every statement that has a happens-before relationship with that statement also has a happens-before relationship with every statement executed by the new thread. The effects of the code that led up to the creation of the new thread are visible to the new thread.
* When a thread terminates and causes a Thread.join in another thread to return, then all the statements executed by the terminated thread have a happens-before relationship with all the statements following the successful join. The effects of the code in the thread are now visible to the thread that performed the join.
