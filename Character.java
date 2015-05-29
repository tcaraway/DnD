/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charactercreator;

import java.util.ArrayList;

/**
 *
 * @author thom
 */
public class Character {
    
    private String race;
    private String playerClass;
    private String characterName;
    private String playerName;
    private String background;
    private String alignment;
    
    //proficiency bonus
    private int profBonus;
    
    //amount of skill proficiences
    private int profAmount;
    
    //inspiration points
    private int inspiration;
    
    //primary stats
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    
    //primary stat ability mods
    private int strMod;
    private int dexMod;
    private int conMod;
    private int intMod;
    private int wisMod;
    private int chaMod;
    
    //arraylist of stat rolls (before choosing stat assignment)
    private int[] statRolls;
    
    //saving throws
    private int strengthST;
    private int dexterityST;
    private int constitutionST;
    private int intelligenceST;
    private int wisdomST;
    private int charismaST;
    
    //skills
    private int[] skills;
    
    //skill proficiencies (1 if prof., 0 if not)
    private int[] skillProfs;
    
    //passive wisdom (perception)
    private int passiveWis;
    
    //armor class
    private int armorClass;
    
    //initiative
    private int initiative;
    
    //speed (in feet per turn)
    private int speed;
    
    //HP
    private int maximumHP;
    private int currentHP;
    
    //weapon attacks
    private ArrayList<WeaponAttack> weaponAttacks;
    
    //other proficiencies and languages
    private ArrayList<String> proficiencies;
    
    //currency ([1] = copper, [2] = silver, etc.)
    private int[] currency;
    
    //features and traits
    private ArrayList<String> features;
    
    //inventory
    private ArrayList<String> inventory;
    
    //spell attacks
    private int spellSaveDC;
    private int spellAttackBonus;
    
    //cantrips
    private ArrayList<String> cantrips;
    
    //1st level spells
    private ArrayList<String> firstLevelSpells;
    
    //2nd level spells
    private ArrayList<String> secondLevelSpells;
    
    //3rd level spells
    private ArrayList<String> thirdLevelSpells;
    
    //4th level spells
    private ArrayList<String> fourthLevelSpells;
    
    //5th level spells
    private ArrayList<String> fifthLevelSpells;
    
    //6th level spells
    private ArrayList<String> sixthLevelSpells;
    
    //7th level spells
    private ArrayList seventhLevelSpells;
    
    //8th level spells
    private ArrayList<String> eigthLevelSpells;
    
    //9th level spells
    private ArrayList<String> ninthLevelSpells;
    
    
    public Character(){
        this.race = "";
        this.playerClass = "";
        this.characterName = "";
        this.playerName = "";
        this.background = "";
        this.alignment = "";
    
        //proficiency bonus
        this.profBonus = 0;
    
        this.profAmount = 0;
        
        //inspiration points
        this.inspiration = 0;
    
        //primary stats
        this.strength = 0;
        this.dexterity = 0;
        this.intelligence = 0;
        this.constitution = 0;
        this.wisdom = 0;
        this.charisma = 0;
    
        //stat rolls
        this.statRolls = new int[6];
                
        //saving throws
        this.strengthST = 0;
        this.dexterityST = 0;
        this.intelligenceST = 0;
        this.constitutionST = 0;
        this.wisdomST = 0;
        this.charismaST = 0;
    
        //skills
        this.skills = new int[18];
        
        //keeps track of proficiencies (1 for proficient, 0 if not)
        this.skillProfs = new int[18];
        for(int i=0;i<18;i++)
            this.skillProfs[i] = 0;
    
        //passive wisdom (perception)
        this.passiveWis = 0;
    
        //armor class
        this.armorClass = 0;
    
        //initiative
        this.initiative = 0;
    
        //speed (in feet per turn)
        this.speed = 0;
    
        //HP
        this.maximumHP = 0;
        this.currentHP = 0;
    
        //weapon attacks
        this.weaponAttacks = new ArrayList<WeaponAttack>();
    
        //other proficiencies and languages
        this.proficiencies = new ArrayList<String>();
    
        //currency ([1] = copper, [2] = silver, etc.)
        this.currency = new int[5];
    
        //features and traits
        this.features = new ArrayList<String>();
    
        //inventory
        this.inventory = new ArrayList<String>();
    
        //spell attacks
        this.spellSaveDC = 0;
        this.spellAttackBonus = 0;
    
        //cantrips
        this.cantrips = new ArrayList<String>();
    
        //1st level spells
        this.firstLevelSpells = new ArrayList<String>();
    
        //2nd level spells
        this.secondLevelSpells = new ArrayList<String>();
    
        //3rd level spells
        this.thirdLevelSpells = new ArrayList<String>();
    
        //4th level spells
        this.fourthLevelSpells = new ArrayList<String>();
    
        //5th level spells
        this.fifthLevelSpells = new ArrayList<String>();
    
        //6th level spells
        this.sixthLevelSpells = new ArrayList<String>();
    
        //7th level spells
        this.seventhLevelSpells = new ArrayList<String>();
    
        //8th level spells
        this.eigthLevelSpells = new ArrayList<String>();
    
        //9th level spells
        this.ninthLevelSpells = new ArrayList<String>();
    }
    
