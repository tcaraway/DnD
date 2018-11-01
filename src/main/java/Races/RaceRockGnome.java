package Races;

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
	public int getMaximumHPBonus() {
		return 0;
	}

	@Override
	public int getStrengthBonus() {
		return 0;
	}

	@Override
	public int getDexterityBonus() {
		return 0;
	}

	@Override
	public int getConstitutionBonus() {
		return 1;
	}

	@Override
	public int getIntelligenceBonus() {
		return 2;
	}

	@Override
	public int getWisdomBonus() {
		return 0;
	}

	@Override
	public int getCharismaBonus() {
		return 0;
	}
}
