package Tests.Java;

import Main.Java.DnDCharacter;
import Main.Java.StatRoller;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DnDCharacterTest {

    @Test
    void givenDnDCharacter_whenValidAbilityScores_thenAbilityScoresSet(){
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
    void givenDnDCharacter_whenClassBard_thenClass() {
		DnDCharacter sut = new DnDCharacter();
		sut.setClass("Bard");
		assertTrue(sut.getPlayerClass().equals("Bard"));
	}
	
	@Test
    void givenDnDCharacter_whenDexMod3_thenAC() {
		DnDCharacter sut = new DnDCharacter();
		sut.setDexterity(16);
		sut.computeRest();
		assertTrue(sut.getArmorClass() == 13);
	}

	@Test
    void givenMonk_whenCon16_thenMaxHP() {
		DnDCharacter sut = new DnDCharacter();
		sut.setConstitution(16);
		sut.setClass("Monk");
		sut.computeRest();
		assertTrue(sut.getMaxHP() == 11);
	}

	@Test
    void givenStatRoller_whenRollStat_CalculateCorrectStat(){
        StatRoller sut = new StatRoller();
        ArrayList<Integer> rolls =  new ArrayList<>(sut.rollStat());
        for (int i = 0; i < 3; i++){
            assertTrue(rolls.get(3) <= rolls.get(i)); //check if the second to last number is the lowest roll
        }
        assertTrue(rolls.get(4) == (rolls.get(0)+rolls.get(1)+rolls.get(2))); //check if the last number is the total stat roll (4d6-lowest)
    }
}
