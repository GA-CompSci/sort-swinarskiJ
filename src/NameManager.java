import java.util.ArrayList;

abstract class NameManager {
    /** Core data structure to hold your name list */
    protected ArrayList<String> names;

    /** Adds names to the list until a blank is submitted */
    abstract void buildList();
    
    /** Uses selection shuffle algorithm */
    abstract void shuffle();
    
    /** Sorts the list of names using insertion sort */
    abstract void insertionSort();
    
    /** Sorts the list of names using selection sort */
    abstract void selectionSort();
    
    /** Sorts the list of names using merge sort */
    abstract void mergeSort();
    
    /** Returns a random name from the names list */
    abstract String pickRandom();
}