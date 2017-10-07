package be.pxl.week3.opdracht3.anonymousInnerClass;

public class Musician {

	public void play() {
		Instrument instrument = new Instrument() {

			@Override
			public void makeNoise() {
				System.out.println("-__--_/-_-_---_/--");
			}
		};
	}
}
