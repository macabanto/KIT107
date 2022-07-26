/**
 * Sticky Note Pad library class for KIT107 Lab 1.
 *
 * @author Julian Dermoudy and <<INSERT NAME HERE>>
 * @version 2020
 */

public class StickyNotePad
{
    private String[] pad;  // array of strings for note pad
    private int currentIndex; // index of current (displayed) note
    private int currentSize; // number of elements in use
    
    /**
     * Constructor
     * Instantiates array, and initialises current index and current
     *   usage count to 0
     * @param size number of elements in array
     */
    public StickyNotePad(int size)
    {
        pad=new String[size];
        currentIndex=0;
        currentSize=0;
    }
    
    /**
     * isFull
     * Check whether note pad is currently full, returning true if
     * so and false otherwise
     * @return boolean of whether note pad is full.
     */
    boolean isFull()
    {
        return (currentSize>=pad.length);
    }
    public int getIndex(){
        return currentIndex;
    }
    public int getSize(){
        return currentSize;
    }

    /**
     * isEmpty
     * Check whether note pad is currently empty, returning true
     * if so and false otherwise
     * @return boolean of whether note pad is empty.
     */
    boolean isEmpty()
    {
        return (currentSize==0);
    }
    
    /**
     * addNote
     * Create a new note by moving to the end of the used portion
     *   of the array, expanding the used portion by incrementing
     *   currentSize, and adding the given String to the new last
     *   element.  If the array is full then an
     *   ArrayIndexOutOfBoundsException object is created and
     *   thrown.
     * @param n contents of new note
     */
    public void addNote(String n)
    {
        if (! isFull())
        {
            currentIndex=currentSize;
            currentSize++;
            pad[currentIndex]=n;
        }
    }
    
    /**
     * deleteNote
     * Delete current note, moving all later notes down in the
     *   array to overwrite the current one.  If there are no
     *   notes then don't do anything.
     */
    public void deleteNote()
    {
        if(!isEmpty()){
            for(int i=currentIndex;i<(currentSize-1);i++){
                pad[i]=pad[i+1];
            }
            if(currentIndex==(currentSize-1)){
                pad[currentIndex]="";
                currentIndex--;
            }
        }
        currentSize--;
        if(isEmpty()){
            currentIndex=0;
        }
        else if(currentIndex>currentSize){
            currentIndex=currentSize-1;
        }
    }
    
    /**
     * getNote
     * Examine current sticky note and return its contents
     *   prefaced by "NOTE x OF y.".  If there are no notes in
     *   the sticky note pad then "" is returned.
     * @return String printable version of sticky note contents
     */
    public String getNote()
    {
        String ans;
        if(isEmpty()){
            ans="";

        }
        else{
            ans="NOTE "+(currentIndex+1)+" OF "+currentSize+".\n"+pad[currentIndex];
        }
        return ans;
    }
    
    /**
     * nextNote
     * Move current note index to next note in note pad (stopping
     *   at last note).
     */
    public void nextNote()
    {
        // increment current note index
        //***
        currentIndex++;
        // readjust current index to end of used portion if necessary
        //***
        getNote();
    }
    
    
    /**
     * previousNote
     * Move current note index to previous note in note pad (stopping
     *   at first note).
     */
    public void previousNote()
    {
        // decrement current note index
        //***
        currentIndex--;
        // readjust current index to start of used portion if necessary
        //***
        getNote();

    }
}
