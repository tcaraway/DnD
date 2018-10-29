package Main.Java;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author thom
 * writes a characters info onto a .txt file, which is then saved onto the desktop
 */
class CharacterWriter
{
    private PrintWriter writer;
    private final File characterFile;
    private final DnDCharacter character;
    private final String filePath;

    public CharacterWriter(DnDCharacter cha)
    {
        String path;
        JFileChooser fileSelect = new JFileChooser();
        fileSelect.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileSelect.showOpenDialog(null);
        path = (fileSelect.getSelectedFile().getAbsolutePath()+ File.separator +cha.getCharacterName()+".txt");
        this.characterFile = new File(path);
        this.character = cha;
        this.filePath = path;
        this.writer = null;
    }
    
    public void createCharacterFile()
    {
        int[] savingThrows = character.getSavingThrows();
        try{
            writer = new PrintWriter(filePath);
            writer.println("Player Name : " + this.character.getPlayerName());
            writer.println("Character Name : " + this.character.getCharacterName());
            writer.println("");
            
            writer.println("Level 1 " + this.character.getRace() + " " + this.character.getPlayerClass());
            writer.println("Background : " + this.character.getBackground());
            writer.println("Alignment  : " + this.character.getAlignment());
            writer.println("");
            
            if(this.character.getStrMod() < 0)
                writer.println("Strength     : " + this.character.getStrength() + "     " + this.character.getStrMod());
            else
                writer.println("Strength     : " + this.character.getStrength() + "    +" + this.character.getStrMod());
            if(this.character.getDexMod() < 0)
                writer.println("Dexterity    : " + this.character.getDexterity() + "     " + this.character.getDexMod());
            else
                writer.println("Dexterity    : " + this.character.getDexterity() + "    +" + this.character.getDexMod());
            if(this.character.getConMod() < 0)
                writer.println("Constitution : " + this.character.getConstitution() + "     " + this.character.getConMod());
            else
                writer.println("Constitution : " + this.character.getConstitution() + "    +" + this.character.getConMod());
            if(this.character.getIntMod() < 0)
                writer.println("Intelligence : " + this.character.getIntelligence() + "     " + this.character.getIntMod());
            else
                writer.println("Intelligence : " + this.character.getIntelligence() + "    +" + this.character.getIntMod());
            if(this.character.getWisMod() < 0)
                writer.println("Wisdom       : " + this.character.getWisdom() + "     " + this.character.getWisMod());
            else
                writer.println("Wisdom       : " + this.character.getWisdom() + "    +" + this.character.getWisMod());
            if(this.character.getChaMod() < 0)
                writer.println("Charisma     : " + this.character.getCharisma() + "     " + this.character.getChaMod());
            else
                writer.println("Charisma     : " + this.character.getCharisma() + "    +" + this.character.getChaMod());
                writer.println("");
            
            writer.println("________Saving Throws________");
            writer.println("Strength     : " + savingThrows[0]);
            writer.println("Dexterity    : " + savingThrows[1]);
            writer.println("Constitution : " + savingThrows[2]);
            writer.println("Intelligence : " + savingThrows[3]);
            writer.println("Wisdom       : " + savingThrows[4]);
            writer.println("Charisma     : " + savingThrows[5]);
            writer.println("");
            
            writer.println("Max HP : " + character.getMaxHP());
            if(character.hasShield())
            {
                writer.println("Armor Class (AC) : " + (character.getArmorClass()-2));
                writer.println("Armor Class (AC) : " + character.getArmorClass() + " (with shield equipped)");
            }
            else    
                writer.println("Armor Class (AC) : " + character.getArmorClass());
            writer.println("Initiative : " + character.getInit());
            writer.println("Speed : " + character.getSpeed());
            writer.println("Size : " + character.getSize());
            writer.println("");
            
            writer.println("Proficiency Bonus : " + character.getProfBonus());
            writer.println("");
            
            writer.println("________Skills________");
            if(character.getThisSkillProf(0) == 0)
                writer.println("Acrobatics      : " + character.getThisSkill(0));
            else
                writer.println("Acrobatics      : " + character.getThisSkill(0) + " * ");
            
            if(character.getThisSkillProf(1) == 0)
                writer.println("Animal Handling : " + character.getThisSkill(1));
            else
                writer.println("Animal Handling : " + character.getThisSkill(1) + " * ");
            
            if(character.getThisSkillProf(2) == 0)
                writer.println("Arcana          : " + character.getThisSkill(2));
            else
                writer.println("Arcana          : " + character.getThisSkill(2) + " * ");
            
            if(character.getThisSkillProf(3) == 0)
                writer.println("Athletics       : " + character.getThisSkill(3));
            else
                writer.println("Athletics       : " + character.getThisSkill(3) + " * ");
            
            if(character.getThisSkillProf(4) == 0)
                writer.println("Deception       : " + character.getThisSkill(4));
            else
                writer.println("Deception       : " + character.getThisSkill(4) + " * ");
            
            if(character.getThisSkillProf(5) == 0)
                writer.println("History         : " + character.getThisSkill(5));
            else
                writer.println("History         : " + character.getThisSkill(5) + " * ");
            
            if(character.getThisSkillProf(6) == 0)
                writer.println("Insight         : " + character.getThisSkill(6));
            else
                writer.println("Insight         : " + character.getThisSkill(6) + " * ");
            
            if(character.getThisSkillProf(7) == 0)
                writer.println("Intimidation    : " + character.getThisSkill(7));
            else
                writer.println("Intimidation    : " + character.getThisSkill(7) + " * ");
            
            if(character.getThisSkillProf(8) == 0)
                writer.println("Investigation   : " + character.getThisSkill(8));
            else
                writer.println("Investigation   : " + character.getThisSkill(8) + " * ");
            
            if(character.getThisSkillProf(9) == 0)
                writer.println("Medicine        : " + character.getThisSkill(9));
            else
                writer.println("Medicine        : " + character.getThisSkill(9) + " * ");
                
            if(character.getThisSkillProf(10) == 0)
                writer.println("Nature          : " + character.getThisSkill(10));
            else
                writer.println("Nature          : " + character.getThisSkill(10) + " * ");
            
            if(character.getThisSkillProf(11) == 0)
                writer.println("Perception      : " + character.getThisSkill(11));
            else
                writer.println("Perception      : " + character.getThisSkill(11) + " * ");
            
            if(character.getThisSkillProf(12) == 0)
                writer.println("Performance     : " + character.getThisSkill(12));
            else
                writer.println("Performance     : " + character.getThisSkill(12) + " * ");
            
            if(character.getThisSkillProf(13) == 0)
                writer.println("Persuasion      : " + character.getThisSkill(13));
            else
                writer.println("Persuasion      : " + character.getThisSkill(13) + " * ");
            
            if(character.getThisSkillProf(14) == 0)
                writer.println("Religion        : " + character.getThisSkill(14));
            else
                writer.println("Religion        : " + character.getThisSkill(14) + " * ");
            
            if(character.getThisSkillProf(15) == 0)
                writer.println("Sleight of Hand : " + character.getThisSkill(15));
            else
                writer.println("Sleight of Hand : " + character.getThisSkill(15) + " * ");
            
            if(character.getThisSkillProf(16) == 0)
                writer.println("Stealth         : " + character.getThisSkill(16));
            else
                writer.println("Stealth         : " + character.getThisSkill(16) + " * ");
            
            if(character.getThisSkillProf(17) == 0)
                writer.println("Survival        : " + character.getThisSkill(17));
            else
                writer.println("Survival        : " + character.getThisSkill(17) + " * ");
            writer.println("");
            
            writer.println("Passive Perception : " + character.getPassivePerception());
            writer.println("");
            
            writer.println("________Weapon Attacks________");
            writer.println("(Assumes proficiency with weapon)");
            writer.println("(stats shown assume used in melee if has thrown property)");
            writer.println("");
            for(WeaponAttack attack : character.getAttacks())
            {
                writer.println(attack.damageString());
                writer.println(attack.attackString());
                writer.println(attack.propertyString());
            }
            writer.println("");
            writer.println("");
            if(character.getPlayerClass().equals("Bard"))
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("1st Level Spells:");
                for(String spell : character.getSpells())
                    writer.println("     " + spell);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass().equals("Cleric"))
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass().equals("Druid"))
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass().equals("Sorcerer"))
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("1st Level Spells:");
                for(String spell : character.getSpells())
                    writer.println("     " + spell);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass().equals("Wizard"))
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("");
                writer.println("");
            }
            if(character.getPlayerClass().equals("Warlock"))
            {
                writer.println("________Spellcasting________");
                writer.println("Spell Save DC      : " + character.getSpellSave());
                writer.println("Spell Attack Bonus : " + character.getSpellAttack());
                writer.println("1st Level Spell Slots : " + character.getFirstSlots());
                writer.println("Cantrips:");
                for(String cant : character.getCantrips())
                    writer.println("     " + cant);
                writer.println("1st Level Spells:");
                for(String spell : character.getSpells())
                    writer.println("     " + spell);
                writer.println("");
                writer.println("");
            }
            
            writer.println("________Class Features________");
            if(character.getPlayerClass().equals("Cleric"))
                writer.println("Cleric Domain : " + character.getClericDomain());
            if(character.getPlayerClass().equals("Fighter"))
                writer.println("Fighting Style : " + character.getFightingStyle());
            if(character.getPlayerClass().equals("Warlock"))
                writer.println("Otherworldly Patron : " + character.getOtherworldlyPatron());
            if(character.getPlayerClass().equals("Ranger"))
                writer.println("Favored Enemy : " + character.getFavoredEnemy());
            
            for(String feature : character.getClassFeatures())
                writer.println(feature);
            writer.println("");
            
            writer.println("________Racial Features________");
            for(String feature : character.getRaceFeatures())
                writer.println(feature);
            writer.println("");
            
            writer.println("________Proficiencies________");
            for(String prof : character.getProficiencies())
                writer.println(prof);
            writer.println("");
            
            writer.println("________Languages Known________");
            for(String lang : character.getLanguages())
                writer.println(lang);
            writer.println("");
            
            writer.println("________Inventory________");
            for(String item : character.getInventory())
                writer.println(item);
            JOptionPane.showMessageDialog(null, "File has been saved to " + filePath);
        } catch(Exception ignored){}
        writer.close();
    }
}
