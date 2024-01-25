import javax.sound.midi.*;

/**
 * QNotePlayer: simple class to access system default MIDI player & play notes
 */

public class NotePlayer {
    private Synthesizer synth;
    private MidiChannel channel;
    /**
     * Default constructor sets up an instrument using the default MIDI player
     */
    public NotePlayer () throws MidiUnavailableException {
        synth = MidiSystem.getSynthesizer(); 
        synth.open();
        synth.loadInstrument(synth.getDefaultSoundbank().getInstruments()[0]);
        channel = synth.getChannels()[0];
    }

    /**
     * Helper method that translates double note duration value to int digital value
     * @return note duration in ms
     */
    public int noteLength(double len) {
        if (len <= .0625) // we can't go below 16th notes
            return 100;
        else
            return (int)(len * 1600);
    }

    /**
     * Plays a single note on default MIDI player
     */
    public void playNote (MusicNote n) throws InterruptedException {
        int pitch = n.getPitch();
        int speed = noteLength(n.getDuration());
        if (pitch > 0)
            channel.noteOn(pitch, speed);
        else
            Thread.sleep(speed);
        Thread.sleep(speed);
        channel.noteOff(pitch);
    }

    public void cleanup () {
        synth.close();
    }
}

