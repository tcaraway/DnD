/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        return (statValue-10)/2;
    }
}
