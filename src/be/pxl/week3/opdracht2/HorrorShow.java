package be.pxl.week3.opdracht2;

public class HorrorShow {

	public static void main(String[] args) {

		class Vampire implements Monster {
			@Override
			public void menace() {
				System.out.println("I’ll drink your blood!!");
			}
		}

		class Werewolf implements DangerousMonster {

			@Override
			public void menace() {
				System.out.println("I’ll destroy you.");
			}

			@Override
			public void destroy(Monster monster) {
				monster.menace();
				System.out.println("Big fight...");
				System.out.println(this.getClass().getName());
				System.out.println("killed one");
				System.out.println(monster.getClass().getName());
			}
		}
		Werewolf werewolf = new Werewolf();
		Vampire vampire = new Vampire();
		werewolf.destroy(vampire);
		werewolf.destroy(new Monster() {
			@Override
			public void menace() {
				System.out.println("You smell like wet dog");
			}
		});
	}
}
