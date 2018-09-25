package Tests.Java;

import Main.Java.DnDCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals(3, sut.getStrength());
        assertEquals(5, sut.getDexterity());
        assertEquals(10, sut.getConstitution());
        assertEquals(20, sut.getIntelligence());
        assertEquals(25, sut.getWisdom());
        assertEquals(30, sut.getCharisma());
    }
    
	@Test
    void givenDnDCharacter_whenClassBard_thenClass() {
		DnDCharacter sut = new DnDCharacter();
		sut.setClass("Bard");
		assert(sut.getPlayerClass().equals("Bard"));
	}
	
	@Test
    void givenDnDCharacter_whenDexMod3_thenkAC() {
		DnDCharacter sut = new DnDCharacter();
		sut.setDexterity(16);
		sut.computeRest();
		assert(sut.getArmorClass() == 13);
	}

}
