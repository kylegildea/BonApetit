import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception 
    {
    	Scanner in = new Scanner(System.in);
        int itemsOrdered = in.nextInt();
        int itemToRemoveIndex = in.nextInt();
        int[] receipt = new int[itemsOrdered];
        int charged = 0;
        
        for(int i = 0; i < itemsOrdered; i++)
        {
        	receipt[i] = in.nextInt();
        }
        charged = in.nextInt();
        int actual = 0;
        for(int i = 0; i < receipt.length; i++)
        {
        	if(i != itemToRemoveIndex)
        	{
        		actual+=receipt[i];
        	}
        	
        }
        
        double annaPays = (double)(actual)/2.0;
        
        if(Double.compare(annaPays, (double)(charged)) == 0)
    	{
    		System.out.print("Bon Appetit");
    	}
    	else
    	{
    		System.out.print((int)(charged - annaPays));
    	}
        
        System.out.println();
    }
}
