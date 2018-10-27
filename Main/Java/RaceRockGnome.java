package Main.Java;

import java.util.ArrayList;

public class RaceRockGnome implements DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
	    raceFeatures.add("Gnome Cunning");
	    raceFeatures.add("Artificer's Lore");
        raceFeatures.add("Tinker");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Rock Gnome";
	}

	@Override
	public int getSpeed() {
		return 25;
	}

	@Override
	public String getSize() {
		return "Small";
	}

	@Override
	public int getMaximumHP() {
		return 0;
	}
}
