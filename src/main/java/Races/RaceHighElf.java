package Races;

import java.util.ArrayList;

public class RaceHighElf implements DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
        raceFeatures.add("Fey Ancestry");
        raceFeatures.add("Trance");
        raceFeatures.add("Keen Senses");
        raceFeatures.add("Elf Weapon Training (prof w/ longsword,shortsword,shortbow,longbow)");
        raceFeatures.add("1 Wizard Cantrip");
        raceFeatures.add("Extra Language");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "High Elf";
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
		return 1;
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
