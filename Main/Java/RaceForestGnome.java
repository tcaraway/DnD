package Main.Java;

import java.util.ArrayList;

public class RaceForestGnome implements DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
	    raceFeatures.add("Gnome Cunning");
	    raceFeatures.add("Natural Illusionist");
        raceFeatures.add("Speak with Small Beasts");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Forest Gnome";
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
