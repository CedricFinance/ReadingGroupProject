package readinggroup.project;

public class City {

	public Object tileCount() {
		return 9;
	}

	public boolean containsTile(int tileNumber, Color color) {
		return tileNumber > 0 && tileNumber < 4;
	}
}
