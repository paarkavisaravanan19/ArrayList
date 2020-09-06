/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NEW
 */
public class billcalculation {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        ArrayList <Double> list1=new ArrayList<>();
        System.out.println("enter the bill amount for 12 months");
       
        
           double a[] = new double[12];
            for(int i=0;i<12;i++)
            {
                a[i]=obj.nextInt();
                list1.add(a[i]);
            }
            double total=0;
            for (int j=0;j<12;j++)
            {
                 total=total+a[j];
            }
            double average=total/list1.size();
            System.out.println("average : "+average);
            System.out.println("least : "+Collections.min(list1));
            System.out.println("maximum bill : "+Collections.max(list1));
            
 
           
      
        
    }
}

    
