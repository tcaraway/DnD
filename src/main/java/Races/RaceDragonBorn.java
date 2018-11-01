package Races;

import java.util.ArrayList;

public class RaceDragonBorn implements DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Draconic Ancestry");
        raceFeatures.add("Breath Weapon");
        raceFeatures.add("Damage Resistance");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Dragon Born";
	}

	@Override
	public int getSpeed() {
		return 30;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Medium";
	}

	@Override
	public int getMaximumHPBonus() {
		return 0;
	}

	@Override
	public int getStrengthBonus() {
		return 2;
	}

	@Override
	public int getDexterityBonus() {
		return 0;
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
