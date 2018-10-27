package Main.Java;

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
	public int getMaximumHP() {
		return 0;
	}
}
