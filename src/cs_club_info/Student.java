/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_club_info;

/**
 *
 * @author Kareem_29
 */
public class Student {
     private String name, department, position;
     private int ID;
     
     public Student()
    {
        this.name=null;
        this.department=null;
        this.position=null;
        this.ID=1000;
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String N1)
    {
        this.name=N1;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public void setDepartment(String D1)
    {
        this.department=D1;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public void setPosition(String P1)
    {
        this.position=P1;
    }
    
     public double getID()
    {         
        double sum=this.ID+1;         
        return sum;     
    } 

}
