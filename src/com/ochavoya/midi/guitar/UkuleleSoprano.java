package com.ochavoya.midi.guitar;

import com.ochavoya.midi.musictheory.MidiNote;


public class UkuleleSoprano extends Guitar{

    // Ukulele Soprano tunning: g'c'e'a' 

	public UkuleleSoprano(){
		super(new MidiNote[]{new MidiNote(0,79),new MidiNote(0,72),
			new MidiNote(0,76),new MidiNote(0,81)},18);
			name="Ukulele Soprano";
	}

	public static void main(String[] args){
        new UkuleleSoprano();
	}
}
