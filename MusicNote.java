public interface MusicNote {
   /** getDuration() returns  returns the length of the note in seconds
     * getPitch() return midi value of note
     * setDuration(double d) takes double d as parameter and sets length of note to specified value (in seconds)
     * setPitch(int midi) sets pitch of note using MIDI value
     */
    // returns the length of the note in seconds
    public double getDuration();

    // return midi value of note
    public int getPitch(); 

    // sets length of note to specified value (in seconds)
    public void setDuration(double d);
    
    // sets pitch of note using MIDI value
    public void setPitch(int midi);
}
