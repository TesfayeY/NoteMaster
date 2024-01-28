public class QNote implements MusicNote {
    private int pitch;
    private double duration;
    
    public QNote(double len, String symbol) {
        setDuration(len);
        setPitchText(symbol);
    }
    
    public QNote(int midi, double len) {
        setPitch(midi);
        setDuration(len);
    }
    


    // returns the length of the note in seconds
    public double getDuration() {
        return duration;
    }

    // return midi value of note
    public int getPitch() {
        return pitch;
    }
    
   
    // sets length of note to specified value (in seconds)
    public void setDuration(double d) {
        if(d <= 0 || d > 1) {
            throw new IllegalArgumentException("Duration must be between 0 and 1");    
        }
        duration = d;
    }
    
    
    public void setPitch(int midi) {
        if (midi == 0 || midi >= 21 && midi <= 108)
            pitch = midi;
        else {
            throw new IllegalArgumentException ("midi value out of range");
        }
    }        

    
    public String getPitchSymbol() {
        return MC.getSymbol(pitch);
    }


    // sets the pitch of the note from symbol
    public void setPitchText(String symbol) {
        int index = MC.findIndex(symbol);
        if (index >= 0) {
            pitch = MC.MIDIVALUES[index];
        } else {
            throw new IllegalArgumentException (symbol + " is not a valid symbol");
        }
    }
     
    
    // returns a string in the format "<duration> <pitch> <repeat>"
    //       For example "0.5 A#4" and "0.25 R".
    public String toString() {
        return String.format("%.3f", duration) + " " + getPitchSymbol();
    }
}
