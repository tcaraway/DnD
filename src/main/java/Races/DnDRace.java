package Races;

import java.util.ArrayList;

public interface DnDRace {
	ArrayList<String> raceFeatures();
	
	String getRace();
	
	int getSpeed();
	
	String getSize();

	int getMaximumHPBonus();
	
	int getStrengthBonus();
	int getDexterityBonus();
	int getConstitutionBonus();
	int getIntelligenceBonus();
	int getWisdomBonus();
	int getCharismaBonus();
}
