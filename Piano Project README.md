Introduction
This is a piano project that provides a set of useful music constants and classes for working with musical notes. It includes classes for defining and manipulating music notes, a MIDI note player, and a tester class for demonstration purposes.

Music Constants (MC.java)
The MC class contains constants and methods related to musical notes.

Constants:
MIDIVALUES: An array of MIDI note values for piano octaves 1-8.
SYMBOLSSHARP: An array of standard note symbols; accidentals are shown as sharps.
SYMBOLSFLAT: An array of standard note symbols; accidentals are shown as flats.
Methods:
findIndex(String symbol): Finds the index of a standard note based on its symbol in standard format (<note value (including accidental)><octave>).
getSymbol(int value): Returns the symbol for a musical note using <note value><octave> notation.
Music Note Interfaces (MusicNote.java)
The MusicNote interface defines methods that must be implemented by any class representing a musical note.

Methods:
getDuration(): Returns the length of the note in seconds.
getPitch(): Returns the MIDI value of the note.
setDuration(double d): Sets the length of the note to the specified value (in seconds).
setPitch(int midi): Sets the pitch of the note using a MIDI value.
NotePlayer Class (NotePlayer.java)
The NotePlayer class provides a simple way to play musical notes using the system's default MIDI player.

Methods:
NotePlayer(): Constructor that sets up an instrument using the default MIDI player.
noteLength(double len): Helper method to translate double note duration values to int digital values.
playNote(MusicNote n): Plays a single note on the default MIDI player.
cleanup(): Closes the MIDI synthesizer when done.
QNote Class (QNote.java)
The QNote class implements the MusicNote interface and represents a musical note with a specified duration and pitch.

Constructors:
QNote(double len, String symbol): Creates a note with the given duration (in seconds) and symbol (e.g., "A#4").
QNote(int midi, double len): Creates a note with the given MIDI value and duration (in seconds).
Methods:
getDuration(): Returns the length of the note in seconds.
getPitch(): Returns the MIDI value of the note.
setDuration(double d): Sets the length of the note to the specified value (in seconds).
setPitch(int midi): Sets the pitch of the note using a MIDI value.
getPitchSymbol(): Returns the symbol of the note.
setPitchText(String symbol): Sets the pitch of the note from a symbol.
toString(): Returns a string representation of the note in the format <duration> <pitch> (e.g., "0.5 A#4").
MidiValuesOnParade Class (MidiValuesOnParade.java)
The MidiValuesOnParade class is an incomplete tester class for the MusicNote project. It demonstrates how to use the MC, QNote, and NotePlayer classes to generate and play notes.

How to Use
To use this project, you can follow these steps:

Download or clone the repository from GitHub.
Include the MC.java, MusicNote.java, NotePlayer.java, QNote.java, and MidiValuesOnParade.java files in your project.
Create your own classes and methods to use the provided classes for your specific piano project needs.
Compile and run your project to see the results.
Feel free to customize and extend the provided classes to suit your project requirements.

Author
This project was created by Cate Sheller on 26-October-2018.

For any questions or issues, please contact the author.
