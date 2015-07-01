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
 * Represents the stats associated with attacking with a weapon 
 */
public class WeaponAttack 
{
    private String weaponName;
    private int attackBonus;
    private String damageType;
    private String damage;
    private ArrayList<String> properties;
    
    
    //create WeaponAttack instance with appropriate stats
    //"mod" is either dex or str ability modifier
    //"prof" is the given proficiency bonus of the character
    public WeaponAttack(String name, int mod, int prof)
    {
        this.weaponName = name;
        properties = new ArrayList<String>();
        
        if(name.equals("Club"))
        {
            damageType = "Bludgeoning";
            damage = "1d4";
            properties.add("Light");
        }
        else if(name.equals("Dagger"))
        {
            damageType = "Piercing";
            damage = "1d4";
            properties.add("Finesse");
            properties.add("Light");
            properties.add("Thrown (range 20/60)");
        }
        else if(name.equals("Greatclub"))
        {
            damageType = "Bludgeoning";
            damage = "1d8";
            properties.add("Two-Handed");
        }
        else if(name.equals("Handaxe"))
        {
            damageType = "Slashing";
            damage = "1d6";
            properties.add("Light");
            properties.add("Thrown (range 20/60)");
        }
        else if(name.equals("Javelin"))
        {
            damageType = "Piercing";
            damage = "1d6";
            properties.add("Thrown (range 30/120)");
        }
        else if(name.equals("Light Hammer"))
        {
            damageType = "Bludgeoning";
            damage = "1d4";
            properties.add("Light");
            properties.add("Thrown (range 20/60)");
        }
        else if(name.equals("Mace"))
        {
            damageType = "Bludgeoning";
            damage = "1d6";
            properties.add("None");
        }
        else if(name.equals("Quarterstaff"))
        {
            damageType = "Bludgeoning";
            damage = "1d6";
            properties.add("Versatile (1d8)");
        }
        else if(name.equals("Sickle"))
        {
            damageType = "Slashing";
            damage = "1d4";
            properties.add("Light");
        }
        else if(name.equals("Spear"))
        {
            damageType = "Piercing";
            damage = "1d6";
            properties.add("Thrown (range 20/60)");
            properties.add("Versatile (1d8)");
        }
        else if(name.equals("Unarmed Strike"))
        {
            damageType = "Bludgeoning";
            damage = "1d4";
            properties.add("None");
        }
        else if(name.equals("Light Crossbow"))
        {
            damageType = "Piercing";
            damage = "1d8";
            properties.add("Ammunition (range 80/320)");
            properties.add("Loading");
            properties.add("Two-Handed");
        }
        else if(name.equals("Dart"))
        {
            damageType = "Piercing";
            damage = "1d4";
            properties.add("Finesse");
            properties.add("Thrown (range 20/60)");
        }
        else if(name.equals("Shortbow"))
        {
            damageType = "Piercing";
            damage = "1d6";
            properties.add("Ammunition (range 80/320)");
            properties.add("Two-Handed");
        }
        else if(name.equals("Sling"))
        {
            damageType = "Bludgeoning";
            damage = "1d4";
            properties.add("Ammunition (range 30/120)");
        }
        else if(name.equals("Battleaxe"))
        {
            damageType = "Slashing";
            damage = "1d8";
            properties.add("Versatile (1d10)");
        }
        else if(name.equals("Flail"))
        {
            damageType = "Bludgeoning";
            damage = "1d8";
            properties.add("None");
        }
        else if(name.equals("Glaive"))
        {
            damageType = "Slashing";
            damage = "1d10";
            properties.add("Heavy");
            properties.add("Reach");
            properties.add("Two-Handed");
        }
        else if(name.equals("Greataxe"))
        {
            damageType = "Slashing";
            damage = "1d12";
            properties.add("Heavy");
            properties.add("Two-Handed");
        }
        else if(name.equals("Greatsword"))
        {
            damageType = "Slashing";
            damage = "2d6";
            properties.add("Heavy");
            properties.add("Two-Handed");
        }
        else if(name.equals("Halberd"))
        {
            damageType = "Slashing";
            damage = "1d10";
            properties.add("Heavy");
            properties.add("Reach");
            properties.add("Two-Handed");
        }
        else if(name.equals("Lance"))
        {
            damageType = "Piercing";
            damage = "1d12";
            properties.add("Reach");
            properties.add("Special");
        }
        else if(name.equals("Longsword"))
        {
            damageType = "Slashing";
            damage = "1d8";
            properties.add("Versatile (1d10)");
        }
        else if(name.equals("Maul"))
        {
            damageType = "Bludgeoning";
            damage = "2d6";
            properties.add("Heavy");
            properties.add("Two-Handed");
        }
        else if(name.equals("Morningstar"))
        {
            damageType = "Piercing";
            damage = "1d8";
            properties.add("None");
        }
        else if(name.equals("Pike"))
        {
            damageType = "Piercing";
            damage = "1d10";
            properties.add("Heavy");
            properties.add("Reach");
            properties.add("Two-Handed");
        }
        else if(name.equals("Rapier"))
        {
            damageType = "Piercing";
            damage = "1d8";
            properties.add("Finesse");
        }
        else if(name.equals("Scimitar"))
        {
            damageType = "Slashing";
            damage = "1d6";
            properties.add("Finesse");
            properties.add("Light");
        }
        else if(name.equals("Shortsword"))
        {
            damageType = "Piercing";
            damage = "1d6";
            properties.add("Finesse");
            properties.add("Light");
        }
        else if(name.equals("Trident"))
        {
            damageType = "Piercing";
            damage  = "1d6";
            properties.add("Thrown (range 20/60)");
            properties.add("Versatile (1d8)");
        }
        else if(name.equals("War Pick"))
        {
            damageType = "Piercing";
            damage = "1d8";
            properties.add("None");
        }
        else if(name.equals("Warhammer"))
        {
            damageType = "Bludgeoning";
            damage = "1d8";
            properties.add("Versatile (1d10");
        }
        else if(name.equals("Whip"))
        {
            damageType = "Slashing";
            damage = "1d4";
            properties.add("Finesse");
            properties.add("Reach");
        }
        else if(name.equals("Blowgun"))
        {
            damageType = "Piercing";
            damage = "1";
            properties.add("Ammunition (range 25/100)");
            properties.add("Loading");
        }
        else if(name.equals("Hand Crossbow"))
        {
            damageType = "Piercing";
            damage = "1d6";
            properties.add("Ammunition (range 30/120)");
            properties.add("Light");
            properties.add("Loading");
        }
        else if(name.equals("Heavy Crossbow"))
        {
            damageType = "Piercing";
            damage = "1d10";
            properties.add("Ammunition (range 100/400)");
            properties.add("Heavy");
            properties.add("Loading");
            properties.add("Two-Handed");
        }
        else if(name.equals("Longbow"))
        {
            damageType = "Piercing";
            damage = "1d8";
            properties.add("Ammunition (range 150/600)");
            properties.add("Heavy");
            properties.add("Two-Handed");
        }
        else
        {
            damageType = "None";
            damage = "None";
            properties.add("Special");
            properties.add("Thrown (range 5/15)");
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
        if(weap.equals("Light Crossbow") || weap.equals("Dart") || weap.equals("Shortbow") || weap.equals("Sling") || weap.equals("Blowgun") || weap.equals("Hand Crossbow") || weap.equals("Heavy Crossbow") || weap.equals("Longbow") || weap.equals("Net"))
            return true;
        else
            return false;
    }
    
    //returns true if finesse weapon
    public static boolean isFinesse(String weap)
    {
        if(weap.equals("Unarmed Strike") || weap.equals("Whip") || weap.equals("Rapier") || weap.equals("Scimitar") || weap.equals("Shortsword") || weap.equals("Dagger"))
            return true;
        else
            return false;
    }
    
    //combine weapon name, damage type, and damage info into one string, for file printing uses
    public String damageString()
    {
        String attack = weaponName + " : " + damageType + " " + damage + " dmg";
        return attack;
    }
    public String attackString()
    {
        String attack = "     Attack Bonus : +" + attackBonus;
        return attack;
    }
    public String propertyString()
    {
        String attack = "     Properties : ";
        for(String prop : properties)
            attack = attack + prop + " ";
        return attack;
    }
    
}
