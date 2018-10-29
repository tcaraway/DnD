package Main.Java.Races;

import java.util.ArrayList;

public interface DnDRace {
	public ArrayList<String> RaceFeatures();
	
	public String getRace();
	
	public int getSpeed();
	
	public String getSize();

	public int getMaximumHPBonus();
	
	public int getStrengthBonus();
	public int getDexterityBonus();
	public int getConstitutionBonus();
	public int getIntelligenceBonus();
	public int getWisdomBonus();
	public int getCharismaBonus();
}
