package Main.Java;

import java.util.ArrayList;

public class RaceLightfootHalfling implements DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Brave");
        raceFeatures.add("Lucky");
        raceFeatures.add("Halfling Nimbleness");
        raceFeatures.add("Naturally Stealthy");
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
	public int getMaximumHP() {
		return 0;
	}

}
