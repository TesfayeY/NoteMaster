/**
 * Incomplete tester class for MusicNote project
 */

public class MidiValuesOnParade {
    public static void main (String [] args) throws Exception{
        NotePlayer player = new NotePlayer();
        MusicNote [] NoteList = new QNote[13];
        int len = NoteList.length;
        System.out.printf("%5s%7s%7s\n","Midi","Sharp", "Flat");
        System.out.printf("%5s%7s%7s\n","Value","Symbol", "Symbol");
        for (int x=0; x<len; x++) {
            System.out.printf("%5d%7s%7s\n", MC.MIDIVALUES[x+40],
                MC.SYMBOLSSHARP[x+40], MC.SYMBOLSFLAT[x+40]);
            QNote n = new QNote(.25, MC.SYMBOLSFLAT[x+40]);
            NoteList[x] = n;
            player.playNote(n);
        }
    }
}
        
