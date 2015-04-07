package readinggroup.project;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static readinggroup.project.Color.Red;
import static readinggroup.project.Color.Yellow;

import org.junit.Before;
import org.junit.Test;

public class WhenCityIsCreatedItShould {

	private static final int NUMBER_OF_TILES_PER_COLOR = 20;
	private City city;

	@Before
	public void init() {
		city = new City();
	}

	@Test
	public void contains_9_building_tiles() {
		assertThat(city.tileCount(), is(equalTo(9)));
	}

	@Test
	public void contains_the_3_first_red_building_tiles() {
		assertThat(city.containsTile(1, Red), is(true));
		assertThat(city.containsTile(2, Red), is(true));
		assertThat(city.containsTile(3, Red), is(true));
	}

	@Test
	public void not_contains_the_4th_red_building_tiles() {
		assertThat(city.containsTile(4, Red), is(false));
	}

	@Test
	public void contains_the_3_first_yellow_building_tiles() {
		assertThat(city.containsTile(1, Yellow), is(true));
		assertThat(city.containsTile(2, Yellow), is(true));
		assertThat(city.containsTile(3, Yellow), is(true));
	}

	@Test
	public void not_contains_the_yellow_building_tiles_after_4() {
		for (int i = 4; i <= NUMBER_OF_TILES_PER_COLOR; i++)
			assertThat(city.containsTile(i, Yellow), is(false));
	}

	@Test
	public void not_contains_the_minus_1_red_building_tiles() {
		assertThat(city.containsTile(-1, Red), is(false));
	}
}
