package Races;

import java.util.ArrayList;

public class RaceHuman implements DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Choose 1 Feat");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Human";
	}

	@Override
	public int getSpeed() {
		return 30;
	}

	@Override
	public String getSize() {
		return "Meduim";
	}

	@Override
	public int getMaximumHPBonus() {
		return 0;
	}

	@Override
	public int getStrengthBonus() {
		return 1;
	}

	@Override
	public int getDexterityBonus() {
		return 1;
	}

	@Override
	public int getConstitutionBonus() {
		return 1;
	}

	@Override
	public int getIntelligenceBonus() {
		return 1;
	}

	@Override
	public int getWisdomBonus() {
		return 1;
	}

	@Override
	public int getCharismaBonus() {
		return 1;
	}

}
