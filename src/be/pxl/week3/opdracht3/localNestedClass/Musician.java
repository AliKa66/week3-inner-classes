package be.pxl.week3.opdracht3.localNestedClass;

public class Musician {

	public void play() {

		class Instrument {

			public void makeNoise() {
				System.out.println("--__--_/---___/-_--");
			}
		}
		Instrument i = new Instrument();
		i.makeNoise();
	}
}
