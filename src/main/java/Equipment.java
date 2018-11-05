package src.main.java;

/**
 *
 * @author thom
 */
class Equipment {
    
    //returns gear given by backgrounds
    public static String[] getBackgroundGear(String bg)
    {
        String[] items = null;
        switch (bg) {
            case "Acolyte":
                items = new String[6];
                items[0] = "holy symbol";
                items[1] = "prayer book";
                items[2] = "5 sticks of incense";
                items[3] = "vestments";
                items[4] = "common clothes";
                items[5] = "belt pouch (containing 15gp)";
                break;
            case "Charlatan":
                items = new String[4];
                items[0] = "fine clothes";
                items[1] = "disguise kit";
                items[2] = "tools for con of choice";
                items[3] = "belt pouch (containing 15gp)";
                break;
            case "Criminal":
                items = new String[3];
                items[0] = "crowbar";
                items[1] = "dark common clothes with hood";
                items[2] = "belt pouch (containing 15gp)";
                break;
            case "Entertainer":
                items = new String[4];
                items[0] = "Musical Instruments (of your choice)";
                items[1] = "favor of an admirer";
                items[2] = "costume";
                items[3] = "belt pouch (containing 15gp)";
                break;
            case "Folk Hero":
                items = new String[5];
                items[0] = "set of artisan's tools (of your choice)";
                items[1] = "shovel";
                items[2] = "iron pot";
                items[3] = "common clothes";
                items[4] = "belt pouch (containing 10gp)";
                break;
            case "Guild Artisan":
                items = new String[4];
                items[0] = "set of artisan's tools (of your choice)";
                items[1] = "letter of introduction from guild";
                items[2] = "traveler's clothes";
                items[3] = "belt pouch (containing 15gp)";
                break;
            case "Hermit":
                items = new String[5];
                items[0] = "scroll case with notes";
                items[1] = "winter blanket";
                items[2] = "common clothes";
                items[3] = "herbalism kit";
                items[4] = "belt pouch (containing 5gp)";
                break;
            case "Noble":
                items = new String[4];
                items[0] = "fine clothes";
                items[1] = "signet ring";
                items[2] = "scroll of pedigree";
                items[3] = "purse (containing 25gp)";
                break;
            case "Outlander":
                items = new String[5];
                items[0] = "staff";
                items[1] = "hunting trap";
                items[2] = "trophy from hunted animal";
                items[3] = "traveler's clothes";
                items[4] = "belt pouch (containing 10gp)";
                break;
            case "Sage":
                items = new String[6];
                items[0] = "bottle of black ink";
                items[1] = "quill";
                items[2] = "small knife";
                items[3] = "letter from dead colleague";
                items[4] = "common clothes";
                items[5] = "belt pouch (containing 10gp";
                break;
            case "Sailor":
                items = new String[5];
                items[0] = "Belaying pin";
                items[1] = "50 ft. silk rope";
                items[2] = "lucky charm";
                items[3] = "common clothes";
                items[4] = "belt pouch (containing 10gp)";
                break;
            case "Soldier":
                items = new String[5];
                items[0] = "insignia of rank";
                items[1] = "trophy from fallen enemy";
                items[2] = "set of bone dice";
                items[3] = "common clothes";
                items[4] = "belt pouch (containing 10gp)";
                break;
            case "Urchin":
                items = new String[5];
                items[0] = "small knife";
                items[1] = "map of hometown";
                items[2] = "pet mouse";
                items[3] = "token to remember your parents by";
                items[4] = "common clothes";
                break;
        }
        return items;
    }
    
    
    
    
    
    //returns gear given by different adventuring packs
    public static String[] getBurglarsPack()
    {
        String[] items = new String[14];
        items[0] = "backpack";
        items[1] = "1,000 ball bearings";
        items[2] = "10ft of string";
        items[3] = "a bell";
        items[4] = "5 candles";
        items[5] = "crowbar";
        items[6] = "hammer";
        items[7] = "10 pitons";
        items[8] = "hooded lantern";
        items[9] = "2 flasks of oil";
        items[10] = "5 days of rations";
        items[11] = "tinderbox";
        items[12] = "waterskin";
        items[13] = "50 ft. hempen rope";
        return items;
    }
    public static String[] getDiplomatsPack()
    {
        String[] items = new String[11];
        items[0] = "chest";
        items[1] = "2 scroll cases";
        items[2] = "fine clothes";
        items[3] = "bottle of ink";
        items[4] = "ink pen";
        items[5] = "lamp";
        items[6] = "2 flasks of oil";
        items[7] = "5 sheets of paper";
        items[8] = "vial of perfume";
        items[9] = "sealing wax";
        items[10] = "soap";
        return items;
    }
    public static String[] getDungeoneersPack()
    {
        String[] items = new String[9];
        items[0] = "backpack";
        items[1] = "crowbar";
        items[2] = "hammer";
        items[3] = "10 pitons";
        items[4] = "10 torches";
        items[5] = "tinderbox";
        items[6] = "10 days of rations";
        items[7] = "waterskin";
        items[8] = "50 ft. hempen rope";
        return items;
    }
    public static String[] getEntertainersPack()
    {
        String[] items = new String[7];
        items[0] = "backpack";
        items[1] = "bedroll";
        items[2] = "2 costumes";
        items[3] = "5 candles";
        items[4] = "5 days of rations";
        items[5] = "waterskin";
        items[6] = "disguise kit";
        return items;
    }
    public static String[] getExplorersPack()
    {
        String[] items = new String[8];
        items[0] = "backpack";
        items[1] = "bedroll";
        items[2] = "mess kit";
        items[3] = "tinderbox";
        items[4] = "10 torches";
        items[5] = "10 days of rations";
        items[6] = "waterskin";
        items[7] = "50 ft. hempen rope";
        return items;
    }
    public static String[] getPriestsPack()
    {
        String[] items = new String[10];
        items[0] = "backpack";
        items[1] = "blanket";
        items[2] = "10 candles";
        items[3] = "tinderbox";
        items[4] = "alms box";
        items[5] = "2 blocks of incense";
        items[6] = "censer";
        items[7] = "vestments";
        items[8] = "2 days rations";
        items[9] = "waterskin";
        return items;
    }
    public static String[] getScholarsPack()
    {
        String[] items = new String[7];
        items[0] = "backpack";
        items[1] = "book of lore";
        items[2] = "bottle of ink";
        items[3] = "ink pen";
        items[4] = "10 sheets of parchment";
        items[5] = "little bag of sand";
        items[6] = "small knife";
        return items;
    }
}
