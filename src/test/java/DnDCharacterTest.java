import Races.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class DnDCharacterTest {

    @Test
	public void givenDnDCharacter_whenValidAbilityScores_thenAbilityScoresSet(){
        DnDCharacter sut = new DnDCharacter();
        sut.setStrength(3);
        sut.setDexterity(5);   //valid range is 3-30
        sut.setConstitution(10);
        sut.setIntelligence(20);
        sut.setWisdom(25);
        sut.setCharisma(30);

        assertEquals(-3, sut.getStrMod());
        assertEquals(-2, sut.getDexMod());
        assertEquals(0, sut.getConMod());
        assertEquals(5, sut.getIntMod());
        assertEquals(7, sut.getWisMod());
        assertEquals(10, sut.getChaMod());
    }
    
	@Test
	public void givenDnDCharacter_whenClassBard_thenClass() {
		DnDCharacter sut = new DnDCharacter();
		sut.setClass("Bard");
		assertTrue(sut.getPlayerClass().equals("Bard"));
	}
	
	@Test
	public void givenDnDCharacter_whenDexMod3_thenAC() {
		DnDCharacter sut = new DnDCharacter();
		sut.setDexterity(16);
		sut.computeRest();
		assertTrue(sut.getArmorClass() == 13);
	}

	@Test
	public void givenMonk_whenCon16_thenMaxHP() {
		DnDCharacter sut = new DnDCharacter();
		sut.setConstitution(16);
		sut.setClass("Monk");
		sut.computeRest();
		assertTrue(sut.getMaxHP() == 11);
	}

	@Test
	public void givenStatRoller_whenRollStat_CalculateCorrectStat(){
        StatRoller sut = new StatRoller();
        ArrayList<Integer> rolls =  new ArrayList<>(sut.rollStat());
        for (int i = 0; i < 3; i++){
            assertTrue(rolls.get(3) <= rolls.get(i)); //check if the second to last number is the lowest roll
        }
        assertTrue(rolls.get(4) == (rolls.get(0)+rolls.get(1)+rolls.get(2))); //check if the last number is the total stat roll (4d6-lowest)
    }
	
	@Test
	public void givenDnDCharacter_whenDruid_thenProficiencies() {
		DnDCharacter sut = new DnDCharacter();
		sut.setClass("Druid");
		sut.computeRest();
		
		assert(sut.getOtherProficiencies().size() == 16);
	}
	
	@Test
	public void givenCleric_whenAttributes_thenSpellDC() {
		DnDCharacter sut = new DnDCharacter();
		sut.setClass("Cleric");
		sut.setWisdom(14);
		sut.computeRest();
		
		assert(sut.getSpellSave() == 12);
	}
	
	@Test
	public void givenBard_whenAttributes_thenCharST() {
		DnDCharacter sut = new DnDCharacter();
		
		sut.setClass("Bard");
		sut.setCharisma(16);
		sut.computeRest();
		
		assert(sut.getSavingThrows()[5] == 5);
	}
	
	@Test
	public void givenWizard_whenAttributes_thenSpellAttackBonus() {
		DnDCharacter sut = new DnDCharacter();
		
		sut.setClass("Wizard");
		sut.setIntelligence(16);
		sut.computeRest();
		
		assert(sut.getSpellAttack() == 5);
	}
	
	@Test
	public void givenDnDCharacter_whenHalfling_thenSize() {
		DnDCharacter sut = new DnDCharacter();

		sut.setRace("Lightfoot Halfling");
		sut.computeRest();
		
		assert(sut.getSize().equals("Small"));
	}
	
	@Test
	public void givenForestGnome_whenIntelligence14_thenInt() {
		DnDCharacter sut = new DnDCharacter();
		
		sut.setRace("Forest Gnome");
		sut.setIntelligence(14);
		sut.computeRest();
		
		assert(sut.getIntelligence() == 16);
	}
	
	@Test
	public void givenRace2_whenRace2Changes_thenRaceFeatures() {
		DnDCharacter sut = new DnDCharacter();
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Darkvision");
		expected.add("Dwarven Resilience");
		expected.add("Dwarven Combat Training (prof w/ battleaxe,handaxe,throwing hammer,warhammer)");
		expected.add("Stonecutting");
		expected.add("Dwarven Armor Training (prof w/ light and medium armor)");
		
		sut.setRace2(new RaceMountainDwarf());
		sut.race2Changes();
		
		assert(sut.getRaceFeatures().equals(expected));
	}
}
