# Garbage-collector
Implement four of the known algorithms used in Garbage Collectors.
## Description
In this Project, We will implement four of the known algorithms used in Garbage Collectors:
  * Mark & Sweep GC.
  * Mark & Compact GC.
  * Copy GC.
 
## How to run:
Program is executed by jar file which takes four arguments:
 * The first three arguments are the absolute paths of heap.csv, roots.txt, and pointers.csv.
 * The last argument is the absolute path in which the new-heap.csv file will be saved to.

### The input files:
 * File heap.csv : it represents the information about a single allocated object. This object may be used or not used.
    * object-identifier: a unique 6 digits identifier of the allocated objects.
    * memory-start: the index of the first byte in heap memory representing this object
    * memory-end: the index of the last byte in heap memory representing this object

 * File roots.txt: it lists object-identifiers that are currently in use.Each line in this file contains a single object-identifier.
 * File pointers.csv: It stores the dependencies between different objects. 
    * parent-identifier: a unique identifier for the parent object
    * child-identifier: a unique identifier for the child object referenced by the parent 

### The output of program:
 * File new-heap.csv: it shows the new memory layout after running the garbage collector.

