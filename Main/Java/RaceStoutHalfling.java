package Main.Java;

import java.util.ArrayList;

public class RaceStoutHalfling implements DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Brave");
        raceFeatures.add("Lucky");
        raceFeatures.add("Halfling Nimbleness");
        raceFeatures.add("Stout Resilience");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Lightfoot Halfling";
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
		return 2;
	}

	@Override
	public int getConstitutionBonus() {
		return 1;
	}

	@Override
	public int getIntelligenceBonus() {
		return 0;
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
