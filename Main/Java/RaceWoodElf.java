package Main.Java;

import java.util.ArrayList;

public class RaceWoodElf implements DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
        raceFeatures.add("Fey Ancestry");
        raceFeatures.add("Trance");
        raceFeatures.add("Keen Senses");
        raceFeatures.add("Elf Weapon Training (prof w/ longsword,shortsword,shortbow,longbow)");
        raceFeatures.add("Fleet of Foot");
        raceFeatures.add("Mask of the Wild");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Wood Elf";
	}

	@Override
	public int getSpeed() {
		return 35;
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
