package Main.Java;

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
	public int getMaximumHP() {
		return 0;
	}
}
