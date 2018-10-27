package Main.Java;

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
	public int getMaximumHP() {
		return 0;
	}

}
