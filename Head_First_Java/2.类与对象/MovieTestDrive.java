package Chapter2;

public class MovieTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
	}
}
