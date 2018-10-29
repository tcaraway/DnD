package Main.Java.Races;

import java.util.ArrayList;

public class RaceDarkElf implements DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
        raceFeatures.add("Fey Ancestry");
        raceFeatures.add("Trance");
        raceFeatures.add("Keen Senses");
        raceFeatures.add("Superior Darkvision");
        raceFeatures.add("Sunlight Sensitivity");
        raceFeatures.add("Drow Magic");
        raceFeatures.add("Drow Weapon Training (prof w/ rapiers,shortswords,hand crossbows)");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Elf";
	}

	@Override
	public int getSpeed() {
		return 30;
	}

	@Override
	public String getSize() {
		return "Medium";
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
		return 0;
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
		return 1;
	}
}
