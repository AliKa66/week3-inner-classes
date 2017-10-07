package be.pxl.week3.opdracht3.innerClass;

public class MusicianApp {

	public static void main(String[] args) {
		Musician musician = new Musician();
		// musician.play();
		Musician.Instrument instrument = musician.new Instrument();
		instrument.makeNoise();
	}

}
