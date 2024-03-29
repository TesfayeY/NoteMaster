/** 
 * MC: Music constants for use with MusicNote interface
 * Set of useful values for defining music notes & related methods
 */
public class MC {  
    /** 
     * MIDIVALUES: list of musical note values for piano octaves 1-8
     */
    public static final int [] MIDIVALUES = {0,21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,
            77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,
            100,101,102,103,104,105,106,107,108};   
            
    /**
     * SYMBOLSSHARP: list of standard note symbols; accidentals are shown as sharps
     */
    public static final String [] SYMBOLSSHARP = {"R","A0","A#0","B0", 
            "C1","C#1","D1","D#1","E1","F1","F#1","G1","G#1","A1","A#1","B1",
            "C2","C#2","D2","D#2","E2","F2","F#2","G2","G#2","A2","A#2","B2",
            "C3","C#3","D3","D#3","E3","F3","F#3","G3","G#3","A3","A#3","B3",
            "C4","C#4","D4","D#4","E4","F4","F#4","G4","G#4","A4","A#4","B4",
            "C5","C#5","D5","D#5","E5","F5","F#5","G5","G#5","A5","A#5","B5",
            "C6","C#6","D6","D#6","E6","F6","F#6","G6","G#6","A6","A#6","B6",
            "C7","C#7","D7","D#7","E7","F7","F#7","G7","G#7","A7","A#7","B7","C8"};  
            
    /**
     * SYMBOLSFLAT: list of standard note symbols; accidentals are shown as flats
     */
    public static final String [] SYMBOLSFLAT = {"R","A0","Bb0","B0", 
            "C1","Db1","D1","Eb1","E1","F1","Gb1","G1","Ab1","A1","Bb1","B1",
            "C2","Db2","D2","Eb2","E2","F2","Gb2","G2","Ab2","A2","Bb2","B2",
            "C3","Db3","D3","Eb3","E3","F3","Gb3","G3","Ab3","A3","Bb3","B3",
            "C4","Db4","D4","Eb4","E4","F4","Gb4","G4","Ab4","A4","Bb4","B4",
            "C5","Db5","D5","Eb5","E5","F5","Gb5","G5","Ab5","A5","Bb5","B5",
            "C6","Db6","D6","Eb6","E6","F6","Gb6","G6","Ab6","A6","Bb6","B6",
            "C7","Db7","D7","Eb7","E7","F7","Gb7","G7","Ab7","A7","Bb7","B7","C8"};
            
    /**
     * finds index of a standard note based on its symbol in standard format:
     * <note value (including accidental)><octave>
     * @return index of note in MIDI & SYMBOLS arrays
     */
    public static int findIndex(String symbol) {
        int x;  // index of symbol, if found
        for (x=0; x<MIDIVALUES.length && 
            !(symbol.equals(SYMBOLSSHARP[x])||symbol.equals(SYMBOLSFLAT[x])); x++);
        if(x == MIDIVALUES.length) // not found
            return -1;
        else
            return x;
        } 
        
    /**
     * @return symbol for musical note using <note value><octave> notation
     */    
    public static String getSymbol (int value) {
        String symbol;
        int index = 0;
        if (value <= 0 || value > 108)
            symbol = "R";   // when all else fails, it's a rest
        else {

            while (MIDIVALUES[index] < value) { index++; }
            symbol = SYMBOLSSHARP[index];
        }
        if (symbol.charAt(0) == 'A')
            symbol = SYMBOLSFLAT[index]; // because who likes A#? 
        return symbol;
    }
}
