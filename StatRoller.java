/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charactercreator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author thom
 */
public class StatRoller {
    
    public static int rollStat(){
        Random rand = new Random();
        int num1 = rand.nextInt(6) + 1;
        int num2 = rand.nextInt(6) + 1;
        int num3 = rand.nextInt(6) + 1;
        int num4 = rand.nextInt(6) + 1;
        
        ArrayList numList = new ArrayList();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
        numList.add(num4);
        
        int minIndex = numList.indexOf(Collections.min(numList));
        numList.remove(minIndex);
        int total = 0;
        
        for(int i=0;i<3;i++)
        {
            total = total + (int)numList.get(i);
        }
        return total;
    }
    
    public static int getStatMod(int statValue)
    {
        int mod = 0;
        if(statValue == 3)
            mod = -4;
        if(statValue == 4 || statValue == 5)
            mod = -3;
        if(statValue == 6 || statValue == 7)
            mod = -2;
        if(statValue == 8 || statValue == 9)
            mod = -1;
        if(statValue == 10 || statValue == 11)
            mod = 0;
        if(statValue == 12 || statValue == 13)
            mod = 1;
        if(statValue == 14 || statValue == 15)
            mod = 2;
        if(statValue == 16 || statValue == 17)
            mod = 3;
        if(statValue == 18 || statValue == 19)
            mod = 4;
        if(statValue == 20 || statValue == 21)
            mod = 5;
        if(statValue == 22 || statValue == 23)
            mod = 6;
        if(statValue == 24 || statValue == 25)
            mod = 7;
        if(statValue == 26 || statValue == 27)
            mod = 8;
        if(statValue == 28 || statValue == 29)
            mod = 9;
        if(statValue >= 30)
            mod = 10;
        return mod;
    }
}
