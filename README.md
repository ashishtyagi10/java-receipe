# java-receipe

1. A process has self contained execution enviornment. It has private set of basic run time resources and have its own memory space. 
2. Java can create additional process using `ProcessBuilder` class. Most execution of JVM run one process.
3. Thread is a lightweight process. Every process have one thread but can have multiple as well.
4. Thread can be created either implemeting Runnable interface or extending Thread class.
5. `Thread.sleep` causes current thread to suspand execution (two variation - miliseconds or nenoseconds) but can not be guranteed to be precise.  it throws `InterruptedException` when another thread interrupts the current thread while `sleep` is active.
6. The interrupt mechanism is implemented using an internal flag known as the interrupt status. Any method that exits by throwing `InterruptException` clears interrupt status. 
7. 