    //GETTERS AND SETTERS
    public void setClass(String pClass)
    {
        this.playerClass = pClass;
    }
    public String getPlayerClass()
    {
        return this.playerClass;
    }
    
    public void setRace(String pRace)
    {
        this.race = pRace;
    }
    public String getRace()
    {
        return this.race;
    }
    
    public void setStatRolls(int index, int value)
    {
        this.statRolls[index] = value;
    }
    public int[] getStatRolls()
    {
        return this.statRolls;
    }
    public int getThisStatRoll(int index)
    {
        return this.statRolls[index];
    }
    
    public void setStrength(int value)
    {
        this.strength = value;
    }
    public void setDexterity(int value)
    {
        this.dexterity = value;
    }
    public void setConstitution(int value)
    {
        this.constitution = value;
    }
    public void setIntelligence(int value)
    {
        this.intelligence = value;
    }
    public void setWisdom(int value)
    {
        this.wisdom = value;
    }
    public void setCharisma(int value)
    {
        this.charisma = value;
    }
    
    public int getStrength()
    {
        return this.strength;
    }
    public int getDexterity()
    {
        return this.dexterity;
    }
    public int getConstitution()
    {
        return this.constitution;
    }
    public int getIntelligence()
    {
        return this.intelligence;
    }
    public int getWisdom()
    {
        return this.wisdom;
    }
    public int getCharisma()
    {
        return this.charisma;
    }
    
    public void setBackground(String bg)
    {
        this.background = bg;
    }
    public String getBackground()
    {
        return this.background;
    }
    
    public void setAlignment(String align)
    {
        this.alignment = align;
    }
    public String getAlignment()
    {
        return this.alignment;
    }
    
    public int getProfAmount()
    {
        return this.profAmount;
    }
    public void setProfAmount(int amount)
    {
        this.profAmount = amount;
    }
    
    public int[] getSkillProfs()
    {
        return this.skillProfs;
    }
    public void setThisSkillProf(int index, int amount)
    {
        this.skillProfs[index] = amount;
    }
    
    public void setStrMod(int value)
    {
        this.strMod = value;
    }
    public void setDexMod(int value)
    {
        this.dexMod = value;
    }
    public void setConMod(int value)
    {
        this.conMod = value;
    }
    public void setIntMod(int value)
    {
        this.intMod = value;
    }
    public void setWisMod(int value)
    {
        this.wisMod = value;
    }
    public void setChaMod(int value)
    {
        this.chaMod = value;
    }
    
    public int getStrMod()
    {
        return this.strMod;
    }
    public int getDexMod()
    {
        return this.dexMod;
    }
    public int getConMod()
    {
        return this.conMod;
    }
    public int getIntMod()
    {
        return this.intMod;
    }
    public int getWisMod()
    {
        return this.wisMod;
    }
    public int getChaMod()
    {
        return this.chaMod;
    }
}
     


