package com.ochavoya.midi.guitar;

import com.ochavoya.midi.musictheory.MidiNote;


public class Bass extends Guitar{
	
	private static final int FRETS = 19;
	
	/*
	 * The bass is supposed to have four strings. It starts with MidiNote(0,28) [E A D F]
	 */

	public Bass(){
		super(new MidiNote[]{new MidiNote(0,28),new MidiNote(0,33), new MidiNote(0,38),new MidiNote(0,43)}, FRETS);
		name="Bass";
	}

	public static void main(String[] args){
		new Bass();
	}
}
