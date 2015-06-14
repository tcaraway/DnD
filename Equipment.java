/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charactercreator;

/**
 *
 * @author thom
 */
public class Equipment {
    
    //returns gear given by backgrounds
    public static String getBackgroundGear(String bg)
    {
        if(bg.equals("Acolyte"))
            return "holy symbol, prayer book, 5 sticks of incense, vestments, set of common clothes, belt pouch (containing 15gp)";
        else if(bg.equals("Charlatan"))
            return "set of fine clothes, disguise kit, con-tools (of your choice), belt pouch (containing 15gp)";
        else if(bg.equals("Criminal"))
            return "crowbar, set of dark common clothes including a hood, belt pouch (containing 15gp)";
        else if(bg.equals("Entertainer"))
            return "Musical Instrument (of your choice), favor of an admirer, costume, belt pouch (containing 15gp)";
        else if(bg.equals("Folk Hero"))
            return "A set of artisan's tools (of your choice), shovel, iron pot, set of common clothes, belt pouch (containing 10gp)";
        else if(bg.equals("Guild Artisan"))
            return "set of artisan's tools (of your choice), letter of introduction from your guild, set of traveler's clothes, belt pouch (containing 15gp)";
        else if(bg.equals("Hermit"))
               return "scroll case with notes, winter blanket, set of common clothes, herbalism kit, 5gp";
        else if(bg.equals("Noble"))
            return "set of fine clothes, signet ring, scroll of pedigree, purse (containing 25gp)";
        else if(bg.equals("Outlander"))
            return "staff, hunting trap, trophy from hunted animal, set of traveler's clothes, belt pouch (containing 10gp)";
        else if(bg.equals("Sage"))
            return "bottle of black ink, quill, small knife, letter from dead colleague, set of common clothes, belt pouch (containing 10gp)";
        else if(bg.equals("Sailor"))
            return "Belaying pin, 50ft. of silk rope, a lucky charm, set of common clothes, belt pouch (containing 10gp)";
        else if(bg.equals("Soldier"))
            return "insignia of rank, trophy from fallen enemy, set of bone dice OR deck of cards, set of common clothes, belt pouch (containing 10gp)";
        else if(bg.equals("Urchin"))
            return "small knife, map of city you grew up in, pet mouse, token to remember your parents by, set of common clothes, bel pouch (containing 10gp)";
        else
            return "";
    }
    
    
    
    
    
    //returns gear given by different adventuring packs
    public static String getBurglarsPack()
    {
        return "backpack, 1,000 ball bearings, 10 ft. of string, a bell, 5 candles, crowbar, hammer, 10 pitons, hooded lantern, 2 flasks of oil, 5 days rations, tinderbox, waterskin, 50ft. hempen rope";
    }
    public static String getDiplomatsPack()
    {
        return "chest, 2 cases for maps/scrolls, fine clothes, bottle of ink, ink pen, lamp, 2 flasks of oil, 5 sheets of paper, vial of perfume, sealing wax, soap";
    }
    public static String getDungeoneersPack()
    {
        return "backpack, crowbar, hammer, 10 pitons, 10 torches, tinderbox, 10 days of rations, waterskin, 50 ft. hempen rope";
    }
    public static String getEntertainersPack()
    {
        return "backpack, bedroll, 2 costumes, 5 candles, 5 days of rations, waterskin, disguise kit";
    }
    public static String getExplorersPack()
    {
        return "backpack, bedroll, mess kit, tinderbox, 10 torches, 10 days of rations, waterskin, 50 ft. hempen rope";
    }
    public static String getPriestsPack()
    {
        return "backpack, blanket, 10 candles, tinderbox, alms box, 2 blocks of incense, censer, vestments, 2 days rations, waterskin";
    }
    public static String getScholarsPack()
    {
        return "backpack, book of lore, bottle of ink, ink pen, 10 sheets of parchment, little bag of sand, small knife";
    }
}
