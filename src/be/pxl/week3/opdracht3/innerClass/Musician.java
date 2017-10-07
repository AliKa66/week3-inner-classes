package be.pxl.week3.opdracht3.innerClass;

public class Musician {

	public void play() {
		Instrument i = new Instrument();
		i.makeNoise();
	}

	public class Instrument {

		public void makeNoise() {
			System.out.println("--__--_/---___/-_--");
		}
	}
}
