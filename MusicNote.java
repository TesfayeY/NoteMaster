public interface MusicNote {

    // returns the length of the note in seconds
    public double getDuration();

    // return midi value of note
    public int getPitch(); 

    // sets length of note to specified value (in seconds)
    public void setDuration(double d);
    
    // sets pitch of note using MIDI value
    public void setPitch(int midi);
}
