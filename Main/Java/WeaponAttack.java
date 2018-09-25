package Main.Java;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author thom
 * Represents the stats associated with attacking with a weapon 
 */
class WeaponAttack
{
    private final String weaponName;
    private int attackBonus;
    private final String damageType;
    private String damage;
    private final ArrayList<String> properties;
    
    
    //create WeaponAttack instance with appropriate stats
    //"mod" is either dex or str ability modifier
    //"prof" is the given proficiency bonus of the character
    public WeaponAttack(String name, int mod, int prof)
    {
        this.weaponName = name;
        properties = new ArrayList<>();

        switch (name) {
            case "Club":
                damageType = "Bludgeoning";
                damage = "1d4";
                properties.add("Light");
                break;
            case "Dagger":
                damageType = "Piercing";
                damage = "1d4";
                properties.add("Finesse");
                properties.add("Light");
                properties.add("Thrown (range 20/60)");
                break;
            case "Greatclub":
                damageType = "Bludgeoning";
                damage = "1d8";
                properties.add("Two-Handed");
                break;
            case "Handaxe":
                damageType = "Slashing";
                damage = "1d6";
                properties.add("Light");
                properties.add("Thrown (range 20/60)");
                break;
            case "Javelin":
                damageType = "Piercing";
                damage = "1d6";
                properties.add("Thrown (range 30/120)");
                break;
            case "Light Hammer":
                damageType = "Bludgeoning";
                damage = "1d4";
                properties.add("Light");
                properties.add("Thrown (range 20/60)");
                break;
            case "Mace":
                damageType = "Bludgeoning";
                damage = "1d6";
                properties.add("None");
                break;
            case "Quarterstaff":
                damageType = "Bludgeoning";
                damage = "1d6";
                properties.add("Versatile (1d8)");
                break;
            case "Sickle":
                damageType = "Slashing";
                damage = "1d4";
                properties.add("Light");
                break;
            case "Spear":
                damageType = "Piercing";
                damage = "1d6";
                properties.add("Thrown (range 20/60)");
                properties.add("Versatile (1d8)");
                break;
            case "Unarmed Strike":
                damageType = "Bludgeoning";
                damage = "1d4";
                properties.add("None");
                break;
            case "Light Crossbow":
                damageType = "Piercing";
                damage = "1d8";
                properties.add("Ammunition (range 80/320)");
                properties.add("Loading");
                properties.add("Two-Handed");
                break;
            case "Dart":
                damageType = "Piercing";
                damage = "1d4";
                properties.add("Finesse");
                properties.add("Thrown (range 20/60)");
                break;
            case "Shortbow":
                damageType = "Piercing";
                damage = "1d6";
                properties.add("Ammunition (range 80/320)");
                properties.add("Two-Handed");
                break;
            case "Sling":
                damageType = "Bludgeoning";
                damage = "1d4";
                properties.add("Ammunition (range 30/120)");
                break;
            case "Battleaxe":
                damageType = "Slashing";
                damage = "1d8";
                properties.add("Versatile (1d10)");
                break;
            case "Flail":
                damageType = "Bludgeoning";
                damage = "1d8";
                properties.add("None");
                break;
            case "Glaive":
                damageType = "Slashing";
                damage = "1d10";
                properties.add("Heavy");
                properties.add("Reach");
                properties.add("Two-Handed");
                break;
            case "Greataxe":
                damageType = "Slashing";
                damage = "1d12";
                properties.add("Heavy");
                properties.add("Two-Handed");
                break;
            case "Greatsword":
                damageType = "Slashing";
                damage = "2d6";
                properties.add("Heavy");
                properties.add("Two-Handed");
                break;
            case "Halberd":
                damageType = "Slashing";
                damage = "1d10";
                properties.add("Heavy");
                properties.add("Reach");
                properties.add("Two-Handed");
                break;
            case "Lance":
                damageType = "Piercing";
                damage = "1d12";
                properties.add("Reach");
                properties.add("Special");
                break;
            case "Longsword":
                damageType = "Slashing";
                damage = "1d8";
                properties.add("Versatile (1d10)");
                break;
            case "Maul":
                damageType = "Bludgeoning";
                damage = "2d6";
                properties.add("Heavy");
                properties.add("Two-Handed");
                break;
            case "Morningstar":
                damageType = "Piercing";
                damage = "1d8";
                properties.add("None");
                break;
            case "Pike":
                damageType = "Piercing";
                damage = "1d10";
                properties.add("Heavy");
                properties.add("Reach");
                properties.add("Two-Handed");
                break;
            case "Rapier":
                damageType = "Piercing";
                damage = "1d8";
                properties.add("Finesse");
                break;
            case "Scimitar":
                damageType = "Slashing";
                damage = "1d6";
                properties.add("Finesse");
                properties.add("Light");
                break;
            case "Shortsword":
                damageType = "Piercing";
                damage = "1d6";
                properties.add("Finesse");
                properties.add("Light");
                break;
            case "Trident":
                damageType = "Piercing";
                damage = "1d6";
                properties.add("Thrown (range 20/60)");
                properties.add("Versatile (1d8)");
                break;
            case "War Pick":
                damageType = "Piercing";
                damage = "1d8";
                properties.add("None");
                break;
            case "Warhammer":
                damageType = "Bludgeoning";
                damage = "1d8";
                properties.add("Versatile (1d10");
                break;
            case "Whip":
                damageType = "Slashing";
                damage = "1d4";
                properties.add("Finesse");
                properties.add("Reach");
                break;
            case "Blowgun":
                damageType = "Piercing";
                damage = "1";
                properties.add("Ammunition (range 25/100)");
                properties.add("Loading");
                break;
            case "Hand Crossbow":
                damageType = "Piercing";
                damage = "1d6";
                properties.add("Ammunition (range 30/120)");
                properties.add("Light");
                properties.add("Loading");
                break;
            case "Heavy Crossbow":
                damageType = "Piercing";
                damage = "1d10";
                properties.add("Ammunition (range 100/400)");
                properties.add("Heavy");
                properties.add("Loading");
                properties.add("Two-Handed");
                break;
            case "Longbow":
                damageType = "Piercing";
                damage = "1d8";
                properties.add("Ammunition (range 150/600)");
                properties.add("Heavy");
                properties.add("Two-Handed");
                break;
            default:
                damageType = "None";
                damage = "None";
                properties.add("Special");
                properties.add("Thrown (range 5/15)");
                break;
        }
        
        if(!damage.equals("None"))
            damage = damage + " + " + mod;
        attackBonus = mod + prof;
    }
    
