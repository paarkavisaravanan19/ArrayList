/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author NEW
 */
public class infostudent {
    public static void main(String args[]){
     
         student s1[]=new student[20];
         ArrayList <student> list3=new ArrayList<>();
      
         for(int i=0;i<20;i++)
         {
            
             s1[i]=new student();
             s1[i].getdata();
            System.out.println(s1[i]);
         }
           for(int j=0;j<20;j++) 
           {
              list3.add(s1[j]);
           }
           System.out.println("information of 20 students");
           System.out.println(list3);
           System.out.println("sorted names");
           Collections.sort(list3,new namesort());
           System.out.println(list3);
      
         }
            
         
    
    }
    

class student
{
    String name;
    int rollno;
    double cgpa;
    Scanner obj= new Scanner(System.in); 
    void getdata()
    {
        System.out.println("enter the name" );
        name=obj.next();
        System.out.println("enter the rollno");
        rollno=obj.nextInt();
        System.out.println("enter the cgpa");
        cgpa=obj.nextDouble();
        
        
    }
    public String toString()
    {
        return "name :"+name+" rollno: "+rollno+"cgpa: "+cgpa;
    }
    
}
class namesort implements Comparator<student>
{
    @Override
    public int compare(student s1,student s2)
    {
        return s1.name.compareTo(s2.name);
    }
    
}

    
    