    //add appropriate modifier with proficiency bonus to get attack bonus
    public void setAttack(int mod, int prof)
    {
        attackBonus = mod + prof;
    }
    
    //add appropriate modifier to damage
    public void setDamage(int mod)
    {
        damage = damage + mod;
    }
    
    //returns true if ranged weapon
    public static boolean isRanged(String weap)
    {
        return weap.equals("Light Crossbow") || weap.equals("Dart") || weap.equals("Shortbow") || weap.equals("Sling") || weap.equals("Blowgun") || weap.equals("Hand Crossbow") || weap.equals("Heavy Crossbow") || weap.equals("Longbow") || weap.equals("Net");
    }
    
    //returns true if finesse weapon
    public static boolean isFinesse(String weap)
    {
        return weap.equals("Unarmed Strike") || weap.equals("Whip") || weap.equals("Rapier") || weap.equals("Scimitar") || weap.equals("Shortsword") || weap.equals("Dagger");
    }
    
    //combine weapon name, damage type, and damage info into one string, for file printing uses
    public String damageString()
    {
        return weaponName + " : " + damageType + " " + damage + " dmg";
    }
    public String attackString()
    {
        return "     Attack Bonus : +" + attackBonus;
    }
    public String propertyString()
    {
        String attack = "     Properties : ";
        for(String prop : properties)
            attack = attack + prop + " ";
        return attack;
    }
    
}
